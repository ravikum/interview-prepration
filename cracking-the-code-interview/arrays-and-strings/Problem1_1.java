import java.util.HashSet;

/*
* 1.1. Implement an algorithm to determine if a string has all unique chars
* Solution : Maintaining Hash map of Chars. Time: O(n) Space : O(n) 
*/
public class Problem1_1{
    public static boolean isStringHaveUniqueChars(String s){
        int len = s.length();
        HashSet<Character> charSet = new HashSet<Character>();
        for(int i=0; i<s.length();i++){
            Character c = s.charAt(i);
            if(!charSet.add(c)){
                break;
            }
        }
        return charSet.size()==len;
    }
    public static void main(String[] args) {
        System.out.println("hello :"+isStringHaveUniqueChars("hello"));
        System.out.println("strong :"+isStringHaveUniqueChars("strong"));
    }

}