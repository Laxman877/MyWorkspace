package oops;
class P{
	P(){
		System.out.println("running p class constructor..");
	}
}
class Q extends P{
	Q()
	{
		super();
		System.out.println("running q class constructorr...");
	}
	Q(int id){
		this();
		System.out.println("id : "+id);
	}
	Q(String name){
		this(10);
		System.out.println("name : "+name);
	}
}
class R extends Q{
	R(){
		super("Tops");
		System.out.println("running R class cons...");
	}
}
public class OOPS08_ConstructorChaining {
	public static void main(String[] args) {
		R r = new R();
	}

}
