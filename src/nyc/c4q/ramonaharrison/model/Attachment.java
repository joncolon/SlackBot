package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a message attachment.
 * See https://api.slack.com/docs/message-attachments
 *
 */

public class Attachment {

    private String fallback;
    private String color;
    private String pretext;
    private String authorName;
    private String authorLink;
    private String title;
    private String titleLink;
    private String text;
    private List<Field> fields;
    private String imageUrl;
    private String thumbUrl;
    private String footer;
    private String footerIcon;
    private long ts;

    //////////////////////////////////////////////////////////////////////////////////////////////////

    public Attachment(JSONObject json) {

        if(json.containsKey("fallback")) {
            this.fallback = (String) json.get("fallback");
        }
        if (json.containsKey("fields")){
            JSONArray jsonFields = (JSONArray) json.get("fields");
            this.fields = new ArrayList<Field>();
            for (int i = 0; i < jsonFields.size(); i++) { // we want to add onto our list
                Field field = new Field((JSONObject)jsonFields.get(i));
                this.fields.add(field);
            }
        }

        if (json.containsKey("ts")){
            this.ts = (Long) json.get("ts");
        }

        /*if (json.get("fallback") != null){

        }*/

    }

//////////////////////////////////////////////////////////////////////////////////////////////////

    public String getFallback() {
        return fallback;
    }

    public void setFallback(String fallback) {
        fallback = fallback;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPretext() {
        return pretext;
    }

    public void setPretext(String pretext) {
        this.pretext = pretext;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLink() {
        return authorLink;
    }

    public void setAuthorLink(String authorLink) {
        this.authorLink = authorLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleLink() {
        return titleLink;
    }

    public void setTitleLink(String titleLink) {
        this.titleLink = titleLink;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getFooterIcon() {
        return footerIcon;
    }

    public void setFooterIcon(String footerIcon) {
        this.footerIcon = footerIcon;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }
}
