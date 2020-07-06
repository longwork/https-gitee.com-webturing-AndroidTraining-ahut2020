package ahut2020.p20;

/**
 *   1
 *  121
 * 12321
 *  121
 *   1
 */
//[0,n) [1,n]
public class P03 {
    static int n=5;

    public static void main(String[] args) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(' '); //打印n-i个空格
            for(int j=1;j<=i;j++) System.out.print(j);//打印1~i
            for(int j=i-1;j>=1;j--)System.out.print(j);//打印i-1~1
            System.out.println();//换行
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++) System.out.print(' '); //打印n-i个空格
            for(int j=1;j<=i;j++) System.out.print(j);//打印1~i
            for(int j=i-1;j>=1;j--)System.out.print(j);//打印i-1~1
            System.out.println();//换行
        }
    }
}
