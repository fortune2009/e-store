/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

import java.time.Month;
import java.time.YearMonth;
import java.util.Date;

public class CreditCardInformation {

    private String creditCardNumber;
    private String nameOnCard;
    private byte cardCvv;
    private YearMonth expirationYearMonth;
    private CardType cardType;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public byte getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(byte cardCvv) {
        this.cardCvv = cardCvv;
    }

    public YearMonth getExpirationYearMonth() {
        return expirationYearMonth;
    }

    public void setExpirationYearMonth(YearMonth expirationYearMonth) {
        this.expirationYearMonth = expirationYearMonth;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
