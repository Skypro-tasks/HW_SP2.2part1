public abstract class HogwartsStudent {

    private String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public HogwartsStudent(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void printStudent(){
        System.out.println(toString());
    }



    private int ability(){
        return powerOfMagic+transgressionDistance;
    }

    public void compareHogwarts(HogwartsStudent student){
        int ability1 = this.ability();
        int ability2 = student.ability();
        if(ability1 > ability2){
            System.out.println("A student " + getName() + " with characteristics " + ability1 +
                    " is stronger than a student " + student.getName() + " with characteristics " + ability2 + ".");
        }else if(ability1 < ability2){
            System.out.println("A student " + student.getName() + " with characteristics " + ability2 +
                    " is stronger than a student " + getName() + " with characteristics " + ability1 + ".");
        }else{
            System.out.println("A student " + getName() + " with characteristics " + ability1 +
                    "  is the same as the student " + student.getName() + " with characteristics " + ability2 + ".");
        }
    }

}
