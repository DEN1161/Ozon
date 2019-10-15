package ru.itpark;

public class Lego {
    private String imageUrl;
    private String popularity;
    private String series;
    private String type;
    private String name;
    private int id;
    private int discount;
    private int price;
    private int rating;
    private int index;
    private int discountPrice;


    public Lego(String imageUrl, String popularity, String series, String type, String name, int id, int discount, int price, int rating, int index) {
        this.imageUrl = imageUrl;
        this.popularity = popularity;
        this.series = series;
        this.type = type;
        this.name = name;
        this.id = id;
        this.discount = discount;
        this.price = price;
        this.rating = rating;
        this.index = index;
        discountPrice = (int) (price * (discount / 100.0));
    }

    public int getIndex() {
        return index;
    }

    public int getDiscount() {
        return discount;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }
}