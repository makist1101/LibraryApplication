package io.vertx.intro.first;


import io.vertx.core.json.JsonObject;

public class User {

    private long id = -1;

    private String name;

    private String type;

    public User(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public User(long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public User() {
        
    }

    public User(JsonObject json) {
        this(
            json.getInteger("id", -1),
            json.getString("name"),
            json.getString("type")
        );
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public User setType(String type) {
        this.type = type;
        return this;
    }
}
