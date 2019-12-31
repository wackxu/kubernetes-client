package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageLabelBuilder extends ImageLabelFluentImpl<ImageLabelBuilder> implements VisitableBuilder<ImageLabel,ImageLabelBuilder>{

    ImageLabelFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageLabelBuilder(){
            this(true);
    }
    public ImageLabelBuilder(Boolean validationEnabled){
            this(new ImageLabel(), validationEnabled);
    }
    public ImageLabelBuilder(ImageLabelFluent<?> fluent){
            this(fluent, true);
    }
    public ImageLabelBuilder(ImageLabelFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageLabel(), validationEnabled);
    }
    public ImageLabelBuilder(ImageLabelFluent<?> fluent,ImageLabel instance){
            this(fluent, instance, true);
    }
    public ImageLabelBuilder(ImageLabelFluent<?> fluent,ImageLabel instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageLabelBuilder(ImageLabel instance){
            this(instance,true);
    }
    public ImageLabelBuilder(ImageLabel instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageLabelBuilder(Validator validator){
            this(new ImageLabel(), true);
    }
    public ImageLabelBuilder(ImageLabelFluent<?> fluent,ImageLabel instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withValue(instance.getValue()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageLabelBuilder(ImageLabel instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageLabel build(){
            ImageLabel buildable = new ImageLabel(fluent.getName(),fluent.getValue());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageLabelBuilder that = (ImageLabelBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
