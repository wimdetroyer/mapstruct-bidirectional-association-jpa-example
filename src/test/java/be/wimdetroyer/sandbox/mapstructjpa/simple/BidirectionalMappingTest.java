package be.wimdetroyer.sandbox.mapstructjpa.simple;
import be.wimdetroyer.sandbox.mapstructjpa.simple.dto.SampleDTO;
import be.wimdetroyer.sandbox.mapstructjpa.simple.dto.SampleDTOChild;
import be.wimdetroyer.sandbox.mapstructjpa.simple.mapping.BidirectionalAssociationMapper;
import be.wimdetroyer.sandbox.mapstructjpa.simple.mapping.BidirectionalAssociationMapperImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BidirectionalMappingTest {



    private BidirectionalAssociationMapper bidirectionalAssociationMapper = new BidirectionalAssociationMapperImpl();


    @Test
    public void bidirectionalAssociationWorks() {
        var sampleDTO = new SampleDTO();
        sampleDTO.setSomeField("foo");
        var dtoChild = new SampleDTOChild();
        dtoChild.setSomeField("bar");
        var dtoChild2 = new SampleDTOChild();
        dtoChild2.setSomeField("baz");
        sampleDTO.setChildren(List.of(dtoChild, dtoChild2));
        var sampleEntity = bidirectionalAssociationMapper.toSampleEntity(sampleDTO);

        Assert.assertEquals("foo", sampleEntity.getSomeField());
        Assert.assertEquals( 2, sampleEntity.getChildren().size());
        var childOne = sampleEntity.getChildren().get(0);
        var childTwo = sampleEntity.getChildren().get(1);
        Assert.assertEquals( "bar", childOne.getSomeField());
        Assert.assertEquals( sampleEntity, childOne.getParent());
        Assert.assertEquals( "baz", childTwo.getSomeField());
        Assert.assertEquals( sampleEntity, childTwo.getParent());
    }
}
