class Food1{

       static void breakFast(){
       System.out.println("having breakFast");

     }

        static void breakFast(String name){

        System.out.println("having"+name);

      }

        static void breakFast(int price){
        System.out.println("idli"+ price);

    }
           
        static void breakFast (float price){
        System.out.println("poori"+ price);  

      } 

            static float breakFast (String name , float price , int quantity){
                     float total = price*quantity;
             
                     return total;
    }

           static float breakFast(String name , float price , int quantity , int noOfpeople ){
                        float total = price*quantity;
                        float avg = total/noOfpeople;
                        return avg;
     }
       

        public static void main (String []ar){
           

            breakFast("idli");
            breakFast();
            breakFast(45);
            breakFast(50.0f);           
            float responce = breakFast("vada" ,25.36f, 20);
            System.out.println(responce);
            float responce2 = breakFast("idly", 30.50f,15,10);
            System.out.println(responce2);
      }
}    