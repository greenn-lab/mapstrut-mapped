package io.github.greennlab.mapstrut.mapped;

public interface Mapped<DTO, ENTITY> {

    ENTITY to(DTO dto);

    DTO by(ENTITY entity);


    Iterable<ENTITY> listTo(Iterable<DTO> dto);

    Iterable<DTO> listBy(Iterable<ENTITY> entity);

}
