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

    public static String isAvailable(String title, String author) {
        switch (title) {
            case "C_Programming":
                if (author.equals("Ashok_Kamathne") && C_Programming > 0) {
                    return "Book is Available";
                } else if (author.equals("BalguruSWamy") && C_Programming > 0) {
                    return "Book is Available ";
                } else {
                    return "Book is not Available";
                }
            default:
                return "Book is not available";
        }
    }
}

class LibraryManagement {
    public static void main(String args[]) {
        System.out.println("Welcome To SGGSIE&T Library ");
        BOOK book = new BOOK("C_Programming", "Samyak");
        System.out.println(BOOK.isAvailable("C_Programming", "Ashok_Kamathne"));
    }
}

