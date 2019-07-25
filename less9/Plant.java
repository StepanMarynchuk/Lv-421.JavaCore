package less9;

public class Plant {
	
	public enum Type {
		annuals, bulbs, cactus, herbs;
	}	
	
	public enum Color {
		red, green, blue, white;
	}
		private Color color;
		private Type type;
		private int size;
		
		public Plant(String color, String type, int size) throws ColorException, TypeException {
			this.size = size;
			this.color = colorCheck(color);
			this.type = typeCheck(type);
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(String color) throws ColorException {
			this.color = colorCheck(color);
		}

		public Type getType() {
			return type;
		}

		public void setType(String type) throws TypeException {
			this.type = typeCheck(type);
		}

		@Override
		public String toString() {
			return "Plant (size- " + size + ",  color- " + color + ",  type- " + type + ")";
		}
		
		private Color colorCheck (String color) throws ColorException{
			switch(color.toLowerCase()) {
			case "red" : return Color.red;
			case "green" : return Color.green;
			case "blue" : return Color.blue;
			case "white" : return Color.white;
			default: throw new ColorException();
			}
		}
		private Type typeCheck (String color) throws TypeException{
			switch(color.toLowerCase()) {
			case "annuals" : return Type.annuals;
			case "bulbs" : return Type.bulbs;
			case "cactus" : return Type.cactus;
			case "herbs" : return Type.herbs;
			default: throw new TypeException();
			}
		}
}
