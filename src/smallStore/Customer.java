/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

import java.util.LinkedList;
import java.util.List;

public class Customer extends User {

    private BillingInformation billingInformation;
    private CreditCardInformation creditCardDetails;
    private List<Cart> cart= new LinkedList<>();


    @Override
    void jump() {

    }
}
