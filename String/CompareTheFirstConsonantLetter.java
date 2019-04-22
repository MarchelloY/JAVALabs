package com.marchello.labs.String;

import java.util.*;

public class CompareTheFirstConsonantLetter implements Comparator<String>{
    private final static String CONSONANTS = "BCDFGHJKLMNPQRSTVXZWYЙЦКНГШЩЗХЪФВПРЛДЖЧСМТЬБ";
    public int compare(String a, String b) {
        return getFirstConsonant(a).compareTo(getFirstConsonant(b));
    }
    private Character getFirstConsonant(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (isConsonant(string.charAt(i))) {
                return string.charAt(i);
            }
        }
        return Character.MIN_VALUE;
    }
    private static boolean isConsonant(Character c) {
        return CONSONANTS.indexOf(Character.toUpperCase(c)) > -1;
    }
    static boolean startsWithVowel(String s) {
        return s.length() > 0 && !isConsonant(s.charAt(0));
    }
}
