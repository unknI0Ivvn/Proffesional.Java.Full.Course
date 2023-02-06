package Lesson6.Homework;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("Homework#1");
        System.out.println("------------------");
        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(4,5,6);
        System.out.println(checkLists(l1,l2));

        List<Integer> l3= Arrays.asList(1,2);
        List<Integer> l4 = Arrays.asList(1,3);
        System.out.println(checkLists(l3,l4));
        List<Integer>l5=Arrays.asList(2,1);
        System.out.println(checkLists(l3,l5));
        System.out.println("------------------");
        System.out.println("Homework#2");
        System.out.println("------------------");

        System.out.println(checkListAndReturnString(Arrays.asList(1,2,3),Arrays.asList(1,4,3)));
        System.out.println("------------------");

        System.out.println("Homework#3");
        System.out.println("------------------");
List<String> strings = Arrays.asList("One","A","Two","Three","Four","Seven");

        System.out.println(compareStringLists(strings));

        System.out.println("------------------");
        System.out.println("Homework#4");

        System.out.println("------------------");

        String [] a = new String[]{"A","B","C","D","A"};
        System.out.println(
                Arrays.toString(
                        removeDuplicates(a)
                )
        );

    } //окончание main

    public static String [] removeDuplicates(String [] s)
    {
        Arrays.sort(s);
        List<String> r = new ArrayList<>();
        String current = s[0];
        r.add(current);
        for (int i = 1; i < s.length; i++) {
            if(!current.equals(s[i]))
            {
                current=s[i];
                r.add(current);
            }

        }
        return r.toArray(new String[]{});

//        String [] result = new String[r.size()];
//        for (int i = 0; i < result.length ; i++) {
//            result[i]=r.get(i);
//
//        }
//        return result;
    }
    public static String compareStringLists(List<String> s)
    {
        String min = s.get(0);
        String max = s.get(0);
        int minPos =0;
        int maxPos = 0;
        for (int i = 0; i < s.size(); i++) {
            String t = s.get(i);
            if (t.length()<min.length())
            {
                min = t;
                minPos = i;
            }

            if (t.length() > max.length()) {

                max = t;
                maxPos = i;
            }
        }
        if(minPos<=maxPos)
            return min;
        else
            return max;

        }


    public static List<String> checkListAndReturnString(List<Integer>l1,List<Integer>l2)
    {
        List<String> r = new ArrayList<>();
        for (int i = 0; i < l1.size() ; i++) {
            if(!l1.get(i).equals(l2.get(i)))
            r.add("No");
      else
            r.add("Yes");

        }
        return r;

    }

    public static boolean checkLists(List<Integer> l1, List<Integer> l2)
    {
//        for (int i = 0; i < l1.size() ; i++) {
//            if(!l1.get(i).equals(l2.get(i)))
//                return false;
//
//        }
//        return true;
        return l1.equals(l2);

    }
}
