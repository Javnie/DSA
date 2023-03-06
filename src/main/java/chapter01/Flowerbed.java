package chapter01;

public class Flowerbed {
    public static void main(String[] args) {
        int[] fb=new int[]{0,0,0,0,1};

        int result=0;
        for (int i = 0; i < fb.length; i+=2) {
            if(fb[i]==0) {
                if(fb[i-1]==0&&fb[i + 1] == 0) result++;
            }
        }

        System.out.println(result);
    }
}
