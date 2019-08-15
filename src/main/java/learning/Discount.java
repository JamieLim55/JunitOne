package learning;

/**
 * Discount
 */
public class Discount {

    public int absoluteValue;
    public int percentageValue;
    public String validityDate;
    public String applicableProducts;
    public int voucherValue;

    Discount(int discountAmount){
        this.absoluteValue = discountAmount;
        this.percentageValue = discountAmount;
        this.voucherValue = discountAmount;

    }

    Discount(String discountData){
        this.validityDate= discountData;
        this.applicableProducts= discountData;

    }
   

   
}