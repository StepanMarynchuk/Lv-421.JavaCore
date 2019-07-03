package java_study;

public enum Breed {
	AKITA, MALAMUTE, BULLDOG, TERRIER;

	public Breed nextBreeds() {
		if (this == Breed.AKITA)
			return MALAMUTE;
		if (this == Breed.MALAMUTE)
			return BULLDOG;
		if (this == Breed.BULLDOG)
			return Breed.TERRIER;
		return Breed.AKITA;
	}

}
