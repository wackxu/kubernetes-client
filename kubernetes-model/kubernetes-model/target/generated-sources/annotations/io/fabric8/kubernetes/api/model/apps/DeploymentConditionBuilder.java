package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentConditionBuilder extends DeploymentConditionFluentImpl<DeploymentConditionBuilder> implements VisitableBuilder<DeploymentCondition,DeploymentConditionBuilder>{

    DeploymentConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentConditionBuilder(){
            this(true);
    }
    public DeploymentConditionBuilder(Boolean validationEnabled){
            this(new DeploymentCondition(), validationEnabled);
    }
    public DeploymentConditionBuilder(DeploymentConditionFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentConditionBuilder(DeploymentConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentCondition(), validationEnabled);
    }
    public DeploymentConditionBuilder(DeploymentConditionFluent<?> fluent,DeploymentCondition instance){
            this(fluent, instance, true);
    }
    public DeploymentConditionBuilder(DeploymentConditionFluent<?> fluent,DeploymentCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withLastUpdateTime(instance.getLastUpdateTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentConditionBuilder(DeploymentCondition instance){
            this(instance,true);
    }
    public DeploymentConditionBuilder(DeploymentCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withLastUpdateTime(instance.getLastUpdateTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentConditionBuilder(Validator validator){
            this(new DeploymentCondition(), true);
    }
    public DeploymentConditionBuilder(DeploymentConditionFluent<?> fluent,DeploymentCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withLastUpdateTime(instance.getLastUpdateTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentConditionBuilder(DeploymentCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withLastUpdateTime(instance.getLastUpdateTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentCondition build(){
            DeploymentCondition buildable = new DeploymentCondition(fluent.getLastTransitionTime(),fluent.getLastUpdateTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentConditionBuilder that = (DeploymentConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
