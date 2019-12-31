package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StepInfoBuilder extends StepInfoFluentImpl<StepInfoBuilder> implements VisitableBuilder<StepInfo,StepInfoBuilder>{

    StepInfoFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StepInfoBuilder(){
            this(true);
    }
    public StepInfoBuilder(Boolean validationEnabled){
            this(new StepInfo(), validationEnabled);
    }
    public StepInfoBuilder(StepInfoFluent<?> fluent){
            this(fluent, true);
    }
    public StepInfoBuilder(StepInfoFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new StepInfo(), validationEnabled);
    }
    public StepInfoBuilder(StepInfoFluent<?> fluent,StepInfo instance){
            this(fluent, instance, true);
    }
    public StepInfoBuilder(StepInfoFluent<?> fluent,StepInfo instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDurationMilliseconds(instance.getDurationMilliseconds()); 
            fluent.withName(instance.getName()); 
            fluent.withStartTime(instance.getStartTime()); 
            this.validationEnabled = validationEnabled; 
    }
    public StepInfoBuilder(StepInfo instance){
            this(instance,true);
    }
    public StepInfoBuilder(StepInfo instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDurationMilliseconds(instance.getDurationMilliseconds()); 
            this.withName(instance.getName()); 
            this.withStartTime(instance.getStartTime()); 
            this.validationEnabled = validationEnabled; 
    }
    public StepInfoBuilder(Validator validator){
            this(new StepInfo(), true);
    }
    public StepInfoBuilder(StepInfoFluent<?> fluent,StepInfo instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDurationMilliseconds(instance.getDurationMilliseconds()); 
            fluent.withName(instance.getName()); 
            fluent.withStartTime(instance.getStartTime()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StepInfoBuilder(StepInfo instance,Validator validator){
            this.fluent = this; 
            this.withDurationMilliseconds(instance.getDurationMilliseconds()); 
            this.withName(instance.getName()); 
            this.withStartTime(instance.getStartTime()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public StepInfo build(){
            StepInfo buildable = new StepInfo(fluent.getDurationMilliseconds(),fluent.getName(),fluent.getStartTime());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StepInfoBuilder that = (StepInfoBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
