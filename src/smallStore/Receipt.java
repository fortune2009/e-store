/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

public class Receipt<Item, Price, Quantity> {
    private Item item;
    private Price price;
    private Quantity quantity;
    private String receiptRef;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public String getReceiptRef() {
        return receiptRef;
    }

    public void setReceiptRef(String receiptRef) {
        this.receiptRef = receiptRef;
    }
}
