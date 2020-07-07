package ahut2020.exp02;

public class P03CarserEncypher {
    public static void main(String[] args) {
        String s = "I like Java programming~";
        StringBuffer t = new StringBuffer();
        int offset = 3;
        for (char c : s.toCharArray()) {
            if (!Character.isLetter(c)) {
                t.append(c);
                continue;
            }
            if (Character.isUpperCase(c)) {
                int x = c - 'A';
                int y = (x + offset) % 26;
                char ch = (char) ('A' + y);
                t.append(ch);
            } else {
                int x = c - 'a';
                int y = (x + offset) % 26;
                char ch = (char) ('a' + y);
                t.append(ch);

            }

        }
        System.out.println(t.toString());
    }
}
