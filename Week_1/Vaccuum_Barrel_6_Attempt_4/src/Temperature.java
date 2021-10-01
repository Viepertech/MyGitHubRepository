public class Temperature 

{

  private double value;  // variable for temperature value

  private char unit;   // variable for unit

  // default constructor

  public Temperature() {

  }

   

  public Temperature(double value, char unit) {

    this.setUnit(unit);

    this.setValue(value);

  }

  // getter methods

  public double getValue() {

    return value;

  }



  public char getUnit() {

    return unit;

  }

  // setter methods

  public void setValue(double value) {

    this.value = value;

  }



  public void setUnit(char unit) {

   //this.value = value;

    this.unit = Character.toUpperCase(unit);

    switch (unit)



      {



      case 'F':



         if(value < -459.67)



         {



            System.out.println("degree can not be < -459.67");



            System.exit(0);



         }



         else



         {



            this.value = value;



            this.unit = 'F';



            //  System.out.println("F is assigned to scale");



         }



         break;



 



      case 'C':



         if(value < -273.15)



         {



            System.out.println("C can not be < -273.15");



            System.exit(0);



         }



         else



         {



            this.value = value;



            this.value = 'C';



            //  System.out.println("C is assigned to value");



         }



         break;



      case 'K':



         if(value < 0.0)



         {



            System.out.println("in set degree cannot be negitive");



            System.exit(0);



         }



         else



         {



            this.value = value;



            this.unit = 'K';



         }



         break;



     // default:



         // System.out.println("bad input scale");



         //System.exit(0);



         // break;



      }



   }

   

  // method to return temperature

   

  public String toString() {

    return value + "" + unit;

  }

  // method to convert to celcius

  Temperature toCelsius() {

    Temperature t = this;

    if (this.unit == 'F') {

      double celsius = ((5 * (this.value - 32.0)) / 9.0);

      t = new Temperature(celsius, 'C');

    } else if (this.unit == 'K') {

      double celsius = this.value - 273.15;

      t = new Temperature(celsius, 'C');

    }

    return t;

  }

   

  Temperature toKelvin() {

    Temperature t = this;

    if (this.unit == 'C') {

      double kelvin = (double) (this.value + 273.15);

      t = new Temperature(kelvin, 'K');

    }

    if (this.unit == 'F') {

      double kelvin = 273.5 + ((this.value - 32.0) * (5.0 / 9.0));

      t = new Temperature(kelvin, 'K');

    }

    return t;

  }

  // method to convert to Fahrenheit

  Temperature toFahrenheit() {

    Temperature t = this;

    if (this.unit == 'C') {

      double f = (this.value * 9.0 / 5.0) + 32.0;

      t = new Temperature(f, 'F');

    }

    if (this.unit == 'K') {

      double f = (((this.value - 273) * 9.0 / 5.0) + 32);

      t = new Temperature(f, 'F');

    }

    return t;

  }

  // method to check two temperature are equal or not

  public boolean equals(Temperature other) {

    Temperature t1 = this.toCelsius();

    Temperature t2 = other.toCelsius();

    if (t1.value == t2.value) {

      return true;

    }

    return false;

  }

  // method to add two temperatures

  Temperature add(Temperature temp1) {

    Temperature t = null;

    switch(this.unit){

      case 'C':

        t = temp1.toCelsius();

        break;

      case 'F':

        t = temp1.toFahrenheit();

        break;

      case 'K':

        t = temp1.toKelvin();

        break;

    }

    t.setValue(this.value+t.value);

    return t;

  }

  // method to divide temperature with a number

  Temperature divide(int number) {

    Temperature t = new Temperature(this.value/number, this.unit);

    return t;

  }

  // method to subtract two temperatures

  Temperature subtract(Temperature temp1) {

    Temperature t = null;

    switch(this.unit){

      case 'C':

        t = temp1.toCelsius();

        break;

      case 'F':

        t = temp1.toFahrenheit();

        break;

      case 'K':

        t = temp1.toKelvin();

        break;

    }

    t.setValue(this.value-t.value);

    return t;

  }

  // method to multiply two temperatures

  Temperature mutiply(Temperature temp1) {

    Temperature t = null;

    switch(this.unit){

      case 'C':

        t = temp1.toCelsius();

        break;

      case 'F':

        t = temp1.toFahrenheit();

        break;

      case 'K':

        t = temp1.toKelvin();

        break;

    }

    t.setValue(this.value*t.value);

    return t;

  }

}



