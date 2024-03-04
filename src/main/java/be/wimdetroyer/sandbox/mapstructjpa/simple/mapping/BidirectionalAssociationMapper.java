package be.wimdetroyer.sandbox.mapstructjpa.simple.mapping;


import be.wimdetroyer.sandbox.mapstructjpa.simple.dto.SampleDTO;
import be.wimdetroyer.sandbox.mapstructjpa.simple.entity.SampleEntity;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;


// See also: https://stackoverflow.com/questions/71983637/mapstruct-custom-list-mapping-for-bi-directional-hibernate-association (solution two)
@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public abstract class BidirectionalAssociationMapper {

    public abstract SampleEntity toSampleEntity(SampleDTO sampleDTO);

}
