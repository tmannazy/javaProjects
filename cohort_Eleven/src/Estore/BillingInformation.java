package Estore;

public class BillingInformation {
    private String receiverPhoneNumber;
    private String receiveName;
    Addresses addresses;
    CreditCardInformation creditCardInformation;

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

}
