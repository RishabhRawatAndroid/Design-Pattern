public abstract class Computer {

    public abstract String HDD();
    public abstract String RAM();
    public abstract String PROCESSOR();

    @Override
    public String toString() {
        return "Hardrive is "+this.HDD()+"\nRam is "+this.RAM()+"\nProcessor is "+this.PROCESSOR();
    }
}
