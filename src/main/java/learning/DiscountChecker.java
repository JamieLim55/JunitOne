package learning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;



/**
 * DiscountChecker
 */
public class DiscountChecker {



    public static int applyDiscount(int price, Discount discount) {

        return price - discount.absoluteValue;
    }


    public static int applyPercentageDiscount(int price, Discount percentageDiscount){

        int totalDiscount = (price * percentageDiscount.percentageValue)/100;
        return price - totalDiscount;
    }

    public static boolean applyValidityPeriod(Discount targetDate) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date today = new Date();
        Date expiryDate = dateFormat.parse(targetDate.validityDate);

        if(today.before(expiryDate)){
            return true;
        } else{
            return false;
        }

    }

    public static boolean applySpecificProduct(String[] productList,Discount targetProduct) { 

        if(Arrays.asList(productList).contains(targetProduct.applicableProducts)){
            return true;
        }else{
            return false;
        }

    }

    public static int applyDiscountInCart(int totalCartPrice, String voucherCode, Discount voucherAmount) {
        if(voucherCode=="ShopHappy"){
            return totalCartPrice - voucherAmount.voucherValue;
        }else{
            return totalCartPrice;
        }
        
    }


}