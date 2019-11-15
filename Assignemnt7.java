/*PRANAV_JAGADEESH_1BM18CS071
7 Write a program to demonstrate generics with multiple object parameters.*/




package basic_programs;


class Testing<T, U, W> 
{ 
	T obj1; 
	U obj2;
    W obj3;	
 
	Testing(T obj1, U obj2, W obj3) 
	{ 
		this.obj1 = obj1; 
		this.obj2 = obj2; 
		this.obj3 = obj3;
	} 

	public void print() 
	{ 
		System.out.println(obj1); 
		System.out.println(obj2);
     System.out.println(obj3);		
	} 
} 
 
class Assignemnt7 
{ 
	public static void main (String[] args) 
	{ 
		Testing<String, Integer,Double> obj = 
			new Testing<String, Integer, Double>("hello", 15, 3.3); 

		obj.print(); 
	} 
}
