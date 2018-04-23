public class MainClass {

    public static void main(String[] args) throws InterruptedException {

        WhetherStation station=new WhetherStation();

        MobilePhone mobilePhone=new MobilePhone();
        mobilePhone.registerobervable(station);

        Website website=new Website();
        website.registerobervable(station);

        Cloud cloud=new Cloud();
        cloud.registerobervable(station);

        station.getdatafromsensor(45.5,36,59);
        Thread.sleep(3000);
        station.getdatafromsensor(50,49,45);
        mobilePhone.deregisterobservable(station);
        System.out.println("####################################################################");
        station.getdatafromsensor(100,100,100);
    }
}
