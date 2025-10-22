package io.mosip.admin.validator;

import io.mosip.admin.bulkdataupload.constant.ErrorConstants;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Documented
@Constraint(validatedBy = DocTypeCodeValidator.class)
@Target({ ElementType.FIELD, ElementType.TYPE_USE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface DocTypeCode {

    String message() default ErrorConstants.INVALID_DOC_TYPE_CODE;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
