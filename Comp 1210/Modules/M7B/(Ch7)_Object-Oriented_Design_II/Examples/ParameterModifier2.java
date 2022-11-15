//********************************************************************
//  ParameterModifier.java       Author: Lewis/Loftus
//
//  Demonstrates the effects of changing parameter values.
//********************************************************************

    public class ParameterModifier2
   {
   //-----------------------------------------------------------------
   //  Modifies the parameters, printing their values before and
   //  after making the changes.
   //-----------------------------------------------------------------
       public void changeValues (int f1, Num f2, Num f3, Integer f4)
      {
         System.out.println ("Before changing the values:");
         System.out.println ("f1\tf2\tf3");
         System.out.println (f1 + "\t" + f2 + "\t" + f3 + "\n");
      
         f1 = 999;
         f2.setValue(888);
         f3 = new Num (777);
         f4 = 44444;
      
         System.out.println ("After changing the values:");
         System.out.println ("f1\tf2\tf3");
         System.out.println (f1 + "\t" + f2 + "\t" + f3 + "\n");
      }
   }