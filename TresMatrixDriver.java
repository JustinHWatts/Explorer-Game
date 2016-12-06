/**
 * TresMatrixDriver.java - Driver class for TresMatrix.java.
 * 
 * @author Justin Watts
 * @version 13-NOV-2014
 */
public class TresMatrixDriver
{
    public static void main(String[] args)
    {
        TresMatrix matrixObj = new TresMatrix();
        TresMatrixTest test = new TresMatrixTest();
        
        //************************************************************************
        // prints a 4x3 Matrix of Treasures w/ a For-Each Loop (No room in output)
        //************************************************************************
        /*
        Treasure[][] matrix1 = {{new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, 150),
            new Treasure("Myrtenaster", "Multi Action Dust Rapier", 80.0, 200),
            new Treasure("Gambol Shroud", "Variant Ballistic Chain Scythe", 112.0, 75)}, 
            {new Treasure("Ember Celica", "Dual Ranged Shot Gauntlets", 160.0, 125),
            new Treasure("Milo and Akouo", "Multi-Form Sword and Shield", 140.0, 175),
            new Treasure("Crocea Mors", "Ancient Longsword and Transforming Sheath", 125.0, 100)},
            {new Treasure("Magnhild", "Combination Hammer Grenade Launcher", 375.0, 190),
            new Treasure("StormFlower", "Dual SMGs with Underbarrel Blades", 50.0, 60),
            new Treasure("Sword Array", "Numerous Cable-Controlled Blades", 100.0, 140)},
            {new Treasure("Coco's Handbag", "Handbag-Transforming Gatling Gun", 300.0, 200),
            new Treasure("Cinder's Bow", "Dust-Based Blade-Bow", 90.0, 130),
            new Treasure("Neopolitan's Unbrella", "Shield/Sheath for Concealed Sword", 80.0, 185)}};
        
        matrixObj.print(matrix1);
        */
        Treasure[][] emptyMatrix = new Treasure[][] {{}};
        
        Treasure[][] oneMatrix = {{new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, 150)}};
        
