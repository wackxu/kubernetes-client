package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TagReferenceBuilder extends TagReferenceFluentImpl<TagReferenceBuilder> implements VisitableBuilder<TagReference,TagReferenceBuilder>{

    TagReferenceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TagReferenceBuilder(){
            this(true);
    }
    public TagReferenceBuilder(Boolean validationEnabled){
            this(new TagReference(), validationEnabled);
    }
    public TagReferenceBuilder(TagReferenceFluent<?> fluent){
            this(fluent, true);
    }
    public TagReferenceBuilder(TagReferenceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TagReference(), validationEnabled);
    }
    public TagReferenceBuilder(TagReferenceFluent<?> fluent,TagReference instance){
            this(fluent, instance, true);
    }
    public TagReferenceBuilder(TagReferenceFluent<?> fluent,TagReference instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAnnotations(instance.getAnnotations()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withGeneration(instance.getGeneration()); 
            fluent.withImportPolicy(instance.getImportPolicy()); 
            fluent.withName(instance.getName()); 
            fluent.withReference(instance.getReference()); 
            fluent.withReferencePolicy(instance.getReferencePolicy()); 
            this.validationEnabled = validationEnabled; 
    }
    public TagReferenceBuilder(TagReference instance){
            this(instance,true);
    }
    public TagReferenceBuilder(TagReference instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAnnotations(instance.getAnnotations()); 
            this.withFrom(instance.getFrom()); 
            this.withGeneration(instance.getGeneration()); 
            this.withImportPolicy(instance.getImportPolicy()); 
            this.withName(instance.getName()); 
            this.withReference(instance.getReference()); 
            this.withReferencePolicy(instance.getReferencePolicy()); 
            this.validationEnabled = validationEnabled; 
    }
    public TagReferenceBuilder(Validator validator){
            this(new TagReference(), true);
    }
    public TagReferenceBuilder(TagReferenceFluent<?> fluent,TagReference instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAnnotations(instance.getAnnotations()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withGeneration(instance.getGeneration()); 
            fluent.withImportPolicy(instance.getImportPolicy()); 
            fluent.withName(instance.getName()); 
            fluent.withReference(instance.getReference()); 
            fluent.withReferencePolicy(instance.getReferencePolicy()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TagReferenceBuilder(TagReference instance,Validator validator){
            this.fluent = this; 
            this.withAnnotations(instance.getAnnotations()); 
            this.withFrom(instance.getFrom()); 
            this.withGeneration(instance.getGeneration()); 
            this.withImportPolicy(instance.getImportPolicy()); 
            this.withName(instance.getName()); 
            this.withReference(instance.getReference()); 
            this.withReferencePolicy(instance.getReferencePolicy()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TagReference build(){
            TagReference buildable = new TagReference(fluent.getAnnotations(),fluent.getFrom(),fluent.getGeneration(),fluent.getImportPolicy(),fluent.getName(),fluent.isReference(),fluent.getReferencePolicy());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TagReferenceBuilder that = (TagReferenceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
