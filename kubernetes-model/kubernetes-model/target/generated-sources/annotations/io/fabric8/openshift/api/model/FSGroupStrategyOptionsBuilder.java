package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class FSGroupStrategyOptionsBuilder extends io.fabric8.openshift.api.model.FSGroupStrategyOptionsFluentImpl<io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder> implements VisitableBuilder<io.fabric8.openshift.api.model.FSGroupStrategyOptions,io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder>{

    io.fabric8.openshift.api.model.FSGroupStrategyOptionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public FSGroupStrategyOptionsBuilder(){
            this(true);
    }
    public FSGroupStrategyOptionsBuilder(Boolean validationEnabled){
            this(new FSGroupStrategyOptions(), validationEnabled);
    }
    public FSGroupStrategyOptionsBuilder(io.fabric8.openshift.api.model.FSGroupStrategyOptionsFluent<?> fluent){
            this(fluent, true);
    }
    public FSGroupStrategyOptionsBuilder(io.fabric8.openshift.api.model.FSGroupStrategyOptionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new FSGroupStrategyOptions(), validationEnabled);
    }
    public FSGroupStrategyOptionsBuilder(io.fabric8.openshift.api.model.FSGroupStrategyOptionsFluent<?> fluent,io.fabric8.openshift.api.model.FSGroupStrategyOptions instance){
            this(fluent, instance, true);
    }
    public FSGroupStrategyOptionsBuilder(io.fabric8.openshift.api.model.FSGroupStrategyOptionsFluent<?> fluent,io.fabric8.openshift.api.model.FSGroupStrategyOptions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRanges(instance.getRanges()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public FSGroupStrategyOptionsBuilder(io.fabric8.openshift.api.model.FSGroupStrategyOptions instance){
            this(instance,true);
    }
    public FSGroupStrategyOptionsBuilder(io.fabric8.openshift.api.model.FSGroupStrategyOptions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRanges(instance.getRanges()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public FSGroupStrategyOptionsBuilder(Validator validator){
            this(new FSGroupStrategyOptions(), true);
    }
    public FSGroupStrategyOptionsBuilder(io.fabric8.openshift.api.model.FSGroupStrategyOptionsFluent<?> fluent,io.fabric8.openshift.api.model.FSGroupStrategyOptions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRanges(instance.getRanges()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public FSGroupStrategyOptionsBuilder(io.fabric8.openshift.api.model.FSGroupStrategyOptions instance,Validator validator){
            this.fluent = this; 
            this.withRanges(instance.getRanges()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public io.fabric8.openshift.api.model.FSGroupStrategyOptions build(){
            FSGroupStrategyOptions buildable = new FSGroupStrategyOptions(fluent.getRanges(),fluent.getType());
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
