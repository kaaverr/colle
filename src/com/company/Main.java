package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	int[] array = new int[]{2 , 3 , 5 , 5 , 8 , 0 , 11 , 23 , 34 , 12};
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1){
                System.out.println(array[i] + " ");
            }
            else{System.out.print(array[i] + ", ");}
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int max = array[array.length -1];
        System.out.println(max);
        int min = array[0];
        System.out.println(min);



        List<Integer> mylist = new ArrayList<>();
        mylist.add(2);
        mylist.add(5);
        mylist.add(3);
        mylist.add(8);
        mylist.add(4);
        System.out.println(mylist);
        mylist.sort(Comparator.naturalOrder());
        System.out.println(mylist);



        Student pasha = new Student("Pasha" , 11);
        Student maxim = new Student("Maxim" , 11);
        Student denik = new Student("Denik" , 19);
        Student sasha = new Student("Sasha" , 7);
        Student oleg = new Student("Oleg" , 7);
        Student artem = new Student("Artem" , 16);
        Student david = new Student("David" , 7);
        Student alex = new Student("Alex" , 7);
        Student aurum = new Student("Aurum" , 7);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add (pasha);
        studentsList.add (maxim);
        studentsList.add (denik);
        studentsList.add (sasha);
        studentsList.add (oleg);
        studentsList.add (artem);
        studentsList.add (david);
        studentsList.add (alex);
        studentsList.add (aurum);
        System.out.println(studentsList);

        /*studentsList.sort(Comparator.comparing(Student::getName));
        System.out.println(studentsList);*/

        /*studentsList.sort(Comparator.comparing(Student::getAge));
        System.out.println(studentsList);*/

        studentsList = studentsList.stream()
                .sorted(Comparator.comparing(Student::getAge).thenComparing(Student::getName))
                .collect(Collectors.toList());
        System.out.println(studentsList);
    }
}
