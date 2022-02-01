package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sudoko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> A = new ArrayList<String>(Arrays.asList("..5.....6", "....14...", ".........", ".....92..", "5....2...", ".......3.", "...54....", "3.....42.", "...27.6.." ));
		System.out.println(isValidSudoku(A));
	}

	public static int isValidSudoku(final List<String> A) {

		ArrayList<HashSet<Integer>> cols = new ArrayList<HashSet<Integer>>();
		ArrayList<HashSet<Integer>> rows = new ArrayList<HashSet<Integer>>();
		ArrayList<HashSet<Integer>> squ = new ArrayList<HashSet<Integer>>();
		for(int i=0;i<9;i++)
		{
			cols.add(new HashSet<Integer>());
			rows.add(new HashSet<Integer>());
		}
		for(int i=0;i<9;i++)
		{
			squ.add(new HashSet<Integer>());
		}

		for(int i = 0;i<A.size();i++)
		{
			char []ch = A.get(i).toCharArray();
			int rowsq = i/3;
			for(int j=0;j<ch.length;j++) {
				if(ch[j] != '.')
				{
					int val = Character.getNumericValue(ch[j]);
					if(!rows.get(i).add(val))
						return 0;
					if(!cols.get(j).add(val))
						return 0;
					int colsq = j/3;
					int sq = colsq + rowsq*3;
					if(!squ.get(sq).add(val))
						return 0;
					
						
				}
			}

		}
		return 1;


	}
}
