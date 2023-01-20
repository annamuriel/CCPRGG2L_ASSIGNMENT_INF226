public class Weapon {
    String name;
    String rarity;
    int damage;

    public void sayMyName() {
        System.out.println("The weapon is " + name);
    }
    
    public void sayMyDamage() {
        System.out.println("My strength is " + damage);
    }
    public String sayMyRarity() {
        System.out.println("Rarity is " + rarity);
        return rarity;
    }
    public void addDamage (int additionalDamage) {
        int newDamage = this.damage + additionalDamage;

        System.out.println("Damage increased from " + this.damage + " to " + newDamage);
        
        this.damage = newDamage;

    }
    String showNameRarity() {
        return this.name + " " + this.rarity;
    }
    
    }
