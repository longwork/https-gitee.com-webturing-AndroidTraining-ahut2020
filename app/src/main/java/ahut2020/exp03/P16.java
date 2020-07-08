package ahut2020.exp03;
//16.	试编程找出能被各位数字之和整除的一切两位数。
public class P16 {
    public static void main(String[] args) {
        for(int n=10;n<=99;n++){
            int a=n/10,b=n%10;
            if(n%(a+b)==0){
                System.out.println(n);
            }
        }
    }
}
