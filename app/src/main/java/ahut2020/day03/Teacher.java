package ahut2020.day03;

public class Teacher extends Person{
    String school;
    public Teacher(String name, int age) {
        super(name,age);
        school="ahut";
    }
    public Teacher(){
        super();
        school="ahut";
    }
    @Override
    void work(){
        System.out.println("好好上课，认真辅导");
    }
}
