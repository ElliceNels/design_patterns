package decoratorPattern;

public class Cushion extends Customisation{
    public Cushion(Furniture f){
        super.f = f;
    }

    @Override
    public String productDescription(){
        return f.productDescription() + " with cushion";
    }
}
