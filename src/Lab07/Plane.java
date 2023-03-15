package Lab07;

public class Plane {
    public void innerMethod(){
        Plane.Wing leftWing = new Plane.Wing();
        leftWing.wingWeight = 1500;

        Plane.Wing rightWing = new Plane.Wing();
        rightWing.wingWeight = 1550;

        leftWing.printWeight();
        rightWing.printWeight();
    }
    class Wing {
        private int wingWeight;

        void printWeight(){
            System.out.println("Вес крыла = " + wingWeight);
        }
    }
}
