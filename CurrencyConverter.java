package main;
import java.util.Scanner;

public class CurrencyConverter {
	    private double exchangeRate;  
	    private String baseCurrency;
	    private String targetCurrency;

	    public CurrencyConverter(String baseCurrency, String targetCurrency) {
	        this.baseCurrency = baseCurrency;
	        this.targetCurrency = targetCurrency;
	        this.exchangeRate = fetchExchangeRate();  
	    }

	    private double fetchExchangeRate() {
	        return 1.15;
	    }

	    public double convertCurrency(double amount) {
	        return amount * exchangeRate;
	    }

	    public void displayResult(double amountConverted) {
	        System.out.println("Converted Amount: " + amountConverted + " " + targetCurrency);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to Currency Converter!");

	        System.out.print("Enter Base Currency: ");
	        String baseCurrency = scanner.nextLine();

	        System.out.print("Enter Target Currency: ");
	        String targetCurrency = scanner.nextLine();

	        CurrencyConverter currencyConverter = new CurrencyConverter(baseCurrency, targetCurrency);

	        System.out.print("Enter Amount in " + baseCurrency + ": ");
	        double amountToConvert = scanner.nextDouble();

	        double convertedAmount = currencyConverter.convertCurrency(amountToConvert);

	        currencyConverter.displayResult(convertedAmount);

	        scanner.close();
	    }
	}



