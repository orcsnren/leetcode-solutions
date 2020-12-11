class Solution {
    public String decodeString(String s) {
        return parse(s, 0);
    }

    public String parse(String s, int i) {
        if (i >= s.length()) return "";
        StringBuilder sb = new StringBuilder();
        for (int k = i; k < s.length(); k++) {
            char c = s.charAt(k);
            if (c == ']') continue;
            if (Character.isDigit(c)) {
                int startNum = k;
                while (c != '[') {
                    k++;
                    c = s.charAt(k);
                }
                int num = Integer.parseInt(s.substring(startNum, k));

                int startString = k + 1;
                int count = 1;
                while (true) {
                    k++;
                    c = s.charAt(k);
                    if (c == '[') count++;
                    if (c == ']') count--;
                    if (c == ']' && count == 0) {
                        break;
                    }
                }

                String returns = parse(s.substring(startString, k + 1), 0);

                for (int j = 0; j < num; j++) {
                    sb.append(returns);
                }
            } else sb.append(c);

        }
        return sb.toString();
    }
}