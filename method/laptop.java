class Laptop {
 
      public static void main (String []laptop){
             
           printFeatures();
           printFeatures("Mac Book Air");

        }
  
          
          static void printFeatures(String model){
               System.out.println(model + "easy to carry");
               System.out.println(model + "portable");
}


        static void printFeatures(){
             System.out.println("easy to carry");
             System.out.println("portable");
             System.out.println("games");
             System.out.println("keybord , mouse");

    }
}