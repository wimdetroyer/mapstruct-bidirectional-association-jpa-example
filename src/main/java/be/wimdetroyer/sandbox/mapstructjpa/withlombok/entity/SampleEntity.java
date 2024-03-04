package be.wimdetroyer.sandbox.mapstructjpa.withlombok.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SampleEntity {

    private String someField;
    private List<SampleEntityChild> children = new ArrayList<>();


    //See: https://vladmihalcea.com/jpa-hibernate-synchronize-bidirectional-entity-associations/
    // Bytecode enhancement could also be used to auto-generate these methods.
    public void addChild(SampleEntityChild entityChild) {
        children.add(entityChild);
        entityChild.setParent(this);
    }

    public void removeChild(SampleEntityChild entityChild) {
        children.remove(entityChild);
        entityChild.setParent(null);
    }

}
