/**
 * HW09.java - Reads files to determine rooms and their corresponding treasures.
 * 
 * @author Justin Watts
 * @version 9-NOV-2014
 */
import java.io.*;
import java.util.Scanner;

public class HW09
{
    public static void main(String[] args) throws IOException
    {
        String curRoom, curTreasure;
        int numRooms = 0, numTreasures = 0, totalValue = 0, totalWeight = 0, i = 1;
        Scanner scan1, scan2;
        
        FileReader rooms = new FileReader("rooms.csv");
        FileReader treasures = new FileReader("treasures.csv");
        
        Room[] roomList = null;
        Treasure treasure = null;
        
        while (rooms.hasNext())
        {
            curRoom = rooms.getRecord();
            scan1 = new Scanner(curRoom);
            scan1.useDelimiter(",");
            
            if (numRooms == 0 && numTreasures == 0)
            {
                curTreasure = treasures.getRecord();
                scan2 = new Scanner(curTreasure);
                scan2.useDelimiter(",");
                
                numRooms = scan1.nextInt();
                roomList = new Room[numRooms];
                numTreasures = scan2.nextInt();
            }
            else if (roomList[0] == null)
            {
                roomList[0] = new Room(scan1.next(), scan1.next());
            }
            else if (treasures.hasNext())
            {
                curTreasure = treasures.getRecord();
                scan2 = new Scanner(curTreasure);
                scan2.useDelimiter(",");
                
                treasure = new Treasure(scan2.next(), scan2.next(), scan2.nextDouble(),
                    scan2.nextInt());
                    
                totalWeight += treasure.getWeight();
                totalValue += treasure.getValue();
                    
                roomList[i] = new Room(scan1.next(), scan1.next(), treasure);
                i++;
            }
        }
        
        for (Room room : roomList)
        {
            System.out.println(room.toString());
            System.out.println();
        }
        
        System.out.println(numRooms + " rooms with " + numTreasures + " treasures");
        System.out.println("Total value: " + totalValue + "    Total weight: " + totalWeight);
    }
}