package be.wimdetroyer.sandbox.mapstructjpa.dto;

import java.util.List;

public class SampleDTO {

    private String someField;
    private List<SampleDTOChild> children;


    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }

    public List<SampleDTOChild> getChildren() {
        return children;
    }

    public void setChildren(List<SampleDTOChild> children) {
        this.children = children;
    }
}
