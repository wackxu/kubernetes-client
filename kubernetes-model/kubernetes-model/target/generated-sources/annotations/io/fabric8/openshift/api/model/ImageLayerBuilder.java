package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageLayerBuilder extends ImageLayerFluentImpl<ImageLayerBuilder> implements VisitableBuilder<ImageLayer,ImageLayerBuilder>{

    ImageLayerFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageLayerBuilder(){
            this(true);
    }
    public ImageLayerBuilder(Boolean validationEnabled){
            this(new ImageLayer(), validationEnabled);
    }
    public ImageLayerBuilder(ImageLayerFluent<?> fluent){
            this(fluent, true);
    }
    public ImageLayerBuilder(ImageLayerFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageLayer(), validationEnabled);
    }
    public ImageLayerBuilder(ImageLayerFluent<?> fluent,ImageLayer instance){
            this(fluent, instance, true);
    }
    public ImageLayerBuilder(ImageLayerFluent<?> fluent,ImageLayer instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMediaType(instance.getMediaType()); 
            fluent.withName(instance.getName()); 
            fluent.withSize(instance.getSize()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageLayerBuilder(ImageLayer instance){
            this(instance,true);
    }
    public ImageLayerBuilder(ImageLayer instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMediaType(instance.getMediaType()); 
            this.withName(instance.getName()); 
            this.withSize(instance.getSize()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageLayerBuilder(Validator validator){
            this(new ImageLayer(), true);
    }
    public ImageLayerBuilder(ImageLayerFluent<?> fluent,ImageLayer instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMediaType(instance.getMediaType()); 
            fluent.withName(instance.getName()); 
            fluent.withSize(instance.getSize()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageLayerBuilder(ImageLayer instance,Validator validator){
            this.fluent = this; 
            this.withMediaType(instance.getMediaType()); 
            this.withName(instance.getName()); 
            this.withSize(instance.getSize()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageLayer build(){
            ImageLayer buildable = new ImageLayer(fluent.getMediaType(),fluent.getName(),fluent.getSize());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageLayerBuilder that = (ImageLayerBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
