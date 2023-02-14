import java.util.Arrays;

public class SortACharArray {

    public static void main(String[] args) {
        char[] arr = {'e','h','r','s','d','f'};
        Arrays.sort(arr);
        for (char c : arr) {
            System.out.println(c);
        }

    }
}

/*
 * Methods in Java Array Class

The static methods of the Java Array class could be used to perform operations like:

Filling the elements
Sorting the elements
Searching for the elements
Converting the array elements to String
Many more...
Let's take a closer look at all the methods provided by the java arrays class. Then we will discuss a few important ones in detail.

Method Name	Function

binary search()	                                                It searches for an element contained in the sorted array by using Binary Search Algorithm.

asList()	                                                    It is used to convert an array to a list of elements.

binarySearch(array, fromIndex, toIndex, key, Comparator)       	A range of specified arrays for the specified object is searched using the Binary Search Algorithm.

toString(original array)	                                    A string representation of the contents of the array is returned. This representation consists of a list of the elements of the array enclosed in square brackets ([]). The elements are separated by a comma and a space and each element is converted to a string by the String. value of() function.

stream(original array)	                                        A sequential stream will be returned with an array that is specified by its source. The stream is a sequence of objects represented as a channel of data that​ has a source where the data is situated, and a destination where it is transmitted.

spliterator(original array,fromIndex, endIndex )               	A spliterator is returned which covers the range of the specified arrays. The Spliterator interface can be used for traversing and partitioning sequences.

spliterator(original array)                                     A spliterator covering all the elements of the array is returned.

sort(T[]a,Comparator <super T>c)                               	The specified array of the objects according to the order which is induced by the comparator is sorted by this.

sort(originalArray, fromIndex, endIndex)                    	The specified range of the array is sorted in ascending order.

sort(T[]a, int fromIndex, int toIndex,Comparator<super T>c)	    The specified range of the specified array of objects according to the specified comparator is sorted.

sort(original array)	                                        The entire array is sorted in ascending order

setAll(originalArray, functionalGenerator)	                    Sets the elements of the array using the generator function which is already provided.

parallel Sort(original array)	                                Sorts the concerned array using the parallel sort.

paralleSetAll(originalArray, functionalGenerator)              	All elements are set into parallel by using the generator function.

parallelPrefix(originalArray, operator)                     	For a complete array it performs parallelPrefix function.

parallelPrefix(originalArray, fromIndex, endIndex, functionalOperator)	It performs parallelPrefix for the given range of the array with the specified functional operator.

mismatch(array1,array2)	                                        It will search and return the index of the first unmatched element between the 2 concerned arrays.

hashCode(originalArray)	                                        An integer hashCode of the array instance is returned. A hashcode is a unique integer that represents an object in Java.

equals (array1, array2)                                     	Will check if both the concerned arrays are equal or not. Two arrays are considered equal if both arrays contain the same number of elements, and all corresponding pairs of elements in the two arrays are equal.

fill(originalArray, fillValue)                              	The fill value is assigned to each index of the arrays.

deepToString(Object[]a)	                                        A string representation is returned of the deep contents and details of the concerned array.

deepHashcode(Object[]a)	                                        This method will receive an array and compute hash code based on the deep content in an array and return it in an integer.

deepEquals(Object[]a1, Object[]a2)                          	It returns true only if the 2 concerned arrays are equal to one another.

copyOfRange(originalArray, fromIndex, endIndex)             	The concerned range of the concerned array is copied into the new array.

copyOf(originalArray, newLength)                            	Copies the specified array, truncating or padding with the default value (if necessary) so the copy has the specified length.

compare(array 1, array2)	                                    Two arrays that are passed as parameters lexicographically are compared to each other.

*/