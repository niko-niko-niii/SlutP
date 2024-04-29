import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Book {
    protected String name; //book name
    protected int releaseDate; //release date
    protected String author; //author of the book
    private String genre;


    Book(String name, int releaseDate,String author,String genre){
        this.name=name;
        this.releaseDate=releaseDate;
        this.author=author;
        this.genre=genre;

    }
    //getters
    public String getName() {return name;}
    public int getReleaseDate() {return releaseDate;}
    public String getAuthor() {return author;}
    public String getGenre() {return genre;}


    //filhantering

    File file;
    String fName;
    //skapar och fyller i filen till boken
    void filehandler(String text) {
        fName=name+".txt";
        file= new File(this.name+".txt");
        createFile(file,fName);
        writeFile(text);
    }

    //får boktexten från användaren
    public void recieveBookText(String text){
    filehandler(text);
    }
    //skapar filen till boken
    private  void createFile(File file, String fName){

        // error handler ifall något går fel
        try {
            //kollar om fil har skapats och notifierar användare
            if(file.createNewFile()) System.out.println("file created");
            else System.out.println("file exists already");

        }catch(IOException e){
            System.out.println(fName+" could not be created");

        }catch(Exception e){
            System.out.println("something went wrong dunno why tho ˚‧º·(˚ ˃̣̣̥᷄⌓˂̣̣̥᷅ )‧º·˚");
        }


    }
    //raderar bok fil
    protected void deleteFile(){
        try {
            file.delete();
            System.out.println("file "+fName+" was deleted");
        }catch(Exception e){
            System.out.println("something went wrong");
        }

    }
    //skriver i filen till boken
    private void writeFile(String text)  {

        try {
            FileWriter writer =new FileWriter(fName); //själva grejen som skriver i filen
            // filen går ej att redigera för att jag orkar inte
            // inte för att jag inte kan
            writer.write(text);
            writer.close();

        }catch(IOException e){
            System.out.println(fName+" could not be edited");
            e.printStackTrace();// liv orka inte förklara "more robust logging" så printStackTrace räcker

        }catch(Exception e){
            System.out.println("something went wrong dunno why tho ˚‧º·(˚ ˃̣̣̥᷄⌓˂̣̣̥᷅ )‧º·˚");
        }
    }
    //funktion läser av filen
    // fien läses av ochh kan ej ändras så det är ok om den e public
    public void readFile(){
        try {
            Scanner readFile =new Scanner(file);
           while(readFile.hasNextLine()){
               System.out.println(readFile.nextLine());
           }
        }catch(Exception e){
            System.out.println("could not read from file "+ fName);
        }

    }

}

