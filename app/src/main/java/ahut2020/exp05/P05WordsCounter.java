package ahut2020.exp05;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

//统计一句话中每一个单词出现的次数，并按照字典序输出
public class P05WordsCounter {
    public static void main(String[] args) {
        String line="To  know  everything is to know   nothing.";
        Map<String,Integer> M=new TreeMap<>();
        System.out.println(line=line.toLowerCase().replaceAll("[^a-zA-z]"," ").trim());
        System.out.println(line);//
        String[] words=line.split("\\s+");
        System.out.println(Arrays.toString(words));
        for(String word:words){
            if(M.containsKey(word)){
                int old=M.get(word);
                M.put(word,old+1);
            }else{
                M.put(word,1);
            }
        }
        System.out.println(M);
        System.out.println(words.length);//7
        for(String word:M.keySet()){//对Map按照键遍历
            System.out.println(word+":"+M.get(word));
        }

    }
}
