/*
 * Copyright © 2020:
 * Fortune David 
 * TDGE 
 */

package smallStore;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> item;
    private Price price;
    private Quantity quantity;
    private List<Price> totalPrice = new ArrayList<>();
    private Receipt<Item, Price, Quantity>  receipt;


    public Receipt<Item, Price, Quantity> getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt<Item, Price, Quantity> receipt) {
        this.receipt = receipt;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public List<Price> getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(List<Price> totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cart{");
        sb.append("item=").append(item);
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append('}');
        return sb.toString();
    }
}
