package Fruits;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CitrusTest {

    @Test
    public void input() {
        boolean p = false;
        try{
            Citrus ob =new Citrus("cncnc", "hhhh", -2.5);
        }

        catch (NumberFormatException e){
            p = true;
        }
        assertTrue(p);

    }

    @Test
    public void print() {
    }

    @Test
    public void toString1() {
    }
}