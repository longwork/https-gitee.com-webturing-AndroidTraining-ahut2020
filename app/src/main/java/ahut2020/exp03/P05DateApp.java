package ahut2020.exp03;

import java.util.Arrays;
import java.util.Scanner;

public class P05DateApp {
    static class Date implements Comparable<Date>{
        int y,m,d;

        public Date(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        @Override//lhs/rhs
        public int compareTo(Date that) {
            if(this.y!=that.y)return  this.y-that.y;
            if(this.m!=that.m)return this.m-that.m;
            return this.d-that.d;
        }
    }
    static class Person implements Comparable<Person>{
        String name;
        Date birth;

        public Person(String name, Date birth) {
            this.name = name;
            this.birth = birth;
        }

        @Override
        public int compareTo(Person that) {
            return this.birth.compareTo(that.birth);
        }

    }

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        Person[] persons=new Person[cin.nextInt()];
        for(int i=0;i<persons.length;i++){
            String name=cin.next();
            Date birth=new Date(cin.nextInt(),cin.nextInt(),cin.nextInt());
            persons[i]=new Person(name,birth);

        }
        Arrays.sort(persons);
        for(Person person:persons){
            System.out.println(person.name);
        }
    }
}
