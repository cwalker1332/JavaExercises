package CodecademyProjects;

// can add a method energyTransfer() that exchanges batteryLevel between instances

public class Droid {

    int batteryLevel = 100;
    String name = "Codey";

    public Droid() {
    }

    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public int energyReport() {
        return batteryLevel;
    }

    public static void main(String[] args) {
        Droid droid = new Droid();
        System.out.println(droid);
        System.out.println(droid.batteryLevel);

        droid.performTask("cleaning");
        System.out.println(droid.energyReport());
    }
}