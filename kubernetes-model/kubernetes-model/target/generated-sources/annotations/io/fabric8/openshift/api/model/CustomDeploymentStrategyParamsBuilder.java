package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomDeploymentStrategyParamsBuilder extends CustomDeploymentStrategyParamsFluentImpl<CustomDeploymentStrategyParamsBuilder> implements VisitableBuilder<CustomDeploymentStrategyParams,CustomDeploymentStrategyParamsBuilder>{

    CustomDeploymentStrategyParamsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomDeploymentStrategyParamsBuilder(){
            this(true);
    }
    public CustomDeploymentStrategyParamsBuilder(Boolean validationEnabled){
            this(new CustomDeploymentStrategyParams(), validationEnabled);
    }
    public CustomDeploymentStrategyParamsBuilder(CustomDeploymentStrategyParamsFluent<?> fluent){
            this(fluent, true);
    }
    public CustomDeploymentStrategyParamsBuilder(CustomDeploymentStrategyParamsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomDeploymentStrategyParams(), validationEnabled);
    }
    public CustomDeploymentStrategyParamsBuilder(CustomDeploymentStrategyParamsFluent<?> fluent,CustomDeploymentStrategyParams instance){
            this(fluent, instance, true);
    }
    public CustomDeploymentStrategyParamsBuilder(CustomDeploymentStrategyParamsFluent<?> fluent,CustomDeploymentStrategyParams instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCommand(instance.getCommand()); 
            fluent.withEnvironment(instance.getEnvironment()); 
            fluent.withImage(instance.getImage()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomDeploymentStrategyParamsBuilder(CustomDeploymentStrategyParams instance){
            this(instance,true);
    }
    public CustomDeploymentStrategyParamsBuilder(CustomDeploymentStrategyParams instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCommand(instance.getCommand()); 
            this.withEnvironment(instance.getEnvironment()); 
            this.withImage(instance.getImage()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomDeploymentStrategyParamsBuilder(Validator validator){
            this(new CustomDeploymentStrategyParams(), true);
    }
    public CustomDeploymentStrategyParamsBuilder(CustomDeploymentStrategyParamsFluent<?> fluent,CustomDeploymentStrategyParams instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCommand(instance.getCommand()); 
            fluent.withEnvironment(instance.getEnvironment()); 
            fluent.withImage(instance.getImage()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomDeploymentStrategyParamsBuilder(CustomDeploymentStrategyParams instance,Validator validator){
            this.fluent = this; 
            this.withCommand(instance.getCommand()); 
            this.withEnvironment(instance.getEnvironment()); 
            this.withImage(instance.getImage()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomDeploymentStrategyParams build(){
            CustomDeploymentStrategyParams buildable = new CustomDeploymentStrategyParams(fluent.getCommand(),fluent.getEnvironment(),fluent.getImage());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomDeploymentStrategyParamsBuilder that = (CustomDeploymentStrategyParamsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
