package nivel1.ejercicio1;

public class NoGenericMethods {
    private String name;
    private String name2;
    private String catName;

    public NoGenericMethods(String name, String name2, String catName) {
        this.name = name;
        this.name2 = name2;
        this.catName = catName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}

