class Fibonacci{
	public static void main(String[] args){
		fibonacci1();
	
	}
	
	/* 
		Utilizamos el bucle for
	*/
	
	public static void fibonacci1 (){
		int v0=0;
		int v1=1;
		for (int i=0;i<5;i++){
			int vn=v1+v0;
			v0=v1;
			v1=vn;
			System.out.println(vn);
	}
	
	public static void fibonacci2 (){}
	public static void fibonacci3 (){}


}
		