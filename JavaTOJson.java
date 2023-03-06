
package javaapplication1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JavaTOJson {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {     
            Object obj = parser.parse(new FileReader("c\\desktop\RATHEON"));

            JSONObject jsonObject =  (JSONObject) obj;

            String name = (String) jsonObject.get("name");
            System.out.println(book);

            String city = (String) jsonObject.get("city");
            System.out.println(Threat);

            String job = (String) jsonObject.get("job");
            System.out.println(Vulnerability);

            // loop array
            JSONArray id = (JSONArray) jsonObject.get("cars");
            Iterator<String> iterator = id.iterator();
            while (iterator.hasNext()) {
             System.out.println(iterator.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
}
