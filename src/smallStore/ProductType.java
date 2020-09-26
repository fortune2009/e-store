/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

public enum ProductType {
     GROCERIES, KITCHEN_UTENSILS, SANITARY_PRODUCTS, MISCELLANEOUS_GOODS, CONTAINERS, WRAPPING,
            DYESTUFFS, PUBLIC_HYGIENE_PRODUCTS, PEST_CONTROL;


    @Override
    public String toString() {
        String productCategoryInString = "";

        switch (this){
            case WRAPPING -> productCategoryInString = "Wrapping";
            case DYESTUFFS -> productCategoryInString = "Dyestuffs";
            case CONTAINERS -> productCategoryInString = "Containers";
            case GROCERIES -> productCategoryInString ="Groceries";
            case KITCHEN_UTENSILS -> productCategoryInString = "Kitchen utensils";
            case MISCELLANEOUS_GOODS -> productCategoryInString = "Miscellaneous goods";
            case PEST_CONTROL -> productCategoryInString = "Pest control";
            case PUBLIC_HYGIENE_PRODUCTS -> productCategoryInString = "Public hygiene";
            case SANITARY_PRODUCTS -> productCategoryInString = "Sanitary products";



        }
        return productCategoryInString;
    }
}
