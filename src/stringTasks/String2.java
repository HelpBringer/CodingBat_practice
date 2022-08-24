package stringTasks;

public class String2 {


 /*   Given a string, return a string where for every char in the original, there are two chars.

            doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"*/

    public static String doubleChar(String str) {

        StringBuilder s = new StringBuilder(str);
        for(int i=0; i<str.length(); i++){
            s.insert(2*i+1, str.charAt(i));
        }

        return s.toString();

    }


/*    Return the number of times that the string "hi" appears anywhere in the given string.

    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2*/

    public static int countHi(String str) {
        int count=0;
        for(int i=1; i<str.length();i++){
            if(str.charAt(i-1)=='h' &&  str.charAt(i)=='i'){
                i++;
                count++;
            }
        }
        return count;
    }



 /*   Return true if the string "cat" and "dog" appear the same number of times in the given string.

    catDog("catdog") → true
    catDog("catcat") → false
    catDog("1cat1cadodog") → true*/

    public static boolean catDog(String str) {
        if ( (str.length() - str.replace("cat", "").length()) / 3 ==
                (str.length() - str.replace("dog", "").length()) / 3 ){
            return true;
        }
        return false;
    }


   /* Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

    countCode("aaacodebbb") → 1
    countCode("codexxcode") → 2
    countCode("cozexxcope") → 2*/

    public static int countCode(String str) {

        String s=str.replaceAll("co[a-zA-Z]e", "");
        return ( str.length() - s.length() ) / 4;
    }



    /*Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    Note: str.toLowerCase() returns the lowercase version of a string.

            endOther("Hiabc", "abc") → true
    endOther("AbC", "HiaBc") → true
    endOther("abc", "abXabc") → true*/

    public static boolean endOther(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()>= b.length()){
            String str=a.substring(a.length()-b.length());
            return str.equals(b);
        }
        else{
            String str=b.substring(b.length()-a.length(), b.length());
            return str.equals(a);
        }
    }


  /*  Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

    xyzThere("abcxyz") → true
    xyzThere("abc.xyz") → false
    xyzThere("xyz.abc") → true*/

    public static boolean xyzThere(String str) {
        String s=str.replaceAll("[^\\.]xyz", "");
        return ( str.length() != s.length() || str.startsWith("xyz"));
    }


/*    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false*/

    public static boolean bobThere(String str) {
        String s=str.replaceAll("b.b", "");
        return ( str.length() != s.length());
    }


    /*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
    So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

    xyBalance("aaxbby") → true
    xyBalance("aaxbb") → false
    xyBalance("yaaxbb") → false*/

    public static boolean xyBalance(String str) {
        String s=str.replaceAll("[x+].*[y]+", "");
        return !s.contains("x");
    }



    /*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a,
    the second char of b, and so on. Any leftover chars go at the end of the result.

    mixString("abc", "xyz") → "axbycz"
    mixString("Hi", "There") → "HTihere"
    mixString("xxxx", "There") → "xTxhxexre"*/

    public static String mixString(String a, String b) {
        StringBuilder str=new StringBuilder("");
        String tmp;
        Boolean reverse=false;
        if(a.length()<b.length()){
            tmp=a;
            a=b;
            b=tmp;
            reverse=true;
        }
        for(int i=0; i<a.length();i++){
            if(reverse){
                if(i<b.length()){
                    str.append(b.charAt(i));
                    str.append(a.charAt(i));
                }
                else{
                    str.append(a.substring(i));
                    break;
                }
            }
            else{
                if(i<b.length()){
                    str.append(a.charAt(i));
                    str.append(b.charAt(i));
                }
                else{
                    str.append(a.substring(i));
                    break;
                }
            }
        }

        return str.toString();
    }


   /* Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.

    repeatEnd("Hello", 3) → "llollollo"
    repeatEnd("Hello", 2) → "lolo"
    repeatEnd("Hello", 1) → "o"*/

    public static String repeatEnd(String str, int n) {
        StringBuilder s=new StringBuilder();
        for(int i=0; i<n;i++){
            s.append(str.substring(str.length()-n));
        }
        return s.toString();
    }


/*    Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string,
    and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

    repeatFront("Chocolate", 4) → "ChocChoChC"
    repeatFront("Chocolate", 3) → "ChoChC"
    repeatFront("Ice Cream", 2) → "IcI"*/

    public static String repeatFront(String str, int n) {
        StringBuilder s= new StringBuilder();
        for(int i=0;i<n;i++){
            s.append(str.substring(0,n-i));
        }
        return s.toString();
    }

/*
    Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

    repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    repeatSeparator("This", "And", 2) → "ThisAndThis"
    repeatSeparator("This", "And", 1) → "This"*/

    public static String repeatSeparator(String word, String sep, int count) {
        if(count == 0){
            return "";
        }
        StringBuilder s= new StringBuilder();
        for(int i=1;i<count;i++){
            s.append(word);
            s.append(sep);
        }
        s.append(word);
        return s.toString();
    }


    /*Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string?
    Assume that the string is not empty and that N is in the range 1..str.length().

    prefixAgain("abXYabc", 1) → true
    prefixAgain("abXYabc", 2) → true
    prefixAgain("abXYabc", 3) → false*/

    public static boolean prefixAgain(String str, int n) {
        String tmp= str.substring(n);
        return tmp.contains(str.substring(0,n));
    }



