class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        HashMap<Character, Integer> s1Freq = new HashMap<>();
        HashMap<Character, Integer> s2Freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            s1Freq.put(ch1, s1Freq.getOrDefault(ch1, 0) + 1);
            s2Freq.put(ch2, s2Freq.getOrDefault(ch2, 0) + 1);
        }

        if (s1Freq.equals(s2Freq)) return true;

        for (int i = n; i < m; i++) {
            char incomingChar = s2.charAt(i);
            char outgoingChar = s2.charAt(i - n);

            s2Freq.put(incomingChar, s2Freq.getOrDefault(incomingChar, 0) + 1);
            if (s2Freq.get(outgoingChar) == 1) 
                s2Freq.remove(outgoingChar);
            else 
                s2Freq.put(outgoingChar, s2Freq.get(outgoingChar) - 1);

            if (s1Freq.equals(s2Freq)) return true;
        }

        return false;
    }
}