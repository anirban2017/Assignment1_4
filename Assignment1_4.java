/*Write a program to print the characters corresponding to ASCII codes from 65 to 90*/


public class Assignment1_4 {
  public static void main(String[] args) throws Exception {

for(int i=65; i<=90; i++) 
{   
    String aChar = new Character((char) i).toString();
System.out.println(i+"-"+aChar);
}
  }
}