
public class EuropeanInvestor extends Investor{


    public void update(float value) {
        System.out.println("Previous value of the stock: " + this.stock_value);
        this.stock_value = value;
        System.out.println("European Investor: The value of the stock has changed to: " + this.stock_value);
        
    }
}