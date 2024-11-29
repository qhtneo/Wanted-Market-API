package com.wanted.marketapi.service;

import com.wanted.marketapi.domain.Member;
import com.wanted.marketapi.entity.MemberEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member toDomain(MemberEntity entity);
    MemberEntity toEntity(Member member);
}
