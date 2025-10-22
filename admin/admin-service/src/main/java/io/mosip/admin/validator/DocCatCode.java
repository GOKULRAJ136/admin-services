package io.mosip.admin.validator;

import io.mosip.admin.bulkdataupload.constant.ErrorConstants;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DocCatCodeValidator.class)
@Target({ ElementType.FIELD, ElementType.TYPE_USE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface DocCatCode {

    String message() default ErrorConstants.INVALID_DOC_CAT_CODE;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
