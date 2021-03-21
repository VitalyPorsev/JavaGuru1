package students.bogdans_pavlovs.lesson_8.level_4.task_16;

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimiter() {
        return Math.PI * 2 * radius;
    }
}
