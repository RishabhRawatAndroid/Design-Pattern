public class MainClass {
    public static void main(String[] args) {
        MobilePhone mobilePhone= new MobilePhone.MobilePhoneBuilder("Samsung")
                .setDualsim(true).setProcessor("Snapdragon").setRam("8GB").setStorage("128GB").build();
        System.out.println(mobilePhone.getCompany());
        System.out.println(mobilePhone.getProcessor());
        System.out.println(mobilePhone.getRam());
        System.out.println(mobilePhone.getStorage());
        System.out.println(mobilePhone.isDualsim());
    }
}
