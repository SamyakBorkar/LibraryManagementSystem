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

class LibraryManagement {
    public static void main(String args[]) {
        System.out.println("Welcome To SGGSIE&T Library ");
        BOOK book = new BOOK("C_Programming", "Samyak");
        boolean RES = book.isAvailable("C_Programming", "Ashok_Kamathne");
        book.displayAvailibility(RES);
        boolean RES1 = book.isAvailable("Java_Programming", "Ashok_Kamathne");
        book.displayAvailibility(RES1);
        
    }
}

