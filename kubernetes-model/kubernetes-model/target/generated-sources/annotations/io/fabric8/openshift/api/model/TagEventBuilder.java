package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TagEventBuilder extends TagEventFluentImpl<TagEventBuilder> implements VisitableBuilder<TagEvent,TagEventBuilder>{

    TagEventFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TagEventBuilder(){
            this(true);
    }
    public TagEventBuilder(Boolean validationEnabled){
            this(new TagEvent(), validationEnabled);
    }
    public TagEventBuilder(TagEventFluent<?> fluent){
            this(fluent, true);
    }
    public TagEventBuilder(TagEventFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TagEvent(), validationEnabled);
    }
    public TagEventBuilder(TagEventFluent<?> fluent,TagEvent instance){
            this(fluent, instance, true);
    }
    public TagEventBuilder(TagEventFluent<?> fluent,TagEvent instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCreated(instance.getCreated()); 
            fluent.withDockerImageReference(instance.getDockerImageReference()); 
            fluent.withGeneration(instance.getGeneration()); 
            fluent.withImage(instance.getImage()); 
            this.validationEnabled = validationEnabled; 
    }
    public TagEventBuilder(TagEvent instance){
            this(instance,true);
    }
    public TagEventBuilder(TagEvent instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCreated(instance.getCreated()); 
            this.withDockerImageReference(instance.getDockerImageReference()); 
            this.withGeneration(instance.getGeneration()); 
            this.withImage(instance.getImage()); 
            this.validationEnabled = validationEnabled; 
    }
    public TagEventBuilder(Validator validator){
            this(new TagEvent(), true);
    }
    public TagEventBuilder(TagEventFluent<?> fluent,TagEvent instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCreated(instance.getCreated()); 
            fluent.withDockerImageReference(instance.getDockerImageReference()); 
            fluent.withGeneration(instance.getGeneration()); 
            fluent.withImage(instance.getImage()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TagEventBuilder(TagEvent instance,Validator validator){
            this.fluent = this; 
            this.withCreated(instance.getCreated()); 
            this.withDockerImageReference(instance.getDockerImageReference()); 
            this.withGeneration(instance.getGeneration()); 
            this.withImage(instance.getImage()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TagEvent build(){
            TagEvent buildable = new TagEvent(fluent.getCreated(),fluent.getDockerImageReference(),fluent.getGeneration(),fluent.getImage());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TagEventBuilder that = (TagEventBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
