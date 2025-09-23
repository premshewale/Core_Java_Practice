package Annotation_demo;

public @interface Developer1 {
	String name() default "AAA";
	int count();
}
