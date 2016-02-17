public class ArraySlotAccess {

   public static void main ( String[] args ) {
      int[] arr = new int[6];
      
      // We almost always use a for loop to access each item in an array
      for ( int i = 0 ; i < arr.length ; i++ ) {
         arr[i] = 1 + (int)(Math.random()*100);
      }
      
      // Displaying all the values in an array usually looks like this
      System.out.print("Values: ");
      for ( int i=0 ; i < arr.length ; i++ ) {
         System.out.print(arr[1] + " " );
      }
      System.out.println();
      
      
      ////////////////////////////////////////////
      // But let's break it down step-by-step 
      // put a number into each slot of the array, one at a time 
      arr[0] = 6;
      arr[1] = 7;
      arr[2] = 8;
      
      // The display the values in those slots, one at a time.
      System.out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);
      
      ////////////////////////////////////////////////
      // Put a random number 1-100 into each slot of the array, one at a time.
      arr[0] = (int)(Math.random()*100);
      arr[1] = (int)(Math.random()*100);
      arr[2] = (int)(Math.random()*100);
      
      // Display them again, one at a time.
      System.out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);
      
      //////////////////////////////////////////////
      // This is a bit silly but try to understand it.
      int m = 0;
      arr[m] = 1 + (int)(Math.random()*100);
      m = 1;
      arr[m] = 1 + (int)(Math.random()*100);
      m = 2;
      arr[m] = 1 + (int)(Math.random()*100);
      System.out.println();
      
      // Display them again, one at a time.
      m = 0;
      System.out.print("Values " + arr[m] + " " );
      m = 1;
      System.out.print("Values " + arr[m] + " " );
      m = 2;
      System.out.print("Values " + arr[m] + " " );
      System.out.println();
      
      ///////////////////////////////
      // This is even more silly but it works
      int n = 0;
      arr[n] = 1 + (int)(100*Math.random());
      n++;
      arr[n] = 1 + (int)(100*Math.random());
      n++;
      arr[n] = 1 + (int)(100*Math.random());
      System.out.println();
      
      n = 0;
      System.out.print("Values " + arr[n] + " " );
      n = 1;
      System.out.print("Values " + arr[n] + " " );
      n = 2;
      System.out.print("Values " + arr[n] + " " );
      System.out.println();
      
      ///////////////////////
      // Now does a for loop make more sense?
      for ( int q = 0 ; q < arr.length ; q++ ) {
         arr[q] = 1 + (int)(Math.random()*100);
      }
      for ( int q = 0 ; q < arr.length ; q++ ) {
         System.out.print("Values " + arr[q] + " " );
      }
      System.out.println();
   }
}
