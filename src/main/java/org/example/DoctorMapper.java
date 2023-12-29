package org.example;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


//@Mapper(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
@Mapper
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper( DoctorMapper.class );

    DoctorDto Doc2DocDto(Doctor doctor);
    List<DoctorDto> Ds2DocDto (List<Doctor> hums);


}
