package vn.funix.fx22541.lab11_1;

public class Main {
    public static void main(String[] args) {
        Car mitsubishiXpander = new Mitsubishi(6, "Xpander");
        Car holdenHkKingswood = new Holden(8, "Holden HK Kingswood");
        Car fordMustang = new Ford(9, "Mustang");
        System.out.println(mitsubishiXpander.accelerate());
        System.out.println((holdenHkKingswood.brake()));
        System.out.println(fordMustang.startEngine());
    }
}
