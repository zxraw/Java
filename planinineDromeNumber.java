public class planinineDromeNumber{
    public static void main(String[] args) {
        int n=222;
        int sum=0,temp,rem;
        temp=n;
        while(n>0){
            rem = n%10;
            sum=(sum*10)+rem;
            n=n/10;

        }
        if(temp==sum){
            System.out.println("palindrom");
        }
        else{
            System.out.println("Not a primePlalineDrome");
        }
    }
}