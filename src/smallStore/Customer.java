/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

import java.util.LinkedList;
import java.util.List;

public class Customer extends User {

    private List<BillingInformation> billingInformation;
    private CreditCardInformation creditCardDetails;
    private Cart customerCart;


    @Override
    void jump() {

    }
}
