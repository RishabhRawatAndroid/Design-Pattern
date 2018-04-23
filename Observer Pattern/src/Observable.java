public interface Observable {


    void registerobserver(Observer registobserver);

    void deregisterobserver(Observer deregistoberser);

    void notification();

}
