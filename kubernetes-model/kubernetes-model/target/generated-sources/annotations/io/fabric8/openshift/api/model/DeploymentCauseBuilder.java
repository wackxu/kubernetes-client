package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentCauseBuilder extends DeploymentCauseFluentImpl<DeploymentCauseBuilder> implements VisitableBuilder<DeploymentCause,DeploymentCauseBuilder>{

    DeploymentCauseFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentCauseBuilder(){
            this(true);
    }
    public DeploymentCauseBuilder(Boolean validationEnabled){
            this(new DeploymentCause(), validationEnabled);
    }
    public DeploymentCauseBuilder(DeploymentCauseFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentCauseBuilder(DeploymentCauseFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentCause(), validationEnabled);
    }
    public DeploymentCauseBuilder(DeploymentCauseFluent<?> fluent,DeploymentCause instance){
            this(fluent, instance, true);
    }
    public DeploymentCauseBuilder(DeploymentCauseFluent<?> fluent,DeploymentCause instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withImageTrigger(instance.getImageTrigger()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentCauseBuilder(DeploymentCause instance){
            this(instance,true);
    }
    public DeploymentCauseBuilder(DeploymentCause instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withImageTrigger(instance.getImageTrigger()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentCauseBuilder(Validator validator){
            this(new DeploymentCause(), true);
    }
    public DeploymentCauseBuilder(DeploymentCauseFluent<?> fluent,DeploymentCause instance,Validator validator){
            this.fluent = fluent; 
            fluent.withImageTrigger(instance.getImageTrigger()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentCauseBuilder(DeploymentCause instance,Validator validator){
            this.fluent = this; 
            this.withImageTrigger(instance.getImageTrigger()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentCause build(){
            DeploymentCause buildable = new DeploymentCause(fluent.getImageTrigger(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentCauseBuilder that = (DeploymentCauseBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
