package observerPatternWithChangeManager;

import java.util.ArrayList;

// Stock class is the subject class
public class Stock {

    private String stock_name;
    private float value;
    private ArrayList<Investor> investors = new ArrayList<Investor>();

    public Stock(String stock_name){
        this.stock_name = stock_name;
    }

    public void attach(Investor investor){
        investors.add(investor);
    }

    public void detach(Investor investor){
        investors.remove(investor);
    }

    public void notifyInvestors(){
        System.out.println(stock_name + " has changed its value to: " + this.value);
        for(Investor investor: investors){
            investor.update(this.value);
        }
    }

    public void value_change(){
        this.value = (float) Math.random() * 100;
        notifyInvestors();
    }
}