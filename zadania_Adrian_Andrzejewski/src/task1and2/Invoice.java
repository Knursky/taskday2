package task1and2;

public class Invoice implements Payable {

    private final String partNumber;
    private final String partDescription;
    private int ilosc;
    private double pricePerItem;

    public Invoice(String partnumber, String partNumber, String partDescription, int ilosc, double pricePerItem) {
        this.partNumber = partNumber;

        this.partDescription = partDescription;
        this.ilosc = ilosc;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    private int getilosc() {
        return ilosc;
    }

    public void setilosc(int ilosc) {
        this.ilosc = ilosc;
    }

    private double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return getilosc()*getPricePerItem();
    }
}
