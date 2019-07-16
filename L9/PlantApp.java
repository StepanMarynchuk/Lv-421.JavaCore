package newpackage;

import newpackage.Plant.Color;
import newpackage.Plant.Type;

public class PlantApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant[] p = new Plant[5];

		try {
			p[0] = new Plant(50, "BLACK", "FLOWER");
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());

		}

		try {
			p[1] = new Plant(60, "green1", "flower");
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());

		}
		try {
			p[2] = new Plant(70, "grey", "flower2");
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());

		}
		try {
			p[3] = new Plant(80, "red", "algae");
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());

		}
		try {
			p[4] = new Plant(90, "white", "coniferms");
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());

		}

		for (Plant pl : p) {
			System.out.println(pl);
		}
	}
}