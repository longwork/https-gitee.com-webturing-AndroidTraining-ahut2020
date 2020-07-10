package ahut2020.exp05;

import java.util.Arrays;

public class P01TakePhotos {
    static class Person implements Comparable<Person>{
        String gender;
        double height;

        public Person(String gender, double height) {
            this.gender = gender;
            this.height = height;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "gender='" + gender + '\'' +
                    ", height=" + height +
                    '}';
        }

        //-1< +1>  0==
        @Override
        public int compareTo(Person that) {
            int cmp=that.gender.compareTo(this.gender);//按照性别牌降序
            if(cmp!=0)return cmp;

            double cmp2=this.height-that.height;
            if(gender.equals("male")){
                if(cmp2<0)return -1;
                if(cmp2==0)return 0;
                if(cmp2>0)return 1;
            }else{
                if(cmp2<0)return 1;
                if(cmp2==0)return 0;
                if(cmp2>0)return -1;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Person[] persons=new Person[]{new Person("male",1.72),new Person("female",1.61),new Person("male",1.65),
                new Person("female",1.68)};
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
