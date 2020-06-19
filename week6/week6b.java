import pack1.*;
import pack2.*;
public class week6b
{
	public static void main(String args[]){
	pack1.A a = new pack1.A();
	pack1.B b = new pack1.B();
	pack1.C c = new pack1.C();
	
	System.out.println("IN PACK 1");
	System.out.println(a.a);
	System.out.println(b.b);
	System.out.println(c.c);
	
	pack2.A d = new pack2.A();
	pack2.B e = new pack2.B();
	pack2.C f = new pack2.C();
	
	System.out.println("IN PACK 2");
	System.out.println(d.a);
	System.out.println(e.b);
	System.out.println(f.c);
	
}
}
