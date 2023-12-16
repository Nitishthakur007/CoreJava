
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      try{
          URL url = new URL("https://www.boredapi.com/api/activity");

          HttpURLConnection conn = (HttpURLConnection)url.openConnection();
          conn.setRequestMethod("GET");
          conn.connect();

          // check if connection is made

          int responseCode = conn.getResponseCode();

          // 200 ok
          if (responseCode != 200){
              throw new RuntimeException("HttpResponseCode: " + responseCode);
          } else {
              StringBuilder informationString = new StringBuilder();
              Scanner scanner = new Scanner(url.openStream());
              while (scanner.hasNext()){
                  informationString.append(scanner.nextLine());

              }

              scanner.close();

              System.out.println(informationString);

              //JSON
              JsonParser parsed = new JsonParser();
              JsonObject dataObject = (JsonObject) parsed.parse(String.valueOf(informationString));

             System.out.println(dataObject.get("activity"));
          }

      } catch (MalformedURLException e) {
          throw new RuntimeException(e);
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
    }
}