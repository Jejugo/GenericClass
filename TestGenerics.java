

public class TestGenerics {
	public static void main (String args[]){

		//Generic Class creation

		//If the implementation of a Generic Class is made by an Interface
		//It is important that the INTERFACE'S name come before to instanciate
		//the class.

		//Creating 2 Generic classes 
		GenericInter<String> pessoa = new GenericClass<>("Jeff");
		GenericInter<Integer> conta = new GenericClass<>(10);

		//Printing it out
		System.out.println("\n O nome da pessoa é " + pessoa.getKey());

		System.out.println(conta.inspect(123));

//		System.out.println("\n ")

	}

}