public class RavenclawStudent extends HogwartsStudent{

    private int intelligence; //ум
    private int wisdom; //мудрость
    private int wit; //остроумие
    private int creativity; //творчество

    public RavenclawStudent(String name, int powerOfMagic, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int ability(){
        return intelligence+wisdom+wit+creativity;
    }

    public void compareRavenclaw(RavenclawStudent student){
        int ability1 = this.ability();
        int ability2 = student.ability();
        if(ability1 > ability2){
            System.out.println("Ravenclaw student " + getName() + " with characteristics " + ability1 +
                    " is stronger than a student " + student.getName() + " with characteristics " + ability2 + ".");
        }else if(ability1 < ability2){
            System.out.println("Ravenclaw student " + student.getName() + " with characteristics " + ability2 +
                    " is stronger than a student " + getName() + " with characteristics " + ability1 + ".");
        }else{
            System.out.println("Ravenclaw student " + getName() + " with characteristics " + ability1 +
                    "  is the same as the student " + student.getName() + " with characteristics " + ability2 + ".");
        }
    }


    @Override
    public String toString() {
        return "Ravenclaw Student:" + getName() +
                ", power of magic=" + getPowerOfMagic() +
                ", transgression distance=" + getTransgressionDistance() +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }
}