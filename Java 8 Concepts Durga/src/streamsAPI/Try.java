package streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Try {

	public static void main(String[] args) {

		int[] A = {2,1};
		int[] B = new int[A.length];
		System.arraycopy(A, 0, B, 0, A.length);
		Arrays.sort(A);
		
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
	}

}
