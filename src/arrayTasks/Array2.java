package arrayTasks;

import java.util.Arrays;

public class Array2 {


    /*Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

    countEvens([2, 1, 2, 3, 4]) → 3
    countEvens([2, 2, 0]) → 3
    countEvens([1, 3, 5]) → 0*/

    public int countEvens(int[] nums) {
        int counter=0;
        for (int i=0;i<nums.length; i++){
            if(nums[i]%2==0){
                counter++;
            }
        }
        return counter;
    }

    /*Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
     Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

    bigDiff([10, 3, 5, 6]) → 7
    bigDiff([7, 2, 10, 9]) → 8
    bigDiff([2, 10, 7, 2]) → 8*/


    public int bigDiff(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max-min;
    }

//---------------------------------------//
    /*Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array.
    If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
     You may assume that the array is length 3 or more.


    centeredAverage([1, 2, 3, 4, 100]) → 3
    centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
    centeredAverage([-10, -4, -2, -4, -2, 0]) → -3*/

    public int centeredAverage(int[] nums) {
        return (Arrays.stream(nums).sum()
                - Arrays.stream(nums).max().getAsInt() - Arrays.stream(nums).min().getAsInt() )/ (nums.length - 2) ;
    }
//---------------------------------------//


   /* Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come
    immediately after a 13 also do not count.

    sum13([1, 2, 2, 1]) → 6
    sum13([1, 1]) → 2
    sum13([1, 2, 2, 1, 13]) → 6*/

    public int sum13(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==13){
                i++;
                continue;
            }
            sum+=nums[i];
        }
        return sum;
    }


/*    Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7(every 6 will be
    followed by at least one 7). Return 0 for no numbers.

    sum67([1, 2, 2]) → 5
    sum67([1, 2, 2, 6, 99, 99, 7]) → 5
    sum67([1, 1, 6, 7, 2]) → 4*/

    public int sum67(int[] nums) {
        int sum=0;
        Boolean flag=false;

        for(int i=0; i<nums.length; i++){
            if(!flag){
                if(nums[i]==6){
                    flag=true;
                    continue;
                }
                sum+=nums[i];
            }
            else{
                if(nums[i]==7){
                    flag=false;
                    continue;
                }

            }
        }
        return sum;
    }


  /*  Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

    has22([1, 2, 2]) → true
    has22([1, 2, 1, 2]) → false
    has22([2, 1, 2]) → false*/

    public boolean has22(int[] nums) {

        Boolean flag=false;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==2){
                if(flag){
                    return true;
                }
                flag=true;
                continue;
            }
            flag=false;
        }
        return false;
    }



    /*Given an array of ints, return true if the array contains no 1's and no 3's.

    lucky13([0, 2, 4]) → true
    lucky13([1, 2, 3]) → false
    lucky13([1, 2, 4]) → false*/

    public boolean lucky13(int[] nums) {

        for(int i=0; i<nums.length;i++){
            if(nums[i]==1 || nums[i]==3){
                return false;
            }
        }
        return true;
    }


    /*Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

    sum28([2, 3, 2, 2, 4, 2]) → true
    sum28([2, 3, 2, 2, 4, 2, 2]) → false
    sum28([1, 2, 3, 4]) → false*/

    public boolean sum28(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==2){
                count+=2;
            }
        }
        return count==8;
    }


   /* Given an array of ints, return true if the number of 1's is greater than the number of 4's

    more14([1, 4, 1]) → true
    more14([1, 4, 1, 4]) → false
    more14([1, 1]) → true*/

    public boolean more14(int[] nums) {
        int counter1=0;
        int counter4=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                counter1++;
            }
            if(nums[i]==4){
                counter4++;
            }
        }
        return counter1>counter4;
    }



 /*   Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0,
    in which case just return a length 0 array. You do not need a separate if-statement for the length-0 case; the for-loop should
    naturally execute 0 times in that case, so it just works. The syntax to make a new int array is: new int[desired_length]

    fizzArray(4) → [0, 1, 2, 3]
    fizzArray(1) → [0]
    fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]*/

    public int[] fizzArray(int n) {
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=i;
        }
        return arr;
    }


    /*Given an array of ints, return true if every element is a 1 or a 4.

    only14([1, 4, 1, 4]) → true
    only14([1, 4, 2, 4]) → false
    only14([1, 1]) → true*/

    public boolean only14(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=1 && nums[i]!= 4){
                return false;
            }
        }
        return true;
    }


    /*Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. N may be 0,
    in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new
    string array is: new String[desired_length]

    fizzArray2(4) → ["0", "1", "2", "3"]
    fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
    fizzArray2(2) → ["0", "1"]*/

    public String[] fizzArray2(int n) {
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=String.valueOf(i);
        }
        return arr;
    }


