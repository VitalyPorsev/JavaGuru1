package students.kate_br.lesson_8.level_5.task_28;

 class Circle extends Shape {

     private double radius;

     public Circle(String title, double radius) {
         super(title);
         this.radius = radius;
     }

     @Override
     double calculateArea() {
         return Math.PI * radius * radius;
     }

     @Override
     double calculatePerimeter() {
         return 2 * Math.PI * radius;
     }
 }
