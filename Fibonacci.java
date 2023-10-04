class Fibonacci{
	public static void main(String[] entradas){
		int cantidad=8
		fibonacci1(cantidad);
		System.out.println();
		fibonacci2(cantidad);
		System.out.println();
		fibonacci2(cantidad);
	}
	
	/* 
		Utilizamos el bucle for
	*/
	
	public static void fibonacci1(int cantidad){
		int v0=0;
		int v1=1;
		System.out.println(v0+", ");
		System.out.println(v1+", ");
		for (int i=0;i<5;i++){
		for(i++<cantidad;)
			int vn=v1+v0;
			v0=v1;
			v1=vn;
			System.out.println(vn+", ");
		}
	}
	/*
		utilizamos el bucle while
	*/
	public static void fibonacci2(int cantidad){
		int v0=0;
		int v1=1;
		int i=0
		System.out.println(v0+", ");
		System.out.println(v1+", ");
		while(i++<cantidad){
			int vn=v1+v0;
			v0=v1;
			v1=vn;
			System.out.println(vn+", ");
			
		}
		
	}
	public static void fibonacci3(int cantidad){
		int v0=0;
		int v1=1;
		System.out.println(v0+", ");
		System.out.println(v1+", ");
		do{
			int vn=v1+v0;
			v0=v1;
			v1=vn;
			System.out.println(vn+", ");
		}while(++i<cantidad);
	}


}
		