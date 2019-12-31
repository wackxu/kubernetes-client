package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ReplicaSetConditionBuilder extends ReplicaSetConditionFluentImpl<ReplicaSetConditionBuilder> implements VisitableBuilder<ReplicaSetCondition,ReplicaSetConditionBuilder>{

    ReplicaSetConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ReplicaSetConditionBuilder(){
            this(true);
    }
    public ReplicaSetConditionBuilder(Boolean validationEnabled){
            this(new ReplicaSetCondition(), validationEnabled);
    }
    public ReplicaSetConditionBuilder(ReplicaSetConditionFluent<?> fluent){
            this(fluent, true);
    }
    public ReplicaSetConditionBuilder(ReplicaSetConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ReplicaSetCondition(), validationEnabled);
    }
    public ReplicaSetConditionBuilder(ReplicaSetConditionFluent<?> fluent,ReplicaSetCondition instance){
            this(fluent, instance, true);
    }
    public ReplicaSetConditionBuilder(ReplicaSetConditionFluent<?> fluent,ReplicaSetCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicaSetConditionBuilder(ReplicaSetCondition instance){
            this(instance,true);
    }
    public ReplicaSetConditionBuilder(ReplicaSetCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicaSetConditionBuilder(Validator validator){
            this(new ReplicaSetCondition(), true);
    }
    public ReplicaSetConditionBuilder(ReplicaSetConditionFluent<?> fluent,ReplicaSetCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ReplicaSetConditionBuilder(ReplicaSetCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ReplicaSetCondition build(){
            ReplicaSetCondition buildable = new ReplicaSetCondition(fluent.getLastTransitionTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ReplicaSetConditionBuilder that = (ReplicaSetConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
