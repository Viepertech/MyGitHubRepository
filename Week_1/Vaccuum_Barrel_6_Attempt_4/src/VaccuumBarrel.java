public class VacuumBarrel extends Barrel{
    private Temperature temperature;

    public VacuumBarrel(Temperature temperature){
        this.temperature = temperature;
        if(!this.temperature.getScale().equals("celsius")){
            this.temperature = toCelsius();
            this.temperature.setScale("celsius");
        }
    }

    public VacuumBarrel add(VacuumBarrel obj){
        VacuumBarrel additionBarrel = new VacuumBarrel(this.temperature);
        if(!obj.temperature.getScale().equalsIgnoreCase("celsius"))
        {
            obj.temperature = obj.toCelsius();
            obj.temperature.setScale("celsius");
        }
        additionBarrel.temperature.setDegree(additionBarrel.temperature.getDegree() + obj.temperature.getDegree());
        additionBarrel.temperature.setScale("celsius");
        return additionBarrel;
    }

    public VacuumBarrel subtract(VacuumBarrel obj){
        VacuumBarrel additionBarrel = new VacuumBarrel(this.temperature);
        if(!obj.temperature.getScale().equalsIgnoreCase("celsius")){
            obj.temperature = obj.toCelsius();
            obj.temperature.setScale("celsius");
        }
        additionBarrel.temperature.setDegree(additionBarrel.temperature.getDegree() - obj.temperature.getDegree());
        additionBarrel.temperature.setScale("celsius");
        return additionBarrel;
    }

    public VacuumBarrel divide(VacuumBarrel obj){
        VacuumBarrel additionBarrel = new VacuumBarrel(this.temperature);
        if(!obj.temperature.getScale().equalsIgnoreCase("celsius")){
            obj.temperature = obj.toCelsius();
            obj.temperature.setScale("celsius");
        }
        additionBarrel.temperature.setDegree(additionBarrel.temperature.getDegree() / obj.temperature.getDegree());
        return additionBarrel;
    }

    public boolean equals(VacuumBarrel obj){
        return this.temperature == obj.temperature;
    }

    public boolean greaterThan(VacuumBarrel obj){
        if(!obj.temperature.getScale().equalsIgnoreCase("celsius")){
            obj.temperature = obj.toCelsius();
            obj.temperature.setScale("celsius");
        }
        return this.temperature.getDegree() > obj.temperature.getDegree();
    }

    public Temperature toKelvin(){
        Temperature mTemp;
        if(this.temperature.getScale().equalsIgnoreCase("celsius")){
            double tempInKelvin = this.temperature.getDegree() + 273.15;
            return new Temperature(tempInKelvin, "kelvin");
        }
        else{
            double tempInKelvin = 273.5f + ((this.temperature.getDegree() - 32.0f) * (5.0f/9.0f));
            return new Temperature(tempInKelvin, "kelvin");
        }
    }

    public Temperature toFahrenheit(){
        Temperature mTemp;
        if(this.temperature.getScale().equalsIgnoreCase("celsius")){
            double tempInFahrenheit = this.temperature.getDegree() * (9f / 5) + 32;
            return new Temperature(tempInFahrenheit, "fahrenheit");
        }
        else{
            double tempInFahrenheit = ((this.temperature.getDegree() - 273.15) * 1.8) + 32;
            return new Temperature(tempInFahrenheit, "fahrenheit");
        }
    }

    public Temperature toCelsius(){
        Temperature mTemp;
        if(this.temperature.getScale().equalsIgnoreCase("fahrenheit")){
            double tempInCelsius =(( 5 *(this.temperature.getDegree() - 32.0)) / 9.0);
            return new Temperature(tempInCelsius, "celsius");
        }
        else{
            double kelvin = this.temperature.getDegree();
            double tempInCelsius = kelvin - 273.15F;
            return new Temperature(tempInCelsius, "celsius");
        }
    }

    @Override
    public String toString() {
        return "VacuumBarrel{" +
                "temperature=" + temperature +
                '}';
    }
}