package StringTasks;

public class String3 {


   /* Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
    but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter
     immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

    countYZ("fez day") → 2
    countYZ("day fez") → 2
    countYZ("day fyyyz") → 2*/

    //TODO: add regex
    public static int countYZ(String str) {
        int count=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length()-1; i++){
            if( (str.charAt(i)=='z' || str.charAt(i)=='y'  )&&
                    !Character.isLetter(str.charAt(i+1))){
                count++;
            }
        }
        if( str.charAt(str.length()-1)=='z' || str.charAt(str.length()-1)=='y'  ){
            count++;
        }
        return count;
    }



    /*Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed(not case sensitive).
    You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

    withoutString("Hello there", "llo") → "He there"
    withoutString("Hello there", "e") → "Hllo thr"
    withoutString("Hello there", "x") → "Hello there"*/

    public static String withoutString(String base, String remove) {
        base=base.replace(remove,"");
        remove=remove.toUpperCase();
        base=base.replace(remove,"");
        remove=remove.toLowerCase();
        base=base.replace(remove,"");

        return base;
    }


   /* Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere
    in the string (case sensitive).

    equalIsNot("This is not") → false
    equalIsNot("This is notnot") → true
    equalIsNot("noisxxnotyynotxisi") → true*/

    public static boolean equalIsNot(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(i<str.length()-2){
                if(str.substring(i,i+3).equals("not")){
                    count++;
                }
            }
            if(i<str.length()-1){
                if(str.substring(i,i+2).equals("is")){
                    count--;
                }
            }
        }
        return count==0;
    }



/*    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in
    the given string are happy.

            gHappy("xxggxx") → true
    gHappy("xxgxx") → false
    gHappy("xxggyygxx") → false*/

    public static boolean gHappy(String str) {
        Boolean flag=false;
        if(str.length()==0){
            return true;
        }
        if(str.length()<2 && str.contains("g")){
            return false;
        }
        for(int i=1;i<str.length();i++){

            if(str.charAt(i-1)=='g'){
                if(str.charAt(i)=='g'){
                    flag=true;
                }
                else{
                    if(flag){
                        flag=false;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(str.charAt(str.length()-1)=='g' && str.charAt(str.length()-2)!='g'){
            return false;
        }
        return true;
    }



    /*We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.

    countTriple("abcXXXabc") → 1
    countTriple("xxxabyyyycd") → 3
    countTriple("a") → 0*/

    public static int countTriple(String str) {
        int count=0;

        for(int i=1; i<str.length()-1;i++){
            if(str.charAt(i-1)==str.charAt(i) && str.charAt(i+1)==str.charAt(i)){
                count++;
            }
        }

        return count;
    }



    /*Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string.
        (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

    sumDigits("aa1bc2d3") → 6
    sumDigits("aa11b33") → 8
    sumDigits("Chocolate") → 0*/

    public static int sumDigits(String str) {
        int sum=0;

        for(int i=0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                sum+=Integer.parseInt(Character.toString(str.charAt(i)));
            }

        }

        return sum;
    }


/*    Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

    sameEnds("abXYab") → "ab"
    sameEnds("xx") → "x"
    sameEnds("xxx") → "x"*/

    public static String sameEnds(String str) {
        String tmp="";
        for(int i=1; i<=str.length()/2;i++){
            if(str.substring(0,i).equals(str.substring(str.length()-i))){
                tmp=str.substring(0,i);
            }

        }
        return tmp;
    }


    /*Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining
    of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

    mirrorEnds("abXYZba") → "ab"
    mirrorEnds("abca") → "a"
    mirrorEnds("aba") → "aba"*/

    public static String mirrorEnds(String str) {
        StringBuilder sb= new StringBuilder(str);
        String tmp= sb.reverse().toString();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==tmp.charAt(i)){
                count++;
                continue;
            }
            break;
        }
        return str.substring(0,count);
    }


   /* Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0*/

    public static int maxBlock(String str) {
        int max=0;
        int count =0;

        for(int i=0; i<str.length();i++){
            int j=i;
            while(j<str.length()-1 && str.charAt(j)==str.charAt(j+1)){
                count++;
                j++;
            }
            if(count>=max){
                max=count+1;
            }
            count=0;
            i=j;
        }

        return max;
    }


/*    Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
    A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
        Integer.parseInt(string) converts a string to an int.)

    sumNumbers("abc123xyz") → 123
    sumNumbers("aa11b33") → 44
    sumNumbers("7 11") → 18*/

    public static int sumNumbers(String str) {
        int sum=0;

        for(int i=0;i<str.length();i++){
            int j=i;
            while(j<str.length() && Character.isDigit(str.charAt(j))){
                j++;
            }
            if(i!=j){
                sum+=Integer.parseInt(str.substring(i,j));
                i=j;
            }
        }

        return sum;
    }



/*    Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
    The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.
        (Note: Character.isLetter(char) tests if a char is a letter.)

    notReplace("is test") → "is not test"
    notReplace("is-is") → "is not-is not"
    notReplace("This is right") → "This is not right"*/
    public static String notReplace(String str) {

        for(int i=0;i<str.length()-1;i++){
            if(str.substring(i,i+2).equals("is") ){
                if(i>0 && Character.isLetter(str.charAt(i-1))){
                    continue;
                }
                if(i<str.length()-2 && Character.isLetter(str.charAt(i+2))){
                    continue;
                }
                StringBuilder tmp=new StringBuilder(str);

                str=tmp.insert(i+2," not").toString();
                i=i+4;
            }
        }

        return str;
    }
}
