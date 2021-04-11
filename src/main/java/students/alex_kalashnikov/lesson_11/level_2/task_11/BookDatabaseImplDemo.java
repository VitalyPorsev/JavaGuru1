package students.alex_kalashnikov.lesson_11.level_2.task_11;

import java.util.Arrays;

class BookDatabaseImplDemo {

    public static void main(String[] args) {

        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B1"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B1"));
        System.out.println(newDataBase.findByTitle("B1"));
        System.out.println(newDataBase.findByTitle("B11"));
        System.out.println(Arrays.toString(newDataBase.repository.toArray()));

    }

}