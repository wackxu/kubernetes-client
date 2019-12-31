package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TagImportPolicyBuilder extends TagImportPolicyFluentImpl<TagImportPolicyBuilder> implements VisitableBuilder<TagImportPolicy,TagImportPolicyBuilder>{

    TagImportPolicyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TagImportPolicyBuilder(){
            this(true);
    }
    public TagImportPolicyBuilder(Boolean validationEnabled){
            this(new TagImportPolicy(), validationEnabled);
    }
    public TagImportPolicyBuilder(TagImportPolicyFluent<?> fluent){
            this(fluent, true);
    }
    public TagImportPolicyBuilder(TagImportPolicyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TagImportPolicy(), validationEnabled);
    }
    public TagImportPolicyBuilder(TagImportPolicyFluent<?> fluent,TagImportPolicy instance){
            this(fluent, instance, true);
    }
    public TagImportPolicyBuilder(TagImportPolicyFluent<?> fluent,TagImportPolicy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withInsecure(instance.getInsecure()); 
            fluent.withScheduled(instance.getScheduled()); 
            this.validationEnabled = validationEnabled; 
    }
    public TagImportPolicyBuilder(TagImportPolicy instance){
            this(instance,true);
    }
    public TagImportPolicyBuilder(TagImportPolicy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withInsecure(instance.getInsecure()); 
            this.withScheduled(instance.getScheduled()); 
            this.validationEnabled = validationEnabled; 
    }
    public TagImportPolicyBuilder(Validator validator){
            this(new TagImportPolicy(), true);
    }
    public TagImportPolicyBuilder(TagImportPolicyFluent<?> fluent,TagImportPolicy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withInsecure(instance.getInsecure()); 
            fluent.withScheduled(instance.getScheduled()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TagImportPolicyBuilder(TagImportPolicy instance,Validator validator){
            this.fluent = this; 
            this.withInsecure(instance.getInsecure()); 
            this.withScheduled(instance.getScheduled()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TagImportPolicy build(){
            TagImportPolicy buildable = new TagImportPolicy(fluent.isInsecure(),fluent.isScheduled());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TagImportPolicyBuilder that = (TagImportPolicyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
