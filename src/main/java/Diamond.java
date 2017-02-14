import java.util.Stack;

public class Diamond {


    public void isoscelesTriangle(int n){

        int original = n;
       while(n-->0){

           for(int i=0;i<n;i++){
               System.out.print(" ");
           }
           int count = 2*(original -n) -1;

           for(int i=0;i<count;i++){
               System.out.print("*");
           }
           System.out.println();
       }
    }

    public static void  main(String[] args){
        Diamond diamond = new Diamond();
        diamond.diamondWithNames(3);

    }


    public void diamond(int n){

        StringBuffer buffer = new StringBuffer();
        Stack<String> stack = new Stack<>();
        int original = n;
        while(n-->0){

            for(int i=0;i<n;i++){
                buffer.append(" ");
            }
            int count = 2*(original -n) -1;

            for(int i=0;i<count;i++){
                buffer.append("*");
            }
            System.out.println(buffer.toString());
            if(n!=0)
                stack.push(buffer.toString());
            buffer = new StringBuffer();
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public void diamondWithNames(int n){

        StringBuffer buffer = new StringBuffer();
        Stack<String> stack = new Stack<>();
        int original = n;
        while(n-->0){
            if(n!=0) {
                for (int i = 0; i < n; i++) {
                    buffer.append(" ");
                }
                int count = 2 * (original - n) - 1;

                for (int i = 0; i < count; i++) {
                    buffer.append("*");
                }
                System.out.println(buffer.toString());

                stack.push(buffer.toString());
                buffer = new StringBuffer();
            }else{
                System.out.println("Bill");
            }
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }



}

