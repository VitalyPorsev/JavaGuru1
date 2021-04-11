package students.alex_kalashnikov.lesson_11.level_2.task_8;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    List<Book> repository = new ArrayList<>();
    Long idCounter = 1L;

    @Override
    public Long save(Book book) {
        book.setId(idCounter);
        repository.add(book);
        idCounter++;
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getId().equals(bookId)) {
                repository.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        boolean check = false;
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).equals(book)) {
                repository.remove(i);
                check = true;
                i--;
            }
        }
        return check;
    }

}