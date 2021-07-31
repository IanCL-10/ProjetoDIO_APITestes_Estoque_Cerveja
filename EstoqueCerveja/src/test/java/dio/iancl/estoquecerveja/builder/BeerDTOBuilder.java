package dio.iancl.estoquecerveja.builder;

import dio.iancl.estoquecerveja.dto.BeerDTO;
import dio.iancl.estoquecerveja.enums.BeerType;
import lombok.Builder;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Kronenbier";

    @Builder.Default
    private String brand = "Ambev";

    @Builder.Default
    private int max = 20;

    @Builder.Default
    private int quantity = 10;

    @Builder.Default
    private BeerType type = BeerType.LAGER;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(id,
                name,
                brand,
                max,
                quantity,
                type);
    }
}