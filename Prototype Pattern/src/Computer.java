import java.util.ArrayList;
import java.util.List;

public class Computer implements Cloneable {

    private List<String> company;

    Computer()
    {
        company=new ArrayList<>();
    }

    Computer(List<String > company)
    {
        this.company=company;
    }

    public List<String> getCompany()
    {
        return company;
    }

    public void addcompany()
    {
        company.add("ASUS");
        company.add("MSI");
        company.add("DELL");
        company.add("ASROCK");
        company.add("GIGABYTE");
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        List<String> com=new ArrayList<>();
        for(String c:this.getCompany())
        {
            com.add(c);
        }
        return new Computer(com);
    }
}
