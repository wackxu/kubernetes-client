package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RollingUpdateDeploymentBuilder extends RollingUpdateDeploymentFluentImpl<RollingUpdateDeploymentBuilder> implements VisitableBuilder<RollingUpdateDeployment,RollingUpdateDeploymentBuilder>{

    RollingUpdateDeploymentFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RollingUpdateDeploymentBuilder(){
            this(true);
    }
    public RollingUpdateDeploymentBuilder(Boolean validationEnabled){
            this(new RollingUpdateDeployment(), validationEnabled);
    }
    public RollingUpdateDeploymentBuilder(RollingUpdateDeploymentFluent<?> fluent){
            this(fluent, true);
    }
    public RollingUpdateDeploymentBuilder(RollingUpdateDeploymentFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RollingUpdateDeployment(), validationEnabled);
    }
    public RollingUpdateDeploymentBuilder(RollingUpdateDeploymentFluent<?> fluent,RollingUpdateDeployment instance){
            this(fluent, instance, true);
    }
    public RollingUpdateDeploymentBuilder(RollingUpdateDeploymentFluent<?> fluent,RollingUpdateDeployment instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMaxSurge(instance.getMaxSurge()); 
            fluent.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.validationEnabled = validationEnabled; 
    }
    public RollingUpdateDeploymentBuilder(RollingUpdateDeployment instance){
            this(instance,true);
    }
    public RollingUpdateDeploymentBuilder(RollingUpdateDeployment instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMaxSurge(instance.getMaxSurge()); 
            this.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.validationEnabled = validationEnabled; 
    }
    public RollingUpdateDeploymentBuilder(Validator validator){
            this(new RollingUpdateDeployment(), true);
    }
    public RollingUpdateDeploymentBuilder(RollingUpdateDeploymentFluent<?> fluent,RollingUpdateDeployment instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMaxSurge(instance.getMaxSurge()); 
            fluent.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RollingUpdateDeploymentBuilder(RollingUpdateDeployment instance,Validator validator){
            this.fluent = this; 
            this.withMaxSurge(instance.getMaxSurge()); 
            this.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RollingUpdateDeployment build(){
            RollingUpdateDeployment buildable = new RollingUpdateDeployment(fluent.getMaxSurge(),fluent.getMaxUnavailable());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RollingUpdateDeploymentBuilder that = (RollingUpdateDeploymentBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
