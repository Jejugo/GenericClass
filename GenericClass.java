

public class GenericClass<T> implements GenericInter<T>{

	//It is importante that you have values attached to the class
	//you are implementing since they will be passed as parameters

	private T key;


	//A constructor that will receive values and
	//put into the class values
	public GenericClass (T key){
		this.key = key;
	}

	//Override method necessary because of the interface
	@Override
	public T getKey(){
		return this.key;
	}

	public <U> void inspect (U u){
		System.out.println("T: " + key.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}
}