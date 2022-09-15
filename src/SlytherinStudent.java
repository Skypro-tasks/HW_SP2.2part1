public class SlytherinStudent extends HogwartsStudent{

    private int cunning; //хитрость
    private int determination; //решительность
    private int ambition; //амбициозность
    private int resourcefulness; //находчивость
    private int lustForPower; //жажда власти

    public SlytherinStudent(String name, int powerOfMagic, int transgressionDistance, int cunning, int determination,
                            int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }


    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int ability(){
        return cunning+determination+ambition+resourcefulness+lustForPower;
    }

    public void compareSlytherin(SlytherinStudent student){
        int ability1 = this.ability();
        int ability2 = student.ability();
        if(ability1 > ability2){
            System.out.println("Slytherin student " + getName() + " with characteristics " + ability1 +
                    " is stronger than a student " + student.getName() + " with characteristics " + ability2 + ".");
        }else if(ability1 < ability2){
            System.out.println("Slytherin student " + student.getName() + " with characteristics " + ability2 +
                    " is stronger than a student " + getName() + " with characteristics " + ability1 + ".");
        }else{
            System.out.println("Slytherin student " + getName() + " with characteristics " + ability1 +
                    "  is the same as the student " + student.getName() + " with characteristics " + ability2 + ".");
        }
    }

    @Override
    public String toString() {
        return "Slytherin Student:" + getName() +
                ", power of magic=" + getPowerOfMagic() +
                ", transgression distance=" + getTransgressionDistance() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower;
    }
}