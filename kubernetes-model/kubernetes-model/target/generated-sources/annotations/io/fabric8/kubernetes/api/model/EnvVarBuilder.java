package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EnvVarBuilder extends EnvVarFluentImpl<EnvVarBuilder> implements VisitableBuilder<EnvVar,EnvVarBuilder>{

    EnvVarFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EnvVarBuilder(){
            this(true);
    }
    public EnvVarBuilder(Boolean validationEnabled){
            this(new EnvVar(), validationEnabled);
    }
    public EnvVarBuilder(EnvVarFluent<?> fluent){
            this(fluent, true);
    }
    public EnvVarBuilder(EnvVarFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new EnvVar(), validationEnabled);
    }
    public EnvVarBuilder(EnvVarFluent<?> fluent,EnvVar instance){
            this(fluent, instance, true);
    }
    public EnvVarBuilder(EnvVarFluent<?> fluent,EnvVar instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withValue(instance.getValue()); 
            fluent.withValueFrom(instance.getValueFrom()); 
            this.validationEnabled = validationEnabled; 
    }
    public EnvVarBuilder(EnvVar instance){
            this(instance,true);
    }
    public EnvVarBuilder(EnvVar instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
            this.withValueFrom(instance.getValueFrom()); 
            this.validationEnabled = validationEnabled; 
    }
    public EnvVarBuilder(Validator validator){
            this(new EnvVar(), true);
    }
    public EnvVarBuilder(EnvVarFluent<?> fluent,EnvVar instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withValue(instance.getValue()); 
            fluent.withValueFrom(instance.getValueFrom()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EnvVarBuilder(EnvVar instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
            this.withValueFrom(instance.getValueFrom()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public EnvVar build(){
            EnvVar buildable = new EnvVar(fluent.getName(),fluent.getValue(),fluent.getValueFrom());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EnvVarBuilder that = (EnvVarBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
