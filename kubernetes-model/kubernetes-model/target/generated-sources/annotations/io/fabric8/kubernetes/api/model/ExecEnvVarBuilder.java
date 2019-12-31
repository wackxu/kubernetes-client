package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ExecEnvVarBuilder extends ExecEnvVarFluentImpl<ExecEnvVarBuilder> implements VisitableBuilder<ExecEnvVar,ExecEnvVarBuilder>{

    ExecEnvVarFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ExecEnvVarBuilder(){
            this(true);
    }
    public ExecEnvVarBuilder(Boolean validationEnabled){
            this(new ExecEnvVar(), validationEnabled);
    }
    public ExecEnvVarBuilder(ExecEnvVarFluent<?> fluent){
            this(fluent, true);
    }
    public ExecEnvVarBuilder(ExecEnvVarFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ExecEnvVar(), validationEnabled);
    }
    public ExecEnvVarBuilder(ExecEnvVarFluent<?> fluent,ExecEnvVar instance){
            this(fluent, instance, true);
    }
    public ExecEnvVarBuilder(ExecEnvVarFluent<?> fluent,ExecEnvVar instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExecEnvVarBuilder(ExecEnvVar instance){
            this(instance,true);
    }
    public ExecEnvVarBuilder(ExecEnvVar instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExecEnvVarBuilder(Validator validator){
            this(new ExecEnvVar(), true);
    }
    public ExecEnvVarBuilder(ExecEnvVarFluent<?> fluent,ExecEnvVar instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withValue(instance.getValue()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ExecEnvVarBuilder(ExecEnvVar instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ExecEnvVar build(){
            ExecEnvVar buildable = new ExecEnvVar(fluent.getName(),fluent.getValue());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ExecEnvVarBuilder that = (ExecEnvVarBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
