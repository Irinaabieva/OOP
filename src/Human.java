public class Human {
    private final int yearOfBirth;
    private final String name;
    private final String town;

    public Human(int yearOfBirth, String name, String town) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " . Я из города " + town + " . Я родился в " + yearOfBirth + " году. Будем знакомы!" ;
    }
}
