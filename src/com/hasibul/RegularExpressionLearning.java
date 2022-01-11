package com.hasibul;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionLearning {

    public static void main(String[] args) {
        String textToMatch = "H";
        String regex = "[**]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textToMatch);

        System.out.println("Is found? " + matcher.find());
        System.out.println("Text '"+matcher.group()+"'"+" Matches at "+matcher.start() + " and end at "+matcher.end());
    }
}
