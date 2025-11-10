
import java.time.LocalDate;

public class Reader extends Person {
    private String address;
    private static int count=0;
    public Reader(String id,String name,int year,int month,int dayOfMonth,String phoneNumber,String Email,String address)
    {
        super(id, name, year, month, dayOfMonth, phoneNumber, Email);
        this.address=address;
        count++;
    } 
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public LocalDate getDate()
    {
        return date;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getEmail()
    {
        return Email;
    }
    public String getAddress()
    {
        return address;
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setDate(int year,int month,int dayOfMonth)
    {
        this.date=LocalDate.of(year, month, dayOfMonth);
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public void setEmail(String Email)
    {
        this.Email=Email;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public static int getTotal()
    {
        return count;
    }
    @Override
    public void showInfo()
    {
        System.out.println("Id: "+getId());
        System.out.println("Name: "+getName());
        System.out.println("Date: "+getDate());
        System.out.println("Phone number: "+getPhoneNumber());
        System.out.println("Email: "+getEmail());
        System.out.println("Address: "+getAddress());
    }
}
