package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TagImageHookBuilder extends TagImageHookFluentImpl<TagImageHookBuilder> implements VisitableBuilder<TagImageHook,TagImageHookBuilder>{

    TagImageHookFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TagImageHookBuilder(){
            this(true);
    }
    public TagImageHookBuilder(Boolean validationEnabled){
            this(new TagImageHook(), validationEnabled);
    }
    public TagImageHookBuilder(TagImageHookFluent<?> fluent){
            this(fluent, true);
    }
    public TagImageHookBuilder(TagImageHookFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TagImageHook(), validationEnabled);
    }
    public TagImageHookBuilder(TagImageHookFluent<?> fluent,TagImageHook instance){
            this(fluent, instance, true);
    }
    public TagImageHookBuilder(TagImageHookFluent<?> fluent,TagImageHook instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withContainerName(instance.getContainerName()); 
            fluent.withTo(instance.getTo()); 
            this.validationEnabled = validationEnabled; 
    }
    public TagImageHookBuilder(TagImageHook instance){
            this(instance,true);
    }
    public TagImageHookBuilder(TagImageHook instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withContainerName(instance.getContainerName()); 
            this.withTo(instance.getTo()); 
            this.validationEnabled = validationEnabled; 
    }
    public TagImageHookBuilder(Validator validator){
            this(new TagImageHook(), true);
    }
    public TagImageHookBuilder(TagImageHookFluent<?> fluent,TagImageHook instance,Validator validator){
            this.fluent = fluent; 
            fluent.withContainerName(instance.getContainerName()); 
            fluent.withTo(instance.getTo()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TagImageHookBuilder(TagImageHook instance,Validator validator){
            this.fluent = this; 
            this.withContainerName(instance.getContainerName()); 
            this.withTo(instance.getTo()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TagImageHook build(){
            TagImageHook buildable = new TagImageHook(fluent.getContainerName(),fluent.getTo());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TagImageHookBuilder that = (TagImageHookBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
