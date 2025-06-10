import java.util.Scanner;

public class Vowels {
public static void main(String[] args) {
Scanner s1 =new Scanner(System.in);
System.out.println("Enter a String");
String word=s1.next();
StringBuilder word2=new StringBuilder();
word=word.toLowerCase();
int vowels=0;
int consonants=0;
for(int i=0;i<=word.length()-1;i++)
{
char ch=word.charAt(i);
if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
vowels++;
word2.append(ch);
}
else
{
consonants++;
}
}
System.out.println("Total no of vowels is "+vowels);
System.out.println("Total no of Consonants is "+consonants);
System.out.println(word2);

}



}