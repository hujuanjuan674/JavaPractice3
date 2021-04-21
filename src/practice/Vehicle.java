package practice;
public class Vehicle {
    double speed;//声明double型变量speed,刻画速度
    int power;//声明int型变量power,刻画功率
    void speedUp(int s) {
            speed=speed+s;
    }
    void speedDown(int d) {
            speed =speed - d;
    }
    void setPower(int p) {
        power=p;    //将参数p的值赋值给成员变量power
    }
    int getPower() {
        return power;  //返回成员变量power的值
    }
    double getSpeed() {
        return speed;
    }
    void brake(){
        speed=0;
    }

    public static class User {
        public static void main(String args[]) {
            Vehicle car1, car2;
            car1 = new Vehicle(); //使用new 运算符和默认的构造方法创建对象car1
            car2 = new Vehicle();//使用new 运算符和默认的构造方法创建对象car2
            car1.setPower(128);
            car2.setPower(76);
            System.out.println("car1的功率是：" + car1.getPower());
            System.out.println("car2的功率是：" + car2.getPower());
            car1.speedUp(40);//car1调用speedUp方法将自己的speed 的最大值控制在200以内
            car2.speedUp(50);//car2调用speedUp方法将自己的seed的最大值控制在200以内
            System.out.println("car1目前的速度：" + car1.getSpeed());
            System.out.println("car2目前的速度：" + car2.getSpeed());
            car1.speedDown(10);
            car2.speedDown(20);
            System.out.println("car1目前的速度：" + car1.getSpeed());
            System.out.println("car2目前的速度：" + car2.getSpeed());
        }
    }
}
