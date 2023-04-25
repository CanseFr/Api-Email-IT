package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Julien","Cansell");
//        em1.setAlternateEmail("juju@gmail.com");
//        System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());


    }
}