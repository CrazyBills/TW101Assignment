public class FizzBuzz {

   public void fizzBuzz(){


       String[] array = new String[101];


       int base = 1;
       while (base*3<=100){
           array[base*3] = "Fizz";
           base++;
       }

       base = 1;

       while (base*5<=100){

           if(array[base*5]==null)
                array[base*5] = "Buzz";
           else
                array[base*5] = "FizzBuzz";
           base++;
       }

       for(int i = 1;i<=100;i++){
           if(array[i]!=null)
               System.out.println(array[i]);
           else
               System.out.println(i);

       }
   }
    public static void main(String[] args){

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz();
    }
}
