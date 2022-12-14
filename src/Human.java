public class Human {
    private  int yearOfBirth;
    private  String name;
    private  String town;
    private  String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
        if (town != null && !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = " Инофрмация не указана";
        }
        if (jobTitle != null && !jobTitle.isEmpty()) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "Информация не указана";
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " . Я из города " + town + " . Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!" ;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null || !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }
}
