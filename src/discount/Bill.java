package discount;

public class Bill{

    private double billAmount;
    private char discountType;

    public Bill(double billAmount, char discountType) {
        this.billAmount = billAmount;
        this.discountType = discountType;
    }

    public double getBillAmount() {
        double tempBill;
        switch (discountType) {
            case 'S':
            case 's':
                tempBill = billAmount - (billAmount * 0.1);
                break;
            case 'D':
            case 'd':
                tempBill = billAmount - (billAmount * 0.5);
                break;
            case 'L':
            case 'l':
                tempBill = billAmount - (billAmount * 0.75);
                break;
            default:
                tempBill = billAmount;
        }
        return tempBill;
    }
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public char getDiscountType() {
        return discountType;
    }
}
