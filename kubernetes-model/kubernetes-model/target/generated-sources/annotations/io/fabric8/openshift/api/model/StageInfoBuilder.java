package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StageInfoBuilder extends StageInfoFluentImpl<StageInfoBuilder> implements VisitableBuilder<StageInfo,StageInfoBuilder>{

    StageInfoFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StageInfoBuilder(){
            this(true);
    }
    public StageInfoBuilder(Boolean validationEnabled){
            this(new StageInfo(), validationEnabled);
    }
    public StageInfoBuilder(StageInfoFluent<?> fluent){
            this(fluent, true);
    }
    public StageInfoBuilder(StageInfoFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new StageInfo(), validationEnabled);
    }
    public StageInfoBuilder(StageInfoFluent<?> fluent,StageInfo instance){
            this(fluent, instance, true);
    }
    public StageInfoBuilder(StageInfoFluent<?> fluent,StageInfo instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDurationMilliseconds(instance.getDurationMilliseconds()); 
            fluent.withName(instance.getName()); 
            fluent.withStartTime(instance.getStartTime()); 
            fluent.withSteps(instance.getSteps()); 
            this.validationEnabled = validationEnabled; 
    }
    public StageInfoBuilder(StageInfo instance){
            this(instance,true);
    }
    public StageInfoBuilder(StageInfo instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDurationMilliseconds(instance.getDurationMilliseconds()); 
            this.withName(instance.getName()); 
            this.withStartTime(instance.getStartTime()); 
            this.withSteps(instance.getSteps()); 
            this.validationEnabled = validationEnabled; 
    }
    public StageInfoBuilder(Validator validator){
            this(new StageInfo(), true);
    }
    public StageInfoBuilder(StageInfoFluent<?> fluent,StageInfo instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDurationMilliseconds(instance.getDurationMilliseconds()); 
            fluent.withName(instance.getName()); 
            fluent.withStartTime(instance.getStartTime()); 
            fluent.withSteps(instance.getSteps()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StageInfoBuilder(StageInfo instance,Validator validator){
            this.fluent = this; 
            this.withDurationMilliseconds(instance.getDurationMilliseconds()); 
            this.withName(instance.getName()); 
            this.withStartTime(instance.getStartTime()); 
            this.withSteps(instance.getSteps()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public StageInfo build(){
            StageInfo buildable = new StageInfo(fluent.getDurationMilliseconds(),fluent.getName(),fluent.getStartTime(),fluent.getSteps());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StageInfoBuilder that = (StageInfoBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
