package com.firabarcelona.seed.repositories;

import com.firabarcelona.common.repositories.BaseMasterRepository;
import com.firabarcelona.seed.entities.Language;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "languages", path = "languages")
public interface LanguageRepository extends BaseMasterRepository<Language, Long> {
}