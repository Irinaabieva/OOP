public class Human {
    private final int yearOfBirth;
    private final String name;
    private final String town;
    private  String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " . Я из города " + town + " . Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!" ;
    }
}
