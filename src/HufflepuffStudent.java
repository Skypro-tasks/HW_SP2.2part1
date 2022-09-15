public class HufflepuffStudent extends HogwartsStudent {

    private int industriousness; //трудолюбие
    private int loyalty; //верность
    private int honesty; //честность

    public HufflepuffStudent(String name, int powerOfMagic, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }


    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int ability(){
        return industriousness+loyalty+honesty;
    }

    public void compareHufflepuff(HufflepuffStudent student){
        int ability1 = this.ability();
        int ability2 = student.ability();
        if(ability1 > ability2){
            System.out.println("Hufflepuff student " + getName() + " with characteristics " + ability1 +
                    " is stronger than a student " + student.getName() + " with characteristics " + ability2 + ".");
        }else if(ability1 < ability2){
            System.out.println("Hufflepuff student " + student.getName() + " with characteristics " + ability2 +
                    " is stronger than a student " + getName() + " with characteristics " + ability1 + ".");
        }else{
            System.out.println("Hufflepuff student " + getName() + " with characteristics " + ability1 +
                    "  is the same as the student " + student.getName() + " with characteristics " + ability2 + ".");
        }
    }

    @Override
    public String toString() {
        return "Hufflepuff Student:" + getName() +
                ", power of magic=" + getPowerOfMagic() +
                ", transgression distance=" + getTransgressionDistance()  +
                ", industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }
}



