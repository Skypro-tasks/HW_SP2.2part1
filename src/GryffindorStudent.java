public class GryffindorStudent extends HogwartsStudent{

    private int nobility; //благородство
    private int honour; //честь
    private int bravery; //храбрость

    public GryffindorStudent(String name, int powerOfMagic, int transgressionDistance, int nobility, int honour, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


    public int ability(){
        return nobility+honour+bravery;
    }

    public void compareGryffindor(GryffindorStudent student){
        int ability1 = this.ability();
        int ability2 = student.ability();
        if(ability1 > ability2){
            System.out.println("Gryffindor student " + getName() + " with characteristics " + ability1 +
                    " is stronger than a student " + student.getName() + " with characteristics " + ability2 + ".");
        }else if(ability1 < ability2){
            System.out.println("Gryffindor student " + student.getName() + " with characteristics " + ability2 +
                    " is stronger than a student " + getName() + " with characteristics " + ability1 + ".");
        }else{
            System.out.println("Gryffindor student " + getName() + " with characteristics " + ability1 +
                    "  is the same as the student " + student.getName() + " with characteristics " + ability2 + ".");
        }
    }

    @Override
    public String toString() {
        return "Gryffindor Student:"  + getName() +
                ", power of magic=" + getPowerOfMagic() +
                ", transgression distance=" + getTransgressionDistance() +
                ", nobility=" + nobility +
                ", honour=" + honour +
                ", bravery=" + bravery;
    }
}
