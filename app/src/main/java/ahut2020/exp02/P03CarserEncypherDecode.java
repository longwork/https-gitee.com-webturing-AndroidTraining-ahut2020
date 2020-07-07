package ahut2020.exp02;

public class P03CarserEncypherDecode {
    public static void main(String[] args) {
        String s = "L olnh Mdyd surjudpplqj~";

        for(int offset=1;offset<26;++offset) {
            StringBuffer t = new StringBuffer();
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
            System.out.println(offset+" "+t.toString());
        }
    }
}
