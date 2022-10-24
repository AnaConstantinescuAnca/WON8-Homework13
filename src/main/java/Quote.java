import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Quote {
    private int id;
    private final String author;
    private final String quote;

    private boolean favourite;

    //= "/resources/quotes.txt";

    public Quote(int id,String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public int getId() {
        return id;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }
}
