package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentDetailsBuilder extends DeploymentDetailsFluentImpl<DeploymentDetailsBuilder> implements VisitableBuilder<DeploymentDetails,DeploymentDetailsBuilder>{

    DeploymentDetailsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentDetailsBuilder(){
            this(true);
    }
    public DeploymentDetailsBuilder(Boolean validationEnabled){
            this(new DeploymentDetails(), validationEnabled);
    }
    public DeploymentDetailsBuilder(DeploymentDetailsFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentDetailsBuilder(DeploymentDetailsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentDetails(), validationEnabled);
    }
    public DeploymentDetailsBuilder(DeploymentDetailsFluent<?> fluent,DeploymentDetails instance){
            this(fluent, instance, true);
    }
    public DeploymentDetailsBuilder(DeploymentDetailsFluent<?> fluent,DeploymentDetails instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCauses(instance.getCauses()); 
            fluent.withMessage(instance.getMessage()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentDetailsBuilder(DeploymentDetails instance){
            this(instance,true);
    }
    public DeploymentDetailsBuilder(DeploymentDetails instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCauses(instance.getCauses()); 
            this.withMessage(instance.getMessage()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentDetailsBuilder(Validator validator){
            this(new DeploymentDetails(), true);
    }
    public DeploymentDetailsBuilder(DeploymentDetailsFluent<?> fluent,DeploymentDetails instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCauses(instance.getCauses()); 
            fluent.withMessage(instance.getMessage()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentDetailsBuilder(DeploymentDetails instance,Validator validator){
            this.fluent = this; 
            this.withCauses(instance.getCauses()); 
            this.withMessage(instance.getMessage()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentDetails build(){
            DeploymentDetails buildable = new DeploymentDetails(fluent.getCauses(),fluent.getMessage());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentDetailsBuilder that = (DeploymentDetailsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
