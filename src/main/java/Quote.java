public class Quote {
    private int id;
    private final String author;
    private final String quote;

    private boolean favourite;


    public Quote(int id,String author, String quote, boolean favourite) {
        this.id = id;
        this.author = author;
        this.quote = quote;
        this.favourite = favourite;
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

    public boolean isFavourite() {
        return favourite;
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
