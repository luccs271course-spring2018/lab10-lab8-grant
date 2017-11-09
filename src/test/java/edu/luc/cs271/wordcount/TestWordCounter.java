package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter

  Map<String,Integer> wordmap;
  WordCounter counting;
  Map<String,Integer> hashmpa;
  WordCounter countinghash;

  @Before
  public void setUp() {
    // TODO create the SUT instance
    wordmap= new TreeMap<String, Integer>();
    hashmpa= new HashMap<String, Integer>();
    countinghash= new WordCounter(hashmpa);
    counting= new WordCounter(wordmap);

  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
    counting = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    assertEquals(counting.getCounts(), Collections.emptyMap());

  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator

    Iterator<String> testtree = Arrays.asList("hey", "what's up", "hello","count","counting","men","men").iterator();
    Iterator<String> testhash= Arrays.asList("dog", "dog","dog", "cat","bird","gorilla").iterator();
    counting.countWords(testtree);
    countinghash.countWords(testhash);
    System.out.println(wordmap);
    System.out.println(hashmpa);
    assertEquals(1, counting.getCount("Snoop"));
    assertEquals(1, counting.getCount("Dogg"));
    assertEquals( 1, counting.getCount("hey"));
    assertEquals(2, counting.getCount("men"));
    assertEquals(1,counting.getCount("counting"));
    assertEquals(3,countinghash.getCount("dog"));
    assertEquals(1,countinghash.getCount("bird"));
    assertEquals(1,countinghash.getCount("gorilla"));
    assertEquals(5,countinghash.getCount("bird"));
    assertEquals(1,countinghash.getCount("abc"));

    //Experimenting a little ^^^^

  }
}
