import com.fasterxml.jackson.databind.ObjectMapper;
import wether.GlobWether;

import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        GlobWether globWether1 = objectMapper.readValue(new URL("https://www.metaweather.com/api/location/2122265/"), GlobWether.class);
        System.out.println(globWether1);

    }

}
