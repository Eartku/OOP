import java.time.LocalDate;

public class Author extends Person {
    private String penName;
    private static int count=0;
    public Author(String id,String name,int month,int year,int dayOfMonth,String penName,String Email,String phoneNumber)
    {
        super(id, name, year, month, dayOfMonth, phoneNumber, Email);
        this.penName=penName;
        count++;
    }
    public String getPenName()
    {
        return penName;
    }
    public void setPenName(String penName)
    {
        this.penName=penName;
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
        System.out.println("Pen name: "+getPenName());
        System.out.println("Email: "+getEmail());
        System.out.println("Phone number: "+getPhoneNumber());
    }
}
