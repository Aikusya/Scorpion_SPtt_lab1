public class Scorpion {
    private static Scorpion instance;
    private IPerformAbility currentAbility;

    private Scorpion(){
        currentAbility = new GetOverHereAbility();
    }

    public static Scorpion getInstance(){
        if(instance == null){
            instance = new Scorpion();
        }
        return instance;
    }



    public void setAbility(IPerformAbility ability){
        this.currentAbility = ability;
    }

    public void performAbility(){
        currentAbility.performAbility();
    }
}
