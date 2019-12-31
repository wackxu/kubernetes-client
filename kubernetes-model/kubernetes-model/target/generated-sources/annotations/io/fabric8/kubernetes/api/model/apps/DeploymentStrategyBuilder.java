package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentStrategyBuilder extends DeploymentStrategyFluentImpl<DeploymentStrategyBuilder> implements VisitableBuilder<DeploymentStrategy,DeploymentStrategyBuilder>{

    DeploymentStrategyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentStrategyBuilder(){
            this(true);
    }
    public DeploymentStrategyBuilder(Boolean validationEnabled){
            this(new DeploymentStrategy(), validationEnabled);
    }
    public DeploymentStrategyBuilder(DeploymentStrategyFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentStrategyBuilder(DeploymentStrategyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentStrategy(), validationEnabled);
    }
    public DeploymentStrategyBuilder(DeploymentStrategyFluent<?> fluent,DeploymentStrategy instance){
            this(fluent, instance, true);
    }
    public DeploymentStrategyBuilder(DeploymentStrategyFluent<?> fluent,DeploymentStrategy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRollingUpdate(instance.getRollingUpdate()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentStrategyBuilder(DeploymentStrategy instance){
            this(instance,true);
    }
    public DeploymentStrategyBuilder(DeploymentStrategy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRollingUpdate(instance.getRollingUpdate()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentStrategyBuilder(Validator validator){
            this(new DeploymentStrategy(), true);
    }
    public DeploymentStrategyBuilder(DeploymentStrategyFluent<?> fluent,DeploymentStrategy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRollingUpdate(instance.getRollingUpdate()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentStrategyBuilder(DeploymentStrategy instance,Validator validator){
            this.fluent = this; 
            this.withRollingUpdate(instance.getRollingUpdate()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentStrategy build(){
            DeploymentStrategy buildable = new DeploymentStrategy(fluent.getRollingUpdate(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentStrategyBuilder that = (DeploymentStrategyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
