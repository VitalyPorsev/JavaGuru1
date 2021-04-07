package students.alex_kalashnikov.lesson_11.level_2.task_12;

import java.util.List;
import java.util.Optional;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

}