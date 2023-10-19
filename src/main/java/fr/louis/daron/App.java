package fr.louis.daron;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez votre salaire annuel : ");
        int salaireAnnuel = clavier.nextInt();

        System.out.print("Depuis combien de temps en années travaillez vous ? : ");
        int tempsTaf = clavier.nextInt();
        clavier.close();

        if (salaireAnnuel >= 30000 && tempsTaf >= 2){
            System.out.println("Prêt accordé");
        }else{
            System.out.println("Prêt non accordé");
        }
    }
    
}
