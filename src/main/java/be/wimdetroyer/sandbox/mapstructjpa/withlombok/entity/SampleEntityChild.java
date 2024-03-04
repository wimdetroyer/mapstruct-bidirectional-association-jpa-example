package be.wimdetroyer.sandbox.mapstructjpa.withlombok.entity;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SampleEntityChild {

    private String someField;

    private SampleEntity parent;

}
