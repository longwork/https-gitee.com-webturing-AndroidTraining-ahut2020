package ahut2020.day03;
//XXXable CanXXX
interface CanDrift{
    void drift();
}
class Vehicle {//陆上交通工具
    void run(){

    }
}
class Tank extends  Vehicle implements CanDrift{
    void run(){
        System.out.println("Tank::run");
    }

    @Override
    public void drift() {
        System.out.println("Tank drifts on river.");
    }
}
class Boat implements CanDrift{

    @Override
    public void drift() {
        System.out.println("Boat drifts on river.");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        CanDrift[] drifts={new Tank(),new Boat()};
        for(CanDrift drift:drifts){
            drift.drift();
        }
    }
}
