public class DatabaseConnection implements DeepCopyClone,ShallowCopyClone {

    private String hostname;
    private int portname;
    private String servername;
    private boolean nameconnection;

    public DatabaseConnection(String hostname, int portname, String servername,boolean nameconnection) {
        this.hostname = hostname;
        this.portname = portname;
        this.servername = servername;
        this.nameconnection=nameconnection;
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

    public boolean isNameconnection() {
        return nameconnection;
    }

    public void setNameconnection(boolean connection) {
        this.nameconnection=connection;
        Thread thread;
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
                    nameconnection=false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

       }
    }

    @Override
    public Object deepCloneCopy() throws CloneNotSupportedException{
       return new DatabaseConnection(this.hostname,this.portname,this.servername,this.nameconnection);
    }

    @Override
    public Object shallowCopyClone() throws CloneNotSupportedException {
        return this;
    }
}
