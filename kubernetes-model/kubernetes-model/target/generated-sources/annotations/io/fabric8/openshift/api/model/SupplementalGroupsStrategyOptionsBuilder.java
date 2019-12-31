package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SupplementalGroupsStrategyOptionsBuilder extends io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluentImpl<io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder> implements VisitableBuilder<io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions,io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder>{

    io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SupplementalGroupsStrategyOptionsBuilder(){
            this(true);
    }
    public SupplementalGroupsStrategyOptionsBuilder(Boolean validationEnabled){
            this(new SupplementalGroupsStrategyOptions(), validationEnabled);
    }
    public SupplementalGroupsStrategyOptionsBuilder(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluent<?> fluent){
            this(fluent, true);
    }
    public SupplementalGroupsStrategyOptionsBuilder(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SupplementalGroupsStrategyOptions(), validationEnabled);
    }
    public SupplementalGroupsStrategyOptionsBuilder(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluent<?> fluent,io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions instance){
            this(fluent, instance, true);
    }
    public SupplementalGroupsStrategyOptionsBuilder(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluent<?> fluent,io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRanges(instance.getRanges()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public SupplementalGroupsStrategyOptionsBuilder(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions instance){
            this(instance,true);
    }
    public SupplementalGroupsStrategyOptionsBuilder(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRanges(instance.getRanges()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public SupplementalGroupsStrategyOptionsBuilder(Validator validator){
            this(new SupplementalGroupsStrategyOptions(), true);
    }
    public SupplementalGroupsStrategyOptionsBuilder(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluent<?> fluent,io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRanges(instance.getRanges()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SupplementalGroupsStrategyOptionsBuilder(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions instance,Validator validator){
            this.fluent = this; 
            this.withRanges(instance.getRanges()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions build(){
            SupplementalGroupsStrategyOptions buildable = new SupplementalGroupsStrategyOptions(fluent.getRanges(),fluent.getType());
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
