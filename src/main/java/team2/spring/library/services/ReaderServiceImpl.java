package team2.spring.library.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import team2.spring.library.dao.interfaces.ReaderDaoInfs;
import team2.spring.library.dto.ReaderStatisticDto;
import team2.spring.library.entities.Reader;

import java.util.List;

@Service
@AllArgsConstructor
public class ReaderServiceImpl implements ReaderService {
  ReaderDaoInfs readerDaoInfs;

  /**
   * Finds a reader by given name.
   *
   * @param name of the reader.
   * @return an object of the found reader.
   */
  @Override
  public List<Reader> findByName(String name) {
    return readerDaoInfs.findByName(name);
  }

  /**
   * Method witch return black list if readers
   *
   * @return return black list of readers
   */
  @Override
  public List<Reader> getBlackList() {
    return readerDaoInfs.getBlackList();
  }

  /**
   * Method witch return information about read book or not returned book or date of reader
   * registration
   *
   * @param readerStatisticDto Name of reader and select with type of returned information
   * @return Dto with certain information depends on  select
   */
  @Override
  public ReaderStatisticDto getUserStatistic(ReaderStatisticDto readerStatisticDto) {
    if (readerStatisticDto.getSelect().equals("")) {
      return readerStatisticDto;
    } else if (readerStatisticDto.getSelect().equals("")) {
      return readerStatisticDto;
    } else {

      return readerStatisticDto;
    }
  }
}