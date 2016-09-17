package nyc.c4q.ramonaharrison.util;

import org.json.simple.JSONObject;

import java.util.List;

/**
 * Created by hakeemsackes-bramble on 9/11/16.
 */
public class User {
    private String id;
    private String name;
    private boolean deleted;
    private String color;
    private List<Field> profile;
    private boolean is_admin;
    private boolean is_owner;
    private boolean is_primary_owner;
    private boolean is_restricted;
    private boolean is_ultra_restricted;
    private boolean has_2fa;
    private String two_factor_type;
    private String has_fields;

    public void Field(JSONObject json) {

        if (json.containsKey("id")) {
            this.id = (String) json.get("id");
        }
        if (json.containsKey("name")) {
            this.name = (String) json.get("name");
        }
        if (json.containsKey("deleted")) {
            this.deleted= (boolean) json.get("deleted");
        }
        if (json.containsKey("color")) {
            this.color = (String) json.get("color");
        }
        if (json.containsKey("profile")) {
            this.profile = (List<Field>) json.get("profile");
        }
        if (json.containsKey("id")) {
            this.is_admin = (boolean) json.get("id");
        }
        if (json.containsKey("id")) {
            this.is_owner = (boolean) json.get("id");
        }
        if (json.containsKey("id")) {
            this.is_primary_owner = (boolean) json.get("id");
        }
        if (json.containsKey("id")) {
            this.is_restricted = (boolean) json.get("id");
        }
        if (json.containsKey("id")) {
            this.is_ultra_restricted = (boolean) json.get("id");
        }
        if (json.containsKey("id")) {
            this.has_2fa = (boolean) json.get("id");
        }
        if (json.containsKey("id")) {
            this.two_factor_type = (String) json.get("id");
        }
        if (json.containsKey("id")) {
            this.has_fields = (String) json.get("id");
        }
        if (json.containsKey("id")) {
            this.has_fields = (String) json.get("id");
        }

    }
}
