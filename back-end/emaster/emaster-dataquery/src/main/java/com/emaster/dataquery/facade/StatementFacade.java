package com.emaster.dataquery.facade;

import java.util.Optional;

import com.emaster.common.dto.PageDto;
import com.emaster.common.dto.StatementDto;
import com.emaster.common.exception.DataQueryException;

public interface StatementFacade {
	StatementDto create(StatementDto StatementDto) throws DataQueryException;

	PageDto<StatementDto> findAll(Optional<Integer> page, Optional<Integer> size) throws DataQueryException;

	StatementDto update(StatementDto StatementDto) throws DataQueryException;

	StatementDto findOne(String id);

	void delete(String id);
}
