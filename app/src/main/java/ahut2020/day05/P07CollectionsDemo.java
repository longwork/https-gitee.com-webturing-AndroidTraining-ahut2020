package ahut2020.day05;

import java.util.*;



public class P07CollectionsDemo {
    public static void main(String[] args) {
        //对比学习Math/Arrays
        System.out.println(Math.sqrt(2));
        Math math=null;
        System.out.println(math);
        System.out.println(math.sqrt(2));
        System.out.println(Math.sqrt(2));
        //Math math2=new Math();
        //Arrays array=new Arrays();
        //Collections c;

        //随机加入元素 Random
        List<Integer>  list=new Vector<Integer>();
        Random r=new Random();
        for(int i=0;i<10;i++){
           list.add(r.nextInt(100));
        }
        System.out.println(list);
        //Collections.max/min极值
        System.out.println(Collections.max(list));//最大值
        System.out.println(Collections.min(list));//最小值

        //默认排序/二分查找
        Collections.sort(list);//升序-非降序
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,13));

        //降序/二分查找
        Collections.sort(list,Collections.reverseOrder());//降序-非增加序列
        System.out.println(Collections.binarySearch(list,13,Collections.reverseOrder()));
        System.out.println(list);

        //多关键字排序
        Collections.sort(list, new Comparator<Integer>() {//自定义排序
            @Override
            public int compare(Integer o1, Integer o2) {
                int cmp= hash(o1)-hash(o2);//按照hash值从小到大排序
                if(cmp!=0)return cmp;
                return o1-o2;
            }
            int hash(int x){//计算一个整数的各位数字之和
                int result=0;
                while(x>0){
                    result+=x%10;
                    x/=10;
                }
                return result;
            }
        });
        System.out.println(list);

        //洗牌和截取子序列
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(list.subList(0,3));


    }
}
