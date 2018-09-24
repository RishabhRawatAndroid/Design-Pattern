public class DatabaseConnection implements DeepCopyClone,ShallowCopyClone {

    private String hostname;
    private int portname;
    private String servername;
    private boolean requireconnection;

    public DatabaseConnection(String hostname, int portname, String servername,boolean requireconnection) {
        this.hostname = hostname;
        this.portname = portname;
        this.servername = servername;
        this.requireconnection=requireconnection;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPortname() {
        return portname;
    }

    public void setPortname(int portname) {
        this.portname = portname;
    }

    public String getServername() {
        return servername;
    }

    public void setServername(String servername) {
        this.servername = servername;
    }

    public boolean getRequireConnection() {
        return requireconnection;
    }

    public void setRequireconnection(boolean connection) {
        this.requireconnection=connection;
        if(connection==true)
        {
            new Thread(() -> {
                try {
                    //suppose database connection require lots of time
                    for(int i=0;i<=10;i++)
                    {
                        Thread.sleep(500);
                        System.out.println("Make Connection "+i);
                    }
                    System.out.println("Connection Successfully establish");
                    requireconnection=false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

       }
    }

    @Override
    public Object deepCloneCopy() throws CloneNotSupportedException{
       return new DatabaseConnection(this.hostname,this.portname,this.servername,this.requireconnection);
    }

    @Override
    public Object shallowCopyClone() throws CloneNotSupportedException {
        return this;
    }
}
