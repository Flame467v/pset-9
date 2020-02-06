import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {

		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}

		// write your code here
//ssdaskdgjuhbasoiud
		int lastIndexA = a.size();
		int lastIndexB = b.size();

		if (a.get(0) == b.get(0)) {
			return true;
		}

		else if (a.get(lastIndexA - 1) == b.get(lastIndexB - 1)) {
			return true;
		}

		else {
			return false;
		}

		// default return value to ensure compilation
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		// write your code here

		ArrayList<String> empty = new ArrayList<String>();

		if (values == null || values.size() < n || n < 0) {
			return empty;
		}

		ArrayList<String> result = new ArrayList<>();
		int length = values.size();
		int index = n;

		for (int i = 0; i < n; i++) {
			result.add(values.get(i));
		}

		for (int j = n; j < 2 * n; j++) {
			result.add(values.get(length-index));
			index--;
		}

		return result;

		// default return value to ensure compilation
	}

	public int difference(ArrayList<Integer> numbers) {
		// write your code here

		if (numbers == null || numbers.size() < 1) {
			return -1;
		}

		int larger = numbers.get(0);
		int smaller = numbers.get(0);

		for (int i = 0; i < numbers.size(); i++) {

			if (numbers.get(i) > larger) {
				larger = numbers.get(i);
			}

			if (numbers.get(i) < smaller) {
				smaller = numbers.get(i);
			}
		}

		int difference = larger - smaller;
		return difference;

		// default return value to ensure compilation
	}

	public double biggest(ArrayList<Double> numbers) {
		// write your code here

		if (numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0) {
			return -1;
		}

		boolean noNegatives = true;
		for (int i = 0; i < numbers.size(); i++) {

			if (numbers.get(i) < 0) {
				noNegatives = false;
			}
		}

		if (!noNegatives) {
			return -1;
		}

		double larger = numbers.get(0);
		int midIndex = numbers.size() / 2;
		int finalIndex = numbers.size() - 1;

		if (numbers.get(midIndex) > larger) {
			larger = numbers.get(midIndex);
		}

		if (numbers.get(finalIndex) > larger) {
			larger = numbers.get(finalIndex);
		}

		return larger;

		// default return value to ensure compilation
	}

	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here

		ArrayList<String> empty = new ArrayList<String>();

		if (values == null || values.size() < 3 || values.size() % 2 == 0) {
			return empty;
		}

		boolean hasNull = false;
		for (int i = 0; i < values.size(); i++) {

			if (values.get(i) == null) {
				hasNull = true;
			}
		}

		if (hasNull) {
			return empty;
		}

		int midIndex = values.size() / 2;
		int firstIndex = midIndex - 1;
		int lastIndex = midIndex + 1;

		ArrayList<String> result = new ArrayList<String>();
		result.add(values.get(firstIndex));
		result.add(values.get(midIndex));
		result.add(values.get(lastIndex));

		return result;

		// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here

		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		int lowestNum = numbers.get(0);
		int middleNum = numbers.get(1);
		int finalNum = numbers.get(2);

		for (int i = 0; i < numbers.size(); i++) {

			if (lowestNum < middleNum && middleNum < finalNum) {
				return true;
			}

			if (i + 2 < numbers.size()) {
				lowestNum = numbers.get(i);
				middleNum = numbers.get(i + 1);
				finalNum = numbers.get(i + 2);
			}

			else {
				return false;
			}
		}

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here

		if (numbers == null || numbers.size() < 1) {
			return false;
		}

		boolean isEverywhere = true;
		for (int i = 0; i < numbers.size(); i++) {

			if (i == 0) {

				if (numbers.get(i) != x && numbers.get(i + 1) != x) {
					isEverywhere = false;
				}
			}

			else if (i == numbers.size() - 1) {
				if (numbers.get(i) != x && numbers.get(i - 1) != x) {
					isEverywhere = false;
				}
			}

			else {
				if (numbers.get(i - 1) != x && numbers.get(i) != x && numbers.get(i + 1) != x) {
					isEverywhere = false;
				}
			}
		}

		return isEverywhere;

		// default return value to ensure compilation
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here

		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		boolean isConsecutive = false;
		for (int i = 2; i < numbers.size(); i++) {

			if (numbers.get(i) % 2 == numbers.get(i - 1) % 2 && numbers.get(i) % 2 == numbers.get(i - 2) % 2) {
				isConsecutive = true;
			}
		}

		return isConsecutive;

		// default return value to ensure compilation
	}

	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here

		if (numbers == null || numbers.size() < 2) {
			return false;
		}

		for (int i = 0; i < numbers.size(); i++) {
			int firstSum = 0;
			int secondSum = 0;

			for (int j = 0; j < i; j++) {
				firstSum += numbers.get(j);
			}

			for (int k = i; k < numbers.size(); k++) {
				secondSum += numbers.get(k);
			}

			if (firstSum == secondSum) {
				return true;
			}
		}

		return false;	// default return value to ensure compilation
	}

	public int clumps(ArrayList<String> values) {
		// write your code here

		if (values == null) {
			return -1;
		}

		boolean hasNull = false;
		for (int i = 0; i < values.size(); i++) {

			if (values.get(i) == null) {
				hasNull = true;
			}
		}

		if (hasNull) {
			return -1;
		}

		boolean isClump = false;
		int clumpAmnt = 0;

		for (int i = 1; i < values.size(); i++) {
			if (values.get(i).equals(values.get(i - 1))) {

				if (!isClump) {
					clumpAmnt++;
				}
				isClump = true;
			}

			else {
				isClump = false;
			}
		}

		return clumpAmnt;

		// default return value to ensure compilation
	}
}
