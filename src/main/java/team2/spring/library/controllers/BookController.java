package team2.spring.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import team2.spring.library.dto.BookDto;

import javax.validation.Valid;

/**
 * Controller witch operate all request of book */
@Controller
public class BookController {

  /**
   * @param model prepare dto for Jsp
   * @return page where get title of book
   */
  @GetMapping("/availableBookForm")
  public String availableBookForm(Model model) {
    model.addAttribute("bookDto", new BookDto());
    return "booksJsp/availableBookForm";
  }

  /**
   * @param bookDto from reader input title
   * @param model prepare dto for Jsp
   * @return  page with available book
   */
  @PostMapping("/availableBook")
  public String availableBook(@Valid @ModelAttribute("bookDto") BookDto bookDto, Model model) {
    model.addAttribute("bookDto", bookDto);
    return "booksJsp/availableBook";
  }
}