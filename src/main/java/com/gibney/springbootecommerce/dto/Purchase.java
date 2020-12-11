package com.gibney.springbootecommerce.dto;

import com.gibney.springbootecommerce.entity.Address;
import com.gibney.springbootecommerce.entity.Customer;
import com.gibney.springbootecommerce.entity.Order;
import com.gibney.springbootecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;

}
