public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic(100);
        Warrior warrior = new Warrior();
        Madic magic = new Madic();
        Hero[] abilites = {magic, medic, warrior};
        for (int i = 0; i < abilites.length; i++) {
            abilites[i].applySuperAbility();
            if (abilites[i] instanceof Medic){
                ((Medic) abilites[i]).increaseExperience();
            }
        }
    }
}