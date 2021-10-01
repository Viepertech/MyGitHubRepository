public class Dispatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("====Polymorphism====\n\n");

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.show();
        b.show();
        c.show();
        d.show();

        a.display();
        b.display();
        c.display();
        d.display();

        b.print();
        c.print();
        d.print();

        System.out.println("\n\n====Dynamic Dispatch====\n\n");

        A ab = new B();
        ab.show();
        ab.display();

        A ac = new C();
        ac.show();
        ac.display();

        A ad = new D();
        ad.show();
        ad.display();

        B bc = new C();
        bc.show();
        bc.display();
        bc.print();

        B bd = new D();
        bd.show();
        bd.display();
        bd.print();

    }

}