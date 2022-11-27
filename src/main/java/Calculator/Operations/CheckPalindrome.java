package Calculator.Operations;

public class CheckPalindrome {
    public static boolean is_palindrome(String str)
    {
        int i=0,j=str.length()-1;
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
