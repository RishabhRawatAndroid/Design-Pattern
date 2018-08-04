public class Apple extends MobilePhone {
    @Override
    public String getCompany() {
        return "Apple Corporation";
    }

    @Override
    public String configuration() {
        return "A12 processor 2GB RAM 64GB Memory";
    }

    @Override
    public float price() {
        return 1000;
    }

    @Override
    public String madeCountry() {
        return "United State of America";
    }
}
