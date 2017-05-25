package multithreading;

public class SingletonExample {
	private static SingletonExample singletonInstance;
	 
    // SingletonExample prevents any other class from instantiating
    private SingletonExample() {
    }
 
    // Providing Global point of access
    public static SingletonExample getSingletonInstance() {
        if (null == singletonInstance) {
            singletonInstance = new SingletonExample();
        }
        return singletonInstance;
    }
 
    void printSingleton(){
        System.out.println("Inside print Singleton");
        abc();
    }
    private void abc(){
    	System.out.println("dfjshf");
    }

}
