public class Main {
    public static void main(String[] args) {
        GryffindorStudent harry = new GryffindorStudent("Harry Potter", 70,40,
                50, 60, 95);
        GryffindorStudent hermione = new GryffindorStudent("Hermione Granger", 90, 70,
                80, 70, 65);
        GryffindorStudent ron = new GryffindorStudent("Ron Weasley", 20,40,
                70, 60,50);

        SlytherinStudent draco = new SlytherinStudent("Draco Malfoy", 75, 60,
                80,60, 90, 50,90);
        SlytherinStudent graham = new SlytherinStudent("Graham Montague", 45, 20,
                20, 40,10,30,20);
        SlytherinStudent gregory = new SlytherinStudent("Gregory Goyle", 30, 30,
                50, 30,20,60,30);

        HufflepuffStudent zacharias = new HufflepuffStudent("Zacharias Smith", 65, 60,
                80,80,65);
        HufflepuffStudent cedric = new HufflepuffStudent("Cedric Diggory", 70, 40,
                45, 60, 70);
        HufflepuffStudent justin = new HufflepuffStudent("Justin Finch-Fletchley", 35, 45,
                60, 35,50);

        RavenclawStudent zhou = new RavenclawStudent("Zhou Chang", 80, 30,
                80,65,70,40);
        RavenclawStudent padma = new RavenclawStudent("Padma Patil", 65,70,
                65, 50,70,80);
        RavenclawStudent marcus = new RavenclawStudent("Marcus Belby", 40, 65,
                55, 35, 70, 80);

        harry.printStudent();
        padma.printStudent();
        draco.printStudent();
        System.out.println();

        harry.compareHogwarts(draco);
        padma.compareHogwarts(ron);
        hermione.compareHogwarts(cedric);
        System.out.println();

        harry.compareGryffindor(hermione);
        hermione.compareGryffindor(ron);
        ron.compareGryffindor(harry);
        System.out.println();


    }
}
