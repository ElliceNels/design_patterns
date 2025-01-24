package decoratorPattern;

public class Sofa extends Furniture{
    
    public Sofa(){
        super();
    }

    @Override
    public String productDescription(){
        return "Sofa";
    }
}
