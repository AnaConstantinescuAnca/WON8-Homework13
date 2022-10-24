import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static String pathFile = "files/quotes.txt";

    public static void main(String[] args) throws IOException {
        //System.out.println("My first maven project");
        //System.out.println(pathFile);
        List<Quote> quoteList = ReadFromFileQuotes.ReadFromFile(pathFile);

//      System.out.println(quoteList.get(0).getId() + " " + quoteList.get(0).getAuthor()
//      + " " + quoteList.get(0).getQuote());

        System.out.println(Arrays.asList(quoteList).toString());

        QuoteService quoteService = new QuoteService(quoteList);
       System.out.println(quoteService.getAllQuotes());

        System.out.println(quoteService.getQuotesForAuthor("Lao Tzu"));

        System.out.println(quoteService.getAuthors());

        QuoteService quoteFavorites = new QuoteService(quoteList);
        quoteFavorites.setFavourite(2);
        //System.out.println(quoteFavorites.setFavourite(2));
        //System.out.println(QuoteService.setFavourite(14);

    }
}
