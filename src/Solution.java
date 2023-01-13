import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution
{
    public static int multi(int D, String s)
    {
        int second;
        switch (s.toLowerCase())
        {
            case "one": second = 1; break;
            case "two": second = 2; break;
            case "three": second = 3; break;
            case "four": second = 4; break;
            case "five": second = 5; break;
            default : second = 0; break;
        }
        return D*second;
    }

    public String solution(String S, int K)
    {
        List<String> days = Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri","Sat","Sun");
        int index  =  days.indexOf(S) + 1;
        index = (index + K)%7;
        return days.get(index-1);
    }

    public static int solution(int N, int K)
    {
        String num = String.valueOf(N);
        int first = Character.digit(num.charAt(0),10);
        int second = Character.digit(num.charAt(1),10);
        int third = Character.digit(num.charAt(2),10);
        for(int i = 0; i<K; i++)
        {
            System.out.println("first: " + first + "second: " + second + "third: " + third);
            if(first<9) {
                first++;
                continue;
            }
            else if(second<9){
                second++;
                continue;
            }
            else if(third<9){
                third++;
                continue;
            }
        }
        String number = first + "" + second + "" + third;
        System.out.println(Integer.valueOf(number));
        return 1;
    }

    public static int solution(String s)
    {
        boolean checkContaining = true;
        ArrayList<Character> checkedLetters = new ArrayList<>();
        char[] letters = s.toCharArray();
        for(int i =0; i<letters.length; i++)
        {
            for(int j = 1; j< letters.length; j++)
            {
                int first = (int) letters[i];
                int second = (int)letters[j];
                if((first-second == 32) || (first-second == -32))
                {
                    if(!checkedLetters.contains(Character.toUpperCase(letters[i])))
                    {
                        checkedLetters.add(Character.toUpperCase(letters[i]));
                        checkedLetters.add(Character.toLowerCase(letters[i]));
                    }
                }
            }
        }
        checkedLetters.stream().forEach(System.out::println);
        String result = "";
        for(int j = checkedLetters.size(); j<letters.length+1; j++)
        {
            if(!checkContaining)
                break;
            for(int i = 0; i<letters.length-j+1; i++)
            {
                if(!checkContaining)break;
                checkContaining = false;
                String check = s.substring(i,i+j);
                System.out.println(check);
                for(char c: checkedLetters)
                {
                   if(!check.contains(Character.toString(c)))
                   {
                       checkContaining = true;
                       break;
                   }
                }
                if(!checkContaining) {
                    for(char c : check.toCharArray())
                    {
                        if(!checkedLetters.toString().contains(Character.toString(c))) {
                            checkContaining = true;
                            break;
                        }
                    }
                    if(!checkContaining)result = check;
                }
            }
        }

            System.out.println("Result: " + result);
            if(result.length()>0)
                return result.length();
            else
                return -1;
    }



    public static void main(String[] args) throws Exception
    {
        System.out.println(solution("abcdefghijklmnopqrstuvwxyz"));
    }


}
