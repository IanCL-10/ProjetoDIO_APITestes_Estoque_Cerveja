package dio.iancl.estoquecerveja.mapper;

import dio.iancl.estoquecerveja.dto.BeerDTO;
import dio.iancl.estoquecerveja.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
