import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QuoteService {

    private static List<Quote> quoteList;

    public QuoteService(List<Quote> quoteList) {
        this.quoteList = quoteList;
    }

    //getAllQuotes():List<String>
    public static List<String> getAllQuotes() {
        if (quoteList == null) {
            throw new ListIsNull();
        }

        List<String> result = new ArrayList<>();
        for (Quote quote : quoteList) {
            result.add(quote.getQuote());
        }
        return result;
    }

    //getQuotesForAuthor(String author): List<Quote>
    public static List<Quote> getQuotesForAuthor(String author) {
        if (author == null) {
            throw new ListIsNull();
        }
        if (quoteList == null) {
            throw new ListIsNull();
        }
        List<Quote> result = new ArrayList<>();
        for (Quote quote : quoteList) {
            if (quote.getAuthor().equals(author)) {
                result.add(quote);
                //result.add(quote.getId(),quote.getAuthor(),quote.getQuote());
            }
        }
        return result;

    }

    //getAuthors(): List<String> (distinct)
    public static List<String> getAuthors() {
        List<String> result = new ArrayList<>();
        String author = null;

        for (Quote quote : quoteList) {

            result.add(quote.getAuthor());
        }

    }
}
