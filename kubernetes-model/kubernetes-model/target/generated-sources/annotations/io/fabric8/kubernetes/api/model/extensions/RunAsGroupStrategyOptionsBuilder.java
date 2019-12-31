package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RunAsGroupStrategyOptionsBuilder extends RunAsGroupStrategyOptionsFluentImpl<RunAsGroupStrategyOptionsBuilder> implements VisitableBuilder<RunAsGroupStrategyOptions,RunAsGroupStrategyOptionsBuilder>{

    RunAsGroupStrategyOptionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RunAsGroupStrategyOptionsBuilder(){
            this(true);
    }
    public RunAsGroupStrategyOptionsBuilder(Boolean validationEnabled){
            this(new RunAsGroupStrategyOptions(), validationEnabled);
    }
    public RunAsGroupStrategyOptionsBuilder(RunAsGroupStrategyOptionsFluent<?> fluent){
            this(fluent, true);
    }
    public RunAsGroupStrategyOptionsBuilder(RunAsGroupStrategyOptionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RunAsGroupStrategyOptions(), validationEnabled);
    }
    public RunAsGroupStrategyOptionsBuilder(RunAsGroupStrategyOptionsFluent<?> fluent,RunAsGroupStrategyOptions instance){
            this(fluent, instance, true);
    }
    public RunAsGroupStrategyOptionsBuilder(RunAsGroupStrategyOptionsFluent<?> fluent,RunAsGroupStrategyOptions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRanges(instance.getRanges()); 
            fluent.withRule(instance.getRule()); 
            this.validationEnabled = validationEnabled; 
    }
    public RunAsGroupStrategyOptionsBuilder(RunAsGroupStrategyOptions instance){
            this(instance,true);
    }
    public RunAsGroupStrategyOptionsBuilder(RunAsGroupStrategyOptions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRanges(instance.getRanges()); 
            this.withRule(instance.getRule()); 
            this.validationEnabled = validationEnabled; 
    }
    public RunAsGroupStrategyOptionsBuilder(Validator validator){
            this(new RunAsGroupStrategyOptions(), true);
    }
    public RunAsGroupStrategyOptionsBuilder(RunAsGroupStrategyOptionsFluent<?> fluent,RunAsGroupStrategyOptions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRanges(instance.getRanges()); 
            fluent.withRule(instance.getRule()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RunAsGroupStrategyOptionsBuilder(RunAsGroupStrategyOptions instance,Validator validator){
            this.fluent = this; 
            this.withRanges(instance.getRanges()); 
            this.withRule(instance.getRule()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RunAsGroupStrategyOptions build(){
            RunAsGroupStrategyOptions buildable = new RunAsGroupStrategyOptions(fluent.getRanges(),fluent.getRule());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RunAsGroupStrategyOptionsBuilder that = (RunAsGroupStrategyOptionsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
