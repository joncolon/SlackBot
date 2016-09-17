package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 *
 */

public class User {

    // TODO: implement private fields for each of the following user JSON keys:

    private String id ;
    private String name ;
    private boolean delete ;
    private String color ;
    private List<Field> profile;
    private boolean isAdmin ;
    private boolean isPrimaryOwner ;
    private boolean isRestricted ;
    private boolean isUltraRestricte ;
    private boolean has2fa ;
    private String twoFactorType ;
    private boolean hasFiles ;

    //////////////////////////////////////////////////////////////////////////////////////////////////

    public User(JSONObject json) {


        if(json.containsKey("id")) {
            this.id = (String) json.get("id");
        }


        if (json.containsKey("profile")){
            JSONArray jsonFields = (JSONArray) json.get("profile");
            this.profile = new ArrayList<Field>();
            for (int i = 0; i < jsonFields.size(); i++) { // we want to add onto our list
                Field field = new Field((JSONObject)jsonFields.get(i));
                this.profile.add(field);
            }
        }


  //////////////////////////////////////////////////////////////////////////////////////////////////


        if (json.containsKey("name")){
            this.name = (String) json.get("name");
        }
        if (json.containsKey("delete")){
            this.delete = (boolean) json.get("delete");
        }
        if (json.containsKey("color")){
            this.color = (String) json.get("color");
        }
        if (json.containsKey("delete")){
            this.delete = (boolean) json.get("delete");
        }
        if (json.containsKey("isadmin")){
            this.isAdmin = (boolean) json.get("isAdmin");
        }
        if (json.containsKey("is_primary_owner")){
            this.isPrimaryOwner = (boolean) json.get("is_primary_owner");
        }
        if (json.containsKey("is_restricted")){
            this.isRestricted = (boolean) json.get("is_restricted");
        }
        if (json.containsKey("is_ultra_restricte")){
            this.isUltraRestricte = (boolean) json.get("is_ultra_restricte");
        }
        if (json.containsKey("has_2fa")){
            this.has2fa = (boolean) json.get("has_2fa");
        }
        if (json.containsKey("twoFactorType")){
            this.twoFactorType = (String)json.get("twoFactorType");
        }
        if (json.containsKey("has_files")){
            this.hasFiles = (boolean) json.get("has_files");
        }

    }

    public User() {


    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Field> getProfile() {
        return profile;
    }

    public void setProfile(List<Field> profile) {
        this.profile = profile;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean is_admin) {
        this.isAdmin = is_admin;
    }

    public boolean isPrimaryOwner() {
        return isPrimaryOwner;
    }

    public void setIsPrimaryOwner(boolean is_primary_owner) {
        this.isPrimaryOwner = is_primary_owner;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public void setIsRestricted(boolean is_restricted) {
        this.isRestricted = is_restricted;
    }

    public boolean isUltraRestricte() {
        return isUltraRestricte;
    }

    public void setIsUltraRestricte(boolean is_ultra_restricte) {
        this.isUltraRestricte = is_ultra_restricte;
    }

    public boolean isHas2fa() {
        return has2fa;
    }

    public void setHas2fa(boolean has_2fa) {
        this.has2fa = has_2fa;
    }

    public String getTwoFactorType() {
        return twoFactorType;
    }

    public void settwoFactorType(String twoFactorType) {
        this.twoFactorType = twoFactorType;
    }

    public boolean isHasFiles() {
        return hasFiles;
    }

    public void setHasFiles(boolean has_files) {
        this.hasFiles = has_files;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////


}
