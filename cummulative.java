public class cummulative{
    public static void main(String[] args) {
        int num[]={25, 35, 12, 4, 36, 48};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
            System.out.print(sum+" ");
        }
    }
}