here is the output



public class Temperature 

{

  private double value;  // variable for temperature value

  private char unit;   // variable for unit

  // default constructor

  public Temperature() {

  }

   

  public Temperature(double value, char unit) {

    this.setUnit(unit);

    this.setValue(value);

  }

  // getter methods

  public double getValue() {

    return value;

  }



  public char getUnit() {

    return unit;

  }

  // setter methods

  public void setValue(double value) {

    this.value = value;

  }



  public void setUnit(char unit) {

   //this.value = value;

    this.unit = Character.toUpperCase(unit);

    switch (unit)



      {



      case 'F':



         if(value < -459.67)



         {



            System.out.println("degree can not be < -459.67");



            System.exit(0);



         }



         else



         {



            this.value = value;



            this.unit = 'F';



            //  System.out.println("F is assigned to scale");



         }



         break;



 



      case 'C':



         if(value < -273.15)



         {



            System.out.println("C can not be < -273.15");



            System.exit(0);



         }



         else



         {



            this.value = value;



            this.value = 'C';



            //  System.out.println("C is assigned to value");



         }



         break;



      case 'K':



         if(value < 0.0)



         {



            System.out.println("in set degree cannot be negitive");



            System.exit(0);



         }



         else



         {



            this.value = value;



            this.unit = 'K';



         }



         break;



     // default:



         // System.out.println("bad input scale");



         //System.exit(0);



         // break;



      }



   }

   

  // method to return temperature

   

  public String toString() {

    return value + "" + unit;

  }

  // method to convert to celcius

  Temperature toCelsius() {

    Temperature t = this;

    if (this.unit == 'F') {

      double celsius = ((5 * (this.value - 32.0)) / 9.0);

      t = new Temperature(celsius, 'C');

    } else if (this.unit == 'K') {

      double celsius = this.value - 273.15;

      t = new Temperature(celsius, 'C');

    }

    return t;

  }

   

  Temperature toKelvin() {

    Temperature t = this;

    if (this.unit == 'C') {

      double kelvin = (double) (this.value + 273.15);

      t = new Temperature(kelvin, 'K');

    }

    if (this.unit == 'F') {

      double kelvin = 273.5 + ((this.value - 32.0) * (5.0 / 9.0));

      t = new Temperature(kelvin, 'K');

    }

    return t;

  }

  // method to convert to Fahrenheit

  Temperature toFahrenheit() {

    Temperature t = this;

    if (this.unit == 'C') {

      double f = (this.value * 9.0 / 5.0) + 32.0;

      t = new Temperature(f, 'F');

    }

    if (this.unit == 'K') {

      double f = (((this.value - 273) * 9.0 / 5.0) + 32);

      t = new Temperature(f, 'F');

    }

    return t;

  }

  // method to check two temperature are equal or not

  public boolean equals(Temperature other) {

    Temperature t1 = this.toCelsius();

    Temperature t2 = other.toCelsius();

    if (t1.value == t2.value) {

      return true;

    }

    return false;

  }

  // method to add two temperatures

  Temperature add(Temperature temp1) {

    Temperature t = null;

    switch(this.unit){

      case 'C':

        t = temp1.toCelsius();

        break;

      case 'F':

        t = temp1.toFahrenheit();

        break;

      case 'K':

        t = temp1.toKelvin();

        break;

    }

    t.setValue(this.value+t.value);

    return t;

  }

  // method to divide temperature with a number

  Temperature divide(int number) {

    Temperature t = new Temperature(this.value/number, this.unit);

    return t;

  }

  // method to subtract two temperatures

  Temperature subtract(Temperature temp1) {

    Temperature t = null;

    switch(this.unit){

      case 'C':

        t = temp1.toCelsius();

        break;

      case 'F':

        t = temp1.toFahrenheit();

        break;

      case 'K':

        t = temp1.toKelvin();

        break;

    }

    t.setValue(this.value-t.value);

    return t;

  }

  // method to multiply two temperatures

  Temperature mutiply(Temperature temp1) {

    Temperature t = null;

    switch(this.unit){

      case 'C':

        t = temp1.toCelsius();

        break;

      case 'F':

        t = temp1.toFahrenheit();

        break;

      case 'K':

        t = temp1.toKelvin();

        break;

    }

    t.setValue(this.value*t.value);

    return t;

  }

}