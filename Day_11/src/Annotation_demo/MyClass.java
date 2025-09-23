package Annotation_demo;

@TestAnno
@Developer(name="abc",count=1)
@Developer1(count=2)

public class MyClass {
	
	@TestAnno
	private int a;
	
	
	public void show(){
		System.out.println(a);
	}
}
