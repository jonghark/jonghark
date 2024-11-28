package examples.json;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class json {
    private static final Logger logger = LoggerFactory.getLogger(json.class);
    public static void main(String[] args){
        JSONObject json = new JSONObject();
        json.put("po", new JSONArray());
        logger.info("po{}",json);
    }
}
