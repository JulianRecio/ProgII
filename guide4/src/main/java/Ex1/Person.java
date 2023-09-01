package Ex1;

public class Person {

    private String fullName;

    private String document;

    private Type type;

    public Person(String fullName, String document, Type type) {
        this.fullName = fullName;
        this.document = document;
        this.type = type;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDocument() {
        return document;
    }

    public Type getType() {
        return type;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
