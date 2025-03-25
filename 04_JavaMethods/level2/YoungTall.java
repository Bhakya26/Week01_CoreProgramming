import java.util.Scanner;
public class YoungTall {
public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0], index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index];
}
public static String findTallest(String[] names,double[] height){
        double maxHeight=height[0];
		int index=0;
		for(int i=1;i<height.length;i++){
		    if(height[i]>maxHeight){
			maxHeight = height[i];
                index = i;
            }
        }
	return names[index];
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String[] names={"amar","akbar","antony"};
int[] age=new int[3];
double[] height=new double[3];
for(int i=0;i<3;i++){
System.out.println("Enter student"+names[i]+"age: "); 
age[i]=sc.nextInt();
System.out.println("Enter student"+names[i]+"height: "); 
height[i]=sc.nextDouble();
}
System.out.println("The youngest among three: "+findYoungest(names,age));
System.out.println("The largest among three: "+findTallest(names,height));
}
}


