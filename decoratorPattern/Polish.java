package decoratorPattern;

public class Polish extends Customisation{
    public Polish(Furniture f){
        super.f = f;
    }

    @Override
    public String productDescription(){
        return f.productDescription() + " with a nice polish";
    }
}
