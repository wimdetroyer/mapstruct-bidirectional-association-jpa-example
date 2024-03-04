package be.wimdetroyer.sandbox.mapstructjpa.withlombok.mapping;


import be.wimdetroyer.sandbox.mapstructjpa.withlombok.dto.SampleDTO;
import be.wimdetroyer.sandbox.mapstructjpa.withlombok.entity.SampleEntity;
import org.mapstruct.Builder;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;


// See also: https://stackoverflow.com/questions/71983637/mapstruct-custom-list-mapping-for-bi-directional-hibernate-association (solution two)
@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, builder = @Builder(disableBuilder = true))
public abstract class BidirectionalAssociationMapper {

    public abstract SampleEntity toSampleEntity(SampleDTO sampleDTO);

}