/*    Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz"
    must differ by at most one. This problem is harder than it looks.

    xyzMiddle("AAxyzBB") → true
    xyzMiddle("AxyzBB") → true
    xyzMiddle("AxyzBBB") → false*/

    public static boolean xyzMiddle(String str) {
        int length=str.length();
        final String XYZ= "xyz";
        if(length>2){
            if (length%2==0){
                if(str.substring(length/2 - 1, length/2 + 2 ).equals(XYZ) ||
                        str.substring(length/2 -2, length/2 +1).equals(XYZ)){
                    return true;
                }
            }
            else{
                if(str.substring(length/ 2 -1, length/ 2 + 2).equals(XYZ)){
                    return true;
                }
            }
        }
        return false;
    }



/*    A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given
    string, or return the empty string "" if there are not two pieces of bread.


            getSandwich("breadjambread") → "jam"
    getSandwich("xxbreadjambreadyy") → "jam"
    getSandwich("xxbreadyy") → ""*/

    public static String getSandwich(String str) {
        final String BREAD = "bread";
        int start= str.indexOf(BREAD);
        int finish= str.lastIndexOf(BREAD);
        String res="";
        if(start!=finish){
            res=str.substring(start+BREAD.length(), finish);
        }
        return res;
    }

    /*Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

            sameStarChar("xy*yzz") → true
    sameStarChar("xy*zzz") → false
    sameStarChar("*xa*az") → true*/

    public static boolean sameStarChar(String str) {
        for (int i=1; i<str.length()-1;i++){
            if(str.charAt(i)=='*' && str.charAt(i-1) != str.charAt(i+1)){
                return false;
            }
        }
        return true;
    }



/*    Given a string, compute a new string by moving the first char to come after the next two chars,
    so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

    oneTwo("abc") → "bca"
    oneTwo("tca") → "cat"
    oneTwo("tcagdo") → "catdog"*/

    public static String oneTwo(String str) {
        if(str.length()>2){
            StringBuilder tmp = new StringBuilder();
            for (int i=0; i<str.length()/3; i++ ){
                //tmp.append(str.substring(3*i + 1 , 3*i + 3));
                tmp.append(str, 3*i + 1, 3*i + 3);
                tmp.append(str.charAt(3*i));
            }
            return tmp.toString();
        }
        return "";
    }



/*    Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all
    such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

    zipZap("zipXzap") → "zpXzp"
    zipZap("zopzop") → "zpzp"
    zipZap("zzzopzop") → "zzzpzp"*/

    public static String zipZap(String str) {
        StringBuilder tmp=new StringBuilder("");
        if(str.length()>2){
            for(int i=0; i<str.length(); i++){
                if (str.charAt(i)=='z' && str.charAt(i+2)=='p'){
                    tmp.append(str.charAt(i));
                    tmp.append(str.charAt(i+2));
                    i=i+2;
                    continue;
                }
                tmp.append(str.charAt(i));
            }
            return tmp.toString();
        }
        return str;
    }


   /* Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone.
    So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

    starOut("ab*cd") → "ad"
    starOut("ab**cd") → "ad"
    starOut("sm*eilly") → "silly"*/

    public static String starOut(String str) {
        StringBuilder tmp= new StringBuilder();
        Boolean flag=false;
        if(!str.contains("*")){
            return str;
        }
        if(str.charAt(0)=='*'){
            flag=true;
        }
        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i+1)=='*'){
                flag=true;
                i=i+1;
            }
            else{
                if(flag){
                    if(str.charAt(i)=='*'){
                        flag=true;
                        continue;
                    }
                    else{
                        flag=false;
                        continue;
                    }
                }
                tmp.append(str.charAt(i));
            }
        }
        if(str.charAt(str.length()-1)!='*' && str.charAt(str.length()-2)!='*'){
            tmp.append(str.charAt(str.length()-1));
        }
        return tmp.toString();
    }

/*
    Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"),
     except for appearances of the word string which are preserved unchanged.

    plusOut("12xy34", "xy") → "++xy++"
    plusOut("12xy34", "1") → "1+++++"
    plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"*/

    public static String plusOut(String str, String word) {
        StringBuilder tmp= new StringBuilder();
        Boolean end = false;
        for(int i=0; i < str.length() ; i++){
            if( (str.length()-word.length()+1 > i) &&
                    str.substring(i,i+word.length()).equals(word)){
                tmp.append(word);
                i=i+word.length()-1;
                if (i+1==str.length()-1){
                    end=true;
                }
            }
            else{
                tmp.append("+");
            }
        }
        //if(!end){
        // for(int i=str.length()-word.length();i<str.length();i++){
        //tmp.append("+");
        // }
        // }
        return tmp.toString();
    }



/*    Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string.
    Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

    wordEnds("abcXY123XYijk", "XY") → "c13i"
    wordEnds("XY123XY", "XY") → "13"
    wordEnds("XY1XY", "XY") → "11"*/

    public static String wordEnds(String str, String word) {
        StringBuilder tmp= new StringBuilder();

        for(int i=0; i<str.length()-word.length()+1;i++){
            if(str.substring(i,i+word.length()).equals(word)){
                if(i>=word.length()){
                    tmp.append(str.charAt(i-1));
                }
                if(i<str.length()-word.length()){
                    tmp.append(str.charAt(i+word.length()));
                }
            }
        }
        return tmp.toString();
    }

}
