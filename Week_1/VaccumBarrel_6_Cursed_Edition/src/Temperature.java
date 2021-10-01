
public class Temperature
{	
    private double degree;
    private String scale;

    public Temperature(double degree, String scale)
    {
        this.degree = degree;
        this.scale = scale;
    }

    public double getDegree() 
    {
        return degree;
    }

    public void setDegree(double degree) 
    {
        this.degree = degree;
    }

    public String getScale() 
    {
        return scale;
    }

    public void setScale(String scale) 
    {
        this.scale = scale;
    }

    public Temperature toKelvin()
    {
        Temperature mTemp;
        if(this.getScale().equalsIgnoreCase("C"))
        {
            double tempInKelvin = this.getDegree() + 273.15;
            return new Temperature(tempInKelvin, "K");
        }
        else
        {
            double tempInKelvin = 273.5f + ((this.getDegree() - 32.0f) * (5.0f/9.0f));
            return new Temperature(tempInKelvin, "K");
        }
    }

    public Temperature toFahrenheit()
    {
        Temperature mTemp;
        if(this.getScale().equalsIgnoreCase("C"))
        {
            double tempInFahrenheit = this.getDegree() * (9f / 5) + 32;
            return new Temperature(tempInFahrenheit, "F");
        }
        else
        {
            double tempInFahrenheit = ((this.getDegree() - 273.15) * 1.8) + 32;
            return new Temperature(tempInFahrenheit, "F");
        }
    }

    public Temperature toCelsius()
    {
        Temperature mTemp;
        if(this.getScale().equalsIgnoreCase("F"))
        {
            double tempInCelsius =(( 5 *(this.getDegree() - 32.0)) / 9.0);
            return new Temperature(tempInCelsius, "C");
        }
        else
        {
            double kelvin = this.getDegree();
            double tempInCelsius = kelvin - 273.15F;
            return new Temperature(tempInCelsius, "C");
        }
    }

    @Override
    public String toString()
    {
        return "Temperature{" +
                "degree=" + degree +
                ", scale='" + scale + '\'' +
                '}';
    }
}