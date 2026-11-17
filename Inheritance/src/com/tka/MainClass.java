package com.tka;

public class MainClass {
	public static void main(String args []) {
		//1.Single Inheritance 
		/*B1 obj = new B1();
		obj.showA();
		obj.showB(); */
		
		
		
		//2.Single Inheritance – Parent and Child Variables
		/*Child obj = new Child();
		System.out.println("X = "+obj.x);
		System.out.println("Y = "+obj.y);  */
		
		
		// Q3: Animal and Dog
		/*Dog d = new Dog();
		d.eat();
		d.bark();  */
		
		
		//4. Vehicle and Car
		/*Car obj = new Car();
		obj.start();
		obj.drive(); */
		
		
		//5.Calculate Double Value
		/*B2 obj = new B2();
	    System.out.println("A = "+obj.a);
	    System.out.println("B = "+obj.b); */
		
		
		//6. Multilevel Inheritance – A → B → C
		/*C3 obj = new C3();
		obj.showA3();
		obj.showB3();
		obj.showC3();  */
		
		
		//7. GrandParent → Parent → Child
		/*Child1 obj = new Child1();
		System.out.println("A = "+obj.a);
		System.out.println("B = "+obj.b);
		System.out.println("C = "+obj.c);   */
		
		
		//8. Vehicle → Car → SportsCar
		/*SportsCar obj = new SportsCar();
		obj.vehicle1();
		obj.car1();
		obj.sportsCar();   */
		
		
		//9.LivingThing → Animal → Dog
		/*Dog1  obj = new Dog1();
		obj.live();
		obj.eat();
		obj.bark();    */
		
		
		//10. X → Y → Z
		/*Z obj = new Z();
		obj.display(); */
		
		
		// 11 .Hierarchical Inheritance - Parent ,Child1 ,Child2
		/*Child2 obj = new Child2();
		obj.p();
		obj.ch1();
		
		System.out.println("----------------------------");
		Child3 obj1 = new Child3();
		obj1.p();
		obj1.ch2();  */
		
		
		// 12.Shape - Circle ,Square
		/*Circle c = new Circle();
		Square s = new Square();
		c.display();
		s.dispplay(); */
		
		
		//13.Animal - Dog,Cat
		/*Dog2 d5 = new Dog2();
		Cat c = new Cat();
		d5.eat();
		d5.sound();
		
		c.eat();
		c.sound();  */
		
		
		//14.A - A -> B and A->C
		/*B4 obj1 = new B4();
		obj1.m1();
		obj1.m2();
		
		System.out.println("-------------------------");
		
		C4 obj2 = new C4();
		obj2.m1();
		obj2.m3();  */
		
		
		//15.Person - Student ,Teacher Childs Class
		/*Student s = new Student ();
		System.out.println("Student Name : "+s.name);
		System.out.println("Student age : "+s.age);
		System.out.println("Student roll No : "+s.rollNo);
		System.out.println("--------------------");
		
		Teacher t = new Teacher();
		System.out.println("Teacher Name : "+t.name);
		System.out.println("Teacher age : "+t.age);
		System.out.println("Subject : "+t.subject);  */
		
		
		//16. A → B, A → C, C → D
		 /*D5 obj = new D5();

	       obj.showA();
	       obj.showC();
	       obj.showD();  */
		
		
		//17. Animal → Dog, Animal → Cat → Tiger
		 /*Tiger obj = new Tiger();

	        obj.eat();
	        obj.meow();
	        obj.roar(); */
	        
	        
	     //18. College → Teacher and College → Student → Monitor  
		   /*Monitor obj = new Monitor();

	        obj.monitor();  */
		
		
		//19. A → B → C with Different Variables
		 
		    /*C6 obj = new C6();

	        obj.display();  */
		
		
		//20. Device → Mobile and Laptop
		 Mobile m = new Mobile();

	        m.powerOn();
	        m.call();

	        System.out.println("----------");

	        Laptop l = new Laptop();

	        l.powerOn();
	        l.coding();
	        
	        
	        
	        
	        
	    }
		
		
		
		
		
		
	}


