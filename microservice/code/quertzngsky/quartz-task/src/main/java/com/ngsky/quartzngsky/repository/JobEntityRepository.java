package com.ngsky.quartzngsky.repository;

import com.ngsky.quartzngsky.code.JobEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * <dl>
 * <dt>JobEntityRepository</dt>
 * <dd>Description:</dd>
 * <dd>CreateDate: 12/13/2018 8:19 AM</dd>
 * </dl>
 *
 * @author daxiong
 */
public interface JobEntityRepository extends CrudRepository<JobEntity, Long> {
    JobEntity getById(Long id);
}
