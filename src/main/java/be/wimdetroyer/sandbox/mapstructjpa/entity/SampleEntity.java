package be.wimdetroyer.sandbox.mapstructjpa.entity;

import java.util.ArrayList;
import java.util.List;

public class SampleEntity {

    private String someField;
    private List<SampleEntityChild> children = new ArrayList<>();


    //See: https://vladmihalcea.com/jpa-hibernate-synchronize-bidirectional-entity-associations/
    // Bytecode enhancement could also be used to auto-generate these methods.
    public void addChild(SampleEntityChild entityChild) {
        children.add(entityChild);
        entityChild.setParent(this);
    }

    public void removeComment(SampleEntityChild entityChild) {
        children.remove(entityChild);
        entityChild.setParent(null);
    }


    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }

    public List<SampleEntityChild> getChildren() {
        return children;
    }

    public void setChildren(List<SampleEntityChild> children) {
        this.children = children;
    }
}
