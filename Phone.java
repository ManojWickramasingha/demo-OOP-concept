//--intro deme class and object create in java---
//---------------------------------------------
//---------------------------------------------

// class Phone {

//     String brand;
//     String model;

//     void call() {
//         System.out.println("strat call.");
//     }

//     public static void main(String[] args) {
//         // create object phone class refer--
//         Phone p1 = new Phone();
//         p1.call();
//         System.out.println(p1.brand);
//         // connet set the value how can set value
//         // 1.two deffernt ways- constrouctor or derect set value
//         p1.brand = "nokia";
//         System.out.println(p1.brand);

//     }

// }
//using constructor call function---
//abstract class
abstract class Phone {
    String brand;
    String model;

    Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void call() {
        // abstract method
    }

    // --------------------override polymophisum one way--------
    // ---------------------------------------------------------
    void user() {
        System.out.println("Phone user");
    }
}