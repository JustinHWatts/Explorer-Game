/**
 * Treasure.java - References a treasure of given value and weight.
 * 
 * @author Justin Watts
 * @version 21-OCT-2014
 */
public class Treasure
{
    private String name;
    private String description;
    private double weight;
    private int value;

    public Treasure(String _name, String _description, double _weight, int _value)
    {
        this.name = _name;
        this.description = _description;
        
        if (_weight >= 0.0)
            this.weight = _weight;
        else
            this.weight = 0.0;
        
        if (_value >= 0)
            this.value = _value;
        else
            this.value = 0;
    }
    
    public String toString()
    {
        return (this.name + ", " + this.description + "\n   value: "
            + this.value + ", weight: " + this.weight);
    }
    
    public boolean equals(Treasure treasure)
    {
        boolean equal = false;
        if (this.name.equals(treasure.name) && this.description.equals(treasure.description) &&
            this.value == treasure.value && this.weight == treasure.weight)
            equal = true;
        
        
        return equal;
    }
    public int compareTo(Treasure treasure)
    {
        return this.value - treasure.value;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public double getWeight()
    {
        return this.weight;
    }
    
    public int getValue()
    {
        return this.value;
    }
}