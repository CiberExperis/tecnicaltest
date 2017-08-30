package com.firabarcelona.seed.repositories;

import com.firabarcelona.seed.entities.BlaBla;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "blablas", path = "blablas")
public interface BlaBlaRepository extends PagingAndSortingRepository<BlaBla, Long> {
}