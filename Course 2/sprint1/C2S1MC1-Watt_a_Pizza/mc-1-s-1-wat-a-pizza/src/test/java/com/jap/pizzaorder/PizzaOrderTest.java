package com.jap.pizzaorder;
import com.jap.pizzaorder.PizzaOrder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PizzaOrderTest {
    PizzaOrder pizzaOrder;
    @Before
    public void setUp(){
        //Initialize the object of class PizzaOrder
        pizzaOrder = new PizzaOrder();
    }
    @After
    public void tearDown(){
        // Assign object of PizzaOrder to null
        pizzaOrder = null;
    }

//     Write th logic inside the test case methods
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceSuccess(){
        float expected=22.4f;
        float actual=pizzaOrder.calculatePriceOfPizza(2,11.2f);
        assertEquals(expected,actual,0.01);
    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceSuccess(){
        float expected=22.4f;
        float actual=pizzaOrder.calculatePriceOfGarlicBread(2,11.2f);
        assertEquals(expected,actual,0.01);
    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceSuccess(){
        float expected=22.4f;
        float actual=pizzaOrder.calculatePriceOfBeverage(2,11.2f);
        assertEquals(expected,actual,0.01);
    }
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure(){
        float expected=-1.0f;
        float actual=pizzaOrder.calculatePriceOfPizza(0,11.2f);
        assertEquals(expected,actual,0.01);
    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure(){
            float expected=-1.0f;
            float actual=pizzaOrder.calculatePriceOfGarlicBread(0,11.2f);
            assertEquals(expected,actual,0.01);
    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceFailure(){
        float expected=-1.0f;
        float actual=pizzaOrder.calculatePriceOfBeverage(-5,11.2f);
        assertEquals(expected,actual,0.01);
    }
    @Test
    public void givenSizeofPizzaReturnPrice(){
    float expected=9.99f;
    float actual=pizzaOrder.getPriceOfPizzaBasedOnSize(1);
    assertEquals(expected,actual,0.01);
    }
    @Test
    public void givenPriceOfItemsCalculateTotalBillAmount(){
    float expected = 60.7f;
    float actual=pizzaOrder.calculateTotalBill(20.2f, 20.4f, 20.1f);
    assertEquals(expected,actual,0.1);
    }

    @Test
    public void givenTotalBillAmountGreaterThan50CalculateDiscount(){
        float expected=90.0f;
        float actual=pizzaOrder.calculateDiscountAndReturnBillAmount(100.0f);
        assertEquals(expected,actual,0.1);
    }
    @Test
    public void givenTotalBillLessThan50AmountCalculateDiscount(){
        float expected=40.0f;
        float actual=pizzaOrder.calculateDiscountAndReturnBillAmount(40.0f);
        assertEquals(expected,actual,0.1);

    }
}
