package ar.edu.unju.fi.ejercicio11.Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2, j;
		boolean band = true;
		int val = 0;
		int desc = 1;
		for(j=40 ; j>=0 ; j--) {
			
			if(band) {
				val= j*i;
				band=false;
				desc = desc + i;
			}
			else {
				System.out.print(val+" ");
				
				val = val + (40-desc);
				
				desc = desc + i;
			}
		}
	}

}