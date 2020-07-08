package ahut2020.exp03;

public class P15 {
    public static void main(String[] args) {
        for(int n=2;;++n){
            int m=n;
            if(m%5!=1)continue;
            m-=(m-1)/5;
            if(m%5!=1)continue;
            m-=(m-1)/5;
            if(m%5!=1)continue;
            m-=(m-1)/5;
            if(m%5!=1)continue;
            m-=(m-1)/5;
            if(m%5!=1)continue;
            m-=(m-1)/5;
            System.out.println(n);
            break;

    }
    }
}
