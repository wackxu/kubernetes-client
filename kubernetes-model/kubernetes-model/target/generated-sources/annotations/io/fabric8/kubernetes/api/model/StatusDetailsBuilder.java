package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StatusDetailsBuilder extends StatusDetailsFluentImpl<StatusDetailsBuilder> implements VisitableBuilder<StatusDetails,StatusDetailsBuilder>{

    StatusDetailsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StatusDetailsBuilder(){
            this(true);
    }
    public StatusDetailsBuilder(Boolean validationEnabled){
            this(new StatusDetails(), validationEnabled);
    }
    public StatusDetailsBuilder(StatusDetailsFluent<?> fluent){
            this(fluent, true);
    }
    public StatusDetailsBuilder(StatusDetailsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new StatusDetails(), validationEnabled);
    }
    public StatusDetailsBuilder(StatusDetailsFluent<?> fluent,StatusDetails instance){
            this(fluent, instance, true);
    }
    public StatusDetailsBuilder(StatusDetailsFluent<?> fluent,StatusDetails instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCauses(instance.getCauses()); 
            fluent.withGroup(instance.getGroup()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withRetryAfterSeconds(instance.getRetryAfterSeconds()); 
            fluent.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatusDetailsBuilder(StatusDetails instance){
            this(instance,true);
    }
    public StatusDetailsBuilder(StatusDetails instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCauses(instance.getCauses()); 
            this.withGroup(instance.getGroup()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withRetryAfterSeconds(instance.getRetryAfterSeconds()); 
            this.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatusDetailsBuilder(Validator validator){
            this(new StatusDetails(), true);
    }
    public StatusDetailsBuilder(StatusDetailsFluent<?> fluent,StatusDetails instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCauses(instance.getCauses()); 
            fluent.withGroup(instance.getGroup()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withRetryAfterSeconds(instance.getRetryAfterSeconds()); 
            fluent.withUid(instance.getUid()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StatusDetailsBuilder(StatusDetails instance,Validator validator){
            this.fluent = this; 
            this.withCauses(instance.getCauses()); 
            this.withGroup(instance.getGroup()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withRetryAfterSeconds(instance.getRetryAfterSeconds()); 
            this.withUid(instance.getUid()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public StatusDetails build(){
            StatusDetails buildable = new StatusDetails(fluent.getCauses(),fluent.getGroup(),fluent.getKind(),fluent.getName(),fluent.getRetryAfterSeconds(),fluent.getUid());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StatusDetailsBuilder that = (StatusDetailsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
