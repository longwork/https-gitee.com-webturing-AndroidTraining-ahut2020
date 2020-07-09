package ahut2020.day03;
interface  CanSing{
    void sing();
}
interface CanDance {
    void dance();
}
interface CanSingAndDance extends CanSing, CanDance {

}
class Artist implements CanSingAndDance{

    @Override
    public void sing() {

    }

    @Override
    public void dance() {

    }
}
class Robot implements CanSing{

    @Override
    public void sing() {

    }
}
public class InterfaceDemo2 {
    public static void main(String[] args) {
        CanSing[] singers={new Robot(),new Artist()};
        for(CanSing singer:singers){
            singer.sing();
        }
    }
}
