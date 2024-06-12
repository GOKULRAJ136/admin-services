package io.mosip.kernel.masterdata.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 
 * @author Ramadurai Pandian
 * @since 1.0.0
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationPutResponseDto {

	private String code;

	private String name;

	private short hierarchyLevel;

	private String hierarchyName;

	private String parentLocCode;

	private String langCode;

	private Boolean isActive;

	private String createdBy;

	private LocalDateTime createdDateTime;

	private String updatedBy;

	private LocalDateTime updatedDateTime;

	private Boolean isDeleted;

	private LocalDateTime deletedDateTime;

}
