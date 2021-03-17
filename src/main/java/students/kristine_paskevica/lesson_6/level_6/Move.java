package students.kristine_paskevica.lesson_6.level_6;

 class Move {

     private int x;
     private int y;

     public Move(int x, int y) {
         this.x = x;
         this.y = y;
     }

     public int getX() {
         return x;
     }

     public int getY() {
         return y;
     }

     @Override
     public String toString() {
         return "Pārvietojamies uz {" +
                 "pirmā koordināte = " + x +
                 ", otrā koordināte = " + y +
                 '}';
     }
}