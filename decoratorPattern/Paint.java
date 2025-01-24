package decoratorPattern;

public class Paint extends Customisation{
 
    private String colour;

    public Paint(String colour, Furniture f){
        super.f = f;
        this.colour = colour;
    }

    @Override
    public String productDescription(){
        return f.productDescription() + " with a " + this.colour + " paint job";
    }
}
