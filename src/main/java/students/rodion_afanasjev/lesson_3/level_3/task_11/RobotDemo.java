package students.rodion_afanasjev.lesson_3.level_3.task_11;
import students.rodion_afanasjev.lesson_3.level_3.task_11.Robot;

public class RobotDemo {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Rider");

        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");

        robot2.sayHello();
        robot2.sayYourName();

    }

}