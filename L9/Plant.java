package newpackage;

public class Plant {

	private int size;
	private Color color;
	private Type type;

	public enum Color {

		WHITE, BLACK, RED,GREEN, GREY
	}

	public enum Type {
		ALGAE, FLOWER, CONIFERS,FLOWER2,FLOWER3
	}

	public Plant(int size, String color, String type) throws ColorException, TypeException{
		Color c = colorStrToEnum(color);
		Type t = typeStrToEnum(type);
		this.size = size;
		this.color = c;
		this.type = t;
	}
	
	private Color colorStrToEnum(String color) throws ColorException {
		switch(color.toUpperCase()){
		case "WHITE": return Color.WHITE;
		case "BLACK": return Color.BLACK;
		case "RED": return Color.RED;
		case "GREEN": return Color.GREEN;
		case "GREY": return Color.GREY;
		default : throw new ColorException("no color");}
		}
	
		private Type typeStrToEnum (String type) throws TypeException {
			switch(type.toUpperCase()){
			case "ALGAE": return Type.ALGAE;
			case "FLOWER": return Type.FLOWER;
			case "CONIFERS": return Type.CONIFERS;
			case "FLOWER2": return Type.FLOWER2;
			case "FLOWER3": return Type.FLOWER3;
			default : throw new TypeException("no type");
			}		
		
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

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}
}
