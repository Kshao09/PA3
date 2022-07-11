/**
 * Kenny Shao
 * Professor: Kianoosh Boroojeni
 * This program uses hashmaps and hashsets to compute the distinct characters of a string and to check whether a string is a palindrome or not
 */

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    /**
     * call all the methods
     */
    public static void main(String[] args) {
        findDistinguishingChar("raccoon", "bar");
        System.out.println("-------------------------------------------------------");
        System.out.println(isAPotentialPalindrome("racecar"));
        System.out.println("-------------------------------------------------------");
        int[] nums = {1,1,2,3,4,5};
        System.out.println(sumOfUniqueElements(nums));
    }
    //uses hashmaps to find the distinct chars
    public static void findDistinguishingChar(String word1, String word2) {
        HashMap<Character, Integer> mapOne = new HashMap<>();
        for (int i = word1.length() - 1; i >= 0; i--) {
            if (mapOne.containsKey(word1.charAt(i))) {
                int count = mapOne.get(word1.charAt(i));
                mapOne.put(word1.charAt(i), ++count);
            } else {
                mapOne.put(word1.charAt(i),1);
            }
        }
        System.out.println(mapOne);
        HashMap<Character, Integer> mapTwo = new HashMap<>();
        for (int i = word2.length() - 1; i >= 0; i--) {
            if (mapTwo.containsKey(word2.charAt(i))) {
                int count = mapTwo.get(word2.charAt(i));
                mapTwo.put(word2.charAt(i), ++count);
            } else {
                mapTwo.put(word2.charAt(i),1);
            }
        }
        System.out.println(mapTwo);
    }
    //uses stringbuilder to check if string is a palindrome or not
    public static boolean isAPotentialPalindrome(String word) {
        StringBuilder sb = new StringBuilder().append(word).reverse();
        if (word.equals(sb.toString())) return true;
        return false;
    }
    // uses a hashset to find the sum of all unique numbers in array
    public static int sumOfUniqueElements(int[] nums) {
        int sum = 0;
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.contains(nums[i])) {
                sum+= nums[i];
                map.add(nums[i]);
            }
        }
        return sum;
    }
}
