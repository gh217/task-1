package model;

public class StudentModel {
    private int id;
    private String name;

    public StudentModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentModel() {}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
