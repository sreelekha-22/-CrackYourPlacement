import java.util.*;
public class A{
public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-- > 0){
    int n=sc.nextInt();
    int r=n/4 + (n%4)/2;
  System.out.println(r);
}
}
}