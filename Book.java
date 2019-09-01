  /*PRANAV_JAGADEESH_1BM18CS071_Java*/

/*Create a class Book which contains four members: name, author, price, num_pages. 
 * Include a constructor to set the values for the members. 
 * Include methods to set and get the details of the objects. 
 * Include a toString( ) method that could display the complete details of the Book. 
 * Develop a Java program to create n Book objects. */

import java.util.*; 

 class Book
 {
  String name;
  String author;
  double price;
  int num_pages;
  
   Book(String name,String author,double price,int num_pages)  /*constructor to set the values for the members*/
    {  
    this.name=name;
    this.author=author;
    this.price=price;
    this.num_pages=num_pages;
    }
   
    public Book()
    {
     
    }

           /*methods to set and get the details of the objects*/
	 
    public String getName()
    {
     return name;
    }

    public void setName(String name)
    {
     this.name=name;
    } 
  
    public String getAuthor()
    {
     return author;
    }
   
    public void setAuthor(String author)
    {
     this.author=author;
    }
   
    public double getPrice()
    {
     return price;
    }
   
    public void setPrice(double price)
    {
     this.price=price;
    } 
   
    public int getNum_pages()
    {
     return num_pages;
    }
    
    public void setNum_pages(int num_pages)
    {
     this.num_pages=num_pages;
    }
    
	 /* toString( ) method that could display the complete details of the Book*/
	 
    public String toString()
    {
    	return "Name of Book:"+name+"\n"+"Author Name :"+author+"\n"+"Book price:"+price+"\n" +"Number of pages:"+num_pages;

    }

    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     int i;
     System.out.println("Details of Book printing using Constructor");
     Book b1 = new Book("Java Complete Reference","HerbertSchild",1050.36,1400);
     System.out.println(b1);
     
     System.out.println("---------------------------------------------");
     System.out.println("\nEnter the number of objects:");   /*to create n Book objects*/
     int n = sc.nextInt();
     Book b[]=new Book[n];
     
     for(i = 0; i<n; i++)
     {
    	 b[i]= new Book();
     }
     System.out.println();
     for(i = 0; i<n; i++)
     {
    	 System.out.println("Enter details of "+(i+1)+" Book");
    	 System.out.println("Enter Book name:");
    	 b[i].setName(sc.next());
  	     System.out.println("Enter Author name:");
    	 b[i].setAuthor(sc.next());
    	 System.out.println("Enter the price of Book:");
    	 b[i].setPrice(sc.nextFloat());
    	 System.out.println("Enter Num of pages in Book:");
    	 b[i].setNum_pages(sc.nextInt());
    	 
     }
     System.out.println("\nDetails of Book printing using set method\n");
     for(i = 0; i<n; i++)
     {
     System.out.println("\nDetails of"+(i+1)+"Book");
	 System.out.println("Name of Book:"+b[i].getName());
	 System.out.println("Author Name :"+ b[i].getAuthor());
	 System.out.println("Book price:"+ b[i].getPrice());
	 System.out.println("Number of pages:"+b[i].getNum_pages());
     }
     
    }
  }  
 
