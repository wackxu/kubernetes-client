package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ReplicationControllerConditionBuilder extends ReplicationControllerConditionFluentImpl<ReplicationControllerConditionBuilder> implements VisitableBuilder<ReplicationControllerCondition,ReplicationControllerConditionBuilder>{

    ReplicationControllerConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ReplicationControllerConditionBuilder(){
            this(true);
    }
    public ReplicationControllerConditionBuilder(Boolean validationEnabled){
            this(new ReplicationControllerCondition(), validationEnabled);
    }
    public ReplicationControllerConditionBuilder(ReplicationControllerConditionFluent<?> fluent){
            this(fluent, true);
    }
    public ReplicationControllerConditionBuilder(ReplicationControllerConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ReplicationControllerCondition(), validationEnabled);
    }
    public ReplicationControllerConditionBuilder(ReplicationControllerConditionFluent<?> fluent,ReplicationControllerCondition instance){
            this(fluent, instance, true);
    }
    public ReplicationControllerConditionBuilder(ReplicationControllerConditionFluent<?> fluent,ReplicationControllerCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicationControllerConditionBuilder(ReplicationControllerCondition instance){
            this(instance,true);
    }
    public ReplicationControllerConditionBuilder(ReplicationControllerCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicationControllerConditionBuilder(Validator validator){
            this(new ReplicationControllerCondition(), true);
    }
    public ReplicationControllerConditionBuilder(ReplicationControllerConditionFluent<?> fluent,ReplicationControllerCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ReplicationControllerConditionBuilder(ReplicationControllerCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ReplicationControllerCondition build(){
            ReplicationControllerCondition buildable = new ReplicationControllerCondition(fluent.getLastTransitionTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ReplicationControllerConditionBuilder that = (ReplicationControllerConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
