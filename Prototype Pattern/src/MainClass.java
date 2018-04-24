//Where we use this pattern?
//Sometime object creation is become more costly like if object access many resources or require lot of time
 //and we have already similar object exiting.So this pattern provide a way to copy the existing object to a new object
  //and then modify the new object according our needs


import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException {

        Computer computer=new Computer();
        computer.addcompany();

        Computer computer1=(Computer)computer.clone();
        Computer computer2=(Computer) computer.clone();

        List<String> com1=computer1.getCompany();
        com1.add("HP");
        com1.add("ACER");
        com1.add("LENOVO");

        List<String> com2=computer2.getCompany();
        com2.add("INTEL");
        com2.add("SAMSUNG");
        com2.add("RAZERBLADE");

        System.out.println(com1);
        System.out.println(com2);


    }
}
