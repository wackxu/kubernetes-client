package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ResourceFieldSelectorBuilder extends ResourceFieldSelectorFluentImpl<ResourceFieldSelectorBuilder> implements VisitableBuilder<ResourceFieldSelector,ResourceFieldSelectorBuilder>{

    ResourceFieldSelectorFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ResourceFieldSelectorBuilder(){
            this(true);
    }
    public ResourceFieldSelectorBuilder(Boolean validationEnabled){
            this(new ResourceFieldSelector(), validationEnabled);
    }
    public ResourceFieldSelectorBuilder(ResourceFieldSelectorFluent<?> fluent){
            this(fluent, true);
    }
    public ResourceFieldSelectorBuilder(ResourceFieldSelectorFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ResourceFieldSelector(), validationEnabled);
    }
    public ResourceFieldSelectorBuilder(ResourceFieldSelectorFluent<?> fluent,ResourceFieldSelector instance){
            this(fluent, instance, true);
    }
    public ResourceFieldSelectorBuilder(ResourceFieldSelectorFluent<?> fluent,ResourceFieldSelector instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withContainerName(instance.getContainerName()); 
            fluent.withDivisor(instance.getDivisor()); 
            fluent.withResource(instance.getResource()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceFieldSelectorBuilder(ResourceFieldSelector instance){
            this(instance,true);
    }
    public ResourceFieldSelectorBuilder(ResourceFieldSelector instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withContainerName(instance.getContainerName()); 
            this.withDivisor(instance.getDivisor()); 
            this.withResource(instance.getResource()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceFieldSelectorBuilder(Validator validator){
            this(new ResourceFieldSelector(), true);
    }
    public ResourceFieldSelectorBuilder(ResourceFieldSelectorFluent<?> fluent,ResourceFieldSelector instance,Validator validator){
            this.fluent = fluent; 
            fluent.withContainerName(instance.getContainerName()); 
            fluent.withDivisor(instance.getDivisor()); 
            fluent.withResource(instance.getResource()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ResourceFieldSelectorBuilder(ResourceFieldSelector instance,Validator validator){
            this.fluent = this; 
            this.withContainerName(instance.getContainerName()); 
            this.withDivisor(instance.getDivisor()); 
            this.withResource(instance.getResource()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ResourceFieldSelector build(){
            ResourceFieldSelector buildable = new ResourceFieldSelector(fluent.getContainerName(),fluent.getDivisor(),fluent.getResource());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceFieldSelectorBuilder that = (ResourceFieldSelectorBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
