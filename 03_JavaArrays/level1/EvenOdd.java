import java.util.Scanner;
public class EvenOdd{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");

int number=sc.nextInt();
if(number<=0){
System.out.println("Error");
}
int [] odd=new int[ number / 2 + 1];
int[] even=new int[ number / 2 + 1];
int indexodd=0;
int indexeven=0;
for(int i=1;i<=number;i++){
if(i%2==0){
even[indexeven++]=i;
}else{
odd[indexodd++]=i;
}
}
for(int i=0;i<indexeven;i++){
System.out.println("even:"+even[i]);
}
for(int i=0;i<indexodd;i++){

System.out.println("odd"+odd[i]);
}
}
}



