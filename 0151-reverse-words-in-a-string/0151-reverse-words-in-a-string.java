class Solution {
    public String reverseWords(String s) {
    if (s.isEmpty()) return "";

    StringBuilder ans = new StringBuilder();
    int i = s.length() - 1;

    while (i >= 0) {

        while (i >= 0 && s.charAt(i) == ' ')
            i--;

        if (i < 0) break;

        StringBuilder word = new StringBuilder();

        while (i >= 0 && s.charAt(i) != ' ') {
            word.append(s.charAt(i));
            i--;
        }

        ans.append(word.reverse()).append(" ");
    }

    return ans.toString().trim();
}
}