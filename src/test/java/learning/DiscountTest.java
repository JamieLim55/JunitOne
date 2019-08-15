package learning;

import java.text.ParseException;



import junit.framework.TestCase;

/**
 * DiscountTest
 */
public class DiscountTest extends TestCase{

    public void testAbsoluteDiscount(){

        //Given
        int productPrice = 500;
        Discount discount = new Discount(200);
        //When
        int finalPrice = DiscountChecker.applyDiscount(productPrice, discount);
        //Then
        assertEquals(300, finalPrice);
    }

    public void testPercentageDiscount(){
        //Given
        int productPrice = 500;
        Discount percentageDiscount = new Discount(20);
        //When
        int finalPrice = DiscountChecker.applyPercentageDiscount(productPrice, percentageDiscount);
        //Then
        assertEquals(400, finalPrice);
    }

    public void testValidityPeriod() throws ParseException{

        //Given
        Discount targetDate= new Discount("08/12/2019");
        //When
        boolean isValidDate = DiscountChecker.applyValidityPeriod(targetDate);
        //Then
        assertEquals(false, isValidDate);
    }
    

    public void testSpecificProducts() {

        //Given
        String[] productList = new String[]{"Latitude","Inspiron"};
        Discount targetProduct= new Discount("Inspiron");
        //When
        boolean isValidProduct = DiscountChecker.applySpecificProduct(productList,targetProduct);
        //Then
        assertEquals(true, isValidProduct);
    }

    public void testDiscountInCart(){

        //Given
        int totalCartPrice = 300;
        String voucherCode ="ShopHappy";
        Discount voucherAmount= new Discount(30);
        //When
        int finalPrice = DiscountChecker.applyDiscountInCart(totalCartPrice, voucherCode, voucherAmount);
        //Then
        assertEquals(270, finalPrice);
    }


}