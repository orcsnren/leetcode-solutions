// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
	private Iterator<Integer> itr = null;
	private Integer nextValue = null;

	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.
		itr = iterator;
		if (hasNext())
			nextValue = itr.next();
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return nextValue;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Integer val = nextValue;
		if (itr.hasNext())
			nextValue = itr.next();
		else
			nextValue = null;

		return val;
	}

	@Override
	public boolean hasNext() {
		return (nextValue != null || itr.hasNext());
	}
}