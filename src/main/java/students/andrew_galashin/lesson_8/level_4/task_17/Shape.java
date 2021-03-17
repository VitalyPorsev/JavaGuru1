package students.andrew_galashin.lesson_8.level_4.task_17;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    public Shape() {

    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
