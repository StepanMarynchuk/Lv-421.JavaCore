
public class Dog {
	  String name;
      Breed breed;
	  int Age;
	  
	public enum Breed{
		Mops, NimetskaVivcharka,Alabay  
	}

	
	public Dog(String name, Breed breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		Age = age;
	}
	public static void main(String[] args) {
	
	Dog dog1 = new Dog("Johny", Breed.Mops, 8);
	Dog dog2 = new Dog("Ruf", Breed.NimetskaVivcharka, 12);
	Dog dog3 = new Dog("Ruf", Breed.Alabay, 4);	
	if (dog1.name==dog2.name) {
		System.out.println("Sobaki mayut odnakovi imena : "+dog1 +" i "+dog2);
	}
	if(dog1.name==dog3.name) {
		System.out.println("Sobaki mayut odnakovi imena : "+dog1 +" i "+dog3);
		
	}
	if(dog2.name==dog3.name) {
		System.out.println("Sobaki mayut odnakovi imena : "+dog2 +" i "+dog3);
		
	}else {
		System.out.println("Vsi sobaki mayut' unikal'ni imena");
	}
		if(dog1.Age>dog2.Age&&dog1.Age>dog3.Age) {
			System.out.println("Naystarsha sobaka: "+dog1+" Yiyi vik: "+dog1.Age);
		}
		if(dog2.Age>dog3.Age&&dog2.Age>dog1.Age) {
			System.out.println("Naystarsha sobaka: "+dog2+" Yiyi vik: "+dog2.Age);
		}
		if (dog3.Age>dog1.Age&&dog3.Age>dog2.Age) {
			System.out.println("Naystarsha sobaka: "+dog3+" Yiyi vik: "+dog3.Age);
		}
	}
	@Override
	public String toString() {
		return "["+breed+" " + name + "]";
		
	}
	

}
