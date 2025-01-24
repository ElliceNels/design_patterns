package decoratorPattern;

public class Table extends Furniture{
        
    public Table(){
        super();
    }

    @Override
    public String productDescription(){
        return "Table";
    }

}
