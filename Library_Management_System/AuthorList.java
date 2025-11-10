
import java.util.Scanner;
import java.util.TreeMap;

public class AuthorList implements I_Management<Author> {
    private final TreeMap<String,Author> authors;
    public AuthorList()
    {
        authors=new TreeMap<>();
    }
    @Override
    public void add(Author author)
    {
        authors.put(author.getId(), author);
        System.out.println("The author has been added.");
    }
    @Override
    public void remove(String id)
    {
        if(authors.containsKey(id))
        {authors.remove(id);
        System.out.println("The author has been removed.");}
        else{
            System.out.println("Not exist");
        }
    }
    @Override
    public Author search(String id)
    {
        if(authors.containsKey(id))
        {
            return authors.get(id);
        }
        else{
            System.out.println("Not found!!");
            return null;
        }
    }
    @Override
    public void editProfile(String id)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int choice;
            do { 
                System.out.println("Enter author ID: ");
                String auId=sc.nextLine();
                while(!authors.containsKey(auId))
                {
                    System.out.println("Not found!!");
                    System.out.println("Try enter again: ");
                    auId=sc.nextLine();
                    System.out.println("");
                }
                System.out.println("Enter the part to edit: ");
                System.out.println("1. Edit name.");
                System.out.println("2. Edit date.");
                System.out.println("3. Edit phone number.");
                System.out.println("4. Edit Email.");
                System.out.println("5. Edit pen name.");
                System.out.println("0. back.");
                System.out.println("Select: ");
                choice=sc.nextInt(); 
                switch(choice)
                {
                    case 1->
                    {
                        System.out.println("Enter new name: ");
                        String auName=sc.nextLine();
                        authors.get(auId).setName(auName);
                        System.out.println("success.");
                    }
                    case 2->
                    {
                        System.out.println("Enter date: ");
                        System.out.println("Enter year: ");
                        int year=sc.nextInt();
                        System.out.println("");
                        System.out.println("Enter month: ");
                        int month=sc.nextInt();
                        System.out.println("");
                        System.out.println("Enter day of month: ");
                        int dayOfMonth=sc.nextInt();
                        authors.get(auId).setDate(year, month, dayOfMonth);
                        System.out.println("");
                        System.out.println("Success.");
                    }
                    case 3 ->                 {
                        System.out.println("Enter new phone number: ");
                        String readerPhoneNumber=sc.nextLine();
                        authors.get(auId).setPhoneNumber(readerPhoneNumber);
                        System.out.println("");
                        System.out.println("Edit success.");
                    }
                    case 4 ->                 {
                        System.out.println("Enter new Email: ");
                        String readerEmail = sc.nextLine();
                        authors.get(auId).setEmail(readerEmail);
                        System.out.println("");
                        System.out.println("Edit success.");
                    }
                    case 5->
                    {
                        System.out.println("Enter new pen name: ");
                        String auPen=sc.nextLine();
                        System.out.println("");
                        authors.get(auId).setPenName(auPen);
                    }
                }               
            } while (choice!=0);
        }
    }
    @Override
    public void show(String id)
    {
        if(authors.containsKey(id))
        authors.get(id).showInfo();
    }
    @Override
    public void showAll()
    {
        for(Author au : authors.values())
        {
            au.showInfo();
        }
    }
    public int totalAuthor()
    {
        return Author.getTotal();
    }
    public int minusQuantity(int quantity)
    {
        return Author.getTotal()-quantity; 
    }
}
