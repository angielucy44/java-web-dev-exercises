package org.launchcode.java.studios.countingcharacters;

import java.util.*;

public class CountingCharacters {

    public static void main(String[] args) {
        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> characterCount = new HashMap<>();
        int total = 0;

        char[] charactersInString = hiddenFigures.toCharArray();
        for (int i = 0; i<charactersInString.length; i++) {
            if (characterCount.containsKey(charactersInString[i])){
                characterCount.put(charactersInString[i], characterCount.get(charactersInString[i]) +1);
            }
            else {
                characterCount.put(charactersInString[i], 1);
            }
        }
//        if (Arrays.asList(charactersInString).contains(i)) {
//            total = ;
//        }
//        characterCount.put(i, total);
//       // total ++;
//    }

//        total = i.count();
//
//    }
//        for (Map.Entry<Character, Integer> j : characterCount.entrySet()) {
//           // total += 1;
//            System.out.println(j.getKey() + " (" + j.getValue() + ")");
////        }
//        }
//    if (characterCount.containsKey()){
//        (map.entry
//    }
//

        for (Map.Entry<Character, Integer> entry : characterCount.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        // System.out.println(characterCount);
    }
}
