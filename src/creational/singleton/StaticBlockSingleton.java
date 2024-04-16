package creational.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    private StaticBlockSingleton(){
        System.out.println("Singleton pattern using static block.");
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
