class Solution {

    public int myAtoi(String s) {
        boolean negative = false;
        StringBuilder sb = new StringBuilder();
        boolean signSeen = false;
        boolean digitStarted = false;
        boolean numberStarted = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!numberStarted) {
                if (c == ' ') continue;

                if ((c == '-' || c == '+') && !signSeen) {
                    negative = (c == '-');
                    signSeen = true;
                    numberStarted = true;
                    continue;
                }

                if (Character.isDigit(c)) {
                    if (c == '0') {
                        signSeen = true;
                        numberStarted = true;
                        continue; 
                    }
                    sb.append(c);
                    signSeen = true;
                    numberStarted = true;
                    digitStarted = true;
                    continue;
                }

                return 0; 
            } else {
                if (!Character.isDigit(c)) break;

                if (c == '0' && !digitStarted) {
                    continue;
                }

                sb.append(c);
                digitStarted = true;
            }
        }

        if (sb.length() == 0 && !digitStarted) return 0;

        try {
            long val = Long.parseLong(sb.toString());
            if (negative) val = -val;
            if (val > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (val < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            return (int) val;
        } catch (NumberFormatException e) {
            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
