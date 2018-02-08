package Exc9;

import java.util.HashSet;
import java.util.Set;

public class Exc9
{
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(9);

        System.out.println(hasEven(set));
    }

    private static boolean hasEven (Set<Integer> set)
    {
        for (Integer i:set)
        {
            if (i%2 == 0)
            {
                return true;
            }
        }
        return false;
    }
}
