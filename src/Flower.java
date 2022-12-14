public class Flower {
    private final String flowerName;
    private final String country;
    private final double  cost;
    private int lifeSpan;

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName != null && !flowerName.isEmpty()) {
            this.flowerName = flowerName;
        } else {
            this.flowerName = "Тип цветка не указан";
        }
        if (country != null && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost >=0 || cost != Math.abs(cost)) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerName='" + flowerName + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + String.format("%.2f",cost) +
                ", lifeSpan=" + lifeSpan +
                '}';
    }

    public static void printFlower(Flower flower) {
        System.out.println(flower.toString());
    }
}
