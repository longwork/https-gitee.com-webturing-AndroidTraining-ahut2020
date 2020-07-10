package ahut2020.day05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

//统计一句话中每一个单词出现的次数，并按照字典序输出
public class P06WordsCounter {
    public static void main(String[] args) {
        String line="To  know  everything is to know   nothing.";
        Map<String,Integer> M=new TreeMap<>();
        System.out.println(line=line.toLowerCase().replaceAll("[^a-zA-z]"," ").trim());
        System.out.println(line);//
        String[] words=line.split("\\s+");
        System.out.println(Arrays.toString(words));
        //TODO
       // Collections

    }
}
