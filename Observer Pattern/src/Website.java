public class Website implements Observer {

   Observable observable;
    @Override
    public void updatefromstation(double temp, double pressure, double humidity) {
        System.out.println(" Website ");
        System.out.println("Temp "+temp+"°");
        System.out.println("Pressure "+pressure+" db");
        System.out.println("Humidity "+humidity+" Φ");
        System.out.println("--------------------------------------------------------------------");

    }

    public void registerobervable(Observable observable1)
    {
        this.observable=observable1;
        observable.registerobserver(this);
    }

    public void deregisterobservable(Observable observable)
    {
        this.observable=observable;
        observable.deregisterobserver(this);
    }


}
