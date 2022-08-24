package StringTasks;

public class String1 {

   /* Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"*/

    public static String helloName(String name) {
        return "Hello "+name+ "!";
    }


    /*Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

    makeAbba("Hi", "Bye") → "HiByeByeHi"
    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    makeAbba("What", "Up") → "WhatUpUpWhat"*/

    public static String makeAbba(String a, String b) {
        return a+b+b+a;
    }


   /* The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

    makeTags("i", "Yay") → "<i>Yay</i>"
    makeTags("i", "Hello") → "<i>Hello</i>"
    makeTags("cite", "Yay") → "<cite>Yay</cite>"*/

    public static String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }


   /* Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

    makeOutWord("<<>>", "Yay") → "<<Yay>>"
    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    makeOutWord("[[]]", "word") → "[[word]]"*/

    public static String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2);
    }



/*    Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"*/

    public static String extraEnd(String str) {
        String s= str.substring(str.length()-2);
        return s+s+s;
    }



/*    Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

    firstTwo("Hello") → "He"
    firstTwo("abcdefg") → "ab"
    firstTwo("ab") → "ab"*/

    public static String firstTwo(String str) {
        return (str.length() >=1)? (str.length()==1)?Character.toString(str.charAt(0)) :str.substring(0,2) :"";
    }



/*    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"*/

    public static String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }



/*    Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

    withoutEnd("Hello") → "ell"
    withoutEnd("java") → "av"
    withoutEnd("coding") → "odin"*/

    public static String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }



    /*Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab"*/

    public static String comboString(String a, String b) {
        if(a.length()>b.length()){
            return b+a+b;
        }
        else{
            return a+b+a;
        }
    }


/*    Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"*/

    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1) ;
    }


/*    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

    left2("Hello") → "lloHe"
    left2("java") → "vaja"
    left2("Hi") → "Hi"*/

    public static String left2(String str) {
        return str.substring(2) +str.substring(0,2);
    }


/*   Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

    right2("Hello") → "loHel"
    right2("java") → "vaja"
    right2("Hi") → "Hi"*/
public static String right2(String str) {
    return str.substring(str.length()-2) + str.substring(0,str.length()-2);
}


   /* Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

            theEnd("Hello", true) → "H"
    theEnd("Hello", false) → "o"
    theEnd("oh", true) → "o"*/

    public static String theEnd(String str, boolean front) {
        if(front){
            return Character.toString(str.charAt(0));
        }
        return Character.toString(str.charAt(str.length()-1));
    }


/*    Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

    withouEnd2("Hello") → "ell"
    withouEnd2("abc") → "b"
    withouEnd2("ab") → ""*/

    public static String withouEnd2(String str) {
        return (str.length()>2)?str.substring(1,str.length()-1) :"";
    }



/*    Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

    middleTwo("string") → "ri"
    middleTwo("code") → "od"
    middleTwo("Practice") → "ct"*/

    public static String middleTwo(String str) {
        return str.substring(str.length()/2-1, str.length()/2+1);
    }



/*    Given a string, return true if it ends in "ly".

    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false*/

    public static boolean endsLy(String str) {
        return (str.length()>=2 && str.substring(str.length()-2).equals("ly"));
    }

/*    Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"*/

    public static String nTwice(String str, int n) {
        return str.substring(0,n)+str.substring(str.length()-n);
    }


/*    Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small
      to define a string length 2, use the first 2 chars. The string length will be at least 2.

    twoChar("java", 0) → "ja"
    twoChar("java", 2) → "va"
    twoChar("java", 3) → "ja"*/
public static String twoChar(String str, int index) {
    return (index> 0 && str.length()>index+1)?str.substring(index,index+2) :str.substring(0,2);
}

   /* Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"*/

    public static String middleThree(String str) {
        return str.substring(str.length()/2-1, str.length()/2+2);
    }


   /* Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or
      "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.

            hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false*/

    public static boolean hasBad(String str) {
        return (str.length()>=3 && (str.substring(0,3).equals("bad") || (str.length()>=4 &&
                str.substring(1,4).equals("bad") )));
    }


/*    Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.

            atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"*/

    public static String atFirst(String str) {
        return (str.length()>1)? str.substring(0,2) :(str.length()==1)?str.substring(0,1)+"@"  :"@@";
    }


    /*Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya".
    If either string is length 0, use '@' for its missing char.

    lastChars("last", "chars") → "ls"
    lastChars("yo", "java") → "ya"
    lastChars("hi", "") → "h@"*/

    public static String lastChars(String a, String b) {
        String tmp="@";
        if(a.length()!=0){
            tmp = a.substring(0,1);
        }
        String tmp2="@";
        if(b.length()!=0){
            tmp2 = b.substring(b.length()-1,b.length());
        }
        return  tmp + tmp2 ;
    }

   /* Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates
    a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc"*/

    public static String conCat(String a, String b) {
        if(a.length()!=0 && b.length()!=0 && a.charAt(a.length()-1)==(b.charAt(0))){
            return a.substring(0, a.length()-1)+b;
        }
        return a+b;
    }

