package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageSourcePathBuilder extends ImageSourcePathFluentImpl<ImageSourcePathBuilder> implements VisitableBuilder<ImageSourcePath,ImageSourcePathBuilder>{

    ImageSourcePathFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageSourcePathBuilder(){
            this(true);
    }
    public ImageSourcePathBuilder(Boolean validationEnabled){
            this(new ImageSourcePath(), validationEnabled);
    }
    public ImageSourcePathBuilder(ImageSourcePathFluent<?> fluent){
            this(fluent, true);
    }
    public ImageSourcePathBuilder(ImageSourcePathFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageSourcePath(), validationEnabled);
    }
    public ImageSourcePathBuilder(ImageSourcePathFluent<?> fluent,ImageSourcePath instance){
            this(fluent, instance, true);
    }
    public ImageSourcePathBuilder(ImageSourcePathFluent<?> fluent,ImageSourcePath instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDestinationDir(instance.getDestinationDir()); 
            fluent.withSourcePath(instance.getSourcePath()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageSourcePathBuilder(ImageSourcePath instance){
            this(instance,true);
    }
    public ImageSourcePathBuilder(ImageSourcePath instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDestinationDir(instance.getDestinationDir()); 
            this.withSourcePath(instance.getSourcePath()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageSourcePathBuilder(Validator validator){
            this(new ImageSourcePath(), true);
    }
    public ImageSourcePathBuilder(ImageSourcePathFluent<?> fluent,ImageSourcePath instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDestinationDir(instance.getDestinationDir()); 
            fluent.withSourcePath(instance.getSourcePath()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageSourcePathBuilder(ImageSourcePath instance,Validator validator){
            this.fluent = this; 
            this.withDestinationDir(instance.getDestinationDir()); 
            this.withSourcePath(instance.getSourcePath()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageSourcePath build(){
            ImageSourcePath buildable = new ImageSourcePath(fluent.getDestinationDir(),fluent.getSourcePath());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageSourcePathBuilder that = (ImageSourcePathBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
