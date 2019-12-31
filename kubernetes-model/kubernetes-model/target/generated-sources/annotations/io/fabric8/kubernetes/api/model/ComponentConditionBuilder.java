package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ComponentConditionBuilder extends ComponentConditionFluentImpl<ComponentConditionBuilder> implements VisitableBuilder<ComponentCondition,ComponentConditionBuilder>{

    ComponentConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ComponentConditionBuilder(){
            this(true);
    }
    public ComponentConditionBuilder(Boolean validationEnabled){
            this(new ComponentCondition(), validationEnabled);
    }
    public ComponentConditionBuilder(ComponentConditionFluent<?> fluent){
            this(fluent, true);
    }
    public ComponentConditionBuilder(ComponentConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ComponentCondition(), validationEnabled);
    }
    public ComponentConditionBuilder(ComponentConditionFluent<?> fluent,ComponentCondition instance){
            this(fluent, instance, true);
    }
    public ComponentConditionBuilder(ComponentConditionFluent<?> fluent,ComponentCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withError(instance.getError()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public ComponentConditionBuilder(ComponentCondition instance){
            this(instance,true);
    }
    public ComponentConditionBuilder(ComponentCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withError(instance.getError()); 
            this.withMessage(instance.getMessage()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public ComponentConditionBuilder(Validator validator){
            this(new ComponentCondition(), true);
    }
    public ComponentConditionBuilder(ComponentConditionFluent<?> fluent,ComponentCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withError(instance.getError()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ComponentConditionBuilder(ComponentCondition instance,Validator validator){
            this.fluent = this; 
            this.withError(instance.getError()); 
            this.withMessage(instance.getMessage()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ComponentCondition build(){
            ComponentCondition buildable = new ComponentCondition(fluent.getError(),fluent.getMessage(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ComponentConditionBuilder that = (ComponentConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
