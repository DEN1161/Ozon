package ru.itpark;

public class Cart {
    private int numberGoods;
    private int totalAmount;
    private int theDiscountedAmount;

    private Lego[] cart = new Lego[10];

    public void add(Lego lego){
        int index = lego.getIndex();
        if(cart[index] == null){
            cart[index] = lego;
            totalAmount += cart[index].getPrice();
            theDiscountedAmount += cart[index].getPrice() - cart[index].getDiscountPrice();
            numberGoods++;
        }
    }

    public void remove(Lego lego){
        int index = lego.getIndex();
        if(cart[index] != null){
            totalAmount -= cart[index].getPrice();
            theDiscountedAmount -= cart[index].getPrice() - cart[index].getDiscountPrice();
            cart[index] = null;
            numberGoods--;
        }
    }
    @Override
    public String toString(){
        return "Ваша корзина" + "\n" + "Количество товаров " + numberGoods + "\n" +
                "Сумма всех товаров " + totalAmount + "\n" +
                "Сумма с учетом скидки " + theDiscountedAmount;
    }

    public int getNumberGoods() {
        return numberGoods;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getTheDiscountedAmount() {
        return theDiscountedAmount;
    }
}
