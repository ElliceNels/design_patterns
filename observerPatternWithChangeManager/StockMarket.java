package observerPatternWithChangeManager;

public class StockMarket {
    public static void main(String[] args) {
        Stock stock1 = new Stock("Google");
        Stock stock2 = new Stock("Amazon");
        AmericanInvestor americanInvestor = new AmericanInvestor();
        EuropeanInvestor europeanInvestor = new EuropeanInvestor();
        ChangeManager changeManager = new ChangeManager();
        changeManager.attachInvestor(americanInvestor);
        changeManager.attachInvestor(europeanInvestor);
        changeManager.attachStock(stock1);
        changeManager.attachStock(stock2);

        // Both checking stock1
        System.out.println("1");
        changeManager.attachInvestorToStock(stock1, americanInvestor);
        changeManager.attachInvestorToStock(stock1, europeanInvestor);
        stock1.value_change();
        stock2.value_change();

        // One checking stock1 and the other checking stock2
        System.out.println("2");
        changeManager.detachInvestorFromStock(stock1, europeanInvestor);
        changeManager.attachInvestorToStock(stock2, europeanInvestor);
        stock1.value_change();
        stock2.value_change();

        // Both checking stock1 and stock2
        System.out.println("3");
        changeManager.attachInvestorToStock(stock1, europeanInvestor);
        changeManager.attachInvestorToStock(stock2, americanInvestor);
        stock1.value_change();
        stock2.value_change();
    }
}
