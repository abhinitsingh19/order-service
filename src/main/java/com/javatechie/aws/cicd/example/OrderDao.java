package com.javatechie.aws.cicd.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {


    public List<Order> getOrders() 
    {
        return Arrays.asList(new Order(101, "Mobile", 1, 30000),
                new Order(58, "Book", 4, 2000),
                new Order(205, "Laptop", 1, 150000),
                new Order(809, "headset", 1, 1799),
                new Order(800, "router", 1, 1500));
    }
}
