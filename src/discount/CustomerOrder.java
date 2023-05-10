package discount;

public class CustomerOrder extends Bill{

    private String customerName;


    public CustomerOrder(String customerName, double billAmount, char discountType) {
        super(billAmount, discountType);
        this.customerName = customerName;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + getBillAmount()
                + ", discountType=" + getDiscountType()
                + '}';
    }
}
