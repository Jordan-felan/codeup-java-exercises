public class MethodsLecture {

    public static void sayHello() {
        System.out.println("Sorry, I'm in a bit of a rush. Have a great day!");
    }

    public static void sayHello(String name) {
        System.out.printf("Hi there! My name is %s! Have a great day!%n", name);
    }
    //method overloading
    public static void sayHello(String salutation, String name) {
        System.out.printf("%s there! My name is %s! Have a great day!%n", salutation, name);
    }

    public static void sayHello(int times) {
        for(int i = 1; i<= times; i++){
            System.out.println("Hello, darling!");
        }
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static void main(String[] args) {
        sayHello();
        sayHello("Jordan");
        sayHello("Howdy", "Jordan");
        sayHello(4);
        System.out.println(multiply(5, 2));
        int product = multiply(7, 3);
        System.out.printf("Did you know that %d x %d ='s %d",product, product, product * product);

}
}
