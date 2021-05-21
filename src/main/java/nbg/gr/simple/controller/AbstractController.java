package nbg.gr.simple.controller;


import nbg.gr.simple.base.AbstractLogEntity;
import nbg.gr.simple.domain.BaseEntity;
import nbg.gr.simple.service.BaseService;
import nbg.gr.simple.transfer.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public abstract class AbstractController<T extends BaseEntity> extends AbstractLogEntity {
	protected abstract BaseService<T, Long> getBaseService();

	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse<T>> findById(@PathVariable("id") final Long id) {
		return ResponseEntity.ok(ApiResponse.<T>builder().data(getBaseService().findById(id)).build());
	}

	@GetMapping
	public ResponseEntity<ApiResponse<List<T>>> findAll() {
		return ResponseEntity.ok(ApiResponse.<List<T>>builder().data(getBaseService().findAll()).build());
	}
/*
	@PostMapping
	public ResponseEntity<ApiResponse<T>> create(@Valid @RequestBody final T entity) {
		return new ResponseEntity<>(ApiResponse.<T>builder().data(getBaseService().save(entity)).build(),
									getNoCacheHeaders(), HttpStatus.CREATED);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@Valid @RequestBody final T entity) {
		getBaseService().update(entity);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") final Long id) {
		getBaseService().deleteById(id);
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@Valid @RequestBody final T entity) {
		if (getBaseService().exists(entity)) {
			getBaseService().delete(entity);
		}
	}

	protected HttpHeaders getNoCacheHeaders() {
		final HttpHeaders headers = new HttpHeaders();
		headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
		headers.add("Pragma", "no-cache");
		headers.add("Expires", "0");
		return headers;
	}

	protected HttpHeaders getDownloadHeaders(final String filename) {
		final HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=" + filename);
		return headers;
	}
	*/
}
