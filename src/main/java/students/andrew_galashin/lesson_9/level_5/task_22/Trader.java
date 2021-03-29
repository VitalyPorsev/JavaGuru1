package students.andrew_galashin.lesson_9.level_5.task_22;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;

    }

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
