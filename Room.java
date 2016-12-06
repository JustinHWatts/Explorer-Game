/**
 * Room.java - References a room containing treasure.
 * 
 * @author Justin Watts
 * @version 21-Oct-2014
 */
public class Room
{
    private String name;
    private String description;
    private Treasure treasure;

    public Room(String _name, String _description)
    {
        this.name = _name;
        this.description = _description;
        this.treasure = null;
    }
    
    public Room(String _name, String _description, Treasure _treasure)
    {
        this.name = _name;
        this.description = _description;
        this.treasure = _treasure;
    }
    
    public String toString()
    {
        String result = "";
        
        if (this.treasure == null)
            result = this.name + " - " + this.description;
        else
            result = this.name + " - " + this.description
                + "\nTreasure: " + this.treasure.getName() + " - " + this.treasure.getDescription()
                + "\nvalue: " + this.treasure.getValue() + "   weight: " + this.treasure.getWeight();
        
        return result;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getDescription()
    {
        return this.name;
    }
    
    public String getTreasure()
    {
        return this.treasure.toString();
    }
}