/**
 * Explorer.java - References an explorer within a room carrying treasure.
 * 
 * @author Justin Watts
 * @version 21-Oct-2014
 */
public class Explorer
{
    private String name;
    private Room room;
    private TreasureList bag;

    public Explorer(String _name, Room _room)
    {
        this.name = _name;
        this.room = _room;
        this.bag = new TreasureList(0);
    }
    
    public String toString()
    {
        return "Explorer: " + this.name + "\nRoom: " + this.room + "\nTreasures:\n" + this.bag.toString();
    }
    
    public void grab(Treasure treasure)
    {
        this.bag.add(treasure);
    }
}
