package ru.practice_1;

public class Ball {
    private int price;
    private String width;
    private String weight;

    public Ball(int a, String b, String c) {
        price = a;
        width = b;
        weight = c;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "price=" + price +
                ", width='" + width + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