        Treasure[][] mulMatrix = {{new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, 150),
            new Treasure("Myrtenaster", "Multi Action Dust Rapier", 80.0, 200),
            new Treasure("Gambol Shroud", "Variant Ballistic Chain Scythe", 112.0, 75)}, 
            {new Treasure("Ember Celica", "Dual Ranged Shot Gauntlets", 160.0, 125),
            new Treasure("Milo and Akouo", "Multi-Form Sword and Shield", 140.0, 175),
            new Treasure("Crocea Mors", "Ancient Longsword and Transforming Sheath", 125.0, 100)}};
        
        Treasure[][] negMatrix = {{new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, -150),
            new Treasure("Myrtenaster", "Multi Action Dust Rapier", 80.0, -200),
            new Treasure("Gambol Shroud", "Variant Ballistic Chain Scythe", 112.0, -75)}, 
            {new Treasure("Ember Celica", "Dual Ranged Shot Gauntlets", 160.0, -125),
            new Treasure("Milo and Akouo", "Multi-Form Sword and Shield", 140.0, -175),
            new Treasure("Crocea Mors", "Ancient Longsword and Transforming Sheath", 125.0, -100)}};
        
        Treasure[][] bothMatrix = {{new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, 150),
            new Treasure("Myrtenaster", "Multi Action Dust Rapier", 80.0, -200),
            new Treasure("Gambol Shroud", "Variant Ballistic Chain Scythe", 112.0, 75)}, 
            {new Treasure("Ember Celica", "Dual Ranged Shot Gauntlets", 160.0, -125),
            new Treasure("Milo and Akouo", "Multi-Form Sword and Shield", 140.0, 175),
            new Treasure("Crocea Mors", "Ancient Longsword and Transforming Sheath", 125.0, -100)}};
            
        Treasure[][] jagMatrix = {{new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, 150),
            new Treasure("Myrtenaster", "Multi Action Dust Rapier", 80.0, 200),
            new Treasure("Gambol Shroud", "Variant Ballistic Chain Scythe", 112.0, 75)}, 
            {new Treasure("Ember Celica", "Dual Ranged Shot Gauntlets", 160.0, 125),
            new Treasure("Milo and Akouo", "Multi-Form Sword and Shield", 140.0, 175)}};
        
        //*****
        // sum
        //*****
        
        System.out.println("Testing sum\n");
        int val = 0;
        int testNum = 1;
        
        //empty matrix
        val = matrixObj.sum(emptyMatrix);
        System.out.println(testNum + ": " + test.validate(0, val));
        testNum++;
        
        //matrix with one element
        val = matrixObj.sum(oneMatrix);
        System.out.println(testNum + ": " + test.validate(150, val));
        testNum++;
        
        //matrix with multiple elements
        val = matrixObj.sum(mulMatrix);
        System.out.println(testNum + ": " + test.validate(825, val));
        testNum++;
        
        //matrix with all negative values
        val = matrixObj.sum(negMatrix);
        System.out.println(testNum + ": " + test.validate(0, val));
        testNum++;
        
        //matrix with both positive and negative values
        val = matrixObj.sum(bothMatrix);
        System.out.println(testNum + ": " + test.validate(400, val));
        testNum++;
        
        //jagged matrix
        val = matrixObj.sum(jagMatrix);
        System.out.println(testNum + ": " + test.validate(725, val));
        testNum++;
        
        //*********
        // sumRows
        //*********
        
        System.out.println("\nTesting sumRows\n");
        testNum = 1;
        int[] vals = null;
        
        //empty matrix
        vals = matrixObj.sumRows(emptyMatrix);
        System.out.println(testNum + ": " + test.validate(new int[] {0}, vals));
        testNum++;
        
        //matrix with one element
        vals = matrixObj.sumRows(oneMatrix);
        System.out.println(testNum + ": " + test.validate(new int[] {150}, vals));
        testNum++;
        
        //matrix with multiple elements
        vals = matrixObj.sumRows(mulMatrix);
        System.out.println(testNum + ": " + test.validate(new int[] {425, 400}, vals));
        testNum++;
        
        //matrix with all negative values
        vals = matrixObj.sumRows(negMatrix);
        System.out.println(testNum + ": " + test.validate(new int[] {0, 0}, vals));
        testNum++;
        
        //matrix with both positive and negative values
        vals = matrixObj.sumRows(bothMatrix);
        System.out.println(testNum + ": " + test.validate(new int[] {225, 175}, vals));
        testNum++;
        
        //jagged matrix
        vals = matrixObj.sumRows(jagMatrix);
        System.out.println(testNum + ": " + test.validate(new int[] {425, 300}, vals));
        testNum++;
        
        //*****
        // min
        //*****
        /*
        System.out.println("\nTesting min\n");
        testNum = 1;
        
        //empty matrix
        val = matrixObj.min(emptyMatrix);
        System.out.println(testNum + ": " + test.validate(0, val));
        testNum++;
        
        //matrix with one element
        val = matrixObj.min(oneMatrix);
        System.out.println(testNum + ": " + test.validate(5, val));
        testNum++;
        
        //matrix with multiple elements
        val = matrixObj.min(mulMatrix);
        System.out.println(testNum + ": " + test.validate(1, val));
        testNum++;
        
        //matrix with all negative values
        val = matrixObj.min(negMatrix);
        System.out.println(testNum + ": " + test.validate(-5, val));
        testNum++;
        
        //matrix with both positive and negative values
        val = matrixObj.min(bothMatrix);
        System.out.println(testNum + ": " + test.validate(-4, val));
        testNum++;
        
        //jagged matrix
        val = matrixObj.min(jagMatrix);
        System.out.println(testNum + ": " + test.validate(1, val));
        testNum++;
        */
        //*****
        // max
        //*****
        /*
        System.out.println("\nTesting max\n");
        testNum = 1;
        
        //empty matrix
        val = matrixObj.max(emptyMatrix);
        System.out.println(testNum + ": " + test.validate(0, val));
        testNum++;
        
        //matrix with one element
        val = matrixObj.max(oneMatrix);
        System.out.println(testNum + ": " + test.validate(5, val));
        testNum++;
        
        //matrix with multiple elements
        val = matrixObj.max(mulMatrix);
        System.out.println(testNum + ": " + test.validate(5, val));
        testNum++;
        
        //matrix with all negative values
        val = matrixObj.max(negMatrix);
        System.out.println(testNum + ": " + test.validate(-1, val));
        testNum++;
        
        //matrix with both positive and negative values
        val = matrixObj.max(bothMatrix);
        System.out.println(testNum + ": " + test.validate(5, val));
        testNum++;
        
        //jagged matrix
        val = matrixObj.max(jagMatrix);
        System.out.println(testNum + ": " + test.validate(9, val));
        testNum++;
        */
        //*******
        // range
        //*******
        
        System.out.println("\nTesting range\n");
        testNum = 1;
        
        //empty matrix
        val = matrixObj.range(emptyMatrix);
        System.out.println(testNum + ": " + test.validate(0, val));
        testNum++;
        
        //matrix with one element
        val = matrixObj.range(oneMatrix);
        System.out.println(testNum + ": " + test.validate(0, val));
        testNum++;
        
        //matrix with multiple elements
        val = matrixObj.range(mulMatrix);
        System.out.println(testNum + ": " + test.validate(125, val));
        testNum++;
        
        //matrix with all negative values
        val = matrixObj.range(negMatrix);
        System.out.println(testNum + ": " + test.validate(0, val));
        testNum++;
        
        //matrix with both positive and negative values
        val = matrixObj.range(bothMatrix);
        System.out.println(testNum + ": " + test.validate(175, val));
        testNum++;
        
        //jagged matrix
        val = matrixObj.range(jagMatrix);
        System.out.println(testNum + ": " + test.validate(125, val));
        testNum++;
        
        //*********
        // isFound
        //*********
        
        System.out.println("\nTesting isFound\n");
        testNum = 1;
        boolean bool = false;
        Treasure check1 = new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, 150);
        Treasure check2 = new Treasure("Myrtenaster", "Multi Action Dust Rapier", 80.0, 200);
        
        //empty matrix
        bool = matrixObj.isFound(emptyMatrix, check1);
        System.out.println(testNum + ": " + test.validate(false, bool));
        testNum++;
        
        //matrix with one element - Found
        bool = matrixObj.isFound(oneMatrix, check1);
        System.out.println(testNum + ": " + test.validate(true, bool));
        testNum++;
        
        //matrix with one element - Not Found
        bool = matrixObj.isFound(oneMatrix, check2);
        System.out.println(testNum + ": " + test.validate(false, bool));
        testNum++;
        
        //matrix with multiple elements - Found
        bool = matrixObj.isFound(mulMatrix, check1);
        System.out.println(testNum + ": " + test.validate(true, bool));
        testNum++;
        
        //matrix with all negative values - Not Found
        bool = matrixObj.isFound(negMatrix, check1);
        System.out.println(testNum + ": " + test.validate(false, bool));
        testNum++;
        
        //matrix with both positive and negative values - Found
        bool = matrixObj.isFound(bothMatrix, check1);
        System.out.println(testNum + ": " + test.validate(true, bool));
        testNum++;
        
        //jagged matrix - Found
        bool = matrixObj.isFound(jagMatrix, check1);
        System.out.println(testNum + ": " + test.validate(true, bool));
        testNum++;
        
        //*************
        // reverseRows
        //*************
        
        System.out.println("\nTesting reverseRows\n");
        testNum = 1;
        Treasure[][] reverseVals = null;
        
        //empty matrix
        reverseVals = matrixObj.reverseRows(emptyMatrix);
        System.out.println(testNum + ": " + test.validate(new Treasure[][] {{}}, reverseVals));
        testNum++;
        
        //matrix with one element
        reverseVals = matrixObj.reverseRows(oneMatrix);
        System.out.println(testNum + ": " + test.validate(
            new Treasure[][] {{new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, 150)}}, 
            reverseVals));
        testNum++;
        
        //matrix with multiple elements
        reverseVals = matrixObj.reverseRows(mulMatrix);
        System.out.println(testNum + ": " + test.validate(
            new Treasure[][] {{new Treasure("Gambol Shroud", "Variant Ballistic Chain Scythe", 112.0, 75),
            new Treasure("Myrtenaster", "Multi Action Dust Rapier", 80.0, 200),
            new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, 150)}, 
            {new Treasure("Crocea Mors", "Ancient Longsword and Transforming Sheath", 125.0, 100),
            new Treasure("Milo and Akouo", "Multi-Form Sword and Shield", 140.0, 175),
            new Treasure("Ember Celica", "Dual Ranged Shot Gauntlets", 160.0, 125)}},
            reverseVals));
        testNum++;
        
        //matrix with all negative values
        reverseVals = matrixObj.reverseRows(negMatrix);
        System.out.println(testNum + ": " + test.validate(
            new Treasure[][] {{new Treasure("Gambol Shroud", "Variant Ballistic Chain Scythe", 112.0, -75),
            new Treasure("Myrtenaster", "Multi Action Dust Rapier", 80.0, -200),
            new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, -150)}, 
            {new Treasure("Crocea Mors", "Ancient Longsword and Transforming Sheath", 125.0, -100),
            new Treasure("Milo and Akouo", "Multi-Form Sword and Shield", 140.0, -175),
            new Treasure("Ember Celica", "Dual Ranged Shot Gauntlets", 160.0, -125)}},
            reverseVals));
        testNum++;
        
        //matrix with both positive and negative values
        reverseVals = matrixObj.reverseRows(bothMatrix);
        System.out.println(testNum + ": " + test.validate(
            new Treasure[][] {{new Treasure("Gambol Shroud", "Variant Ballistic Chain Scythe", 112.0, 75),
            new Treasure("Myrtenaster", "Multi Action Dust Rapier", 80.0, -200),
            new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, 150)}, 
            {new Treasure("Crocea Mors", "Ancient Longsword and Transforming Sheath", 125.0, -100),
            new Treasure("Milo and Akouo", "Multi-Form Sword and Shield", 140.0, 175),
            new Treasure("Ember Celica", "Dual Ranged Shot Gauntlets", 160.0, -125)}},
            reverseVals));
        testNum++;
        
        //jagged matrix
        reverseVals = matrixObj.reverseRows(jagMatrix);
        System.out.println(testNum + ": " + test.validate(
            new Treasure[][] {{new Treasure("Gambol Shroud", "Variant Ballistic Chain Scythe", 112.0, 75),
            new Treasure("Myrtenaster", "Multi Action Dust Rapier", 80.0, 200),
            new Treasure("Crescent Rose", "High-Caliber Sniper-Scythe", 320.0, 150)}, 
            {new Treasure("Milo and Akouo", "Multi-Form Sword and Shield", 140.0, 175),
            new Treasure("Ember Celica", "Dual Ranged Shot Gauntlets", 160.0, 125)}},
            reverseVals));
        testNum++;
    }
}