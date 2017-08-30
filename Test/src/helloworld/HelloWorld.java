package helloworld;

public class HelloWorld {

  public static void main(String[] args) {

    if(args.length == 0){
      System.out.println("HelloWorld");
    } else {

    int n = Integer.parseInt(args[0]);
    System.out.println();

    for(int i = 0; i < n; i++) {
    System.out.println("HelloWorld");
      }
    }
    System.out.println("Oh how have you changed");
    System.out.println("And I have seen so little of you.");

  }

}
