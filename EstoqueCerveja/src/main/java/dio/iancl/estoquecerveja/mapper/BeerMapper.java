package dio.iancl.estoquecerveja.mapper;

import dio.iancl.estoquecerveja.dto.BeerDTO;
import dio.iancl.estoquecerveja.entity.Beer;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
