package com.darksci.kafkaview.repository;

import com.darksci.kafkaview.model.ViewToFilterEnforced;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewToFilterEnforcedRepository extends CrudRepository<ViewToFilterEnforced, Long> {
    List<ViewToFilterEnforced> findByFilterId(final Long filterId);
    List<ViewToFilterEnforced> findByViewId(final Long viewId);
}
