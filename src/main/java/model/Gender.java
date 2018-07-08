package model;

/**
 * Created by bitzero on 6/26/18.
 */
public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private String name;
    Gender(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Gender getGender(String name) {
        if(name.equalsIgnoreCase("male"))
            return MALE;
        if(name.equalsIgnoreCase("female"))
            return FEMALE;
        return OTHER;
    }


}
