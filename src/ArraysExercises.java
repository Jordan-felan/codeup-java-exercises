import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);


        Person firstPerson = new Person("Jordan");
        Person secondPerson = new Person("Mona");
        Person thirdPerson = new Person("Cameron");
        Person fourthPerson = new Person("Carlos");

        Person[] personArray = new Person[3];
        personArray[0] = firstPerson;
        personArray[1] = secondPerson;
        personArray[2] = thirdPerson;

        for (Person p : personArray){
            System.out.println(p.getName());
        }

        Person[] personArrayOne = add(personArray, fourthPerson);



    }



}
