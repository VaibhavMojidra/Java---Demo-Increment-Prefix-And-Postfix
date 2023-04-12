
public class Demo {
	public static void main(String[] args) {
        int var1 = 5, var2 = 5;

        System.out.println("\nValues before:\n");
        System.out.println("Var1: "+var1);
        System.out.println("Var2: "+var2+"\n\n");
        
        
        // 5 is displayed
        // Then, var1 is increased to 6.
        System.out.println(var1++);

        // var2 is increased to 6
        // Then, var2 is displayed
        System.out.println(++var2);
        
        
        System.out.println("\nValues after:\n");
        System.out.println("Var1: "+var1);
        System.out.println("Var2: "+var2);
    }
}
