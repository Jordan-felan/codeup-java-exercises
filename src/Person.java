public class Person {

    private String name;

    public String getName(){
      return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello" + name);
    }

    public Person(String name){
        this.name = name;
    }

    public Person (){}

    public static void main(String[] args) {
        Person testPerson = new Person("Jordan");
        System.out.println(testPerson.getName());
        testPerson.setName("Ramon");
        System.out.println("New name is " + testPerson.getName());
    }




}
