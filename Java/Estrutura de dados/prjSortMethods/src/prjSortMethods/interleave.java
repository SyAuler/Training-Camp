package prjSortMethods;

public class interleave {
	public static int[] interleave(int[] v, int[] u) { //static pode ser chamado sem a instanciação/criação do objeto
		int resultado[] = new int[v.length + u.length];
		int i = 0; 
		int j = 0; 
		int k = 0;
		int w[] = new int[10];
		while ( i < v.length && j < u.length) {
			w[k++] = v[i++];
			w[k++] = u[j++];
			
			/*if (v[i~] < u[j]){
			 * 	 w[k++] = v[i++];
			 *} else { 
			 * 	 w[k++] = u[j++];
			 * }
			 */
		}
		while (i < v.length) {
			w[k++] = v[i++];
		}
		while (j < u.length) {
			w[k++] = u[j++];
		}
		return w;
	}

}
