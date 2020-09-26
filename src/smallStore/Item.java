/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

public class Item {
    private String productId;
    private String productName;
    private ProductType productCategory;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductType getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductType productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Item{");
        sb.append("productId='").append(productId).append('\'');
        sb.append(", productName='").append(productName).append('\'');
        sb.append(", productCategory=").append(productCategory);
        sb.append('}');
        return sb.toString();
    }
}
