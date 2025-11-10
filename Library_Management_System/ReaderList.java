import java.util.Scanner;
import java.util.TreeMap;
public class ReaderList implements  I_Management<Reader>{
    private final TreeMap<String,Reader> readers;
    public ReaderList()
    {
        readers=new TreeMap<>();
    }
    @Override
    public void add(Reader reader)
    {
        readers.put(reader.getId(), reader);
        System.out.println("The reader has been added.");
    }
    @Override
    public void remove(String id)
    {
        if(readers.containsKey(id))
        {readers.remove(id);
        System.out.println("The reader has been removed.");}
        else{
            System.out.println("Not exist!!");
        }
    }
    @Override
    public void editProfile(String id)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("Enter reader ID: ");
                String readerId=sc.nextLine();
                while(!readers.containsKey(readerId))
                {
                    System.out.println("Not found!!");
                    System.out.println("Enter Id again: ");
                    readerId=sc.nextLine();
                    System.out.println("");
                }
                System.out.println("Enter the part to edit: ");
                System.out.println("1. Edit name.");
                System.out.println("2. Edit date.");
                System.out.println("3. Edit phone number.");
                System.out.println("4. Edit Email.");
                System.out.println("5. Edit address.");
                System.out.println("0. back.");
                System.out.println("Select: ");
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1 ->                 {
                        System.out.println("Enter new name: ");
                        String readerName=sc.nextLine();
                        System.out.println("");
                        readers.get(readerId).setName(readerName);
                        System.out.println("");
                        System.out.println("Edit success.");
                    }
                    case 2 ->                 {   System.out.println("Enter new date: ");
                    System.out.println("Enter year: ");
                    int year = sc.nextInt();
                    System.out.println("");
                    System.out.println("Enter month: ");
                    int month = sc.nextInt();
                    System.out.println("");
                    System.out.println("Enter day of month: ");
                    int dayOfMonth= sc.nextInt();
                    System.out.println("");
                    readers.get(readerId).setDate(year,month,dayOfMonth);
                    System.out.println("");
                    System.out.println("Edit success.");
                    }
                    case 3 ->                 {
                        System.out.println("Enter new phone number: ");
                        String readerPhoneNumber=sc.nextLine();
                        readers.get(readerId).setPhoneNumber(readerPhoneNumber);
                        System.out.println("");
                        System.out.println("Edit success.");
                    }
                    case 4 ->                 {
                        System.out.println("Enter new Email: ");
                        String readerEmail = sc.nextLine();
                        readers.get(readerId).setEmail(readerEmail);
                        System.out.println("");
                        System.out.println("Edit success.");
                    }
                    case 5 ->                 {
                        System.out.println("Enter new address: ");
                        String readerAddress=sc.nextLine();
                        readers.get(readerId).setAddress(readerAddress);
                        System.out.println("");
                        System.out.println("Edit success");
                    }
                    
                }
            } while (choice !=0);
        }
    }
    @Override
    public Reader search(String id)
    {
        if(readers.containsKey(id))
        return readers.get(id);
        else
        {
            System.out.println("Not found!!");
            return null;
        }
    }
    @Override
    public void show(String id)
    {
        if(readers.containsKey(id))
        readers.get(id).showInfo();
    }
    @Override
    public void showAll()
    {
        for(String rId : readers.keySet())
        {
            readers.get(rId).showInfo();
        }
    }
    public int getTotalReader()
    {
        return Reader.getTotal();
    }
    public int minusQuantity(int quantity)
    {
        return Reader.getTotal()-quantity;
    }
}
