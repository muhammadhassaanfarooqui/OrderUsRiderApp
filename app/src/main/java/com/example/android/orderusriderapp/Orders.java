package com.example.android.orderusriderapp;

import java.util.ArrayList;

/**
 * Created by Hassaan on 6/22/2017.
 */

public class Orders {
    ArrayList<Order> orders;
    private class Order {
        String store;
        String payment;
        String time;
    }
    Orders() {
        Order order1 = new Order();
        order1.store = "Gourmet Bakers and Sweets";
        order1.payment = "Cash on delivery";
        order1.time = "10:10AM";
        orders.add(order1);
        Order order2 = new Order();
        order2.store = "Alfatah Store";
        order2.payment = "Cash on delivery";
        order2.time = "11:11AM";
        orders.add(order2);
        Order order3 = new Order();
        order3.store = "Metro Cash and Carry";
        order3.payment = "Cash on delivery";
        order3.time = "05:10PM";
        orders.add(order3);

    }
}
