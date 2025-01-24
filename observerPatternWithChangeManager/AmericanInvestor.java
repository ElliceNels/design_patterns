package observerPatternWithChangeManager;

public class AmericanInvestor extends Investor{

    public void update(float value) {
        System.out.println("Previous value of the stock: " + this.stock_value);
        this.stock_value = value;
        System.out.println("American Investor: The value of the stock has changed to: " + this.stock_value);
        
    }
    
}

