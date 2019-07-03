package java_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input 3 float numbers");
		float[] numbers = new float[3];
		for (int i = 0; i < 3; i++) {
			numbers[i] = Float.parseFloat(br.readLine());
		}
		checkrange(numbers);
		///////////////////////////////////////////////////////
		System.out.println("Input 3 int numbers");
		int[] inumbers = new int[3];
		for (int i = 0; i < 3; i++) {
			inumbers[i] = Integer.parseInt(br.readLine());
		}
		minmax(inumbers);
		///////////////////////////////////////////////////////
		System.out.println("Input error code ");
		int code = Integer.parseInt(br.readLine());
		checkcode(code);
		//////////////////////////////////////////////////////
		Breed breed = Breed.AKITA;
		Dog[] dogs = new Dog[3];
		for (int i = 0; i < 3; i++) {
			dogs[i] = new Dog("Name" + i, 2 + i, breed.nextBreeds());
		}
		dogs[0].samenames(dogs[1]);
		dogs[0].samenames(dogs[2]);
		dogs[1].samenames(dogs[2]);
		Dog.theoldest(dogs);
	}

	public static void checkcode(int code) {
		HTTPError error = null;
		switch (code) {
		case 400:
			error = HTTPError.BAD_REQUEST;
			break;
		case 403:
			error = HTTPError.FORBIDDEN;
			break;
		case 406:
			error = HTTPError.NOT_ACCEPTABLE;
			break;
		case 404:
			error = HTTPError.NOT_FOUND;
			break;
		default:
			System.out.println("Not such code");
		}
		System.out.println("Your error " + error);
	}

	public static void minmax(int[] inumbers) {
		int check = inumbers[0];
		for (int i = 0; i < 3; i++) {
			check = Math.max(check, inumbers[i]);
		}
		System.out.println("Max number " + check);
		for (int i = 0; i < 3; i++) {
			check = Math.min(check, inumbers[i]);
		}
		System.out.println("Min number " + check);

	}

	public static void checkrange(float[] f) {
		for (int i = 0; i < 3; i++) {
			if ((f[i] > 5.0) || (f[i] < -5.0)) {
				System.out.println("Out of range");
			} else
				System.out.println("In range");
		}
	}

}
