class Food2{

           public static void main (String []ar){
                 
              breakFast();
              breakFast("dosa");

              breakFast("dosa" ,35.88f);
              breakFast("having dosa" , 25.55f ,"tasty");

              float responce = breakFast("dosa" ,29.88f ,12);
                  System.out.println(responce);

              float average = breakFast("dosa" ,45.89f ,120,54);
                  System.out.println("average");

           

           }


            static void breakFast(){
                System.out.println("having breakFast");
             }

                static void  breakFast(String name){
                   System.out.println("having" + name);
             }

              static float breakFast(float price){
                     price = 49.99f;
                     return price;
             }

              static void breakFast(String name , float price){
                    System.out.println(name + price);
              }

               static void breakFast(String name , float price ,String taste){
                        System.out.println(name +"price" +price +taste);
              }

                static float breakFast(String name , float price ,int quantity){
                                 float totalprice =price*quantity;
                                   return totalprice;
               }
                static float breakFast(String name , float price , int quantity , int noOfpeople){

                          float totalprice =price*quantity;
                          float average = totalprice/noOfpeople;
                          return average;
              }
}