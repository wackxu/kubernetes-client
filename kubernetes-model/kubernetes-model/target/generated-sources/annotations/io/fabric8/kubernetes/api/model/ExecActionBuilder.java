package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ExecActionBuilder extends ExecActionFluentImpl<ExecActionBuilder> implements VisitableBuilder<ExecAction,ExecActionBuilder>{

    ExecActionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ExecActionBuilder(){
            this(true);
    }
    public ExecActionBuilder(Boolean validationEnabled){
            this(new ExecAction(), validationEnabled);
    }
    public ExecActionBuilder(ExecActionFluent<?> fluent){
            this(fluent, true);
    }
    public ExecActionBuilder(ExecActionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ExecAction(), validationEnabled);
    }
    public ExecActionBuilder(ExecActionFluent<?> fluent,ExecAction instance){
            this(fluent, instance, true);
    }
    public ExecActionBuilder(ExecActionFluent<?> fluent,ExecAction instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCommand(instance.getCommand()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExecActionBuilder(ExecAction instance){
            this(instance,true);
    }
    public ExecActionBuilder(ExecAction instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCommand(instance.getCommand()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExecActionBuilder(Validator validator){
            this(new ExecAction(), true);
    }
    public ExecActionBuilder(ExecActionFluent<?> fluent,ExecAction instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCommand(instance.getCommand()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ExecActionBuilder(ExecAction instance,Validator validator){
            this.fluent = this; 
            this.withCommand(instance.getCommand()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ExecAction build(){
            ExecAction buildable = new ExecAction(fluent.getCommand());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ExecActionBuilder that = (ExecActionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
