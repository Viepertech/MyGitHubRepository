public class VacuumBarrel extends Barrel
{
    private Temperature temperature;

    public VacuumBarrel(int numberOfApples, Temperature temperature)
    {
        set(numberOfApples);
        this.temperature = temperature;
        if(!this.temperature.getScale().equals("C"))
        {
            this.temperature = temperature.toCelsius();
            this.temperature.setScale("C");
        }
    }

    public VacuumBarrel add(VacuumBarrel obj)
    {
        VacuumBarrel additionBarrel = new VacuumBarrel(get(), this.temperature);
        if(!obj.temperature.getScale().equalsIgnoreCase("C"))
        {
            obj.temperature = obj.temperature.toCelsius();
            obj.temperature.setScale("C");
        }
        additionBarrel.temperature.setDegree(additionBarrel.temperature.getDegree() + obj.temperature.getDegree());
        additionBarrel.temperature.setScale("C");
        return additionBarrel;
    }

    public VacuumBarrel subtract(VacuumBarrel obj)
    {
        VacuumBarrel additionBarrel = new VacuumBarrel(get(), this.temperature);
        if(!obj.temperature.getScale().equalsIgnoreCase("C"))
        {
            obj.temperature = obj.temperature.toCelsius();
            obj.temperature.setScale("C");
        }
        additionBarrel.temperature.setDegree(additionBarrel.temperature.getDegree() - obj.temperature.getDegree());
        additionBarrel.temperature.setScale("C");
        return additionBarrel;
    }

    public VacuumBarrel divide(VacuumBarrel obj)
    {
        VacuumBarrel additionBarrel = new VacuumBarrel(get(), this.temperature);
        if(!obj.temperature.getScale().equalsIgnoreCase("C"))
        {
            obj.temperature = obj.temperature.toCelsius();
            obj.temperature.setScale("C");
        }
        additionBarrel.temperature.setDegree(additionBarrel.temperature.getDegree() / obj.temperature.getDegree());
        return additionBarrel;
    }

    public boolean equals(VacuumBarrel obj)
    {
        return this.temperature == obj.temperature;
    }

    public boolean greaterThan(VacuumBarrel obj)
    {
        if(!obj.temperature.getScale().equalsIgnoreCase("C"))
        {
            obj.temperature = obj.temperature.toCelsius();
            obj.temperature.setScale("C");
        }
        return this.temperature.getDegree() > obj.temperature.getDegree();
    }

    public void set(Temperature temperature) 
    {
        this.temperature = temperature;
    }

    @Override
    public String toString() 
    {
        return "VacuumBarrel{ " +
                "temperature = " + temperature +
                ' ';
    }

    public VacuumBarrel toKelvin()
    {
        return new VacuumBarrel(get(), this.temperature.toKelvin());
    }
}