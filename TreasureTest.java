
/**
 * TreasureTest.java - Test Driver for the Treasure Class.
 * 
 * @author Justin Watts
 * @version 21-OCT-2014
 */
public class TreasureTest
{
    public static void main(String[] args)
    {
        Treasure t1 = new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, 150);
        Treasure t2 = new Treasure("Myrtenaster", "Multi Action Dust Rapier", 80.0, 200);
        Treasure t3 = new Treasure("Gambol Shroud", "Variant Ballistic Chain Scythe", 112.0, 75);
        Treasure t4 = new Treasure("Ember Celica", "Dual Ranged Shot Gauntlets", 160.0, 125);
        
        Treasure t5 = new Treasure("Gambol Shroud", "Variant Ballistic Chain Scythe", 112.0, 75);
        Treasure found;
        
        System.out.println("\nThe handle found points to:");
        if (t5.equals(t1))
        {
            found = t1;
            System.out.println(found.toString());
        }
        else if (t5.equals(t2))
        {
            found = t2;
            System.out.println(found.toString());
        }
        else if (t5.equals(t3))
        {
            found = t3;
            System.out.println(found.toString());
        }
        else if (t5.equals(t4))
        {
            found = t4;
            System.out.println(found.toString());
        }
        else
        {
            found = new Treasure("Nothing", "I'm sorry, but your treasure is in another room", 0.0, 0);
            System.out.println(found.toString());
        }
        
        System.out.println("\nfound points to correct treasure:");
        
        if (found == t3)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        
            
        Treasure min = t1;
        Treasure max = t1;
        
        if (min.compareTo(t2) > 0)
            min = t2;
        else if (min.compareTo(t3) > 0)
            min = t3;
        else if (min.compareTo(t4) > 0)
            min = t4;
            
        if (max.compareTo(t2) < 0)
            max = t2;
        else if (max.compareTo(t3) < 0)
            max = t3;
        else if (max.compareTo(t4) < 0)
            max = t4;
        
        System.out.println("\nThe lowest value treasure is:\n" + min.toString());
        System.out.println("\nThe highest value treasure is:\n" + max.toString());
        
        
        System.out.println("\nmin points to correct treasure:");
        
        if (min == t3)
            System.out.println("Pass");
        else
            System.out.println("Fail");
            
        System.out.println("\nmax points to correct treasure:");
        
        if (max == t2)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
