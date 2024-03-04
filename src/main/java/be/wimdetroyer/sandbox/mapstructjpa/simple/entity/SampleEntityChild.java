package be.wimdetroyer.sandbox.mapstructjpa.simple.entity;

public class SampleEntityChild {

    private String someField;

    private be.wimdetroyer.sandbox.mapstructjpa.simple.entity.SampleEntity parent;

    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }

    public be.wimdetroyer.sandbox.mapstructjpa.simple.entity.SampleEntity getParent() {
        return parent;
    }

    public void setParent(be.wimdetroyer.sandbox.mapstructjpa.simple.entity.SampleEntity parent) {
        this.parent = parent;
    }
}
