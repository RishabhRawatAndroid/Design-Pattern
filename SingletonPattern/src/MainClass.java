public class MainClass {
    public static void main(String[] args) throws IllegalAccessException {

        SingletonClass singletonClass=SingletonClass.getCaptain();
        singletonClass.setCaptainName("Rishabh");
        System.out.println("Captain Name is "+singletonClass.getCaptainname());

        SingletonClass singletonClass1=SingletonClass.getCaptain();
        singletonClass.setCaptainName("Rawat");
        System.out.println(singletonClass.getCaptainname());
    }
}
