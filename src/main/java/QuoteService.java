import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QuoteService {

    private final List<Quote> quoteList;

    public QuoteService(List<Quote> quoteList) {
        this.quoteList = quoteList;
    }

    public List<Quote> getQuoteList() {
        return quoteList;
    }

    //getAllQuotes():List<String>
    public List<String> getAllQuotes() {
        List<String> result = new ArrayList<>();
        for (Quote quote : quoteList) {
            result.add(quote.getQuote());
        }
        return result;
    }

    //getQuotesForAuthor(String author): List<Quote>
    public List<Quote> getQuotesForAuthor(String author) {
        List<Quote> result = new ArrayList<>();
        for (Quote quote : quoteList) {
            if (author == null || quote.getAuthor().equals(author)) {
                result.add(quote);
            }
        }
        return result;
    }

    //getAuthors(): List<String> (distinct) ?????????
    public List<String> getAuthors() {
        List<String> result = new ArrayList<>();
        String author = null;

        for (Quote quote : quoteList) {

            if(author==null || quote.getAuthor().contains(author)){
                result.add(quote.getAuthor());
            }
        }
        return result;

    }

    //- setFavourite(int id)
    public void setFavourite(int id){

        Quote quote = new Quote();
        quote.setFavourite(true);

    }
}
