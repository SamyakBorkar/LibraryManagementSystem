class BOOK {
    private String Title;
    private String Author;
    public static int C_Programming = 10;
    public static int Java_Programming = 10;
    public static int Python_Programming = 7;
    public static int CPP_Programming = 9;

    public BOOK(String title, String author) {
        this.Title = title;
        this.Author = author;
    }

    public static boolean isAvailable(String title, String author) {
        switch (title) {
            case "C_Programming":
                return (author.equals("Ashok_Kamathne") && C_Programming > 0) || (author.equals("BalguruSWamy") && C_Programming > 0);

            case "Java_Programming":
                return (author.equals("Cay S. Horstmann") && Java_Programming > 0) || (author.equals("Herbert Schildt") && Java_Programming > 0);

            case "Python_Programming":
                return (author.equals("Eric Matthes") && Python_Programming > 0) || (author.equals("John M Zelle") && Python_Programming > 0);

            case "CPP_Programming":
                return (author.equals("Mark Reed") && CPP_Programming > 0) || (author.equals("D.S. Malik") && CPP_Programming > 0);

            default:
                return false;
        }
    }
    
    public static void displayAvailibility(boolean x){
    	if(x==true){
        	System.out.println("Book is Available");
        	
        }
        
        else{
        	System.out.println("Book is not Available");
        }
        
    }
}

class STUDENT{
    private String name;
    private String regNumber;
    public static int booksIssued;
	
    public STUDENT(){
    	
    }	
    public STUDENT(String name, String regNumber) {
        this.name = name;
        this.regNumber = regNumber;
        this.booksIssued = 4;
    }
    
    public static boolean isValidStudent(String regNumber){
    	if(regNumber.length() !=10){
    		return false;
    	}
    	else{
    	String year = regNumber.substring(0, 4);
        String dept = regNumber.substring(4, 7);
        String rollno= regNumber.substring(7, 10);
    	
    	int YR, RN;
    	
    	YR=Integer.parseInt(year);
    	RN=Integer.parseInt(rollno);
    	
    	if(YR<2018||YR>2026){
    	 return false;
    	 
    	}
    	
    	
    	else if(RN<1|| RN >100){
    		return false;
    	}
    	
    	else if(!(dept.equals("BIT") || dept.equals("BCS") || dept.equals("BME") ||
              dept.equals("BCE") || dept.equals("BEL") || dept.equals("BCH"))){
              	return false;
              	
              }
         else{
         	return true ;
         }
    	}
    }
    
}

class LIBRARIAN{
	STUDENT S2 = new STUDENT("Samyak", "2022BIT037");
	void checkNumberOfBooksIssued(){
		if(S2.booksIssued>=5){
			System.out.println("Cant Issue more than 5 Books");
		}
		else{
			System.out.println("No of Books Issued are :"+S2.booksIssued);
		}
		
	}
}

class LibraryManagement {
    public static void main(String args[]) {
        System.out.println("Welcome To SGGSIE&T Library ");
        BOOK book = new BOOK("C_Programming", "Samyak");
        STUDENT student = new STUDENT();
        LIBRARIAN Lib = new LIBRARIAN();
        
        
        boolean RES = book.isAvailable("C_Programming", "Ashok_Kamathne");
        book.displayAvailibility(RES);
        if(RES==true){
        	boolean st = student.isValidStudent("2022BIT037");
        	if(st==true){
        		System.out.println("Student is Valid");
        	}
        	else{
        		System.out.println("Student is not Valid");
        	}
        }
       Lib.checkNumberOfBooksIssued();
        
    }
}

