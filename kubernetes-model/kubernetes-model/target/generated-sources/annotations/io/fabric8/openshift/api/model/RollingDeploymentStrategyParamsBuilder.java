package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RollingDeploymentStrategyParamsBuilder extends RollingDeploymentStrategyParamsFluentImpl<RollingDeploymentStrategyParamsBuilder> implements VisitableBuilder<RollingDeploymentStrategyParams,RollingDeploymentStrategyParamsBuilder>{

    RollingDeploymentStrategyParamsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RollingDeploymentStrategyParamsBuilder(){
            this(true);
    }
    public RollingDeploymentStrategyParamsBuilder(Boolean validationEnabled){
            this(new RollingDeploymentStrategyParams(), validationEnabled);
    }
    public RollingDeploymentStrategyParamsBuilder(RollingDeploymentStrategyParamsFluent<?> fluent){
            this(fluent, true);
    }
    public RollingDeploymentStrategyParamsBuilder(RollingDeploymentStrategyParamsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RollingDeploymentStrategyParams(), validationEnabled);
    }
    public RollingDeploymentStrategyParamsBuilder(RollingDeploymentStrategyParamsFluent<?> fluent,RollingDeploymentStrategyParams instance){
            this(fluent, instance, true);
    }
    public RollingDeploymentStrategyParamsBuilder(RollingDeploymentStrategyParamsFluent<?> fluent,RollingDeploymentStrategyParams instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withIntervalSeconds(instance.getIntervalSeconds()); 
            fluent.withMaxSurge(instance.getMaxSurge()); 
            fluent.withMaxUnavailable(instance.getMaxUnavailable()); 
            fluent.withPost(instance.getPost()); 
            fluent.withPre(instance.getPre()); 
            fluent.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            fluent.withUpdatePeriodSeconds(instance.getUpdatePeriodSeconds()); 
            this.validationEnabled = validationEnabled; 
    }
    public RollingDeploymentStrategyParamsBuilder(RollingDeploymentStrategyParams instance){
            this(instance,true);
    }
    public RollingDeploymentStrategyParamsBuilder(RollingDeploymentStrategyParams instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withIntervalSeconds(instance.getIntervalSeconds()); 
            this.withMaxSurge(instance.getMaxSurge()); 
            this.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.withPost(instance.getPost()); 
            this.withPre(instance.getPre()); 
            this.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.withUpdatePeriodSeconds(instance.getUpdatePeriodSeconds()); 
            this.validationEnabled = validationEnabled; 
    }
    public RollingDeploymentStrategyParamsBuilder(Validator validator){
            this(new RollingDeploymentStrategyParams(), true);
    }
    public RollingDeploymentStrategyParamsBuilder(RollingDeploymentStrategyParamsFluent<?> fluent,RollingDeploymentStrategyParams instance,Validator validator){
            this.fluent = fluent; 
            fluent.withIntervalSeconds(instance.getIntervalSeconds()); 
            fluent.withMaxSurge(instance.getMaxSurge()); 
            fluent.withMaxUnavailable(instance.getMaxUnavailable()); 
            fluent.withPost(instance.getPost()); 
            fluent.withPre(instance.getPre()); 
            fluent.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            fluent.withUpdatePeriodSeconds(instance.getUpdatePeriodSeconds()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RollingDeploymentStrategyParamsBuilder(RollingDeploymentStrategyParams instance,Validator validator){
            this.fluent = this; 
            this.withIntervalSeconds(instance.getIntervalSeconds()); 
            this.withMaxSurge(instance.getMaxSurge()); 
            this.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.withPost(instance.getPost()); 
            this.withPre(instance.getPre()); 
            this.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.withUpdatePeriodSeconds(instance.getUpdatePeriodSeconds()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RollingDeploymentStrategyParams build(){
            RollingDeploymentStrategyParams buildable = new RollingDeploymentStrategyParams(fluent.getIntervalSeconds(),fluent.getMaxSurge(),fluent.getMaxUnavailable(),fluent.getPost(),fluent.getPre(),fluent.getTimeoutSeconds(),fluent.getUpdatePeriodSeconds());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RollingDeploymentStrategyParamsBuilder that = (RollingDeploymentStrategyParamsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
