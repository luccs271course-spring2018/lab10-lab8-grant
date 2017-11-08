package edu.luc.cs271.wordcount;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.*;
        import java.io.FileReader;

        
public class Main {

  public static void main(final String[] args) throws InterruptedException {
    // set up the scanner so that it separates words based on space and punctuation
    Map<String,Integer> wordmap= new TreeMap<String,Integer>();
    try {
      //uppercase does not matter
      Scanner scan = new Scanner(new File("child.txt"));
      List<String> words= new ArrayList<String>();
      while (scan.hasNext()) {
        words.add(scan.next().replaceAll(("[^a-zA-Z0-9]"), "").toLowerCase());
      }
      //words in new array
      System.out.println(words);
      //creating iterator
      Iterator<String> stepbystep=words.iterator();
      //putting in the wordmap to the word counter and calling count words
      WordCounter counting= new WordCounter(wordmap);
      counting.countWords(stepbystep);
      // printing the new map
      System.out.println(counting.getCounts());
      //step 6 creating arraylist
      ArrayList<Map.Entry<String,Integer>> decreasedorder= new ArrayList<Map.Entry<String,Integer>>(wordmap.size());
      // adding map entries to the decreased order arraylist
      for(Map.Entry<String, Integer> entry : wordmap.entrySet()) {
        decreasedorder.add(entry);
      }

      //sorting the map
      Collections.sort(decreasedorder,new DescendingByCount());
      // printing out the sorted order
      System.out.println(decreasedorder);
      for (int i=0; i<10&& i<wordmap.size();i++)
      {
        System.out.println(decreasedorder.get(i));
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }


    // TODO complete this main program
    // 1. create a WordCounter instance
    // 2. use this to count the words in the input
    // 3. determine the size of the resulting map
    // 4. create an ArrayList of that size and
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    // 6. sort the ArrayList in descending order by count
    //    using Collections.sort and an instance of the provided comparator (after fixing the latter)
    // 7. print the (up to) ten most frequent words in the text

  }
}

