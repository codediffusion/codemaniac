import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author RD
 * 
 */
public class Test {

	private static final String[] EMPTY_ARRAY = new String[0];

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		final Test test = new Test();
		System.out.println(test.minimum(1));

		System.out.println(test.convertListToArray(new ArrayList<String>())
				.hashCode());

		System.out.println(test.convertArrayToList(new String[] { "1" }));

	}

	/**
	 * @param val
	 * @return
	 */
	private int minimum(final int firstval, final int... val) {

		int value = 0;
		if (val.length == 0) {
			value = firstval;
		} else {
			Arrays.sort(val);
			value = val[0];
		}
		return value;
	}

	private String[] convertListToArray(final List<String> strList) {
		return strList.toArray(EMPTY_ARRAY);
	}

	private List<String> convertArrayToList(final String[] strArr) {

		List<String> list = Collections.emptyList();
		if (strArr.length > 0) {
			list = Arrays.asList(strArr);
			list.add("Rahul");
		}

		return list;

	}
}
