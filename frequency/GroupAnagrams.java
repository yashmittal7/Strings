/*1. Problem Understanding

Group together strings that are anagrams.

Example
Input:
["eat","tea","tan","ate","nat","bat"]

Output:
[[eat, tea, ate], [tan, nat], [bat]]
2. Approach 1 ⭐ (Interview Preferred)
Using HashMap + Sorting
Idea

If two words are anagrams,

after sorting they become identical.

eat → aet

tea → aet

ate → aet

Use the sorted word as the key in the HashMap.


Create HashMap<String, List<String>>

For each word

    Convert to char array

    Sort it

    Convert back to String

    If key doesn't exist
        Create new list

    Add original word to that list

Return all values of HashMap
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GroupAnagrams {
    public static void groupAnagrams(String[] words) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char[] arr = words[i].toCharArray();

            Arrays.sort(arr); // Sort the characters

            String key = new String(arr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(words[i]); // Store original word
        }
        System.out.println("Grouped Anagrams:");
        for (ArrayList<String> group : map.values()) {
            System.out.println(group);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        groupAnagrams(words);

        sc.close();
    }
}