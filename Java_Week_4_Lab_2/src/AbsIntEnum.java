public class AbsIntEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String []args)
    {
        Car c = new Car(2020,"Honda", Color.RED);
        
        System.out.println(c.getVehicleInfo());
        
        c.ignite();
        
        c.quote();
    }
    
}