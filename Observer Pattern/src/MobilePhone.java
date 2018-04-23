public class MobilePhone implements Observer {

    Observable observable;
    @Override
    public void updatefromstation(double temp, double pressure, double humidity) {
        System.out.println(" Mobile Phone ");
        System.out.println("Temp "+temp+"°");
        System.out.println("Pressure "+pressure+" db");
        System.out.println("Humidity "+humidity+" Φ");
        System.out.println("--------------------------------------------------------------------");
    }

    public void registerobervable(Observable observable)
    {
        this.observable=observable;
        observable.registerobserver(this);
    }

    public void deregisterobservable(Observable observable)
    {
        this.observable=observable;
        observable.deregisterobserver(this);
    }



}
