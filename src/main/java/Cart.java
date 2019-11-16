import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<String> book;
    public Cart(){
        book = new ArrayList<String>();
    }

    public void addItem(){
        book.add("book");
    }

    public List<String> checkout(){
        return book;
    }
}
