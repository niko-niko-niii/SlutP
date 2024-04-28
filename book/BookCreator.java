import java.util.Scanner;

public class BookCreator {

    public  void bCreate(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("book name:");
        String name = scanner.nextLine();
        System.out.println("releaseDate(yyyymm):");
        int releaseDate;
        loop:
        do {
            //tar in bbara ints i datumet
            try{
                releaseDate= scanner.nextInt();
                //kollar så att datumet inte är för stor eller för liten
                if(releaseDate<1000000 && releaseDate>-1000000){
                break;
                }else{
                    System.out.println("date out of range");
                }

            }catch (Exception e){
                System.out.println("write numbers only");
            }

        }while(true);
        System.out.println("author");
        String author= scanner.nextLine();
        System.out.println("genre chose between:");
        System.out.println("romance, horror, sci fi, cook book, comics");
        String genre;
        // loopen kollar att genre är giltig
        loop:
        while(true){
            genre= scanner.nextLine();
            switch (genre){
                case "romance", "comics", "cook book", "sci fi", "horror": bCreator( name,releaseDate,author,genre);
                    break loop;
                default:
                    System.out.println("genre not recogized try again");

            }

        }


    }
    // bokfabrik
    private void bCreator(String name, int releaseDate, String author, String genre){
        Scanner scanner =new Scanner(System.in);
        Book book=new Book(name,releaseDate,author,genre);
        String text= scanner.nextLine();
        book.recieveBookText(text);
    }
        
        
    }

