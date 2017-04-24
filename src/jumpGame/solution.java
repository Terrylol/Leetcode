package jumpGame;

/**
 * Created by 95232 on 2017/3/31.
 */
public class solution {
    //个人理解是一种分区的思想，第一次跳可以划分成一组，然后在这一组里找出跳的最远的点，也就意味着这个最远的点之前只用覆盖这一组的次数再加
    //一次就可以了，然后上次最大到新的最大又分成了下一组。这一组最算是共享最小到达次数。不断更新，一直到最后一个被更新完。
    public static int jump(int[] A) {
        int step_count = 0;
        int last_jump_max = 0;
        int current_jump_max = 0;
        for(int i=0; i<A.length-1; i++) {
            current_jump_max = Math.max(current_jump_max, i+A[i]);
            if( i == last_jump_max ) {
                step_count++;
                last_jump_max = current_jump_max;
            }
        }
        return step_count;}

    public static int jump2(int[] a){
        int count = 0;
        int last = 0;
        int current = 0;
        for (int i=0;i<a.length;i++){
            current = Math.max(current,i+a[i]);
            if(i==last){
                count++;
                last = current;
            }
        }
        return count;
    }

    public static boolean canJump (int a[]){
        int last = a.length-1,i,j;
        for(i=last-1;i>=0;i--){
            if(i+a[i]>=last)last=i;
        }
        return last<=0;
    }

    public static void main(String[] args){

        int a = jump(new int[] {2,3,1,1,4});
    }
}
