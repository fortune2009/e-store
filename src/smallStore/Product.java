/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

public class Product {
    private String productId;
    private String productName;
    private ProductCategory productCategory;
    private String productDescription;

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

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("productId='").append(productId).append('\'');
        sb.append(", productName='").append(productName).append('\'');
        sb.append(", productCategory=").append(productCategory);
        sb.append(", productDescription='").append(productDescription).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