/*    Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

    lastTwo("coding") → "codign"
    lastTwo("cat") → "cta"
    lastTwo("ab") → "ba"*/

    public static String lastTwo(String str) {
        if(str.length()>1){
            return str.substring(0, str.length()-2)+ str.charAt(str.length()-1) + str.charAt(str.length()-2);
        }
        return str;
    }

    /* Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

            seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"*/

    public static String seeColor(String str) {
        if(str.length()>=3){
            if(str.substring(0,3).equals("red")){
                return "red";
            }
            if(str.length()>=4){
                if(str.substring(0,4).equals("blue")){
                    return "blue";
                }
            }
        }
        return "";
    }


/*    Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

    frontAgain("edited") → true
    frontAgain("edit") → false
    frontAgain("ed") → true*/

    public static boolean frontAgain(String str) {
        return (str.length()>1 && str.substring(0,2).equals(str.substring(str.length()-2, str.length())));
    }


    /*Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different
    lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

    minCat("Hello", "Hi") → "loHi"
    minCat("Hello", "java") → "ellojava"
    minCat("java", "Hello") → "javaello"*/

    public static String minCat(String a, String b) {
        int tmp;
        if(a.length()>=b.length()){
            tmp=b.length();
        }
        else{
            tmp=a.length();
        }
        if(a.length()==0 || b.length()==0){
            return "";
        }
        return a.substring(a.length()-tmp, a.length())+b.substring(b.length()-tmp, b.length());
    }


    /*Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars,
    use whatever is there.

    extraFront("Hello") → "HeHeHe"
    extraFront("ab") → "ababab"
    extraFront("H") → "HHH"*/

    public static String extraFront(String str) {
        if(str.length()==0){
            return "";
        }
        if(str.length()==1){
            return str+str+str;
        }
        return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
    }


    /*Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
    The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

    without2("HelloHe") → "lloHe"
    without2("HelloHi") → "HelloHi"
    without2("Hi") → ""*/

    public static String without2(String str) {
        if(str.length()>1 && str.substring(0,2).equals(str.substring(str.length()-2, str.length())))
        {
            return str.substring(2);
        }
        return str;
    }



/*    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'.
      The string may be any length.Harder than it looks.

    deFront("Hello") → "llo"
    deFront("java") → "va"
    deFront("away") → "aay"*/

    public static String deFront(String str) {
        String tmp="";

        if(str.charAt(0)=='a'){
            tmp+="a";
        }
        if(str.charAt(1)=='b'){
            tmp+="b";
        }
        tmp+=str.substring(2);
        return tmp;
    }


  /*  Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first
    char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo"
    the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.

    startWord("hippo", "hi") → "hi"
    startWord("hippo", "xip") → "hip"
    startWord("hippo", "i") → "h"*/

    public static String startWord(String str, String word) {
        if(str.length()>1){
            if(str.substring(0,word.length()).equals(word.substring(0)) ){
                return str.substring(0,word.length());
            }

            if(str.substring(1,word.length()).equals(word.substring(1)) ){
                return str.substring(0,word.length());
            }
        }
        if(str.length()==1 && str.length()==word.length()){
            return str;
        }
        return "";
    }

/*
    Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


            withoutX("xHix") → "Hi"
    withoutX("xHi") → "Hi"
    withoutX("Hxix") → "Hxi"*/

    public static String withoutX(String str) {
        String tmp="";
        if(str.length()>1){
            if(!str.substring(0,1).equals("x")){
                tmp+=str.substring(0,str.length()-1);
            }
            else{
                tmp+=str.substring(1,str.length()-1);
            }
            if(!str.substring(str.length()-1).equals("x")){
                tmp+=str.substring(str.length()-1);
            }
        }
        else{
            if(str.length()==1){
                return (str.charAt(0)=='x')?"" :str;
            }
            return str;
        }
        return tmp;
    }

/*    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
    This is a little harder than it looks.


    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi"*/
    public static String withoutX2(String str) {
        String tmp="";
        if(str.length()>1){
            if(!str.substring(0,1).equals("x")){
                tmp+=str.substring(0,1);
            }

            if(!str.substring(1,2).equals("x")){
                tmp+=str.substring(1);
            }
            else{
                tmp+=str.substring(2);
            }
        }
        else{
            if(str.length()==1){
                return (str.charAt(0)=='x')?"" :str;
            }
            return str;
        }
        return tmp;
    }

}
