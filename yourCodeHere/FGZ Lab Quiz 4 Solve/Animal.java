// Version: 1.0
// Set B
// Lab Quiz 4: Animal
// Scheduled: 9th July'24; Tue 11 AM

public class Animal {
    // Fields
    private String type;
    private String name;
    private String status = "assessing";
    private String id;

    public void setType(String type) {
        if (id != null) {
            this.type = type;
        } else {
            System.out.println("Please set ID first.");
        }
    }

    public void setName(String name) {
        if (id != null) {
            this.name = name;
        } else {
            System.out.println("Please set ID first.");
        }
    }

    public void setID(String id) {
        this.id = id;
    }

    public void updateStatus(String newStatus) {
        if (status.equals("available") || newStatus.equals("available")) {
            status = newStatus;
        } else {
            System.out.println(this.name + " the " + this.type + " won't be " + newStatus + " since it is currently " + status + ".");
        }
    }

    public void printStatus() {
        if (id == null) {
            System.out.println("Please set ID first.");
        } else {
            System.out.println(name + " the " + type + " is currently " + status + ".");
        }
    }
}
