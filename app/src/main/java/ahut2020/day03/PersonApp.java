package ahut2020.day03;

public class PersonApp {
    public static void main(String[] args) {
        Person tom=new Person("tom");
        Person jerry=new Student("jerry",18);
        //jerry=new Person();
        Person peter=new Teacher("peter",26);
        tom.work();
        jerry.work();
        peter.work();
        Person[] persons={tom,jerry,peter};
        for(Person person:persons){
            System.out.print(person.getName()+"say:");
            person.work();
        }
        tom=new Teacher();
        System.out.println(tom instanceof Person);
        System.out.println(tom instanceof Student);
        System.out.println(tom instanceof Teacher);
        if(tom instanceof Teacher){
            Teacher t=(Teacher)tom;
            System.out.println(t.school);
        }
    }
}
