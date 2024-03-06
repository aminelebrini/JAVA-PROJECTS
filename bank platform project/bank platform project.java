import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class banking_system {



    public static void devenir_un_client()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("                                                        >>> AMINE BANK <<<");   
        System.out.println("REMPLIR LES CHAMPS OBLIGATOIRE : \n");
        System.out.println("VOTRE NOM COMPLET : ");
        String full_name = scanner.nextLine().toUpperCase();

        System.out.println("VOTRE NAISSANCE jj/mm/aa : ");
        String n_n = scanner.nextLine();

        System.out.println("VOTRE EMAIL : ");
        String email = scanner.nextLine();

        System.out.println("VOTRE NUMERO DE TELEPHONE : ");
        int tele = scanner.nextInt();

        for(int i = 0; i <= 100; i++)
        {
            System.out.println("\n>>>>>>>>>>>>VOTRE COMPTE EN COURS DE CREATION... is loading "+i+"%");
        }
        System.out.println("\n>>>>felicitation votre compte a bien creer");

    }

    
    public static void je_me_connecte()
    {
        String[] ids = {"HASSAN", "MOHAMMED", "YASSINE"};
        int[] pss = {2004, 2010, 2005};
        int[] slode ={1000, 30000,100};
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("entrer votre identifiant : ");
        String id = scanner.nextLine().toUpperCase();

        System.out.println("entrer votre mot de passe : ");
        int ps = scanner.nextInt();

        System.out.println("EN RECHERCHE...");

        for(int i = 0; i >= 0; i++)
        {
            for(int j = 0; j >= 0 ; j++)
            {
                if (id.equals(ids[i]) && ps == pss[j]) {

                    System.out.println("                                                          AMINE BANK");
                    System.out.println("BIENVENUE Mr " + ids[i]); 
                    System.out.println("VOTRE SOLDE : "+ slode[i]+ " MAD"+"\n"); 
                    System.out.println("choisir une service : ");
                    System.out.println("1.EFFECTUEZ UNE RECHARGE");
                    System.out.println("2.EFFECTUEZ UN VIREMENT");
                    System.out.println("3.PAYER UNE FACTURE");
                    int ch;

                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("entrer le numero de votre service : ");
                    ch = scanner2.nextInt();

                    if (ch == 1) {

                        
                        System.out.println("                                        >>EFFECTUEZ UNE RECHARGE<<");
                        System.out.println("choisir l'operateur :");
                        System.out.println("1.INWI");
                        System.out.println("2. MAROC TELECOM");
                        System.out.println("3. ORANGE");
                        Scanner scanner3 = new Scanner(System.in);
                        int c = scanner3.nextInt();

                        if (c==1) {

                            Scanner scanner4 = new Scanner(System.in);

                            System.out.println("choisir le type de votre recharge : ");
                            String recharge = scanner4.nextLine();

                            System.out.println("entrer le numero de telephone : ");
                            int telephone = scanner4.nextInt();

                            System.out.println("entrer le montant de votre recharge : ");
                            int mtn = scanner4.nextInt();

                            System.out.println("votre recharge de l'offre "+recharge+" de montant "+mtn+" MAD "+"a bien effetue");
                            slode[i] -= mtn;
                            System.out.println("votre solde maintenant est" + slode[i]);
                        }
                        else if (c==2) {
                            Scanner scanner5 = new Scanner(System.in);

                            System.out.println("choisir le type de votre recharge : ");
                            String recharge = scanner5.nextLine();

                            System.out.println("entrer le numero de telephone : ");
                            int telephone = scanner5.nextInt();

                            System.out.println("entrer le montant de votre recharge : ");
                            int mt = scanner5.nextInt();

                            System.out.println("votre recharge de l'offre "+recharge+" de montant "+mt+" MAD "+"a bien effetue");
                            slode[i] -= mt;
                            System.out.println("votre solde maintenant est" + slode[i]);
                        }else if(c==3){
                            Scanner scanner6 = new Scanner(System.in);

                            System.out.println("choisir le type de votre recharge : ");
                            String recharge = scanner6.nextLine();

                            System.out.println("entrer le numero de telephone : ");
                            int telephone = scanner6.nextInt();

                            System.out.println("entrer le montant de votre recharge : ");
                            int mts = scanner6.nextInt();

                            System.out.println("votre recharge de l'offre "+recharge+" de montant "+mts+" MAD "+"a bien effetue");

                            slode[i] -= mts;

                        System.out.println("votre solde maintenant est" + slode[i]);
                        }

                        
                    }else if(ch == 2)
                    {
                        Scanner scanner4 = new Scanner(System.in);
                        System.out.println("EFFECTUEZ UN VIREMENT:\n");

                        System.out.println("ENTRER LE NONTANT DE VIREMENT EN MAD:");
                        int montant = scanner4.nextInt();

                        System.out.println("ENTRER LE NUMERO DE COMPTE DU BENIFECIAIRE :");
                        int beni = scanner4.nextInt();

                        System.out.println("ENTRER LE NOM COMPLET DU BENIFECIAIRE :");
                        String name = scanner4.nextLine();

                        

                        slode[i] -= montant;

                        System.out.println("votre solde maintenant est " + slode[i]);

                       
                    }
                }
            }
            
        }
        scanner.close();

        
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("                                        >>>Bienvenue dans AMINE BANK<<<");
        System.out.println("choisir : ");
        System.out.println("1.Je me connecte");
        System.out.println("2.Devenir Un Client");

        int choise;
        System.out.println("Entrer Le Choix : ");
        choise = scanner.nextInt();

        if (choise == 1) {
           je_me_connecte();
            
        }else if(choise==2)
        {
            devenir_un_client();
        }
        
    }
}
