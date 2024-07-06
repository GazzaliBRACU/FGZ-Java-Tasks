public class Shelter {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setName("Rex");
        animal1.printStatus();  // Should prompt to set ID first
        animal1.setID("101");
        animal1.setType("Dog");
        animal1.setName("Rex");
        animal1.printStatus();
        animal1.updateStatus("available");
        System.out.println("After update 1:");
        animal1.printStatus();
        animal1.updateStatus("adopted");
        System.out.println("After update 2:");
        animal1.printStatus();
        animal1.updateStatus("reserved");
        animal1.updateStatus("assessing");
        System.out.println("After update 3:");
        animal1.printStatus();

        System.out.println("*********************************");
    }

    //     Animal animal2 = new Animal();
    //     animal2.setID("102");
    //     animal2.setType("Cat");
    //     animal2.setName("Whiskers");
    //     animal2.printStatus();
    //     animal2.updateStatus("reserved");
    //     System.out.println("After update 4:");
    //     animal2.printStatus();
    //     animal2.updateStatus("adopted");  // Should not allow as it's reserved
    // }
}

