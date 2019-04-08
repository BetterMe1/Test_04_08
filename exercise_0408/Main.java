package exercise.exercise_0408;

/*
构造队列
小明同学把1到n这n个数字按照一定的顺序放入了一个队列Q中。现在他对队列Q执行了如下程序：
while(!Q.empty())              //队列不空，执行循环
{
    int x=Q.front();            //取出当前队头的值x
    Q.pop();                 //弹出当前队头
    Q.push(x);               //把x放入队尾
    x = Q.front();              //取出这时候队头的值
    printf("%d\n",x);          //输出x
    Q.pop();                 //弹出这时候的队头
}
做取出队头的值操作的时候，并不弹出当前队头。
小明同学发现，这段程序恰好按顺序输出了1,2,3,...,n。现在小明想让你构造出原始的队列，
你能做到吗？[注：原题样例第三行5有错，应该为3，以下已修正]
输入描述:
第一行一个整数T（T ≤ 100）表示数据组数，每组数据输入一个数n（1 ≤ n ≤ 100000），输入的所有n之和不超过200000。
输出描述:
对于每组数据，输出一行，表示原始的队列。数字之间用一个空格隔开，不要在行末输出多余的空格.
示例1
输入
4
1
2
3
10
输出
1
2 1
2 1 3
8 1 6 2 10 3 7 4 9 5
 */
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            if(n == 1){
                System.out.println(n);
            }else{
                int[] nums = new int[n];
                nums[n-1] = n;
                nums[n-2] = n-1;
                for(int j=n-2; j>=0; j--){
                    //前移
                    int tmp = nums[n-1];
                    System.arraycopy(nums,j,nums,j+1,n-1-j);
                    nums[j] = tmp;
                    //插入数字
                    if(j-1>=0){
                        nums[j-1] = j;
                    }
                }
                for(int k=0; k<nums.length; k++){
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
        }
    }
}*/

/*
彩色宝石项链
有一条彩色宝石项链，是由很多种不同的宝石组成的，包括红宝石，蓝宝石，钻石，翡翠，珍珠等。
有一天国王把项链赏赐给了一个学者，并跟他说，你可以带走这条项链，但是王后很喜欢红宝石，
蓝宝石，紫水晶，翡翠和钻石这五种，我要你从项链中截取连续的一小段还给我，
这一段中必须包含所有的这五种宝石，剩下的部分你可以带走。如果无法找到则一个也无法带走。
请帮助学者找出如何切分项链才能够拿到最多的宝石。
输入描述:
我们用每种字符代表一种宝石，A表示红宝石，B表示蓝宝石，C代表紫水晶，D代表翡翠，E代表钻石，
F代表玉石，G代表玻璃等等，我们用一个全部为大写字母的字符序列表示项链的宝石序列，注意项链是首尾相接的。每行代表一种情况。
输出描述:
输出学者能够拿到的最多的宝石数量。每行一个
示例1
输入
ABCYDYE
ATTMBQECPD
输出
1
3
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(solution(s));
        }
    }
    private static int solution(String s){
        int len = s.length();
        for(int i=5; i<len; i++){//长度
            for(int k=1; k<i; k++){
                String tmp = s.substring(len-i+k)+ s.substring(0,k);
                if(judge(tmp)){
                    return len-i;
                }
            }
            for(int j=0; j<=len-i; j++){
                String tmp = s.substring(j,j+i);
                if(judge(tmp)){
                    return len-i;
                }
            }
        }
        return 0;
    }
    private static boolean judge(String s){
        if(s.contains("A") && s.contains("B")
                && s.contains("C")&& s.contains("D")
                && s.contains("E")){
            return true;
        }
        return false;
    }
}