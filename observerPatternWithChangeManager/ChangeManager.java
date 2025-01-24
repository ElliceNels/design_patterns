package observerPatternWithChangeManager;

import java.util.ArrayList;

public class ChangeManager {
    private ArrayList<Investor> investors = new ArrayList<Investor>();    
    private ArrayList<Stock> stocks = new ArrayList<Stock>();
    
    public void attachInvestorToStock(Stock stock, Investor investor){
        if (stocks.contains(stock) && investors.contains(investor)){
            stock.attach(investor);
        }
    }

    public void detachInvestorFromStock(Stock stock, Investor investor){
        if (stocks.contains(stock) && investors.contains(investor)){
            stock.detach(investor);
        }
    }

    public void attachStock(Stock stock){
        stocks.add(stock);
    }

    public void detachStock(Stock stock){
        stocks.remove(stock);
    }

    public void attachInvestor(Investor investor){
        investors.add(investor);
    }

    public void detachInvestor(Investor investor){
        investors.remove(investor);
    }

    public void notifyAllInvestors(){
        for(Stock stock: stocks){
            stock.notifyInvestors();
        }
    }
}
