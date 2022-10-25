import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static String pathFile = "files/quotes.txt";

    public static void main(String[] args) throws IOException, ListIsNullException {

        List<Quote> quoteList = ReadFromFileQuotes.ReadFromFile(pathFile);


        System.out.println(Arrays.asList(quoteList).toString());
        QuoteService quoteService = new QuoteService(quoteList);
        System.out.println(quoteService.getAllQuotes());

        System.out.println(quoteService.getQuotesForAuthor("Lao Tzu"));

        System.out.println(quoteService.getAuthors());

        quoteService.setFavourite(2);
        quoteService.setFavourite(10);
        quoteService.setFavourite(100);

        System.out.println((quoteService.getFavourites()));
        System.out.println(quoteService.getRandomQuote());

    }
}
