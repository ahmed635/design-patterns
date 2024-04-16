package creational.singleton;

public class EagerInitializedSingleton {
    private static EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        System.out.println("Singleton pattern using eager initialisation");
    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
