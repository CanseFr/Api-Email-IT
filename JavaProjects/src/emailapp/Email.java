package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String departement;
    private  String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "porn.org";

    // Constructor pour nom et prenom
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Email Created : " + this.firstName +"  "+ this.lastName);

        // Methode pour demander le departement lors de la creation , return departement
        this.departement = setDepartement();
//        System.out.println("Deparement: " + this.departement);

        // Appel la methode qui retroune un random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("You password is : " + this.password);

        // Combiner elements pour generation email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() +"@"+ departement + "." + companySuffix;
//        System.out.println("Votre email : " + email);
    }

    // demander le departement
    private String setDepartement(){
        System.out.println("New worker:"+firstName+". CODE DEPARTEMENT : \n1 pour Vente \n2 pour Comptabilité \n3 pur le Developement \n0 pour Aucun Poste");
        Scanner sc = new Scanner(System.in);
        int departementChoix = sc.nextInt();
        if (departementChoix == 1){return "vente";}
        else if (departementChoix == 2 ){ return "compta";}
        else if (departementChoix == 3 ){ return "dev";}
        else {return "";}
    }

    // Generer un random password
    private  String randomPassword(int length){
        String passwordSet = "ABCDEFGHIKLMONPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@$%#";
        char[] password = new char[length]; // je creer l'objet tableau de car avec la taille passé en argument
        for (int i = 0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    // set le mailbox capacty
    public void setMailBoxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // set le alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Changer password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String gatPassword(){return password;}

    public String showInfo(){
        return  "DISPLAY NAME : "+firstName+" "+lastName +
                "\nCOMPANY EMAIL : "+email+
                "\nMAIL BOX CAPACITY : " + mailboxCapacity+" mb";
    }



}
