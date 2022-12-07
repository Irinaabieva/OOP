public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        System.out.println(maksim.toString());
        Human anna = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        System.out.println(anna.toString());
        Human katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        System.out.println(katya.toString());
        Human artem = new Human(1995, "Артем", "Москва","директор по развитию бизнеса");
        System.out.println(artem.toString());
    }
}