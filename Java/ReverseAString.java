



class ReverseAString {
    public static void main(String[] args) {
        String name = "Kenshin";
        StringBuilder sb = new StringBuilder(name);
        sb = sb.reverse();
        name = sb.toString();
        System.out.println(name);
        
    }
}

/*
 * public StringBuilder append(String s)	                            It is utilised to append the specified string to the provided string. This function is overloaded.

 public StringBuilder insert(int offset, String s)	                    This string is used to insert the provided string at the designated place.

 public StringBuilder replace(int startIndex, int endIndex, String str)	The string from the startIndex and endIndex values are replaced using this method.

 public StringBuilder delete(int startIndex, int endIndex)          	It is used to delete the string from startIndex and endIndex that are provided.

 public StringBuilder reverse()	                                        It is used to reverse the string.

 public int capacity()                                              	It is used to return the current capacity.

 public void ensureCapacity(int minimumCapacity)                     	It's used to make sure that the capacity is at least equal to the minimum specified.

 public char charAt(int index)	                                        It is utilised to retrieve the character at the requested location.

 public int length()	                                                The length of the string, or the total number of characters, is returned using this method.

 public String substring(int beginIndex)	                            The substring starting at the supplied beginIndex is returned using it.

 public String substring(int beginIndex, int endIndex)              	It is used to retrieve the substring starting at the beginIndex and endIndex values supplied.
 */