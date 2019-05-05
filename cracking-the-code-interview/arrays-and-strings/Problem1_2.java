/*
* 1.2. Reverse a string
* Time: O(n) Space : O(1) 
*/
public class Problem1_2{
    public static String reverseString(String s){
        int len = s.length();
        char[] tempArray = s.toCharArray();
        for(int i=0,j=len-1; i<j;i++,j--){
            Character c = tempArray[i];
            tempArray[i]= tempArray[j];
            tempArray[j]= c;
        }
        return new String(tempArray);
    }
    public static void main(String[] args) {
        System.out.println("hello :"+reverseString("hello"));
        System.out.println("strong :"+reverseString("strong"));
    }

}