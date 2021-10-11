package edu.wctc.sales.iface;

public interface ShippingPolicy {
    double getShippingCost(Sale sale);
}