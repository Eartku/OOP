
import java.util.TreeMap;

public class BookList implements I_Management<Book> {
    TreeMap<String, Book> books;
    public BookList()
    {
        books=new TreeMap<>();
    }
    @Override
    public void add(Book book)
    {
        books.put(book.getId(), book);
        System.out.println("The book has been added.");
    }
    @Override
    public void remove(String id)
    {
        if(books.containsKey(id))
        {
            books.remove(id);
        }
        else{
            System.out.println("Not exist!!");
        }
    }
    @Override
    public Book search(String id)
    {
        if(books.containsKey(id))
        return books.get(id);
        else{
            System.out.println("Not found!!");
            return null;
        }
    }
    @Override
    public void editProfile(String id)
    {

    }
    @Override
    public void show(String id)
    {
        if(books.containsKey(id))
        {
            books.get(id).showInfo();
        }
    }
    @Override
    public void showAll()
    {
        for(Book b : books.values())
        {
            b.showInfo();
        }
    }
    public int getTotalBook()
    {
        return Book.getTotal();
    }
    public int minusQuantity(int quantity)
    {
        return Book.getTotal()-quantity;
    }
}
