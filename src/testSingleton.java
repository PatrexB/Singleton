public class testSingleton {
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        s1.name = "Patryk";
        Singleton2 s2 = Singleton2.INSTANCE;
        s2.name = "Kamil";
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
