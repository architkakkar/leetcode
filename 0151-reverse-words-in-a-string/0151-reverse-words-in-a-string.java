class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder str = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            if(words[i].length() > 0)
                str.append(words[i] + " ");
        }
        
        return str.toString().trim(); 
    }
}