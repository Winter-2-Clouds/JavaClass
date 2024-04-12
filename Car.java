public class Car 
{
    public enum Colour
    {
        Black,
        Red,
        Blue
    }
    
    private String make;
    private String model;
    private int numWheels;
    private Colour colour;
    private int mileage;
    private int year;
    private boolean satisfied;

    Car( String make, String model, int numWheels, String colour, int mileage, int year, boolean satisfied)
    {
        this.make = make;
        this.model = model;
        this.numWheels = numWheels;
        
        this.mileage = mileage;
        this.year = year;
        this.satisfied = satisfied;


    }
    Car(String carMake, String carModel)
    {
        make = carMake;
        model = carModel;
    }

    public String GetModel()
    {
        return model; // return the istance variable
    }

    // Setter methods 
    public void SetMake( String newMake)
    {
        make = newMake; //set the make of the car
    }

    public String GetMake()
    {
        
    }

}
