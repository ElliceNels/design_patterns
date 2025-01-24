public class StockMarket {

    public static void main(String[] args) {
        // Create Stock
        Stock stock = new Stock();

        // Create Stock Investors
        AmericanInvestor americanInvestor = new AmericanInvestor();
        EuropeanInvestor europeanInvestor = new EuropeanInvestor();
        
        // Have the investors attach to the stock to track stock value changes
        stock.attach(americanInvestor);
        stock.attach(europeanInvestor);

        // Change the stock value
        stock.value_change();
        stock.detach(americanInvestor);
        stock.value_change();
    }
}