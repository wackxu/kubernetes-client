package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StatusBuilder extends StatusFluentImpl<StatusBuilder> implements VisitableBuilder<Status,StatusBuilder>{

    StatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StatusBuilder(){
            this(true);
    }
    public StatusBuilder(Boolean validationEnabled){
            this(new Status(), validationEnabled);
    }
    public StatusBuilder(StatusFluent<?> fluent){
            this(fluent, true);
    }
    public StatusBuilder(StatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Status(), validationEnabled);
    }
    public StatusBuilder(StatusFluent<?> fluent,Status instance){
            this(fluent, instance, true);
    }
    public StatusBuilder(StatusFluent<?> fluent,Status instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withCode(instance.getCode()); 
            fluent.withDetails(instance.getDetails()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatusBuilder(Status instance){
            this(instance,true);
    }
    public StatusBuilder(Status instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withCode(instance.getCode()); 
            this.withDetails(instance.getDetails()); 
            this.withKind(instance.getKind()); 
            this.withMessage(instance.getMessage()); 
            this.withMetadata(instance.getMetadata()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatusBuilder(Validator validator){
            this(new Status(), true);
    }
    public StatusBuilder(StatusFluent<?> fluent,Status instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withCode(instance.getCode()); 
            fluent.withDetails(instance.getDetails()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StatusBuilder(Status instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withCode(instance.getCode()); 
            this.withDetails(instance.getDetails()); 
            this.withKind(instance.getKind()); 
            this.withMessage(instance.getMessage()); 
            this.withMetadata(instance.getMetadata()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Status build(){
            Status buildable = new Status(fluent.getApiVersion(),fluent.getCode(),fluent.getDetails(),fluent.getKind(),fluent.getMessage(),fluent.getMetadata(),fluent.getReason(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StatusBuilder that = (StatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
