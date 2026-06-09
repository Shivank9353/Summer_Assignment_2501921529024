class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Optimization: If the note is longer than the magazine, it's impossible
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        // Array to store counts of characters 'a' through 'z'
        int[] charCounts = new int[26];

        // Count the frequencies of each character in the magazine
        for (int i = 0; i < magazine.length(); i++) {
            charCounts[magazine.charAt(i) - 'a']++;
        }

        // Subtract frequencies for each character in the ransom note
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            charCounts[index]--;

            // If we ran out of this letter, we can't form the note
            if (charCounts[index] < 0) {
                return false;
            }
        }

        return true;
    }
}