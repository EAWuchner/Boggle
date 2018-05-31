import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WordChecker
{
    private ArrayList<String> dictionary = new ArrayList<String>();
    
    public WordChecker(){
        try (BufferedReader br = new BufferedReader(new FileReader("dictionary.txt")))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                dictionary.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public boolean isValid(String word){
        int low = 0;
        int high = dictionary.size() - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (dictionary.get(mid).compareTo(word) < 0) {
                low = mid + 1;
            } else if (dictionary.get(mid).compareTo(word) > 0) {
                high = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}