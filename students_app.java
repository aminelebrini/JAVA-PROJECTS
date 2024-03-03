import java.util.Scanner;

public class MallApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("                                             >>> Bienvenue dans votre espace étudiant <<<");
        System.out.println("Entrez votre identifiant : ");
        String id = scanner.nextLine().toUpperCase();
        System.out.println("Entrez votre mot de passe : ");
        int password = scanner.nextInt();

        if (id.equals("ALE12345") && password == 2033) {
            USER1();
        } else if (id.equals("ANLE12345") && password == 2032) {
            user2();
        } else {
            System.out.println("Identifiant ou mot de passe incorrect.");
        }
        scanner.close();
    }

    public static void USER1() {
        System.out.println("                                                      >>> BIENVENUE USER1 <<<");
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHOISIR LE SERVICE : ");
        System.out.println("1. L'INSCRIPTION");
        System.out.println("2. CONSULTER LES NOTES");
        System.out.println("3. RECLAMATION");
        System.out.println("Entrer le numéro de votre service : ");
        int serviceNumber = scanner.nextInt();

        if (serviceNumber == 1) {
            System.out.println("VOICI VOTRE MODULES >SEG< ET L'ETAT D'INSCRIPTION DE SESSION DE PRINGTEMPS:\n\n");
            System.out.println(">>ECONOMIE MONETAIRE ET FINANCIAIRE : R+\n");
            System.out.println(">>PROBLEME ECONOMIQUE ET SOCIAUX : R+\n");
            System.out.println(">>COMPTABILITE ANALYTIQUE : R+\n");
            System.out.println(">>MARKETING DE BASE : R+\n");
            System.out.println(">>ECHANTILLONNAGE ET ESTIMATION : R+\n");
            System.out.println(">>INTRODUCTION A L'ETUDE DE DROIT : R+\n");
        }else if (serviceNumber == 2) {
            System.out.println("VOICI LES NOTES DE VOTRE MODULES DE SESSION DE PRINGTEMPS SN:\n\n");
            System.out.println(">>ECONOMIE MONETAIRE ET FINANCIAIRE : 9 RAT\n");
            System.out.println(">>PROBLEME ECONOMIQUE ET SOCIAUX : 14 V\n");
            System.out.println(">>COMPTABILITE ANALYTIQUE : 18 V\n");
            System.out.println(">>MARKETING DE BASE : 10 V\n");
            System.out.println(">>ECHANTILLONNAGE ET ESTIMATION : 6 RAT\n");
            System.out.println(">>INTRODUCTION A L'ETUDE DE DROIT : 13.5 V\n");
        }
        else if (serviceNumber == 3) {

            System.out.println("LA FENETRE DE RECLAMATION : ");
            Scanner scanner2 = new Scanner(System.in);
            
            System.out.println("VOTRE NOM : ");
            String last_name = scanner2.nextLine();
            System.out.println("VOTRE PRENOM : ");
            String name = scanner2.nextLine();
            System.out.println("VOTRE E-MAIL : ");
            String e_mail = scanner2.nextLine();
            System.out.println("VOTRE NUMERO DE TELEPHONE : ");
            int num = scanner2.nextInt();
            System.out.println("VOTRE RECLAMATION : ");
            String reclamation = scanner2.nextLine();

            System.out.println(">>>> VOTRE RECLAMATION A BIEN REÇU <<<<");
        }
        // Ajoutez le code pour gérer les services ici
        scanner.close();
    }

    public static void user2() {
        System.out.println("                                                      >>> BIENVENUE USER 2<<<");
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHOISIR LE SERVICE : ");
        System.out.println("1. L'INSCRIPTION");
        System.out.println("2. CONSULTER LES NOTES");
        System.out.println("3. RECLAMATION");
        System.out.println("Entrer le numéro de votre service : ");
        int serviceNumber = scanner.nextInt();

        if (serviceNumber == 1) {
            System.out.println("VOICI VOTRE MODULES >SEG< ET L'ETAT D'INSCRIPTION DE SESSION DE PRINGTEMPS:\n\n");
            System.out.println(">>ECONOMIE MONETAIRE ET FINANCIAIRE : R+\n");
            System.out.println(">>PROBLEME ECONOMIQUE ET SOCIAUX : R+\n");
            System.out.println(">>COMPTABILITE ANALYTIQUE : R+\n");
            System.out.println(">>MARKETING DE BASE : R+\n");
            System.out.println(">>ECHANTILLONNAGE ET ESTIMATION : R+\n");
            System.out.println(">>INTRODUCTION A L'ETUDE DE DROIT : R+\n");
        }else if (serviceNumber == 2) {
            System.out.println("VOICI LES NOTES DE VOTRE MODULES DE SESSION DE PRINGTEMPS SN:\n\n");
            System.out.println(">>ECONOMIE MONETAIRE ET FINANCIAIRE : 10 V\n");
            System.out.println(">>PROBLEME ECONOMIQUE ET SOCIAUX : 14 V\n");
            System.out.println(">>COMPTABILITE ANALYTIQUE : 14 V\n");
            System.out.println(">>MARKETING DE BASE : 4 RAT\n");
            System.out.println(">>ECHANTILLONNAGE ET ESTIMATION : 6 RAT\n");
            System.out.println(">>INTRODUCTION A L'ETUDE DE DROIT : 14.5 V\n");
        }
        else if (serviceNumber == 3) {

            System.out.println("LA FENETRE DE RECLAMATION : ");
            Scanner scanner2 = new Scanner(System.in);
            
            System.out.println("VOTRE NOM : ");
            String last_name = scanner2.nextLine();
            System.out.println("VOTRE PRENOM : ");
            String name = scanner2.nextLine();
            System.out.println("VOTRE E-MAIL : ");
            String e_mail = scanner2.nextLine();
            System.out.println("VOTRE NUMERO DE TELEPHONE : ");
            int num = scanner2.nextInt();
            System.out.println("VOTRE RECLAMATION : ");
            String reclamation = scanner2.nextLine();

            System.out.println(">>>> VOTRE RECLAMATION A BIEN REÇU <<<<");
        }
        // Ajoutez le code pour gérer les services ici
        scanner.close();
    }
}
