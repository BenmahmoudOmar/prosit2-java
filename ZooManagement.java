import java.util.Scanner;
public class ZooManagement {
    static int nbrCages = 20;
    static String zoo = "my Zoo";

    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("donner le nom de votre zoo ");
    	zoo=sc.nextLine();
    	System.out.println("donner le nombre de cages ");
    	nbrCages=sc.nextInt();
       System.out.println(zoo+" contient "+nbrCages+" cages");
       Animal lion=new Animal("","Lion",5,true);
       Animal[] zooan = { lion };
       Zoo myZoo = new Zoo(zooan, "My Zoo", "sfax", 10);
       System.out.println("Animal :");
       System.out.println("Famille : " + lion.getFamily());
       System.out.println("Nom : " + lion.getName());
       System.out.println("Âge : " + lion.getAge());
       System.out.println("Est un mammifère : " + lion.isMammal());
       System.out.println("\nZoo :");
       System.out.println("Nom du zoo : " + myZoo.getName());
       System.out.println("Ville : " + myZoo.getCity());
       System.out.println("Nombre de cages : " + myZoo.getNbrCages());
    }
}