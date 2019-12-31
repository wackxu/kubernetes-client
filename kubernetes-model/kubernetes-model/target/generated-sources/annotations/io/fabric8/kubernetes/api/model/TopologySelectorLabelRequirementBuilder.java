package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TopologySelectorLabelRequirementBuilder extends TopologySelectorLabelRequirementFluentImpl<TopologySelectorLabelRequirementBuilder> implements VisitableBuilder<TopologySelectorLabelRequirement,TopologySelectorLabelRequirementBuilder>{

    TopologySelectorLabelRequirementFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TopologySelectorLabelRequirementBuilder(){
            this(true);
    }
    public TopologySelectorLabelRequirementBuilder(Boolean validationEnabled){
            this(new TopologySelectorLabelRequirement(), validationEnabled);
    }
    public TopologySelectorLabelRequirementBuilder(TopologySelectorLabelRequirementFluent<?> fluent){
            this(fluent, true);
    }
    public TopologySelectorLabelRequirementBuilder(TopologySelectorLabelRequirementFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TopologySelectorLabelRequirement(), validationEnabled);
    }
    public TopologySelectorLabelRequirementBuilder(TopologySelectorLabelRequirementFluent<?> fluent,TopologySelectorLabelRequirement instance){
            this(fluent, instance, true);
    }
    public TopologySelectorLabelRequirementBuilder(TopologySelectorLabelRequirementFluent<?> fluent,TopologySelectorLabelRequirement instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withKey(instance.getKey()); 
            fluent.withValues(instance.getValues()); 
            this.validationEnabled = validationEnabled; 
    }
    public TopologySelectorLabelRequirementBuilder(TopologySelectorLabelRequirement instance){
            this(instance,true);
    }
    public TopologySelectorLabelRequirementBuilder(TopologySelectorLabelRequirement instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withKey(instance.getKey()); 
            this.withValues(instance.getValues()); 
            this.validationEnabled = validationEnabled; 
    }
    public TopologySelectorLabelRequirementBuilder(Validator validator){
            this(new TopologySelectorLabelRequirement(), true);
    }
    public TopologySelectorLabelRequirementBuilder(TopologySelectorLabelRequirementFluent<?> fluent,TopologySelectorLabelRequirement instance,Validator validator){
            this.fluent = fluent; 
            fluent.withKey(instance.getKey()); 
            fluent.withValues(instance.getValues()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TopologySelectorLabelRequirementBuilder(TopologySelectorLabelRequirement instance,Validator validator){
            this.fluent = this; 
            this.withKey(instance.getKey()); 
            this.withValues(instance.getValues()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TopologySelectorLabelRequirement build(){
            TopologySelectorLabelRequirement buildable = new TopologySelectorLabelRequirement(fluent.getKey(),fluent.getValues());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TopologySelectorLabelRequirementBuilder that = (TopologySelectorLabelRequirementBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
