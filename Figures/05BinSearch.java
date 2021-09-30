class BinSearch {
// This is an encapsulation of a binary search function that takes an array of
// ordered objects and a key and returns an object with 2 attributes namely
// index - the value of the array index
// found - a boolean indicating whether or not the key is in the array 
// An object is returned because it is not possible in Java to pass basic types by
// reference to a function and so return two values 
// the key is -1 if the element is not found
	public static void search (int key, int [] elemArray, Result r)
	{
		int bottom = 0;
		int top = elemArray.length - 1;
		int mid r.found = false; r.index = -1;
		while ( bottom <= top)
		{
			mid = (top + bottom) / 2;
			If (elemArray [mid] == key)
			{
				r.index = mid;
				r.found = true;
				return ;
			} // if part
			else
			{
				if (elemArray [mid] < key)
					bottom = mid + 1;
				else
					top= mid -i;
			}
		} //while loop
	} //search
} //BinSearch
