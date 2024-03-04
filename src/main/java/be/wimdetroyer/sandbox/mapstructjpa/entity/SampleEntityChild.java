package be.wimdetroyer.sandbox.mapstructjpa.entity;

public class SampleEntityChild {

    private String someField;

    private SampleEntity parent;

    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }

    public SampleEntity getParent() {
        return parent;
    }

    public void setParent(SampleEntity parent) {
        this.parent = parent;
    }
}
