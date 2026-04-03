class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int n1 = strs[0].length();
        StringBuilder sb = new StringBuilder();
        boolean isEqual = true;

        for (int i = 0; i < n1; i++) {
            char ch1 = strs[0].charAt(i);

            for (int j = 1; j < n; j++) {
                int n2 = strs[j].length();

                if (i < n2) {
                    char ch2 = strs[j].charAt(i);

                    if (ch1 != ch2) {
                        isEqual = false;
                        break;
                    }
                } else {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual) {
                sb.append(ch1);
            } else {
                break;
            }
        }

        return sb.toString();
    }
}