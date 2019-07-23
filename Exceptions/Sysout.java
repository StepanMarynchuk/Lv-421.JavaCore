import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

public class Sysout {

    public static void main(String[] args) {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        try {
            Plant[] list = new Plant[2];
            Plant p1 = new Plant();
            Plant p2 = new Plant();
            Plant p3 = new Plant();
            for (int i = 0; i < list.length; i++) {
                System.out.println("enter color, please");
                System.out.println("enter type, please");
                String color = br.readLine();
                String type = br.readLine();
               list[i].color = list[i].colorStrToEnum(color);
               list[i].type = list[i].typeStrToEnum(type);
//                System.out.println("enter color, please");
//                System.out.println("enter type, please");
//                String color1 = br.readLine();
//                String type2 = br.readLine();
//                p2.color = p2.colorStrToEnum(color1);
//                p2.type = p2.typeStrToEnum(type2);


                System.out.println(list[i]);
            }
        }catch (IOException e) {
            System.out.println("file not found");

        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + '\n');
        } catch (NullPointerException e ){
            System.out.println(e.getMessage() + '\n');
        }
        System.out.println("thank you");//кидає NullPointerException ??????//
    }
}
