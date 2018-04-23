public class ComputerFactory {
    public static Computer getclass(String str)
    {
        if(str.equalsIgnoreCase("server"))
            return new Server();
        else if(str.equalsIgnoreCase("desktop"))
            return new Desktop();
        else if(str.equalsIgnoreCase("workstation"))
            return new WorkStation();
        else
            return null;
    }
}
