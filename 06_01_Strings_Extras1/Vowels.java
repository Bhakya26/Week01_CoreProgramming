import java.util.Scanner;
public class Vowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a=sc.nextLine();
        int vowelcount=0,consonantcount=0;
        String vowels="AEIOUaeiou";
        for(char ch:a.toCharArray()){
            if(Character.isLetter(ch)){
                if(vowels.indexOf(ch)!=-1){
                    vowelcount++;
                }
                else{
                    consonantcount++;
                }
             }
            }
            System.out.println("No of vowels: "+vowelcount);
            System.out.println("No of consonants: "+consonantcount);

    }
}
