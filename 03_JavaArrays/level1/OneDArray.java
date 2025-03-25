import java.util.Scanner;
public class OneDArray{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int col=sc.nextInt();
int[][] matrix=new int[row][col];
int [] arr=new int[row*col];
int index=0;
System.out.println("Enter elements of the matrix:");
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
matrix[i][j]=sc.nextInt();
}
}
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
arr[index++]=matrix[i][j];
}
}
System.out.println("1d array elements:");
for(int a=0;a<arr.length;a++){
System.out.println(arr[a]+" ");
}
}
}

