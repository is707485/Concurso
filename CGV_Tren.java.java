
public class Problemas {
	static int mov = 0;
	static int cmp = 0;

	static boolean greaterThan(int a, int b) {
		cmp ++;
		return a > b;
	}

	public static void insertion(int[] array, int delta, int start) {
		for (int p = start + delta; p < array.length; p += delta) {
			int pivot = array[p];
			int i = p - delta;
			while (i >= start && greaterThan(array[i], pivot)) { // array[i]>pivot) {
				array[i + delta] = array[i];
				mov++;
				i = i - delta;
			}
			array[i + delta] = pivot;
		}
		System.out.println("\nMov: "+mov);
	}

	public static void shell(int[] array) {
		mov = 0;
		cmp = 0;
		int delta = 1;
		while(delta < array.length) delta = 3 * delta + 1;
		delta /= 3;
		//		delta = 1;  Degradar Shell a Inserción
		while(delta >= 1) {
			for(int start = 0; start < delta; start ++) {
				insertion(array, delta, start);		
			}
			delta /= 3;
		}
	}
	public static void main(String[] args) {

		int array1 []= {1,3,2};
		int array2[]= {4,3,2,1};
		
		
		shell(array1);
		System.out.print("Array1: ");
		for(int i =0;i<array1.length;i++) 
			System.out.print(array1[i]);
		
		shell(array2);
		System.out.print("Array2: ");
		for(int i =0;i<array2.length;i++)
			System.out.print(array2[i]);
	
	}

}
