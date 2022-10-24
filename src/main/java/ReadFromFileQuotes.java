import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ReadFromFileQuotes {
    private String pathFile;

    public ReadFromFileQuotes(String pathFile) {
        this.pathFile = pathFile;
    }


    public static List<Quote> ReadFromFile(String pathFile) throws IOException {
        System.out.println("Citesc din fisier : ");
        List<Quote> listQuote = new ArrayList<>();
        String defaultPath = "files/quote.txt";
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(pathFile));
        } catch (FileNotFoundException e) {
            bufferedReader = new BufferedReader(new FileReader(defaultPath));
        }

        String line;
        int i = 0;
        while ((line = bufferedReader.readLine()) != null) {
            i++;
            listQuote.add(QuoteFromLine(i, line));
        }
        return listQuote;
    }

    private static Quote QuoteFromLine(int i, String line) {
        String[] token = line.split(Pattern.quote("~"));
        return new Quote(i, token[0], token[1]);
    }


}
