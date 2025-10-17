package io.mosip.admin.validator;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class DocTypeCodeValidator implements ConstraintValidator<DocTypeCode, String>  {

    @Autowired
    private List<String> docTypeCodes;


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(docTypeCodes == null){
            /*         Note: An additional validation was getting triggered by doInvoke() method of
             * 		 RepositoryListItemWriter class with documentTypeRepository equal to null
             *               which is not desired. This if clause is being used to escape that additional
             *               validation step.
             */
            return true;
        }

        if(null != value && !value.isEmpty()) {
            return docTypeCodes.contains(value);
        }
        return false;
    }


}