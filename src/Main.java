abstract class Boisson {

    public final void preparer() {
        chaufferEau();
        ajouterIngredient();
        servir();
    }

    public void chaufferEau() {
        System.out.println("Chauffage de l'eau");
    }

    abstract void ajouterIngredient();

    public void servir() {
        System.out.println("Boisson servie");
    }
}

class Cafe extends Boisson {

    void ajouterIngredient() {
        System.out.println("Ajout du cafe");
    }
}

class The extends Boisson {

    void ajouterIngredient() {
        System.out.println("Ajout du the");
    }
}
public class Main {
    public static void main(String[] args) {

        Boisson cafe = new Cafe();
        Boisson the = new The();

        System.out.println("Preparation du cafe :");

        System.out.println("\nPreparation du the :");

    }
}

