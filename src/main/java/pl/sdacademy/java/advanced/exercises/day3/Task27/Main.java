package pl.sdacademy.java.advanced.exercises.day3.Task27;

public class Main {
    public static void main(String[] args) {

//        joiner.join(new String[]{"a","b","c"});
//        joiner.join("a","b","c");

//        joiner.dummy(2,4,5,6);  // first = 2 ;  second[] = {4,5,6}
//        joiner.dummy(2,new int[]{4,5,6});  // first = 2 ;  second[] = {4,5,6}  // ten sam zapis


        Joiner<String> joiner = new Joiner<>("-");
        String result = joiner.join("a", "b", "c", "d");
        System.out.println(result);

        Joiner<Integer> joiner2 = new Joiner<>("|");
        String result2 = joiner2.join(1,2,3,4);
        System.out.println(result2);

        Joiner joiner3 = new Joiner("*");
        String result3 = joiner3.join("a", 1, 2.0);
        System.out.println(result3);

        Joiner<Child> joiner4 = new Joiner<Child>(" <!> ");
        String result4 = joiner4.join(new Child("Ala", 4), new Child("Ola", 6));
        System.out.println(result4);

    }
}
