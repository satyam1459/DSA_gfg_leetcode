package Pattern;

public class Pattern {
    protected void solidRectangle(int breadth, int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    protected void hollowRectangle(int b, int l) {
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || j == 1 || i == l || j == b)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    protected void halfPyramid(int n){
       for(int i = 1; i <= n; i++){
           for(int j = 1; j <= n; j++){
               if(i >= j){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
           }
           System.out.println();
        }
    }
    protected void printX(int n){
        if(n%2 != 1){
            System.out.println("invalid number, number should be odd");
            return;
        }
        int i = 1;
        while( i<=n){
            for(int j = 1; j<= n;j++){
                if(i == j){
                    System.out.print("* ");
                }else if(i+j == n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            i++;
        }
    }

    protected void printZ(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=n;j++){
                if(i == 1 || i == n){
                    System.out.print("* ");
                } else if (i+j  == n+1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
