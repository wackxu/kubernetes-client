package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SignatureConditionBuilder extends SignatureConditionFluentImpl<SignatureConditionBuilder> implements VisitableBuilder<SignatureCondition,SignatureConditionBuilder>{

    SignatureConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SignatureConditionBuilder(){
            this(true);
    }
    public SignatureConditionBuilder(Boolean validationEnabled){
            this(new SignatureCondition(), validationEnabled);
    }
    public SignatureConditionBuilder(SignatureConditionFluent<?> fluent){
            this(fluent, true);
    }
    public SignatureConditionBuilder(SignatureConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SignatureCondition(), validationEnabled);
    }
    public SignatureConditionBuilder(SignatureConditionFluent<?> fluent,SignatureCondition instance){
            this(fluent, instance, true);
    }
    public SignatureConditionBuilder(SignatureConditionFluent<?> fluent,SignatureCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastProbeTime(instance.getLastProbeTime()); 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public SignatureConditionBuilder(SignatureCondition instance){
            this(instance,true);
    }
    public SignatureConditionBuilder(SignatureCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastProbeTime(instance.getLastProbeTime()); 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public SignatureConditionBuilder(Validator validator){
            this(new SignatureCondition(), true);
    }
    public SignatureConditionBuilder(SignatureConditionFluent<?> fluent,SignatureCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastProbeTime(instance.getLastProbeTime()); 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SignatureConditionBuilder(SignatureCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastProbeTime(instance.getLastProbeTime()); 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SignatureCondition build(){
            SignatureCondition buildable = new SignatureCondition(fluent.getLastProbeTime(),fluent.getLastTransitionTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SignatureConditionBuilder that = (SignatureConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
