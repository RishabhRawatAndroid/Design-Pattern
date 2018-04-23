public class MainClass {
    public static void main(String[] args) {

        Computer computer=ComputerFactory.getclass("SERVER");
        System.out.println(computer.toString());
        Computer computer1=ComputerFactory.getclass("DESKTOP");
        System.out.println(computer1.toString());
        Computer computer2=ComputerFactory.getclass("WorkstaTion");
        System.out.println(computer2.toString());
    }


}
