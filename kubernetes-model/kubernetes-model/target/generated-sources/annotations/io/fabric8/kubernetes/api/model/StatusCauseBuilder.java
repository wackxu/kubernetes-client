package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StatusCauseBuilder extends StatusCauseFluentImpl<StatusCauseBuilder> implements VisitableBuilder<StatusCause,StatusCauseBuilder>{

    StatusCauseFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StatusCauseBuilder(){
            this(true);
    }
    public StatusCauseBuilder(Boolean validationEnabled){
            this(new StatusCause(), validationEnabled);
    }
    public StatusCauseBuilder(StatusCauseFluent<?> fluent){
            this(fluent, true);
    }
    public StatusCauseBuilder(StatusCauseFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new StatusCause(), validationEnabled);
    }
    public StatusCauseBuilder(StatusCauseFluent<?> fluent,StatusCause instance){
            this(fluent, instance, true);
    }
    public StatusCauseBuilder(StatusCauseFluent<?> fluent,StatusCause instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withField(instance.getField()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatusCauseBuilder(StatusCause instance){
            this(instance,true);
    }
    public StatusCauseBuilder(StatusCause instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withField(instance.getField()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatusCauseBuilder(Validator validator){
            this(new StatusCause(), true);
    }
    public StatusCauseBuilder(StatusCauseFluent<?> fluent,StatusCause instance,Validator validator){
            this.fluent = fluent; 
            fluent.withField(instance.getField()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StatusCauseBuilder(StatusCause instance,Validator validator){
            this.fluent = this; 
            this.withField(instance.getField()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public StatusCause build(){
            StatusCause buildable = new StatusCause(fluent.getField(),fluent.getMessage(),fluent.getReason());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StatusCauseBuilder that = (StatusCauseBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
