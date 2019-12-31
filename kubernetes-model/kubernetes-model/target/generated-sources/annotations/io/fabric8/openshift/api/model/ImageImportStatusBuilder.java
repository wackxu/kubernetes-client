package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageImportStatusBuilder extends ImageImportStatusFluentImpl<ImageImportStatusBuilder> implements VisitableBuilder<ImageImportStatus,ImageImportStatusBuilder>{

    ImageImportStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageImportStatusBuilder(){
            this(true);
    }
    public ImageImportStatusBuilder(Boolean validationEnabled){
            this(new ImageImportStatus(), validationEnabled);
    }
    public ImageImportStatusBuilder(ImageImportStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ImageImportStatusBuilder(ImageImportStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageImportStatus(), validationEnabled);
    }
    public ImageImportStatusBuilder(ImageImportStatusFluent<?> fluent,ImageImportStatus instance){
            this(fluent, instance, true);
    }
    public ImageImportStatusBuilder(ImageImportStatusFluent<?> fluent,ImageImportStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withImage(instance.getImage()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withTag(instance.getTag()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageImportStatusBuilder(ImageImportStatus instance){
            this(instance,true);
    }
    public ImageImportStatusBuilder(ImageImportStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withImage(instance.getImage()); 
            this.withStatus(instance.getStatus()); 
            this.withTag(instance.getTag()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageImportStatusBuilder(Validator validator){
            this(new ImageImportStatus(), true);
    }
    public ImageImportStatusBuilder(ImageImportStatusFluent<?> fluent,ImageImportStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withImage(instance.getImage()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withTag(instance.getTag()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageImportStatusBuilder(ImageImportStatus instance,Validator validator){
            this.fluent = this; 
            this.withImage(instance.getImage()); 
            this.withStatus(instance.getStatus()); 
            this.withTag(instance.getTag()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageImportStatus build(){
            ImageImportStatus buildable = new ImageImportStatus(fluent.getImage(),fluent.getStatus(),fluent.getTag());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageImportStatusBuilder that = (ImageImportStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
