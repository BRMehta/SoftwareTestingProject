package Calculator.Operations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CheckPalindromeTest {
    CheckPalindrome chk=new CheckPalindrome();

    String str1="";
    String str2="a";
    String str3="1";
    String str4="ab";
    String str5="aa";
    String str6="abc";
    String str7="eye";
    String str8="abba";
    String str9="abbz";

    @Test
    public void isPalindrome()
    {
        boolean res=chk.isPalindrome(str1);
        assertFalse(res==false);
        assertEquals(true,res);

        res=chk.isPalindrome(str2);
        assertFalse(res==false);
        assertEquals(true,res);

        res=chk.isPalindrome(str3);
        assertFalse(res==false);
        assertEquals(true,res);

        res=chk.isPalindrome(str4);
        assertEquals(false,res);

        res=chk.isPalindrome(str5);
        assertEquals(true,res);

        res=chk.isPalindrome(str6);
        assertEquals(false,res);

        res=chk.isPalindrome(str7);
        assertEquals(true,res);

        res=chk.isPalindrome(str8);
        assertEquals(true,res);

        res=chk.isPalindrome(str9);
        assertEquals(false,res);
    }
}
