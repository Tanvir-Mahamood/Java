package module6f;
import java.util.*;

public class Topic7
{
	public static void main(String args[])
	{
		int[] ax = {10,20,50,40,60,30};
		System.out.println("Initial Array");
		System.out.println(Arrays.toString(ax));
		System.out.println(max_of_first4(ax));
	}

	public static int max_of_first4(int...ax) {
		int ans = -999;
		for(int i=0;i<4;i++) {
			if(ax[i]>ans) {
				ans = ax[i];
			}
		}

		return ans;
	}

}