/**
 * TreasureListDriver.java - Test Driver for the TreasureList Class.
 * 
 * @author Justin Watts
 * @version 6-NOV-2014
 */
public class TreasureListDriver
{
    public static void main(String[] args)
    {
        TreasureList list1 = new TreasureList(-1);
        int testNum = 1;
        
        System.out.println("Test of Growing an Array\n");
        
        System.out.println(testNum + ": " + (list1.toString().equals("No Treasures") ? "Pass" : "Fail"));
        testNum++;
        
        TreasureList list2 = new TreasureList(0);
        System.out.println(testNum + ": " + (list2.toString().equals("No Treasures") ? "Pass" : "Fail"));
        testNum++;
        
        Treasure t1 = new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, 150);
        Treasure t2 = new Treasure("Myrtenaster", "Multi Action Dust Rapier", 80.0, 200);
        
        list2.add(t1);
        System.out.println(testNum + ": " + (list2.toString().equals("1. Crescent Rose, High-Caliber Sniper"
            + "-Scythe\n   value: 150, weight: 320.0\n\n") ? "Pass" : "Fail"));
        testNum++;
        
        list2.add(t2);
        System.out.println(testNum + ": " + (list2.toString().equals("1. Crescent Rose, High-Caliber Sniper"
            + "-Scythe\n   value: 150, weight: 320.0\n\n"
            + "2. Myrtenaster, Multi Action Dust Rapier\n   value: 200, weight: 80.0\n\n") ? "Pass" : "Fail"));
        testNum++;
    }
}
