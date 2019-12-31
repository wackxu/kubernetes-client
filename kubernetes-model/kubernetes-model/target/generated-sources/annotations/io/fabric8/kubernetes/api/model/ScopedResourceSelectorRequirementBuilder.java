package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ScopedResourceSelectorRequirementBuilder extends ScopedResourceSelectorRequirementFluentImpl<ScopedResourceSelectorRequirementBuilder> implements VisitableBuilder<ScopedResourceSelectorRequirement,ScopedResourceSelectorRequirementBuilder>{

    ScopedResourceSelectorRequirementFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ScopedResourceSelectorRequirementBuilder(){
            this(true);
    }
    public ScopedResourceSelectorRequirementBuilder(Boolean validationEnabled){
            this(new ScopedResourceSelectorRequirement(), validationEnabled);
    }
    public ScopedResourceSelectorRequirementBuilder(ScopedResourceSelectorRequirementFluent<?> fluent){
            this(fluent, true);
    }
    public ScopedResourceSelectorRequirementBuilder(ScopedResourceSelectorRequirementFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ScopedResourceSelectorRequirement(), validationEnabled);
    }
    public ScopedResourceSelectorRequirementBuilder(ScopedResourceSelectorRequirementFluent<?> fluent,ScopedResourceSelectorRequirement instance){
            this(fluent, instance, true);
    }
    public ScopedResourceSelectorRequirementBuilder(ScopedResourceSelectorRequirementFluent<?> fluent,ScopedResourceSelectorRequirement instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withOperator(instance.getOperator()); 
            fluent.withScopeName(instance.getScopeName()); 
            fluent.withValues(instance.getValues()); 
            this.validationEnabled = validationEnabled; 
    }
    public ScopedResourceSelectorRequirementBuilder(ScopedResourceSelectorRequirement instance){
            this(instance,true);
    }
    public ScopedResourceSelectorRequirementBuilder(ScopedResourceSelectorRequirement instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withOperator(instance.getOperator()); 
            this.withScopeName(instance.getScopeName()); 
            this.withValues(instance.getValues()); 
            this.validationEnabled = validationEnabled; 
    }
    public ScopedResourceSelectorRequirementBuilder(Validator validator){
            this(new ScopedResourceSelectorRequirement(), true);
    }
    public ScopedResourceSelectorRequirementBuilder(ScopedResourceSelectorRequirementFluent<?> fluent,ScopedResourceSelectorRequirement instance,Validator validator){
            this.fluent = fluent; 
            fluent.withOperator(instance.getOperator()); 
            fluent.withScopeName(instance.getScopeName()); 
            fluent.withValues(instance.getValues()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ScopedResourceSelectorRequirementBuilder(ScopedResourceSelectorRequirement instance,Validator validator){
            this.fluent = this; 
            this.withOperator(instance.getOperator()); 
            this.withScopeName(instance.getScopeName()); 
            this.withValues(instance.getValues()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ScopedResourceSelectorRequirement build(){
            ScopedResourceSelectorRequirement buildable = new ScopedResourceSelectorRequirement(fluent.getOperator(),fluent.getScopeName(),fluent.getValues());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScopedResourceSelectorRequirementBuilder that = (ScopedResourceSelectorRequirementBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
