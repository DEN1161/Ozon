package ru.itpark;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void createCart(){
        Lego lego1 = new Lego("https://www.ozon.ru",
                "Бестселлер" ,
                "LEGO Hidden Side" ,
                "Конструктор" ,
                "Старый рыбацкий корабль" , 70419 ,
                32 ,
                2299 ,
                5 ,
                0);

        Lego lego2 = new Lego("https://www.ozon.ru",
                "Бестселлер" ,
                "LEGO Hidden Side" ,
                "Конструктор" ,
                "Загадка старого кладбища" , 70420 ,
                33 ,
                2299 ,
                5 ,
                1);

        Lego lego3 = new Lego("https://www.ozon.ru",
                "Бестселлер" ,
                "LEGO Hidden Side" ,
                "Конструктор" ,
                "Трюковой грузовик Эль-Фуэго" , 70421 ,
                33 ,
                2999,
                5 ,
                2);
        Cart cart = new Cart();

        cart.add(lego1);
        cart.add(lego1);
        cart.add(lego2);
        cart.add(lego3);
        cart.add(lego2);
        cart.remove(lego1);
        cart.remove(lego2);
        cart.remove(lego2);

        assertEquals(1 , cart.getNumberGoods());
        assertEquals(2999 , cart.getTotalAmount());
        assertEquals(2010 , cart.getTheDiscountedAmount());
        assertEquals(989 , cart.getTotalAmount() - cart.getTheDiscountedAmount());
    }
}