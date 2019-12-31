package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomResourceDefinitionConditionBuilder extends CustomResourceDefinitionConditionFluentImpl<CustomResourceDefinitionConditionBuilder> implements VisitableBuilder<CustomResourceDefinitionCondition,CustomResourceDefinitionConditionBuilder>{

    CustomResourceDefinitionConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomResourceDefinitionConditionBuilder(){
            this(true);
    }
    public CustomResourceDefinitionConditionBuilder(Boolean validationEnabled){
            this(new CustomResourceDefinitionCondition(), validationEnabled);
    }
    public CustomResourceDefinitionConditionBuilder(CustomResourceDefinitionConditionFluent<?> fluent){
            this(fluent, true);
    }
    public CustomResourceDefinitionConditionBuilder(CustomResourceDefinitionConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomResourceDefinitionCondition(), validationEnabled);
    }
    public CustomResourceDefinitionConditionBuilder(CustomResourceDefinitionConditionFluent<?> fluent,CustomResourceDefinitionCondition instance){
            this(fluent, instance, true);
    }
    public CustomResourceDefinitionConditionBuilder(CustomResourceDefinitionConditionFluent<?> fluent,CustomResourceDefinitionCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionConditionBuilder(CustomResourceDefinitionCondition instance){
            this(instance,true);
    }
    public CustomResourceDefinitionConditionBuilder(CustomResourceDefinitionCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionConditionBuilder(Validator validator){
            this(new CustomResourceDefinitionCondition(), true);
    }
    public CustomResourceDefinitionConditionBuilder(CustomResourceDefinitionConditionFluent<?> fluent,CustomResourceDefinitionCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomResourceDefinitionConditionBuilder(CustomResourceDefinitionCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomResourceDefinitionCondition build(){
            CustomResourceDefinitionCondition buildable = new CustomResourceDefinitionCondition(fluent.getLastTransitionTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceDefinitionConditionBuilder that = (CustomResourceDefinitionConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
