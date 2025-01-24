package decoratorPattern;

public abstract class Furniture {
    private int noOfLegs = 4;

    // All decorators must implement the productDescription method
    public abstract String productDescription();

    public int getNoOfLegs(){
        return noOfLegs;
    }

    public void setNoOfLegs(int number){
        noOfLegs = number;
    }
}
