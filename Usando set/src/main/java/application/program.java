package application;

import java.util.*;

public class program {
    public static void main(String[] args){
        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();
        TreeSet<Integer> c = new TreeSet<>();
        TreeSet<Integer> teacher = new TreeSet<>();

        System.out.println("How many students for course A");
        Scanner sc = new Scanner(System.in);
        Integer A = sc.nextInt();
        for(int i = 0; i<A; i++){
            System.out.println("Id's for students");
            Integer n = sc.nextInt();
            a.add(n);
        }
        System.out.println("How many students for course B");
        Integer B = sc.nextInt();
        for(int i = 0; i<B; i++){
            System.out.println("Id's for students");
            Integer n = sc.nextInt();
            b.add(n);
        }
        System.out.println("How many students for course C");
        Integer C = sc.nextInt();
        for(int i = 0; i<C; i++){
            System.out.println("Id's for students");q
            Integer n = sc.nextInt();
            c.add(n);
        }
        teacher.addAll(a);
        teacher.addAll(b);
        teacher.addAll(c);
        System.out.println("Total size: "+teacher.size());
    }
}
