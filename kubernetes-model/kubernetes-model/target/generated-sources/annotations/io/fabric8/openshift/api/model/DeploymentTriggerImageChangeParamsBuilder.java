package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentTriggerImageChangeParamsBuilder extends DeploymentTriggerImageChangeParamsFluentImpl<DeploymentTriggerImageChangeParamsBuilder> implements VisitableBuilder<DeploymentTriggerImageChangeParams,DeploymentTriggerImageChangeParamsBuilder>{

    DeploymentTriggerImageChangeParamsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentTriggerImageChangeParamsBuilder(){
            this(true);
    }
    public DeploymentTriggerImageChangeParamsBuilder(Boolean validationEnabled){
            this(new DeploymentTriggerImageChangeParams(), validationEnabled);
    }
    public DeploymentTriggerImageChangeParamsBuilder(DeploymentTriggerImageChangeParamsFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentTriggerImageChangeParamsBuilder(DeploymentTriggerImageChangeParamsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentTriggerImageChangeParams(), validationEnabled);
    }
    public DeploymentTriggerImageChangeParamsBuilder(DeploymentTriggerImageChangeParamsFluent<?> fluent,DeploymentTriggerImageChangeParams instance){
            this(fluent, instance, true);
    }
    public DeploymentTriggerImageChangeParamsBuilder(DeploymentTriggerImageChangeParamsFluent<?> fluent,DeploymentTriggerImageChangeParams instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAutomatic(instance.getAutomatic()); 
            fluent.withContainerNames(instance.getContainerNames()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withLastTriggeredImage(instance.getLastTriggeredImage()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentTriggerImageChangeParamsBuilder(DeploymentTriggerImageChangeParams instance){
            this(instance,true);
    }
    public DeploymentTriggerImageChangeParamsBuilder(DeploymentTriggerImageChangeParams instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAutomatic(instance.getAutomatic()); 
            this.withContainerNames(instance.getContainerNames()); 
            this.withFrom(instance.getFrom()); 
            this.withLastTriggeredImage(instance.getLastTriggeredImage()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentTriggerImageChangeParamsBuilder(Validator validator){
            this(new DeploymentTriggerImageChangeParams(), true);
    }
    public DeploymentTriggerImageChangeParamsBuilder(DeploymentTriggerImageChangeParamsFluent<?> fluent,DeploymentTriggerImageChangeParams instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAutomatic(instance.getAutomatic()); 
            fluent.withContainerNames(instance.getContainerNames()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withLastTriggeredImage(instance.getLastTriggeredImage()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentTriggerImageChangeParamsBuilder(DeploymentTriggerImageChangeParams instance,Validator validator){
            this.fluent = this; 
            this.withAutomatic(instance.getAutomatic()); 
            this.withContainerNames(instance.getContainerNames()); 
            this.withFrom(instance.getFrom()); 
            this.withLastTriggeredImage(instance.getLastTriggeredImage()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentTriggerImageChangeParams build(){
            DeploymentTriggerImageChangeParams buildable = new DeploymentTriggerImageChangeParams(fluent.isAutomatic(),fluent.getContainerNames(),fluent.getFrom(),fluent.getLastTriggeredImage());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentTriggerImageChangeParamsBuilder that = (DeploymentTriggerImageChangeParamsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
