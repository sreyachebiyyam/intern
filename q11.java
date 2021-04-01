public class Conversion
 {  
   public static void main (String args[])  
    { 
	float Fahrenheit = 43;
	Conversion c=new Conversion();
	c.converttoCelsius(Fahrenheit);
    }
   void converttoCelsius(float f)
   {
	float Celsius;  
          Celsius  = ((f-32)*5)/9;  
          System.out.println("Temperature in celsius is: "+Celsius);  
    }
}
