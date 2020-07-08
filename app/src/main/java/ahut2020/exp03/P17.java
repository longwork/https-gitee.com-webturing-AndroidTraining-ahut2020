package ahut2020.exp03;
//17.	一个正整数的个位数字是6，
// 如果把个位数字移到首位,所得到的数是原数的4倍，
//        试编程找出满足条件的最小正整数。
public class P17 {
    public static void main(String[] args) {
      for(int x=1;;x++){
          int p=x*10+6;
          String s="6"+x;
          int q=Integer.parseInt(s);
          if(q==4*p){
              System.out.println(p);
              System.out.println(4*p);
              System.out.println(q);
              break;
          }
      }
    }
}
