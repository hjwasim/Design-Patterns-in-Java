package singleton_dp;

public class SingletonClass {
	private static SingletonClass own_instance = new SingletonClass();

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		return own_instance;
	}
	
	public String getMessage() {
		return "Hii, This is from singleton class";
	}
}
