public class  CGV_Estaturas{


	public static void main(String[] args) {
		int array1 []= {1,0,2};
		int array2[]= {200 ,300 ,100 ,400 ,600 ,500};
		int array3 []= {10,12,8,15};

		selection(array1);
		System.out.print("Array1: ");
		for(int i =0;i<array1.length;i++) 
			System.out.printf(" "+array1[i]);
		System.out.print("\n");
		selection(array2);
		System.out.print("Array2: ");
		for(int i =0;i<array2.length;i++)
			System.out.printf(" "+array2[i]);
		System.out.print("\n");
		selection(array3);
		System.out.print("Array3: ");
		for(int i =0;i<array3.length;i++)
			System.out.printf(" "+array3[i]);
	}
}
