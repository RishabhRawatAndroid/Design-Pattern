public class MainClass {
    public static void main(String[] args) {

        MobilePhone mobilePhone = MobilePhoneFactory.buyphone("apple");
        System.out.println(mobilePhone.getCompany());
        System.out.println(mobilePhone.configuration());
        System.out.println(mobilePhone.madeCountry());
        System.out.println(mobilePhone.price());

        MobilePhone mobilePhone1= MobilePhoneFactory.buyphone("samsung");
        System.out.println(mobilePhone1.getCompany());
        System.out.println(mobilePhone1.configuration());
        System.out.println(mobilePhone1.madeCountry());
        System.out.println(mobilePhone1.price());
    }
}
