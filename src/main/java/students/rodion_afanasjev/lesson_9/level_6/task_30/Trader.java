package students.rodion_afanasjev.lesson_9.level_6.task_30;

class Trader {

    private String fullName;
    private String city;

    public Trader(String fullName,String city){
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
