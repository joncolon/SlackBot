package nyc.c4q.ramonaharrison.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Created by hakeemsackes-bramble on 9/11/16.
 */
public class Field {
    private String title;
    private String value;
    private boolean isShort;

    public Field(JSONObject json){
        if(json.containsKey("title")){
            this.title = (String) json.get("title");
        }
        if(json.containsKey("value")){
            this.title = (String) json.get("value");
        }
        if(json.containsKey("isShort")){
            this.title = (String) json.get("isShort");
        }

    }
}
