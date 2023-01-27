public class Car {
    String name;
    String color;
    Person owner;

    Car(String carName, String color, Person ownerName) {
        this.name = carName;
        this.owner = ownerName;
        this.color = color;
    }
    void showOwner(){
        System.out.println("The " + this.color + " " + this.name + " is owned by " + owner.name);
    }

}
