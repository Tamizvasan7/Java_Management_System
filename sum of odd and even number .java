import java.util.*;
public class Main {
    public static void main(String[] args) {
int even=0;
int odd=0;
for(int i=1; i<=8; i++){
  if(i%2==0)
  even+=i;
  else
  odd+=i;
}
  System.out.println("sum of the even number:"+even);
System.out.println("odd:"+odd);
}
}
