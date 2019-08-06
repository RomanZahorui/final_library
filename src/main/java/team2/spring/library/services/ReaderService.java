package team2.spring.library.services;

import org.springframework.dao.DataIntegrityViolationException;
import team2.spring.library.dto.GeneralStatisticDto;
import team2.spring.library.dto.ReaderAvgDto;
import team2.spring.library.dto.ReaderStatisticDto;
import team2.spring.library.entities.Author;
import team2.spring.library.entities.Book;
import team2.spring.library.entities.Reader;

import java.text.ParseException;
import java.util.List;

public interface ReaderService {

  List<Reader> getAllReaders();

  List<Reader> findByName(String name);

  List<Reader> getBlackList();

  ReaderStatisticDto getUserStatistic(ReaderStatisticDto readerStatisticDto);

  GeneralStatisticDto getGeneralStatisticDto(GeneralStatisticDto generalStatisticDto)
      throws ParseException;

  /**
   * @param author object which need for searching average age bu author
   * @return double
   */
  double getAvgAgeByAuthor(Author author);

  /**
   * @param author object which need for searching average age bu author
   * @param book object which need for searching average age bu author
   * @return ReaderAvgDto - object which contains average age by author and by book
   */
  ReaderAvgDto getBothAvg(Author author, Book book);

  /**
   * Tries to delete a reader by id.
   *
   * @param id of the reader.
   * @return list of the existed reader after the deletion.
   * @throws IllegalArgumentException if a reader with the id is not exists.
   * @throws DataIntegrityViolationException if a reader with the id is not exists.
   */
  List<Reader> deleteReader(int id) throws IllegalArgumentException, DataIntegrityViolationException;
}
