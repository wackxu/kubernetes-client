package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentTriggerPolicyBuilder extends DeploymentTriggerPolicyFluentImpl<DeploymentTriggerPolicyBuilder> implements VisitableBuilder<DeploymentTriggerPolicy,DeploymentTriggerPolicyBuilder>{

    DeploymentTriggerPolicyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentTriggerPolicyBuilder(){
            this(true);
    }
    public DeploymentTriggerPolicyBuilder(Boolean validationEnabled){
            this(new DeploymentTriggerPolicy(), validationEnabled);
    }
    public DeploymentTriggerPolicyBuilder(DeploymentTriggerPolicyFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentTriggerPolicyBuilder(DeploymentTriggerPolicyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentTriggerPolicy(), validationEnabled);
    }
    public DeploymentTriggerPolicyBuilder(DeploymentTriggerPolicyFluent<?> fluent,DeploymentTriggerPolicy instance){
            this(fluent, instance, true);
    }
    public DeploymentTriggerPolicyBuilder(DeploymentTriggerPolicyFluent<?> fluent,DeploymentTriggerPolicy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withImageChangeParams(instance.getImageChangeParams()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentTriggerPolicyBuilder(DeploymentTriggerPolicy instance){
            this(instance,true);
    }
    public DeploymentTriggerPolicyBuilder(DeploymentTriggerPolicy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withImageChangeParams(instance.getImageChangeParams()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentTriggerPolicyBuilder(Validator validator){
            this(new DeploymentTriggerPolicy(), true);
    }
    public DeploymentTriggerPolicyBuilder(DeploymentTriggerPolicyFluent<?> fluent,DeploymentTriggerPolicy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withImageChangeParams(instance.getImageChangeParams()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentTriggerPolicyBuilder(DeploymentTriggerPolicy instance,Validator validator){
            this.fluent = this; 
            this.withImageChangeParams(instance.getImageChangeParams()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentTriggerPolicy build(){
            DeploymentTriggerPolicy buildable = new DeploymentTriggerPolicy(fluent.getImageChangeParams(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentTriggerPolicyBuilder that = (DeploymentTriggerPolicyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
