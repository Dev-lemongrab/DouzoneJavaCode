package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]\n";
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person temp = (Person)obj;
			return name.equals(temp.name)&& age == temp.age;
		}
		return false;
	}
	
	
	
	
	
}//Person End
public class HashsetMain {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new Person("Yunseong", 31));
		set.add(new Person("David", 20));//
		set.add(new Person("David", 20));//2+20 
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		set.add(new String("happy"));
		set.add(new String("happy"));
		
		System.out.print(set);
		Person p = new Person("", 12);
		
		
		
	}
}
