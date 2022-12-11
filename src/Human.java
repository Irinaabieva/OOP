public class Human {
    private final int yearOfBirth;
    private final String name;
    private final String town;
    private  String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        this.town = town;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " . Я из города " + town + " . Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!" ;
    }
}
