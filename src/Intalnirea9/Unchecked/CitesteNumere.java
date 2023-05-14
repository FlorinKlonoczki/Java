package Intalnirea9.Unchecked;

import java.util.ArrayList;
import java.util.List;

public class CitesteNumere {
    public static void main(String[] args) {
        List<String> numereStrings = new ArrayList<>();
        numereStrings.add("1");
        numereStrings.add("3");
        numereStrings.add("6");
        numereStrings.add("1a");

        List<Integer> numereTransformate = new ArrayList<>();
        for (String numereString : numereStrings) {
            try{
                numereTransformate.add(Integer.parseInt(numereString));
            }catch (NumberFormatException e) {///luam NumberFormatException din libraria parseIn
                System.out.println("S- introdus un numar invalid " + numereString);

            }

        }

        System.out.println(numereTransformate);
    }

}
