package Reflection;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class ReflectionDemo {
@SuppressWarnings("rawtypes")

public static void main(String[] args) {
	// TODO Auto-generated method stub

	try{
		Employee emp =new Employee(10, "AAA", 10000);
		Class c1 =emp.getClass();
		System.out.println(c1);
		Class c=Class.forName("Reflection.Employee");
		System.out.println(c);
		
		Method mArr[]=c.getMethods();
		
		for(Method m: mArr){
			System.out.println(m);
		}
		
		Field fArr[]=c.getFields();
		
		for(Field f: fArr){
			System.out.println(f);
		}
	}
	catch(ClassNotFoundException e){
		System.err.println(e);

}
}
}
