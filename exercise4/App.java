public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Person Me = new Person("Anna" , 19);

        Person Friend = new Person("Mika Bear",  56);

        Me.addFriend(Friend);

        Pet Dog = new Pet("Jordan" , 5, Me);
        Dog.showOwner();

        Person Classmate = new Person("Aica", 5);
        Person Classmate1 = new Person("Niel", 3);
        Person Classmate2 = new Person("KB", 1);

        Me.addClassmate(Classmate);
        Me.addClassmate(Classmate1);
        Me.addClassmate(Classmate2);

        Car SportsCar = new Car("Lamboo","red" , Me);
        SportsCar.showOwner();
    
    }
}
