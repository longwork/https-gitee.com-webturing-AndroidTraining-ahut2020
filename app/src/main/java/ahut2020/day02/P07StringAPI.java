package ahut2020.day02;

public class P07StringAPI {
    public static void main(String[] args) {
        String s="ahut2020-AndroidProgramming~";
        System.out.println(s.length());//28
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.concat(" is funny and useful~"));
        System.out.println(s.charAt(10));//'n'
        System.out.println(s.contains("2020"));//true
        System.out.println(s.indexOf("Android"));//9
        System.out.println(s.indexOf("java"));//-1
        System.out.println(s.startsWith("ahut"));//true
        System.out.println(s.endsWith(".docx"));//false
        System.out.println(s.substring(4,8));//"2020"
        System.out.println(s.substring(10));//ndroidProgramming~
        System.out.println(s.indexOf("20"));
        System.out.println(s.indexOf("20",5));
        System.out.println(s.replace("ahut","pku"));
        System.out.println(s.replaceAll("ahut","pku"));
    }
}
