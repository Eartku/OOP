
import java.time.LocalDate;

public abstract class Person{
    protected String id;
    protected String name;
    protected LocalDate date;
    protected String phoneNumber;
    protected String Email;
    public Person(String name,int year,int month,int dayOfMonth,String phoneNumber,String Email)
    {
        this.name=name;
        this.date=LocalDate.of(year, month, dayOfMonth);
        this.phoneNumber=phoneNumber;
        this.Email=Email;
    }
    public Person(String id,String name,int year,int month,int dayOfMonth,String phoneNumber,String Email)
    {
        this.id=id;
        this.name=name;
        this.date=LocalDate.of(year, month, dayOfMonth);
        this.phoneNumber=phoneNumber;
        this.Email=Email;
    }
    abstract public void showInfo();
}