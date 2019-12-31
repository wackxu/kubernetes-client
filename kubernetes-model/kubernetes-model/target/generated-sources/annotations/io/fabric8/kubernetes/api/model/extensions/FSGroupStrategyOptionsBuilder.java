package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class FSGroupStrategyOptionsBuilder extends FSGroupStrategyOptionsFluentImpl<FSGroupStrategyOptionsBuilder> implements VisitableBuilder<FSGroupStrategyOptions,FSGroupStrategyOptionsBuilder>{

    FSGroupStrategyOptionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public FSGroupStrategyOptionsBuilder(){
            this(true);
    }
    public FSGroupStrategyOptionsBuilder(Boolean validationEnabled){
            this(new FSGroupStrategyOptions(), validationEnabled);
    }
    public FSGroupStrategyOptionsBuilder(FSGroupStrategyOptionsFluent<?> fluent){
            this(fluent, true);
    }
    public FSGroupStrategyOptionsBuilder(FSGroupStrategyOptionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new FSGroupStrategyOptions(), validationEnabled);
    }
    public FSGroupStrategyOptionsBuilder(FSGroupStrategyOptionsFluent<?> fluent,FSGroupStrategyOptions instance){
            this(fluent, instance, true);
    }
    public FSGroupStrategyOptionsBuilder(FSGroupStrategyOptionsFluent<?> fluent,FSGroupStrategyOptions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRanges(instance.getRanges()); 
            fluent.withRule(instance.getRule()); 
            this.validationEnabled = validationEnabled; 
    }
    public FSGroupStrategyOptionsBuilder(FSGroupStrategyOptions instance){
            this(instance,true);
    }
    public FSGroupStrategyOptionsBuilder(FSGroupStrategyOptions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRanges(instance.getRanges()); 
            this.withRule(instance.getRule()); 
            this.validationEnabled = validationEnabled; 
    }
    public FSGroupStrategyOptionsBuilder(Validator validator){
            this(new FSGroupStrategyOptions(), true);
    }
    public FSGroupStrategyOptionsBuilder(FSGroupStrategyOptionsFluent<?> fluent,FSGroupStrategyOptions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRanges(instance.getRanges()); 
            fluent.withRule(instance.getRule()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public FSGroupStrategyOptionsBuilder(FSGroupStrategyOptions instance,Validator validator){
            this.fluent = this; 
            this.withRanges(instance.getRanges()); 
            this.withRule(instance.getRule()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public FSGroupStrategyOptions build(){
            FSGroupStrategyOptions buildable = new FSGroupStrategyOptions(fluent.getRanges(),fluent.getRule());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            FSGroupStrategyOptionsBuilder that = (FSGroupStrategyOptionsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
