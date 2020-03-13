package Exemplo01;

import java.util.Arrays;

public class AppSortObject {
	
	static class MyObject{
		static int id = 0; //atributo no contexto da classe
		
		int x = ++id; //atributo no contexto do objeto
	}
	public static void main(String[] args) {
		//um array de cinco elementos
		MyObject[] v = new MyObject[5];
		
		for(int i = v.length; i > 0; i--) {
			v[i - 1] = new MyObject();
			
			Arrays.sort(v);
			
		for(MyObject obj : v)
			System.out.printf("%s ", obj);
		}
	}
}
