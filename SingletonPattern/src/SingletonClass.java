public class SingletonClass {
    public static SingletonClass captain;
    private static String captainname;

    private SingletonClass() {
    }

    public static synchronized SingletonClass getCaptain() throws IllegalAccessException {
        if (captain == null) {
            captain = new SingletonClass();
            return captain;
        } else {
            throw new IllegalAccessException("Object already created (Captain already decided who is "+captainname+")");
        }
    }

    public void setCaptainName(String name) {
        captainname = name;
    }

    public String getCaptainname() {
        return captainname;
    }

}
