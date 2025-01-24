package decoratorPattern;

public abstract class Customisation extends Furniture{
    // All decorators must have a reference to the Furniture object they are decorating
    public Furniture f;

    // All decorators must implement the productDescription method
    public abstract String productDescription();}
