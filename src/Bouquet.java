import java.util.Arrays;

public class Bouquet {
    private final Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }
    public double calculateCost(){
        double sum = 0;
        StringBuilder result = new StringBuilder("Состав букета:").append("/n");
        for (Flower flower: flowers){
            sum += flower.getCost();

        }
        return sum*1.1;
    }
    public int calculateLifeSpan(){
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower: flowers){
            if (flower.getLifeSpan() < minLifeSpan){
                minLifeSpan = flower.getLifeSpan();
            }
        }
        return minLifeSpan;
    }

    public void printPrice() {
        System.out.println(this);


    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Состав букета:").append("\n");
        double sum = calculateCost();
        int minLifeSpan = calculateLifeSpan();

        for (Flower flower: flowers){
            result.append(flower).append("\n");
        }
        result.append("Срок стояния букета: ").append(minLifeSpan).append(" дней");
        result.append("Стоймость букета: ").append(sum).append(" руб.");
        return result.toString();
    }

}
