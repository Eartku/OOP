
import java.util.ArrayList;

public class Book {
    private String id;
    private String title;
    private final ArrayList<String> categories;
    private final ArrayList<Author> authors;
    private String publicationyear;
    private int quantity;
    private static int count=0;
    public Book(String id,String title,String publicationyear,int quantity)
    {
        this.id=id;
        this.title=title;
        categories=new ArrayList<>();
        authors=new ArrayList<>();
        this.publicationyear=publicationyear;
        this.quantity=quantity;
        count++;
    }
    public String getId()
    {
        return id;
    }
    public void setId()
    {
        String bookId="B"+Book.getTotal();
        this.id=bookId;
    }
    public String getTitle()
    {
        return title;
    }
    public ArrayList<String> getCategories()
    {
        return categories;
    }
    public ArrayList<Author> getAuthors()
    {
        return authors;
    }
    public String getPublicationYear()
    {
        return publicationyear;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public static int getTotal()
    {
        return count;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public void addCategory(String category)
    {
        categories.add(category);
    }
    public void addAuthor(Author author)
    {
        authors.add(author);
    }
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    public void setPublicationYear(String publicationYear)
    {
        this.publicationyear=publicationYear;
    }
    public void showInfo()
    {
        System.out.println("ID: "+getId());
        System.out.println("Title: "+getTitle());
        System.out.println("Categories: ");
        for(String c: categories)
        {
            System.out.println(c);
        }
        System.out.println("");
        System.out.println("Authors: ");
        for(Author au : authors)
        {
            au.showInfo();
        }
        System.out.println("Publication year: "+getPublicationYear());
        System.out.println("Quantity: "+getTotal());
        System.out.println("");
    }
}
