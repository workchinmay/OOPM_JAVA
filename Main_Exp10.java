// CurrencyConverter.java in the currency package
package currency;

public class CurrencyConverter {
    public static double convertUSDToEUR(double amount) {
        return amount * 0.85; // Conversion rate as of the time of writing
    }

    public static double convertEURToUSD(double amount) {
        return amount / 0.85; // Reverse conversion
    }
}
