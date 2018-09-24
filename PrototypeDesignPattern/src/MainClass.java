public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        String hostname="tigerscott";
        int portname=8080;
        String servername="Linux";
        boolean Isconnection=true;
        DatabaseConnection connection=new DatabaseConnection(hostname,portname,servername,Isconnection);
        connection.setNameconnection(Isconnection);


        Thread.sleep(6000);

        //Deep Copy Clone
        System.out.println("-------------------------------------------------------------");
        DatabaseConnection connection1= (DatabaseConnection) connection.deepCloneCopy();
        System.out.println("HostName "+connection1.getHostname());
        System.out.println("PortName "+connection1.getPortname());
        System.out.println("ServerName "+connection1.getServername());
        //if it return false that means connection already establish and we don't need to make a connection again
        //which take the 10 or more second
        //and if it return true that means database connection not establish
        System.out.println("RequireConnection "+connection1.isNameconnection());
        connection1.setServername("Red hut Linux");
        System.out.println("Change Server Name "+connection.getServername());
        System.out.println("--------------------------------------------------------------");

        //Shallow Copy Clone
        System.out.println("-------------------------------------------------------------");
        DatabaseConnection connection2= (DatabaseConnection) connection.shallowCopyClone();
        System.out.println("HostName "+connection2.getHostname());
        System.out.println("PortName "+connection2.getPortname());
        System.out.println("ServerName "+connection2.getServername());
        //if it return false that means connection already establish and we don't need to make a connection again
        //which take the 10 or more second
        //and if it return true that means database connection not establish
        System.out.println("RequireConnection "+connection2.isNameconnection());
        connection2.setServername("Windows");
        System.out.println("Change Server Name "+connection.getServername());
        System.out.println("--------------------------------------------------------------");
    }
}
