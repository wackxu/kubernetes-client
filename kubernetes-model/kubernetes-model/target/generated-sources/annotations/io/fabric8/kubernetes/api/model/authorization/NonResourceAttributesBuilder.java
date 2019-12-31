package io.fabric8.kubernetes.api.model.authorization;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NonResourceAttributesBuilder extends NonResourceAttributesFluentImpl<NonResourceAttributesBuilder> implements VisitableBuilder<NonResourceAttributes,NonResourceAttributesBuilder>{

    NonResourceAttributesFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NonResourceAttributesBuilder(){
            this(true);
    }
    public NonResourceAttributesBuilder(Boolean validationEnabled){
            this(new NonResourceAttributes(), validationEnabled);
    }
    public NonResourceAttributesBuilder(NonResourceAttributesFluent<?> fluent){
            this(fluent, true);
    }
    public NonResourceAttributesBuilder(NonResourceAttributesFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NonResourceAttributes(), validationEnabled);
    }
    public NonResourceAttributesBuilder(NonResourceAttributesFluent<?> fluent,NonResourceAttributes instance){
            this(fluent, instance, true);
    }
    public NonResourceAttributesBuilder(NonResourceAttributesFluent<?> fluent,NonResourceAttributes instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPath(instance.getPath()); 
            fluent.withVerb(instance.getVerb()); 
            this.validationEnabled = validationEnabled; 
    }
    public NonResourceAttributesBuilder(NonResourceAttributes instance){
            this(instance,true);
    }
    public NonResourceAttributesBuilder(NonResourceAttributes instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPath(instance.getPath()); 
            this.withVerb(instance.getVerb()); 
            this.validationEnabled = validationEnabled; 
    }
    public NonResourceAttributesBuilder(Validator validator){
            this(new NonResourceAttributes(), true);
    }
    public NonResourceAttributesBuilder(NonResourceAttributesFluent<?> fluent,NonResourceAttributes instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPath(instance.getPath()); 
            fluent.withVerb(instance.getVerb()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NonResourceAttributesBuilder(NonResourceAttributes instance,Validator validator){
            this.fluent = this; 
            this.withPath(instance.getPath()); 
            this.withVerb(instance.getVerb()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NonResourceAttributes build(){
            NonResourceAttributes buildable = new NonResourceAttributes(fluent.getPath(),fluent.getVerb());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NonResourceAttributesBuilder that = (NonResourceAttributesBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
