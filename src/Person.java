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
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }




}
