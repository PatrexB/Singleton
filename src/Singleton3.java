public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3(){

    }

    public static synchronized Singleton3 getInstance(){
        if (instance == null)
            instance = Singleton3();

            return instance;
    }
}
