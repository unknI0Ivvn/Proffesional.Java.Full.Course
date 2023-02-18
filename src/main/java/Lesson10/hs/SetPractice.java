package Lesson10.hs;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        //Напишите функцию,которая принимает на вход String и возвращает
        //Collection<Character> из всех уникальных символов строки
        //"Hello world"-> '','e',...,''l
        //2.
        System.out.println(
                getUniqueChars("Hello,World")
        );
        //Напишите функцию,которая принимает на вход String и возвращает
        //Collection<Character> из всех уникальных символов строки
        //в порядке сортировки
        //"Hello world"-> [d e l o r w]
        //
        System.out.println(
                getUniqueSortedChars("Hello, World")
        );
        Collection<Character> result = getUniqueChars("Hello, world");
        Character[] chars = new Character[result.size()];
        result.toArray(chars);
        System.out.println(Arrays.toString(chars));

        List<Character> l = new ArrayList<>(getUniqueSortedChars("Hello, world!"));
        Collections.sort(l);

        System.out.println(
                getResults("Hello, world !")
        );



    } // конец main

    static class Result {
        Character c;
        List<Integer> positions = new ArrayList<>();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Result result = (Result) o;
            return Objects.equals(c, result.c);
        }

        @Override
        public String toString() {
            return "Result{" +
                    "c=" + c +
                    ", positions=" + positions +
                    '}';
        }

        @Override
        public int hashCode() {

            return c;
        }
    }
    //написать функцию, которая принимает на вход строку и
    //возвращает позиции каждой буквы в этой строке
    //012345678901
    //"Hello,world"
    //{
    // 'l' ->[2,3,10]
    // 'e' ->[1]
    //}

    public static Collection<Result> getResults(String s)
    {
        Set<Result> res = new HashSet<>();
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            Result r = new Result();
            r.c = c;
            if(res.contains(r))
            {
                Iterator<Result> resultIterator = res.iterator();
                while(resultIterator.hasNext())
                {
                    Result current = resultIterator.next();
                    if(current.equals(r))
                    {
                        r = current;
                        break;
                    }
                }
            }
            r.positions.add(i);
            res.add(r);
        }
        return res;
    }
    public static Collection<Character> getUniqueChars(String string)
    {
        Set<Character> chars = new HashSet<>(); //ЧИТАТЬ БОЛЬШЕ про HASH SET
       for(char c:string.toCharArray())
           chars.add(c);
       return chars;

    }
    public static Collection<Character> getUniqueSortedChars(String string)
    {
        Set<Character> chars = new TreeSet<>();
        for(char c:string.toCharArray())
            chars.add(c);
        return chars;
    }
}
