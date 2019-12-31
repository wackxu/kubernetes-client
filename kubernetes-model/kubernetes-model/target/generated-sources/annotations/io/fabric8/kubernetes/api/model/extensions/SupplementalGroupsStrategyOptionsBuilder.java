package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SupplementalGroupsStrategyOptionsBuilder extends SupplementalGroupsStrategyOptionsFluentImpl<SupplementalGroupsStrategyOptionsBuilder> implements VisitableBuilder<SupplementalGroupsStrategyOptions,SupplementalGroupsStrategyOptionsBuilder>{

    SupplementalGroupsStrategyOptionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SupplementalGroupsStrategyOptionsBuilder(){
            this(true);
    }
    public SupplementalGroupsStrategyOptionsBuilder(Boolean validationEnabled){
            this(new SupplementalGroupsStrategyOptions(), validationEnabled);
    }
    public SupplementalGroupsStrategyOptionsBuilder(SupplementalGroupsStrategyOptionsFluent<?> fluent){
            this(fluent, true);
    }
    public SupplementalGroupsStrategyOptionsBuilder(SupplementalGroupsStrategyOptionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SupplementalGroupsStrategyOptions(), validationEnabled);
    }
    public SupplementalGroupsStrategyOptionsBuilder(SupplementalGroupsStrategyOptionsFluent<?> fluent,SupplementalGroupsStrategyOptions instance){
            this(fluent, instance, true);
    }
    public SupplementalGroupsStrategyOptionsBuilder(SupplementalGroupsStrategyOptionsFluent<?> fluent,SupplementalGroupsStrategyOptions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRanges(instance.getRanges()); 
            fluent.withRule(instance.getRule()); 
            this.validationEnabled = validationEnabled; 
    }
    public SupplementalGroupsStrategyOptionsBuilder(SupplementalGroupsStrategyOptions instance){
            this(instance,true);
    }
    public SupplementalGroupsStrategyOptionsBuilder(SupplementalGroupsStrategyOptions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRanges(instance.getRanges()); 
            this.withRule(instance.getRule()); 
            this.validationEnabled = validationEnabled; 
    }
    public SupplementalGroupsStrategyOptionsBuilder(Validator validator){
            this(new SupplementalGroupsStrategyOptions(), true);
    }
    public SupplementalGroupsStrategyOptionsBuilder(SupplementalGroupsStrategyOptionsFluent<?> fluent,SupplementalGroupsStrategyOptions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRanges(instance.getRanges()); 
            fluent.withRule(instance.getRule()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SupplementalGroupsStrategyOptionsBuilder(SupplementalGroupsStrategyOptions instance,Validator validator){
            this.fluent = this; 
            this.withRanges(instance.getRanges()); 
            this.withRule(instance.getRule()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SupplementalGroupsStrategyOptions build(){
            SupplementalGroupsStrategyOptions buildable = new SupplementalGroupsStrategyOptions(fluent.getRanges(),fluent.getRule());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SupplementalGroupsStrategyOptionsBuilder that = (SupplementalGroupsStrategyOptionsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
