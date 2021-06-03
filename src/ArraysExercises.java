import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] array, Person newPerson) {
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson;
                return people;
    }



    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);


        Person[] personArray = new Person[3];
        personArray[0] = new Person("Jordan");
        personArray[1] = new Person("Mona");
        personArray[2] = new Person("Carlos");

        for (Person p : personArray){
            System.out.println(p.getName());
        }
        System.out.println("----------------");

        Person cameron = new Person("Cameron");
        personArray = addPerson(personArray, cameron);

        for (Person p : personArray){
            System.out.println(p.getName());
        }





    }



}
