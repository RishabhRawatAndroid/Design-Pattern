public class MobilePhoneFactory {


    public static MobilePhone buyphone(String company) {
        if (company.equalsIgnoreCase("samsung")) {
            return new Samsung();
        } else if (company.equalsIgnoreCase("apple")) {
            return new Apple();
        } else if (company.equalsIgnoreCase("xiaomi")) {
            return new Xiaomi();
        } else {
            return null;
        }
    }

}
