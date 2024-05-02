package com.devsuperior.desafiocid.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(double amount) {
        double shipping = 0;
        
        if (amount < 100.00) {
            shipping = 20.00;
        } else if (amount < 200.00) {
            shipping = 12.00;
        } 
        return shipping;
    }
}