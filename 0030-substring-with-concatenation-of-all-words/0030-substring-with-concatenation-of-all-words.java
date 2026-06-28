class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();

        if (s == null || words == null || words.length == 0)
            return ans;

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        int wordLen = words[0].length();
        int totalWords = words.length;
        int windowLen = wordLen * totalWords;

        if (s.length() < windowLen)
            return ans;

        for (int offset = 0; offset < wordLen; offset++) {

            HashMap<String, Integer> window = new HashMap<>();

            int left = offset;
            int count = 0;

            for (int right = offset; right + wordLen <= s.length(); right += wordLen) {

                String word = s.substring(right, right + wordLen);

                if (!map.containsKey(word)) {
                    window.clear();
                    count = 0;
                    left = right + wordLen;
                    continue;
                }

                window.put(word, window.getOrDefault(word, 0) + 1);
                count++;

                while (window.get(word) > map.get(word)) {

                    String leftWord = s.substring(left, left + wordLen);
                    window.put(leftWord, window.get(leftWord) - 1);

                    left += wordLen;
                    count--;
                }

                if (count == totalWords) {

                    ans.add(left);

                    String leftWord = s.substring(left, left + wordLen);
                    window.put(leftWord, window.get(leftWord) - 1);

                    left += wordLen;
                    count--;
                }
            }
        }

        return ans;
    }
}