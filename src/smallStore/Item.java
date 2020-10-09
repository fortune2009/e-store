/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

import java.math.BigDecimal;

public class Item {
    private int quantityOfProductSelected;
    private Product product;

    public int getQuantityOfProductSelected() {
        return quantityOfProductSelected;
    }

    public void setQuantityOfProductSelected(int quantityOfProductSelected) {
        this.quantityOfProductSelected = quantityOfProductSelected;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Item{");
        sb.append("quantityOfProductSelected=").append(quantityOfProductSelected);
        sb.append(", product=").append(product);
        sb.append('}');
        return sb.toString();
    }
}
