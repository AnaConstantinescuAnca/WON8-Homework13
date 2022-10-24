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

       System.out.println(QuoteService.getAllQuotes());

        System.out.println(QuoteService.getQuotesForAuthor("Lao Tzu"));

    }
}
