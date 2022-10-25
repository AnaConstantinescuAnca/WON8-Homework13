import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

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

            if (author == null) {
                result.add(quote.getAuthor());
            } else {
                if (!result.contains(author))
                    result.add(author);
            }
            author = quote.getAuthor();

        }
        return result;

    }

    //- setFavourite(int id)
    public void setFavourite(int id) {
        for(Quote quote:quoteList){
            if(quote.getId()==id){
                quote.setFavourite(true);
            }
        }
    }
    //- getFavourites():List<Quote>
    public List<Quote> getFavourites(){
        List<Quote> result = new ArrayList<>();
        for(Quote quote:quoteList){
            if(quote.isFavourite()){
                result.add(quote);
            }
        }
        return result;
    }

    //getRandomQuote():String : generati un numar random cu ajutorul obiectului java.util.Random si returnati quote-ul cu acel id
    public String getRandomQuote(){
        //String randomQuote = "";
        Random random = new Random();
        int numberRandom = random.nextInt(0, quoteList.size());
//
//        for (Quote quote : quoteList) {
//            if (quote.getId() == numberRandom) {
//                randomQuote = quote.getQuote();
//            }
//        }
//        return  randomQuote;
        // ca sa nu mai parcurg lista
        return quoteList.get(numberRandom).getQuote();
    }
}
