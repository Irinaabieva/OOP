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
        Human vladimir = new Human(-1, "", "","Не работает");
        System.out.println(vladimir.toString());

        Flower roza = new Flower("Роза обыкновенная","",35.29,0);
        Flower chrysanthemum = new Flower("Хризантема", "", 15, 5);
        Flower peony = new Flower("Пион", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);
        peony.setLifeSpan(5);
        Bouquet bouquet = new Bouquet(new Flower[]{
                roza,roza,roza,
                chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,
                gypsophila});
        bouquet.printPrice();

    }

}