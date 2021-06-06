package base;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TaxCalculator {
    public float orderPrice;
    public String state;
    public BigDecimal subtotal;
    public BigDecimal tax;
    public BigDecimal total;
    public final double wITaxRate = .055;


    public void setOrderPrice(float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    public String getState() {
        return state;
    }

    public void Calculate(float orderPrice, String state)
    {
        //format and create builder to allow for only one output and one if
        StringBuilder b = new StringBuilder();
        DecimalFormat df = new DecimalFormat("$0.00");

        if(state.equals("WI")) {
            //will calculate subtotal, tax and total and append subtotal and tax
            // to string for printing only if WI is entered
            setSubtotal(BigDecimal.valueOf(orderPrice));
            b.append("The subtotal is " + df.format(orderPrice) + ".\n");
            setTax(subtotal.multiply(BigDecimal.valueOf(wITaxRate)));
            b.append("The tax is " + df.format(tax) + ".\n");
            setTotal(subtotal.add(tax));
        }
        //will print total depending on what state is entered
        b.append("The total is " + df.format(total) + ".");
        System.out.println(b);
    }

}