/*    Given an array of ints, return true if it contains no 1's or it contains no 4's.

    no14([1, 2, 3]) → true
    no14([1, 2, 3, 4]) → false
    no14([2, 3, 4]) → true*/

    public boolean no14(int[] nums) {
        Boolean flag1=false;
        Boolean flag4=false;
        for(int i=0; i<nums.length;i++){

            if(nums[i]==1){
                flag1=true;
            }
            if(nums[i]==4){
                flag4=true;
            }
            if(flag4==true && flag1==true){
                return false;
            }
        }
        return true;
    }



 /*   We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair
    is that value. Return true if the given value is everywhere in the array.

    isEverywhere([1, 2, 1, 3], 1) → true
    isEverywhere([1, 2, 1, 3], 2) → false
    isEverywhere([1, 2, 1, 3, 4], 1) → false*/

    public boolean isEverywhere(int[] nums, int val) {

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==val || nums[i+1]==val){
                continue;
            }
            return false;
        }
        return true;
    }


    /*Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

    either24([1, 2, 2]) → true
    either24([4, 4, 1]) → true
    either24([4, 4, 1, 2, 2]) → false*/

    public boolean either24(int[] nums) {
        Boolean flag2=false;
        Boolean flag4=false;
        Boolean res2=false;
        Boolean res4=false;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==2){
                if(flag2){
                    if(res4){
                        return false;
                    }
                    res2=true;
                }
                flag2=true;
                continue;
            }
            if(nums[i]==4){
                if(flag4){
                    if(res2){
                        return false;
                    }
                    res4=true;
                }
                flag4=true;
                continue;
            }
            flag2=false;
            flag4=false;
        }
        if(res2 || res4){
            return true;
        }
        return false;
    }

    /*Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index).
    Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

    matchUp([1, 2, 3], [2, 3, 10]) → 2
    matchUp([1, 2, 3], [2, 3, 5]) → 3
    matchUp([1, 2, 3], [2, 3, 3]) → 2*/

    public int matchUp(int[] nums1, int[] nums2) {
        int count=0;
        for(int i=0; i<nums1.length;i++){
            if(nums1[i]!=nums2[i] && (nums1[i]-1==nums2[i] ||  nums1[i]+1==nums2[i] ||
                    nums1[i]-2==nums2[i] ||  nums1[i]+2==nums2[i])){
                count++;
            }
        }
        return count;
    }



  /*  Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.

    has77([1, 7, 7]) → true
    has77([1, 7, 1, 7]) → true
    has77([1, 7, 1, 1, 7]) → false*/

    public boolean has77(int[] nums) {
        for(int i=1; i<nums.length-1;i++){
            if((nums[i-1]==7 && nums[i+1]==7) || (nums[i]==7 && nums[i+1]==7)
                    || (nums[i-1]==7 && nums[i]==7)){
                return true;
            }
        }
        return false;
    }



  /*  Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

    has12([1, 3, 2]) → true
    has12([3, 1, 2]) → true
    has12([3, 1, 4, 5, 2]) → true*/

    public boolean has12(int[] nums) {
        Boolean flag1=false;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==1){
                flag1=true;
            }
            if(flag1 && nums[i]==2){
                return true;
            }
        }
        return false;
    }

   /* Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

    modThree([2, 1, 3, 5]) → true
    modThree([2, 1, 2, 5]) → false
    modThree([2, 4, 2, 5]) → true*/

    public boolean modThree(int[] nums) {
        for(int i=1; i<nums.length-1;i++){
            if ((nums[i-1]%2==1 && nums[i]%2==1 && nums[i+1]%2==1) ||
                    (nums[i-1]%2==0 && nums[i]%2==0 && nums[i+1]%2==0)){
                return true;
            }
        }
        return false;
    }


   /* Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

    haveThree([3, 1, 3, 1, 3]) → true
    haveThree([3, 1, 3, 3]) → false
    haveThree([3, 4, 3, 3, 4]) → false*/

    public boolean haveThree(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==3 ){
                count++;
            }
            if(i+1<nums.length && nums[i]==3 && nums[i+1]==3){
                return false;
            }
        }

        return count==3;
    }



   /* Given an array of ints, return true if every 2 that appears in the array is next to another 2.

    twoTwo([4, 2, 2, 3]) → true
    twoTwo([2, 2, 4]) → true
    twoTwo([2, 2, 4, 2]) → false*/

    public boolean twoTwo(int[] nums) {
        Boolean flag2=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==2){
                if(i+1<nums.length && nums[i+1]==2){
                    flag2=true;
                    continue;
                }
                if(flag2){
                    flag2=false;
                    continue;
                }
                return false;
            }
        }
        return true;
    }


    /*Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends
    are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.

    sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
    sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
    sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false*/

    public boolean sameEnds(int[] nums, int len) {
        for(int i=0;i<len;i++){
            if (nums[i]!=nums[nums.length-len+i]){
                return false;
            }
        }
        return true;
    }

    /*Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

    tripleUp([1, 4, 5, 6, 2]) → true
    tripleUp([1, 2, 3]) → true
    tripleUp([1, 2, 4]) → false*/

    public boolean tripleUp(int[] nums) {
        for(int i=1; i<nums.length-1;i++){
            if(nums[i-1]+1==nums[i] && nums[i]+1==nums[i+1]){
                return true;
            }
        }
        return false;
    }



