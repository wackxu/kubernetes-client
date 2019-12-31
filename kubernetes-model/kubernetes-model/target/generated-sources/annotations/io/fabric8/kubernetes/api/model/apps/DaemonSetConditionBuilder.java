package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DaemonSetConditionBuilder extends DaemonSetConditionFluentImpl<DaemonSetConditionBuilder> implements VisitableBuilder<DaemonSetCondition,DaemonSetConditionBuilder>{

    DaemonSetConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DaemonSetConditionBuilder(){
            this(true);
    }
    public DaemonSetConditionBuilder(Boolean validationEnabled){
            this(new DaemonSetCondition(), validationEnabled);
    }
    public DaemonSetConditionBuilder(DaemonSetConditionFluent<?> fluent){
            this(fluent, true);
    }
    public DaemonSetConditionBuilder(DaemonSetConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DaemonSetCondition(), validationEnabled);
    }
    public DaemonSetConditionBuilder(DaemonSetConditionFluent<?> fluent,DaemonSetCondition instance){
            this(fluent, instance, true);
    }
    public DaemonSetConditionBuilder(DaemonSetConditionFluent<?> fluent,DaemonSetCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonSetConditionBuilder(DaemonSetCondition instance){
            this(instance,true);
    }
    public DaemonSetConditionBuilder(DaemonSetCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonSetConditionBuilder(Validator validator){
            this(new DaemonSetCondition(), true);
    }
    public DaemonSetConditionBuilder(DaemonSetConditionFluent<?> fluent,DaemonSetCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DaemonSetConditionBuilder(DaemonSetCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DaemonSetCondition build(){
            DaemonSetCondition buildable = new DaemonSetCondition(fluent.getLastTransitionTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DaemonSetConditionBuilder that = (DaemonSetConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
