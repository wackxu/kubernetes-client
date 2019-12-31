package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ResourceRequirementsBuilder extends ResourceRequirementsFluentImpl<ResourceRequirementsBuilder> implements VisitableBuilder<ResourceRequirements,ResourceRequirementsBuilder>{

    ResourceRequirementsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ResourceRequirementsBuilder(){
            this(true);
    }
    public ResourceRequirementsBuilder(Boolean validationEnabled){
            this(new ResourceRequirements(), validationEnabled);
    }
    public ResourceRequirementsBuilder(ResourceRequirementsFluent<?> fluent){
            this(fluent, true);
    }
    public ResourceRequirementsBuilder(ResourceRequirementsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ResourceRequirements(), validationEnabled);
    }
    public ResourceRequirementsBuilder(ResourceRequirementsFluent<?> fluent,ResourceRequirements instance){
            this(fluent, instance, true);
    }
    public ResourceRequirementsBuilder(ResourceRequirementsFluent<?> fluent,ResourceRequirements instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLimits(instance.getLimits()); 
            fluent.withRequests(instance.getRequests()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceRequirementsBuilder(ResourceRequirements instance){
            this(instance,true);
    }
    public ResourceRequirementsBuilder(ResourceRequirements instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLimits(instance.getLimits()); 
            this.withRequests(instance.getRequests()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceRequirementsBuilder(Validator validator){
            this(new ResourceRequirements(), true);
    }
    public ResourceRequirementsBuilder(ResourceRequirementsFluent<?> fluent,ResourceRequirements instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLimits(instance.getLimits()); 
            fluent.withRequests(instance.getRequests()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ResourceRequirementsBuilder(ResourceRequirements instance,Validator validator){
            this.fluent = this; 
            this.withLimits(instance.getLimits()); 
            this.withRequests(instance.getRequests()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ResourceRequirements build(){
            ResourceRequirements buildable = new ResourceRequirements(fluent.getLimits(),fluent.getRequests());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceRequirementsBuilder that = (ResourceRequirementsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
