package decoratorPattern;

public class FurnitureShop {

    public static void main(String[] args) {
        // Decorator pattern
        Furniture f = new Paint("green", new Cushion(new Cushion(new Polish(new Sofa()))));
        System.out.println(f.productDescription());
        System.out.println(f.getNoOfLegs());
    }
}