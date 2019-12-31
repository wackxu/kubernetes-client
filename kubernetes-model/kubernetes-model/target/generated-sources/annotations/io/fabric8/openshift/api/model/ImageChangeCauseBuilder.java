package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageChangeCauseBuilder extends ImageChangeCauseFluentImpl<ImageChangeCauseBuilder> implements VisitableBuilder<ImageChangeCause,ImageChangeCauseBuilder>{

    ImageChangeCauseFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageChangeCauseBuilder(){
            this(true);
    }
    public ImageChangeCauseBuilder(Boolean validationEnabled){
            this(new ImageChangeCause(), validationEnabled);
    }
    public ImageChangeCauseBuilder(ImageChangeCauseFluent<?> fluent){
            this(fluent, true);
    }
    public ImageChangeCauseBuilder(ImageChangeCauseFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageChangeCause(), validationEnabled);
    }
    public ImageChangeCauseBuilder(ImageChangeCauseFluent<?> fluent,ImageChangeCause instance){
            this(fluent, instance, true);
    }
    public ImageChangeCauseBuilder(ImageChangeCauseFluent<?> fluent,ImageChangeCause instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFromRef(instance.getFromRef()); 
            fluent.withImageID(instance.getImageID()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageChangeCauseBuilder(ImageChangeCause instance){
            this(instance,true);
    }
    public ImageChangeCauseBuilder(ImageChangeCause instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFromRef(instance.getFromRef()); 
            this.withImageID(instance.getImageID()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageChangeCauseBuilder(Validator validator){
            this(new ImageChangeCause(), true);
    }
    public ImageChangeCauseBuilder(ImageChangeCauseFluent<?> fluent,ImageChangeCause instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFromRef(instance.getFromRef()); 
            fluent.withImageID(instance.getImageID()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageChangeCauseBuilder(ImageChangeCause instance,Validator validator){
            this.fluent = this; 
            this.withFromRef(instance.getFromRef()); 
            this.withImageID(instance.getImageID()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageChangeCause build(){
            ImageChangeCause buildable = new ImageChangeCause(fluent.getFromRef(),fluent.getImageID());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageChangeCauseBuilder that = (ImageChangeCauseBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
