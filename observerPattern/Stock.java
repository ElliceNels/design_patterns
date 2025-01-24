import java.util.ArrayList;

// Stock class is the subject class
public class Stock {

    private float value;
    private ArrayList<Investor> investors = new ArrayList<Investor>();

    public void attach(Investor investor){
        investors.add(investor);
    }

    public void detach(Investor investor){
        investors.remove(investor);
    }

    public void notify_investors(){
        for(Investor investor: investors){
            investor.update(this.value);
        }
    }

    public void value_change(){
        this.value = (float) Math.random() * 100;
        notify_investors();
    }
}