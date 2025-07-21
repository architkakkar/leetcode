class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        List<Integer> anagrams = new ArrayList<>();

        if (m > n)
            return anagrams;

        HashMap<Character, Integer> windowFreq = new HashMap<>();
        HashMap<Character, Integer> pFreq = new HashMap<>();

        for (int i = 0; i < m; i++) {
            char ch1 = s.charAt(i);
            char ch2 = p.charAt(i);

            windowFreq.put(ch1, windowFreq.getOrDefault(ch1, 0) + 1);
            pFreq.put(ch2, pFreq.getOrDefault(ch2, 0) + 1);
        }

        if (windowFreq.equals(pFreq))
            anagrams.add(0);

        for (int i = m; i < n; i++) {
            char chToInsert = s.charAt(i);
            char chToDelete = s.charAt(i - m);

            windowFreq.put(chToInsert, windowFreq.getOrDefault(chToInsert, 0) + 1);
            if (windowFreq.get(chToDelete) == 1)
                windowFreq.remove(chToDelete);
            else
                windowFreq.put(chToDelete, windowFreq.get(chToDelete) - 1);

            if (windowFreq.equals(pFreq))
                anagrams.add(i - m + 1);
        }

        return anagrams;
    }
}