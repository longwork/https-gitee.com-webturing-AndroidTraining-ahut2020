package ahut2020.exp03;

public class P18 {
    public static void main(String[] args) {
        int ones=0;
        int i=1;
        for(;ones<202;i++){
            String s=""+i;
            int tot=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    ++tot;
                }
            }
            ones+=tot;

        }
        if(ones==202){
            System.out.println(i);
        }else{
            System.out.println("Impossible");
        }
    }
}
