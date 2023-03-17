public class uc6 {

    // static varible declaration
    static int a=10;
    static int b=20;

    static int c=22;
    static int d=5000;
    // Ststic method declaration
    static void display(){
        System.out.println("this is static method ");
        System.out.println("this is static varibales");
        System.out.println(uc6.c);
        System.out.println(uc6.d);
    }

    public static void main(String[] args) {
// static method calling
        uc6.display();
        // static varible calling
        System.out.println("static value of a is :- " +uc6.a);
        System.out.println("Static value of b is :- " +uc6.b);
    }
}