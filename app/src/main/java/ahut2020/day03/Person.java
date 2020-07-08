package ahut2020.day03;

public class Person {
    static String country="CHINA";//类字段 Class field

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;//成员字段 Member field;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    int age;

    public Person(String name) {
       this("tom",1);
    }

    public Person() {
        this("unamed");
    }


    void grow() {
         System.out.println("Happy birthday! "+name);
         ++age;
    }

    void work(){
        System.out.println("努力工作，创造美好的明天");
    }
    final void finalMethod(){

    }
    public static void main(String[] args) {
        Person tom=new Person();
        tom.name="Tom";
        tom.age=1;
        tom.grow();
        System.out.println(tom.age);

    }
}
