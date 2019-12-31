package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TagReferencePolicyBuilder extends TagReferencePolicyFluentImpl<TagReferencePolicyBuilder> implements VisitableBuilder<TagReferencePolicy,TagReferencePolicyBuilder>{

    TagReferencePolicyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TagReferencePolicyBuilder(){
            this(true);
    }
    public TagReferencePolicyBuilder(Boolean validationEnabled){
            this(new TagReferencePolicy(), validationEnabled);
    }
    public TagReferencePolicyBuilder(TagReferencePolicyFluent<?> fluent){
            this(fluent, true);
    }
    public TagReferencePolicyBuilder(TagReferencePolicyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TagReferencePolicy(), validationEnabled);
    }
    public TagReferencePolicyBuilder(TagReferencePolicyFluent<?> fluent,TagReferencePolicy instance){
            this(fluent, instance, true);
    }
    public TagReferencePolicyBuilder(TagReferencePolicyFluent<?> fluent,TagReferencePolicy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public TagReferencePolicyBuilder(TagReferencePolicy instance){
            this(instance,true);
    }
    public TagReferencePolicyBuilder(TagReferencePolicy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public TagReferencePolicyBuilder(Validator validator){
            this(new TagReferencePolicy(), true);
    }
    public TagReferencePolicyBuilder(TagReferencePolicyFluent<?> fluent,TagReferencePolicy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TagReferencePolicyBuilder(TagReferencePolicy instance,Validator validator){
            this.fluent = this; 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TagReferencePolicy build(){
            TagReferencePolicy buildable = new TagReferencePolicy(fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TagReferencePolicyBuilder that = (TagReferencePolicyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
