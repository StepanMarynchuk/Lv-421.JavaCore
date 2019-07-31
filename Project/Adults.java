import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import sun.util.resources.LocaleData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.time.Period;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Adults extends Person {
    private VisitContent visitContent;

    public Adults(String name, String surName, int id, int dateOfBirth) {
        super(name, surName, id, dateOfBirth);
    }


    public Adults(BufferedReader bufferedReader) {
    }

    ;


    @Override
    public void visitDiscription() {
    }


    public void visitDiscription(BufferedReader br) throws IOException {
        System.out.println("input target and conclusion");
        String s = br.readLine();
        System.out.println(s);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}




