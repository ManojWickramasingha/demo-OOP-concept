
//inheritance-----
public class Samsung extends Phone {

    private int version;

    // using call perent super constructor-----
    Samsung(String brand, String model, int version) {
        super(brand, model);
        this.version = version;
    }

    void camera() {
        System.out.println("can phone photoes users.");
    }

    void call() {
        System.out.println("call right");
    }

    // abstract class inherit abstract fuction overried sub inheretance--

    // polymophisum------
    void user() {
        System.out.println("use the " + brand);
    }

    // encapusulation use getters and setters----------------
    // -----------------------------------
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}
