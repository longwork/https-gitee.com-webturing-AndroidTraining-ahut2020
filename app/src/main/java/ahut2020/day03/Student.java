package ahut2020.day03;

public class Student extends Person {
    String major;
    public Student(String name, int age) {
        super(name,age);
        major="CS";
    }

    @Override
    void work(){
        System.out.println("好好学习,天天向上");
    }

//    @Override
//    void finalMethod(){
//
//    }
}
