package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RecreateDeploymentStrategyParamsBuilder extends RecreateDeploymentStrategyParamsFluentImpl<RecreateDeploymentStrategyParamsBuilder> implements VisitableBuilder<RecreateDeploymentStrategyParams,RecreateDeploymentStrategyParamsBuilder>{

    RecreateDeploymentStrategyParamsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RecreateDeploymentStrategyParamsBuilder(){
            this(true);
    }
    public RecreateDeploymentStrategyParamsBuilder(Boolean validationEnabled){
            this(new RecreateDeploymentStrategyParams(), validationEnabled);
    }
    public RecreateDeploymentStrategyParamsBuilder(RecreateDeploymentStrategyParamsFluent<?> fluent){
            this(fluent, true);
    }
    public RecreateDeploymentStrategyParamsBuilder(RecreateDeploymentStrategyParamsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RecreateDeploymentStrategyParams(), validationEnabled);
    }
    public RecreateDeploymentStrategyParamsBuilder(RecreateDeploymentStrategyParamsFluent<?> fluent,RecreateDeploymentStrategyParams instance){
            this(fluent, instance, true);
    }
    public RecreateDeploymentStrategyParamsBuilder(RecreateDeploymentStrategyParamsFluent<?> fluent,RecreateDeploymentStrategyParams instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMid(instance.getMid()); 
            fluent.withPost(instance.getPost()); 
            fluent.withPre(instance.getPre()); 
            fluent.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.validationEnabled = validationEnabled; 
    }
    public RecreateDeploymentStrategyParamsBuilder(RecreateDeploymentStrategyParams instance){
            this(instance,true);
    }
    public RecreateDeploymentStrategyParamsBuilder(RecreateDeploymentStrategyParams instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMid(instance.getMid()); 
            this.withPost(instance.getPost()); 
            this.withPre(instance.getPre()); 
            this.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.validationEnabled = validationEnabled; 
    }
    public RecreateDeploymentStrategyParamsBuilder(Validator validator){
            this(new RecreateDeploymentStrategyParams(), true);
    }
    public RecreateDeploymentStrategyParamsBuilder(RecreateDeploymentStrategyParamsFluent<?> fluent,RecreateDeploymentStrategyParams instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMid(instance.getMid()); 
            fluent.withPost(instance.getPost()); 
            fluent.withPre(instance.getPre()); 
            fluent.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RecreateDeploymentStrategyParamsBuilder(RecreateDeploymentStrategyParams instance,Validator validator){
            this.fluent = this; 
            this.withMid(instance.getMid()); 
            this.withPost(instance.getPost()); 
            this.withPre(instance.getPre()); 
            this.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RecreateDeploymentStrategyParams build(){
            RecreateDeploymentStrategyParams buildable = new RecreateDeploymentStrategyParams(fluent.getMid(),fluent.getPost(),fluent.getPre(),fluent.getTimeoutSeconds());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RecreateDeploymentStrategyParamsBuilder that = (RecreateDeploymentStrategyParamsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
