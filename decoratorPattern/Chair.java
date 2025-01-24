package decoratorPattern;

public class Chair extends Furniture {

    public Chair(){
        super();
    }
    
    @Override
    public String productDescription(){
        return "Chair";
    }
}
