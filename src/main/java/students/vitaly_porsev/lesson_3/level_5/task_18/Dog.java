package students.vitaly_porsev.lesson_3.level_5.task_18;

class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    void voice(){
        System.out.println(this.name + " " + this.name + " " + this.name);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Lucky");
        dog1.voice();
    }
}

