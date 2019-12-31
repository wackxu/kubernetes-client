package io.fabric8.kubernetes.api.model.authorization;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ResourceAttributesBuilder extends ResourceAttributesFluentImpl<ResourceAttributesBuilder> implements VisitableBuilder<ResourceAttributes,ResourceAttributesBuilder>{

    ResourceAttributesFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ResourceAttributesBuilder(){
            this(true);
    }
    public ResourceAttributesBuilder(Boolean validationEnabled){
            this(new ResourceAttributes(), validationEnabled);
    }
    public ResourceAttributesBuilder(ResourceAttributesFluent<?> fluent){
            this(fluent, true);
    }
    public ResourceAttributesBuilder(ResourceAttributesFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ResourceAttributes(), validationEnabled);
    }
    public ResourceAttributesBuilder(ResourceAttributesFluent<?> fluent,ResourceAttributes instance){
            this(fluent, instance, true);
    }
    public ResourceAttributesBuilder(ResourceAttributesFluent<?> fluent,ResourceAttributes instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withGroup(instance.getGroup()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withResource(instance.getResource()); 
            fluent.withSubresource(instance.getSubresource()); 
            fluent.withVerb(instance.getVerb()); 
            fluent.withVersion(instance.getVersion()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceAttributesBuilder(ResourceAttributes instance){
            this(instance,true);
    }
    public ResourceAttributesBuilder(ResourceAttributes instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withGroup(instance.getGroup()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withResource(instance.getResource()); 
            this.withSubresource(instance.getSubresource()); 
            this.withVerb(instance.getVerb()); 
            this.withVersion(instance.getVersion()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceAttributesBuilder(Validator validator){
            this(new ResourceAttributes(), true);
    }
    public ResourceAttributesBuilder(ResourceAttributesFluent<?> fluent,ResourceAttributes instance,Validator validator){
            this.fluent = fluent; 
            fluent.withGroup(instance.getGroup()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withResource(instance.getResource()); 
            fluent.withSubresource(instance.getSubresource()); 
            fluent.withVerb(instance.getVerb()); 
            fluent.withVersion(instance.getVersion()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ResourceAttributesBuilder(ResourceAttributes instance,Validator validator){
            this.fluent = this; 
            this.withGroup(instance.getGroup()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withResource(instance.getResource()); 
            this.withSubresource(instance.getSubresource()); 
            this.withVerb(instance.getVerb()); 
            this.withVersion(instance.getVersion()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ResourceAttributes build(){
            ResourceAttributes buildable = new ResourceAttributes(fluent.getGroup(),fluent.getName(),fluent.getNamespace(),fluent.getResource(),fluent.getSubresource(),fluent.getVerb(),fluent.getVersion());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceAttributesBuilder that = (ResourceAttributesBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
