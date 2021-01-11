import java.util.*;
class Main{
    public static void main(String[] args){
    Scanner kbd = new Scanner(System.in);
    int n = kbd.nextInt();
    if(n%2 != 0)
      System.out.println("Alice");
    else
      System.out.println("Bob");
    }
}