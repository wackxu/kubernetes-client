package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ExecConfigBuilder extends ExecConfigFluentImpl<ExecConfigBuilder> implements VisitableBuilder<ExecConfig,ExecConfigBuilder>{

    ExecConfigFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ExecConfigBuilder(){
            this(true);
    }
    public ExecConfigBuilder(Boolean validationEnabled){
            this(new ExecConfig(), validationEnabled);
    }
    public ExecConfigBuilder(ExecConfigFluent<?> fluent){
            this(fluent, true);
    }
    public ExecConfigBuilder(ExecConfigFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ExecConfig(), validationEnabled);
    }
    public ExecConfigBuilder(ExecConfigFluent<?> fluent,ExecConfig instance){
            this(fluent, instance, true);
    }
    public ExecConfigBuilder(ExecConfigFluent<?> fluent,ExecConfig instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withArgs(instance.getArgs()); 
            fluent.withCommand(instance.getCommand()); 
            fluent.withEnv(instance.getEnv()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExecConfigBuilder(ExecConfig instance){
            this(instance,true);
    }
    public ExecConfigBuilder(ExecConfig instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withArgs(instance.getArgs()); 
            this.withCommand(instance.getCommand()); 
            this.withEnv(instance.getEnv()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExecConfigBuilder(Validator validator){
            this(new ExecConfig(), true);
    }
    public ExecConfigBuilder(ExecConfigFluent<?> fluent,ExecConfig instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withArgs(instance.getArgs()); 
            fluent.withCommand(instance.getCommand()); 
            fluent.withEnv(instance.getEnv()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ExecConfigBuilder(ExecConfig instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withArgs(instance.getArgs()); 
            this.withCommand(instance.getCommand()); 
            this.withEnv(instance.getEnv()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ExecConfig build(){
            ExecConfig buildable = new ExecConfig(fluent.getApiVersion(),fluent.getArgs(),fluent.getCommand(),fluent.getEnv());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ExecConfigBuilder that = (ExecConfigBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
