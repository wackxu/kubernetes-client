package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class LabelSelectorRequirementBuilder extends LabelSelectorRequirementFluentImpl<LabelSelectorRequirementBuilder> implements VisitableBuilder<LabelSelectorRequirement,LabelSelectorRequirementBuilder>{

    LabelSelectorRequirementFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public LabelSelectorRequirementBuilder(){
            this(true);
    }
    public LabelSelectorRequirementBuilder(Boolean validationEnabled){
            this(new LabelSelectorRequirement(), validationEnabled);
    }
    public LabelSelectorRequirementBuilder(LabelSelectorRequirementFluent<?> fluent){
            this(fluent, true);
    }
    public LabelSelectorRequirementBuilder(LabelSelectorRequirementFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new LabelSelectorRequirement(), validationEnabled);
    }
    public LabelSelectorRequirementBuilder(LabelSelectorRequirementFluent<?> fluent,LabelSelectorRequirement instance){
            this(fluent, instance, true);
    }
    public LabelSelectorRequirementBuilder(LabelSelectorRequirementFluent<?> fluent,LabelSelectorRequirement instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withKey(instance.getKey()); 
            fluent.withOperator(instance.getOperator()); 
            fluent.withValues(instance.getValues()); 
            this.validationEnabled = validationEnabled; 
    }
    public LabelSelectorRequirementBuilder(LabelSelectorRequirement instance){
            this(instance,true);
    }
    public LabelSelectorRequirementBuilder(LabelSelectorRequirement instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withKey(instance.getKey()); 
            this.withOperator(instance.getOperator()); 
            this.withValues(instance.getValues()); 
            this.validationEnabled = validationEnabled; 
    }
    public LabelSelectorRequirementBuilder(Validator validator){
            this(new LabelSelectorRequirement(), true);
    }
    public LabelSelectorRequirementBuilder(LabelSelectorRequirementFluent<?> fluent,LabelSelectorRequirement instance,Validator validator){
            this.fluent = fluent; 
            fluent.withKey(instance.getKey()); 
            fluent.withOperator(instance.getOperator()); 
            fluent.withValues(instance.getValues()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public LabelSelectorRequirementBuilder(LabelSelectorRequirement instance,Validator validator){
            this.fluent = this; 
            this.withKey(instance.getKey()); 
            this.withOperator(instance.getOperator()); 
            this.withValues(instance.getValues()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public LabelSelectorRequirement build(){
            LabelSelectorRequirement buildable = new LabelSelectorRequirement(fluent.getKey(),fluent.getOperator(),fluent.getValues());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LabelSelectorRequirementBuilder that = (LabelSelectorRequirementBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
