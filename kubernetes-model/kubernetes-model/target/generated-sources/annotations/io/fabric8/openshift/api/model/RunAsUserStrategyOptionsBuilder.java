package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RunAsUserStrategyOptionsBuilder extends RunAsUserStrategyOptionsFluentImpl<RunAsUserStrategyOptionsBuilder> implements VisitableBuilder<RunAsUserStrategyOptions,RunAsUserStrategyOptionsBuilder>{

    RunAsUserStrategyOptionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RunAsUserStrategyOptionsBuilder(){
            this(true);
    }
    public RunAsUserStrategyOptionsBuilder(Boolean validationEnabled){
            this(new RunAsUserStrategyOptions(), validationEnabled);
    }
    public RunAsUserStrategyOptionsBuilder(RunAsUserStrategyOptionsFluent<?> fluent){
            this(fluent, true);
    }
    public RunAsUserStrategyOptionsBuilder(RunAsUserStrategyOptionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RunAsUserStrategyOptions(), validationEnabled);
    }
    public RunAsUserStrategyOptionsBuilder(RunAsUserStrategyOptionsFluent<?> fluent,RunAsUserStrategyOptions instance){
            this(fluent, instance, true);
    }
    public RunAsUserStrategyOptionsBuilder(RunAsUserStrategyOptionsFluent<?> fluent,RunAsUserStrategyOptions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withType(instance.getType()); 
            fluent.withUid(instance.getUid()); 
            fluent.withUidRangeMax(instance.getUidRangeMax()); 
            fluent.withUidRangeMin(instance.getUidRangeMin()); 
            this.validationEnabled = validationEnabled; 
    }
    public RunAsUserStrategyOptionsBuilder(RunAsUserStrategyOptions instance){
            this(instance,true);
    }
    public RunAsUserStrategyOptionsBuilder(RunAsUserStrategyOptions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withType(instance.getType()); 
            this.withUid(instance.getUid()); 
            this.withUidRangeMax(instance.getUidRangeMax()); 
            this.withUidRangeMin(instance.getUidRangeMin()); 
            this.validationEnabled = validationEnabled; 
    }
    public RunAsUserStrategyOptionsBuilder(Validator validator){
            this(new RunAsUserStrategyOptions(), true);
    }
    public RunAsUserStrategyOptionsBuilder(RunAsUserStrategyOptionsFluent<?> fluent,RunAsUserStrategyOptions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withType(instance.getType()); 
            fluent.withUid(instance.getUid()); 
            fluent.withUidRangeMax(instance.getUidRangeMax()); 
            fluent.withUidRangeMin(instance.getUidRangeMin()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RunAsUserStrategyOptionsBuilder(RunAsUserStrategyOptions instance,Validator validator){
            this.fluent = this; 
            this.withType(instance.getType()); 
            this.withUid(instance.getUid()); 
            this.withUidRangeMax(instance.getUidRangeMax()); 
            this.withUidRangeMin(instance.getUidRangeMin()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RunAsUserStrategyOptions build(){
            RunAsUserStrategyOptions buildable = new RunAsUserStrategyOptions(fluent.getType(),fluent.getUid(),fluent.getUidRangeMax(),fluent.getUidRangeMin());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RunAsUserStrategyOptionsBuilder that = (RunAsUserStrategyOptionsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
