package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageSourceBuilder extends ImageSourceFluentImpl<ImageSourceBuilder> implements VisitableBuilder<ImageSource,ImageSourceBuilder>{

    ImageSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageSourceBuilder(){
            this(true);
    }
    public ImageSourceBuilder(Boolean validationEnabled){
            this(new ImageSource(), validationEnabled);
    }
    public ImageSourceBuilder(ImageSourceFluent<?> fluent){
            this(fluent, true);
    }
    public ImageSourceBuilder(ImageSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageSource(), validationEnabled);
    }
    public ImageSourceBuilder(ImageSourceFluent<?> fluent,ImageSource instance){
            this(fluent, instance, true);
    }
    public ImageSourceBuilder(ImageSourceFluent<?> fluent,ImageSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAs(instance.getAs()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withPaths(instance.getPaths()); 
            fluent.withPullSecret(instance.getPullSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageSourceBuilder(ImageSource instance){
            this(instance,true);
    }
    public ImageSourceBuilder(ImageSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAs(instance.getAs()); 
            this.withFrom(instance.getFrom()); 
            this.withPaths(instance.getPaths()); 
            this.withPullSecret(instance.getPullSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageSourceBuilder(Validator validator){
            this(new ImageSource(), true);
    }
    public ImageSourceBuilder(ImageSourceFluent<?> fluent,ImageSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAs(instance.getAs()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withPaths(instance.getPaths()); 
            fluent.withPullSecret(instance.getPullSecret()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageSourceBuilder(ImageSource instance,Validator validator){
            this.fluent = this; 
            this.withAs(instance.getAs()); 
            this.withFrom(instance.getFrom()); 
            this.withPaths(instance.getPaths()); 
            this.withPullSecret(instance.getPullSecret()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageSource build(){
            ImageSource buildable = new ImageSource(fluent.getAs(),fluent.getFrom(),fluent.getPaths(),fluent.getPullSecret());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageSourceBuilder that = (ImageSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
