package com.gibney.springbootecommerce.service;

import com.gibney.springbootecommerce.dto.Purchase;
import com.gibney.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
