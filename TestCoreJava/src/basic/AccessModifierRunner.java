package basic;

public class AccessModifierRunner {

	public static void main(String[] args) {
		System.out.println("Current value of stat is"+ AccessModifiers.stat );
		AccessModifiers.methodStatic();
		
		AccessModifiers e1 = new AccessModifiers();
		e1.pbl = 'x';
		System.out.println("The current value of pbl is: "+ e1.pbl);
		e1.methodPublic(10);
		e1.methodProtected();

	}

}
