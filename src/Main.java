public class Main {
    public static void main(String[] args) {

        Scorpion scorpion = Scorpion.getInstance();


        System.out.println("Character's abilities:");
        scorpion.performAbility();
        scorpion.setAbility(new KunaiSpearAttackAbility());
        scorpion.performAbility();
        scorpion.setAbility(new BlastFireAbility());
        scorpion.performAbility();

    }
}