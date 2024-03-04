package be.wimdetroyer.sandbox.mapstructjpa.mapping;


import be.wimdetroyer.sandbox.mapstructjpa.dto.SampleDTO;
import be.wimdetroyer.sandbox.mapstructjpa.entity.SampleEntity;
import be.wimdetroyer.sandbox.mapstructjpa.entity.SampleEntityChild;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;


// See also: https://stackoverflow.com/questions/71983637/mapstruct-custom-list-mapping-for-bi-directional-hibernate-association (solution two)
@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public abstract class BidirectionalAssociationMapper {

    public abstract SampleEntity toSampleEntity(SampleDTO sampleDTO);

}
