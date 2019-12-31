package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentCauseImageTriggerBuilder extends DeploymentCauseImageTriggerFluentImpl<DeploymentCauseImageTriggerBuilder> implements VisitableBuilder<DeploymentCauseImageTrigger,DeploymentCauseImageTriggerBuilder>{

    DeploymentCauseImageTriggerFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentCauseImageTriggerBuilder(){
            this(true);
    }
    public DeploymentCauseImageTriggerBuilder(Boolean validationEnabled){
            this(new DeploymentCauseImageTrigger(), validationEnabled);
    }
    public DeploymentCauseImageTriggerBuilder(DeploymentCauseImageTriggerFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentCauseImageTriggerBuilder(DeploymentCauseImageTriggerFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentCauseImageTrigger(), validationEnabled);
    }
    public DeploymentCauseImageTriggerBuilder(DeploymentCauseImageTriggerFluent<?> fluent,DeploymentCauseImageTrigger instance){
            this(fluent, instance, true);
    }
    public DeploymentCauseImageTriggerBuilder(DeploymentCauseImageTriggerFluent<?> fluent,DeploymentCauseImageTrigger instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFrom(instance.getFrom()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentCauseImageTriggerBuilder(DeploymentCauseImageTrigger instance){
            this(instance,true);
    }
    public DeploymentCauseImageTriggerBuilder(DeploymentCauseImageTrigger instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFrom(instance.getFrom()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentCauseImageTriggerBuilder(Validator validator){
            this(new DeploymentCauseImageTrigger(), true);
    }
    public DeploymentCauseImageTriggerBuilder(DeploymentCauseImageTriggerFluent<?> fluent,DeploymentCauseImageTrigger instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFrom(instance.getFrom()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentCauseImageTriggerBuilder(DeploymentCauseImageTrigger instance,Validator validator){
            this.fluent = this; 
            this.withFrom(instance.getFrom()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentCauseImageTrigger build(){
            DeploymentCauseImageTrigger buildable = new DeploymentCauseImageTrigger(fluent.getFrom());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentCauseImageTriggerBuilder that = (DeploymentCauseImageTriggerBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
