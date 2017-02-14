public class Triangle {

    public void easist() {

        System.out.println("*");
    }

    public void horizontal(int n) {

        while (n-- > 0) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void vertical(int n) {
        while (n-- > 0) {
            System.out.println("*");
        }
    }

    public void righttriangle(int n) {

        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
