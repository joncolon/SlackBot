package nyc.c4q.ramonaharrison.model;

import nyc.c4q.ramonaharrison.util.Field;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 * <p>
 * A class representing a message attachment.
 * See https://api.slack.com/docs/message-attachments
 */

public class Attachment {

    private String fallback;
    private String color;
    private String pretext;
    private  String authorName;
    private String authorIcon;
    private String title;
    private String titleLink;
    private String text;
    private List<Field> fields;
    private  String imageUrl;
    private String thumbUrl;
    private String footer;
    private String footerIcon;
    private long ts;

    public Attachment(JSONObject json){
        // TODO: parse an aattachment from the incoming icon

        if(json.containsKey("fallback")){
            this.fallback = (String) json.get("fallback");
        }
        if(json.containsKey("fields")){
            JSONArray jsonFields = (JSONArray) json.get("fields");
            this.fields = new ArrayList<Field>();
            for(int i = 0; i < jsonFields.size(); i++){
                Field field = new Field((JSONObject) jsonFields.get(i));
                this.fields.add(field);
            }
        }
        if(json.containsKey("ts")){
            this.ts = (Long) json.get("ts");
        }

    }


    // TODO: implement private fields for each of the following attachment JSON keys:
    // "fallback"
    // "color"
    // "pretext"
    // "author_name"
    // "author_link"
    // "author_icon"
    // "title"
    // "title_link"
    // "text"
    // "fields"
    // "image_url"
    // "thumb_url"
    // "footer"
    // "footer_icon"
    // "ts"

   // public Attachment(JSONObject json) {
        // TODO: parse an attachment from the incoming json
    //}

    // TODO add getters to access private fields

}
