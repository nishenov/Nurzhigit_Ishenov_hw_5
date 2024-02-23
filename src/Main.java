import javax.crypto.CipherOutputStream;

public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss ();
        boss1.setHealth(100);
        boss1.setDamage(15);
        boss1.setDefenceType("Magic");
        System.out.println("BOSS INFO:");
        System.out.println("HEALTH " + boss1.getHealth() + " DAMAGE " + boss1.getDamage() +
                " DEFENCE " + boss1.getDefenceType());
        Hero[] heroes = createHeroes();
        System.out.println("HEROES INFO: ");
        for (Hero hero : heroes){
            System.out.println("HEALTH " + hero.getHealth() + " DAMAGE " + hero.getHealth() +
                    " ABILITY " + hero.getSuperAbility());
        }
    }

    public static Hero[] createHeroes(){
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(10, 5, "Physical");
        heroes[1] = new Hero(15,1);
        heroes[2] = new Hero(20,2, "Magic");
        return heroes;
    }
}

