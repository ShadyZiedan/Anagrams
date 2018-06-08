package com.example.anagram;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class AnagramTest {
    @Test
    public void checkReverse() {
        assertEquals("olleH dlroW!", Anagram.reverseWord("Hello World!"));
    }

    @Test
    public void checkReverseFromTaskExample1(){
        assertEquals("dcba hgfe", Anagram.reverseWord("abcd efgh"));
    }

    @Test
    public void checkReverseFromTaskExample2(){
        assertEquals("d1cba hgf!e", Anagram.reverseWord("a1bcd efg!h"));
    }
}