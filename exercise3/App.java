public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        Weapon Sword = new Weapon();

        Sword.name = "Jordan";
        Sword.damage = 10;
        Sword.rarity = "Epic";
        Sword.addDamage(5);

        Weapon Bow = new Weapon();

        Bow.name = "Mika Bow";
        Bow.damage = 3;
        Bow.rarity = "Legendary";
        
        System.out.println(Bow.showNameRarity());
    

        Character Archer = new Character();
        Archer.name = "Carter";
        Archer.strength = 8;
        Archer.intelligence = 5;
        Archer.agility = 10;
        Archer.Attack();
    }
}
