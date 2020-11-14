package 对象与类;

import java.text.NumberFormat;

public class FactoryTest {
    public static void main(String[] args) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();

        double x = 0.1;

        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));

    }
}
