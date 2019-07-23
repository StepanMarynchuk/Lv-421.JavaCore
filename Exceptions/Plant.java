import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Plant {
    //Create a class Plant, which includes fields int size, Color color and Type type,
    // and constructor where these fields are initialized. Color and type are Enum.
    // Override the method toString( ). Create classes ColorException and TypeException
    // and describe there all possible colors and types of plants.
    // In the method main create an array of five plants. Check to work your exceptions.
    public enum Color{Green, White, Yellow, Blue}




    public enum Type{Conifers, Algai, Mosses }
    private int size;
    public Plant(){};
    Color color = Color.Green;
    Type type = Type.Mosses;

    public Plant(int size) {
        this.size = size;
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



    public Plant(String color, String type)throws ColorException, TypeException{
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.color= c;
        this.type= t;

    }
public Color colorStrToEnum(String color)throws ColorException{
        switch (color.toLowerCase()){
            case "green": return Color.Green;
            case " white": return Color.White;
            case "blue": return Color.Blue;
            case "yellow": return Color.Yellow;
            default: throw new ColorException("enter: green, white, blue or yellow");
        }

}
public Type typeStrToEnum(String type)throws TypeException{
        switch ((type.toLowerCase())){
            case"conifers":return Type.Conifers;
            case "algai":return Type.Algai;
            case"mosses":return Type.Mosses;
            default:throw new TypeException("enter conifers, algai or mosses");
        }
}
    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}