/*    Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end,
    so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. Note that a length-0 array is valid.

    fizzArray3(5, 10) → [5, 6, 7, 8, 9]
    fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
    fizzArray3(1, 3) → [1, 2]*/

    public int[] fizzArray3(int start, int end) {
        int[] arr=new int[end-start];
        for(int i=0; i+start<end;i++ ){
            arr[i]=i+start;
        }
        return arr;
    }


/*    Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

    shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    shiftLeft([1, 2]) → [2, 1]
    shiftLeft([1]) → [1]*/

    public int[] shiftLeft(int[] nums) {
        if(nums.length==0){
            return nums;
        }
        int[] tmp=new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            tmp[i]=nums[i+1];
        }
        tmp[tmp.length-1]=nums[0];
        return tmp;
    }

    /*For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10.
     So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

    tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
    tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
    tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]*/


    public int[] tenRun(int[] nums) {
        int tmp=-1;
        for(int i=0; i<nums.length;i++){
            if(nums[i]%10==0){
                tmp=nums[i];
                continue;
            }
            if(tmp!=-1){
                nums[i]=tmp;
            }
        }
        return nums;
    }


/*    Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array.
    The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

    pre4([1, 2, 4, 1]) → [1, 2]
    pre4([3, 1, 4]) → [3, 1]
    pre4([1, 4, 4]) → [1]*/

    public int[] pre4(int[] nums) {
        int tmp=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==4){
                tmp=i;
                break;
            }
        }
        int[] arr=new int[tmp];
        for(int i=0; i<tmp;i++){
            arr[i]=nums[i];
        }
        return arr;
    }


/*    Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4
    in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

    post4([2, 4, 1, 2]) → [1, 2]
    post4([4, 1, 4, 2]) → [2]
    post4([4, 4, 1, 2, 3]) → [1, 2, 3]*/

    public int[] post4(int[] nums) {
        int tmp=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==4){
                tmp=i+1;
            }
        }
        int[] arr=new int[nums.length-tmp];
        for(int i=0; i+tmp<nums.length;i++){
            arr[i]=nums[i+tmp];
        }
        return arr;
    }



   /* We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from
    it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.

    notAlone([1, 2, 3], 2) → [1, 3, 3]
    notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
    notAlone([3, 4], 3) → [3, 4]*/

    public int[] notAlone(int[] nums, int val) {
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==val && nums[i-1]!=nums[i] && nums[i+1]!=nums[i]){
                if(nums[i-1]>nums[i+1]){
                    nums[i]=nums[i-1];
                }
                else{
                    nums[i]=nums[i+1];
                }
            }
        }
        return nums;
    }


    /*Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array.
     The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

    zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
    zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
    zeroFront([1, 0]) → [0, 1]*/

    public int[] zeroFront(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=nums[count];
                nums[count]=0;
                count++;
            }
        }

        return nums;
    }



    /*Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as
     needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or
     make a new array.

    withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
    withoutTen([10, 2, 10]) → [2, 0, 0]
    withoutTen([1, 99, 10]) → [1, 99, 0]*/

    public int[] withoutTen(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=10){
                nums[count]=nums[i];
                count++;
            }
        }
        for(int i=count;i<nums.length;i++){
            nums[i]=0;
        }
        return nums;
    }


    /*Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array.
     If there is no odd value to the right of the zero, leave the zero as a zero.

    zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
    zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
    zeroMax([0, 1, 0]) → [1, 1, 0]*/

    public int[] zeroMax(int[] nums) {
        int largestOdd;
        for (int i=0; i<nums.length;i++){
            if(nums[i]==0){
                largestOdd=0;
                for(int j=i; j<nums.length;j++){
                    if(nums[j]%2==1){
                        largestOdd=Math.max(largestOdd,nums[j]);
                    }
                }
                nums[i]=largestOdd;
            }
        }
        return nums;
    }



    /*Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the
    odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.

    evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
    evenOdd([3, 3, 2]) → [2, 3, 3]
    evenOdd([2, 2, 2]) → [2, 2, 2]*/

    public int[] evenOdd(int[] nums) {
        int count=0;
        int tmp;

        for(int i=0; i<nums.length;i++){
            if(nums[i]%2==0){
                tmp=nums[count];
                nums[count]=nums[i];
                nums[i]=tmp;
                count++;
            }

        }

        return nums;
    }


   /* This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for
    job interviews. (See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running up to but not including end,
    so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers,
    except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
    In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated than the usual version
    since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.

    fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
    fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
    fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]*/

    public String[] fizzBuzz(int start, int end) {
        String[] nums=new String[end-start];

        for(int i=0; i+start<end;i++){
            if(( i+start) % 15==0){
                nums[i]="FizzBuzz";
                continue;
            }
            if(( i+start) % 5==0){
                nums[i]="Buzz";
                continue;
            }
            if(( i+start) % 3==0){
                nums[i]="Fizz";
                continue;
            }
            nums[i]=String.valueOf(i+start);
        }
        return nums;
    }


}
