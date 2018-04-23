import java.util.ArrayList;

public class WhetherStation implements Observable {

    private ArrayList<Observer> observerArrayList;
    private double temp, pressure, humidity;

    WhetherStation() {
        observerArrayList = new ArrayList<>();
    }

    @Override
    public void registerobserver(Observer registobserver) {
        if (!observerArrayList.contains(registobserver))
            observerArrayList.add(registobserver);
    }

    @Override
    public void deregisterobserver(Observer deregistobserver) {
        if (observerArrayList.contains(deregistobserver)) {
            int index = observerArrayList.indexOf(deregistobserver);
            observerArrayList.remove(index);
        }
    }

    @Override
    public void notification() {
        for (Observer ob : observerArrayList) {
            ob.updatefromstation(temp, pressure, humidity);
        }
    }

    public void getdatafromsensor(double temperature, double pressure, double humidity) {
        this.temp = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notification();
    }
}
