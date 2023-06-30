package com.FullCreative.intern;

public class AAA {
    public static String getUserName (String firstName, String lastName) {
        // return the user name as LastName, FirstName e.g. Smith, John
        String result=null;
        if(lastName==null)
            return capitaliseFirstLetter(firstName);
        result=capitaliseFirstLetter(lastName)+", "+capitaliseFirstLetter(firstName);
        return result;
    }


    public static String capitaliseFirstLetter (String s) {
        if (s == null || s.length() < 1) {
            return s;
        }

        char[] chars = s.toCharArray();

        chars[0] = Character.toUpperCase(chars[0]);

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(getUserName("krishna",null));
    }
}
