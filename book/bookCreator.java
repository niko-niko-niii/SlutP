import java.util.Scanner;

public class bookCreator {
    static Scanner scanner = new Scanner(System.in);

    public static void createBook() {
        startloop:
        do {
            System.out.println("book name:");
            String Bname = scanner.nextLine();
            System.out.println("author name");
            String AuthorName = scanner.nextLine();
            System.out.println("Release date");
            String releaseDate = scanner.nextLine();
            //if function checks that releaseDate has only ints
            if (releaseDate.equalsIgnoreCase(String.valueOf(Integer.parseInt(releaseDate)))) {
                System.out.println("book created");
                break startloop;
            } else {
                System.out.println("try again");
            }

        } while (true);
    }


    private static void addBook(String bookName, String authorName, String releaseDate){


    }
}
