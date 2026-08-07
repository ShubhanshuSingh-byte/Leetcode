class Solution {
    public String smallestNumber(String num, long t) {
        int[] prime = {2,3,5,7};
        long temp = t;

        for(int i: prime){
            while(temp%i==0){
                temp/=i;
            }
        }

        if(temp>1) return "-1";

        int len = num.length();
        long[] requiredFactor = new long[len + 1];
        requiredFactor[0] = t;
        int firstZeroIndex = len - 1;
        char[] digits = num.toCharArray();
        for (int i = 0; i < len; i++) {
            if (digits[i] == '0') {
                firstZeroIndex = i;
                break;
            }
            requiredFactor[i + 1] =requiredFactor[i] / gcd(requiredFactor[i], digits[i] - '0');
        }
        if (requiredFactor[len] == 1) {
            return num;
        }
        for (int i = firstZeroIndex; i >= 0; i--) {
            while (++digits[i] <= '9') {
                long currentNeed =requiredFactor[i] /gcd(requiredFactor[i], digits[i] - '0');
                int candidateDigit = 9;
                for (int j = len - 1; j > i; j--) {
                    while (currentNeed % candidateDigit != 0) {
                        candidateDigit--;
                    }

                    currentNeed /= candidateDigit;

                    digits[j] = (char) ('0' + candidateDigit);
                }
                if (currentNeed == 1) {
                    return new String(digits);
                }
            }
        }

        StringBuilder answer = new StringBuilder();

        long remaining = t;
        for (int digit = 9; digit >= 2; digit--) {

            while (remaining % digit == 0) {

                answer.append((char) ('0' + digit));
                remaining /= digit;
            }
        }

        int extraOnes = Math.max(len + 1 - answer.length(), 0);

        while (extraOnes-- > 0) {
            answer.append('1');
        }
        return answer.reverse().toString();
    }

    private long gcd(long first, long second) {

        while (second != 0) {
            long temp = second;
            second = first % second;
            first = temp;
        }

        return first;
    }
}