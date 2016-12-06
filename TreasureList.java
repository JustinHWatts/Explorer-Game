/**
 * TreasureList.java - References and manages a list of treasures carried by the explorer.
 * 
 * @author Justin Watts
 * @version 6-NOV-2014
 */
public class TreasureList
{
    private Treasure[] list;
    private int numTreasures;

    public TreasureList(int size)
    {
        this.numTreasures = 0;
        
        if (size >= 0)
            this.list = new Treasure[size];
        else
            this.list = new Treasure[0];
    }

    private boolean isFull()
    {
        boolean bool = false;
        if (this.numTreasures == this.list.length)
            bool = true;
        
        return bool;
    }
    
    private boolean isEmpty()
    {
        boolean bool = false;
        if (this.numTreasures == 0)
            bool = true;
        
        return bool;
    }
    
    private Treasure[] grow(Treasure[] _list, int size)
    {
        int i = 0;
        if (size > this.list.length)
        {
            this.list = new Treasure[size];
            for (Treasure treasure : _list)
            {
                this.list[i] = treasure;
                i++;
            }
        }
        else
            this.list = null;
            
        return this.list;
    }
    
    public void add(Treasure treasure)
    {
        if (this.isFull())
            this.grow(this.list, (this.list.length + 1));
            
        this.list[this.numTreasures] = treasure;
        this.numTreasures++;
    }
    
    public String toString()
    {
        String treasures = "";
        int i = 1;
        
        if (this.isEmpty())
            treasures = "No Treasures";
        else
        {
            for (Treasure curTreasure : this.list)
            {
                treasures += i + ". " + curTreasure + "\n\n";
                i++;
            }
        }
        
        return treasures;
    }
}