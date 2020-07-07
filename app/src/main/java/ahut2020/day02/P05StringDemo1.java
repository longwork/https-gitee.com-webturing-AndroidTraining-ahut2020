package ahut2020.day02;

public class P05StringDemo1 {
    //Object hashCode()是对象在JVM虚拟机存储地址的哈希值
    public static void main(String[] args) {
        String s="ahut";
        System.out.println(Integer.toHexString(s.hashCode()));
        s=s+"2020";
        System.out.println(Integer.toHexString(s.hashCode()));
        //123456789101112......9999


    }
}
