## Results 

the=36968
=19256
of=18052
and=13544
a=13236
to=12538
in=10156
he=8717
was=7853
that=7030

//Had to change the file size so the word count is a little off

### Try using a `TreeMap` instead of a `HashMap`. Does this make any difference?

 HashMap is O(1) 
 TreeMap is O(log(n))
 So, HashMap is faster since it's less complex. 

### What happens if you invoke `countWords` multiple times for different String iterators?

"countWords" would be returned since they're all in the same map

### What crucial role does the Iterator abstraction play in making `WordCounter` testable?

It allows for words to be added to the map. So if there are no words in the map, it cannot be tested. 
