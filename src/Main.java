import packageSameName.SameName;

public class Main {
    public static void main(String[] args) {
        SameName sameName = new SameName();
        sameName.printMessage();
        SameName sameNamePackage = new SameName();
        sameNamePackage.printMessage();


        Employee employee = new Employee("Kateryna", 41,
                "Manage", "k@gmail.com", "789456");
        System.out.println(employee);


        Car car = new Car();
        car.start();
    }

}