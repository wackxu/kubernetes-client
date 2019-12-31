package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageStreamTagBuilder extends ImageStreamTagFluentImpl<ImageStreamTagBuilder> implements VisitableBuilder<ImageStreamTag,ImageStreamTagBuilder>{

    ImageStreamTagFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageStreamTagBuilder(){
            this(true);
    }
    public ImageStreamTagBuilder(Boolean validationEnabled){
            this(new ImageStreamTag(), validationEnabled);
    }
    public ImageStreamTagBuilder(ImageStreamTagFluent<?> fluent){
            this(fluent, true);
    }
    public ImageStreamTagBuilder(ImageStreamTagFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageStreamTag(), validationEnabled);
    }
    public ImageStreamTagBuilder(ImageStreamTagFluent<?> fluent,ImageStreamTag instance){
            this(fluent, instance, true);
    }
    public ImageStreamTagBuilder(ImageStreamTagFluent<?> fluent,ImageStreamTag instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withGeneration(instance.getGeneration()); 
            fluent.withImage(instance.getImage()); 
            fluent.withKind(instance.getKind()); 
            fluent.withLookupPolicy(instance.getLookupPolicy()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withTag(instance.getTag()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamTagBuilder(ImageStreamTag instance){
            this(instance,true);
    }
    public ImageStreamTagBuilder(ImageStreamTag instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withConditions(instance.getConditions()); 
            this.withGeneration(instance.getGeneration()); 
            this.withImage(instance.getImage()); 
            this.withKind(instance.getKind()); 
            this.withLookupPolicy(instance.getLookupPolicy()); 
            this.withMetadata(instance.getMetadata()); 
            this.withTag(instance.getTag()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamTagBuilder(Validator validator){
            this(new ImageStreamTag(), true);
    }
    public ImageStreamTagBuilder(ImageStreamTagFluent<?> fluent,ImageStreamTag instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withGeneration(instance.getGeneration()); 
            fluent.withImage(instance.getImage()); 
            fluent.withKind(instance.getKind()); 
            fluent.withLookupPolicy(instance.getLookupPolicy()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withTag(instance.getTag()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageStreamTagBuilder(ImageStreamTag instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withConditions(instance.getConditions()); 
            this.withGeneration(instance.getGeneration()); 
            this.withImage(instance.getImage()); 
            this.withKind(instance.getKind()); 
            this.withLookupPolicy(instance.getLookupPolicy()); 
            this.withMetadata(instance.getMetadata()); 
            this.withTag(instance.getTag()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageStreamTag build(){
            ImageStreamTag buildable = new ImageStreamTag(fluent.getApiVersion(),fluent.getConditions(),fluent.getGeneration(),fluent.getImage(),fluent.getKind(),fluent.getLookupPolicy(),fluent.getMetadata(),fluent.getTag());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageStreamTagBuilder that = (ImageStreamTagBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
