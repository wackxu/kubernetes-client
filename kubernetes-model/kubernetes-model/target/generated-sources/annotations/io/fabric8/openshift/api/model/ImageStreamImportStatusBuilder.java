package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageStreamImportStatusBuilder extends ImageStreamImportStatusFluentImpl<ImageStreamImportStatusBuilder> implements VisitableBuilder<ImageStreamImportStatus,ImageStreamImportStatusBuilder>{

    ImageStreamImportStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageStreamImportStatusBuilder(){
            this(true);
    }
    public ImageStreamImportStatusBuilder(Boolean validationEnabled){
            this(new ImageStreamImportStatus(), validationEnabled);
    }
    public ImageStreamImportStatusBuilder(ImageStreamImportStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ImageStreamImportStatusBuilder(ImageStreamImportStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageStreamImportStatus(), validationEnabled);
    }
    public ImageStreamImportStatusBuilder(ImageStreamImportStatusFluent<?> fluent,ImageStreamImportStatus instance){
            this(fluent, instance, true);
    }
    public ImageStreamImportStatusBuilder(ImageStreamImportStatusFluent<?> fluent,ImageStreamImportStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withImages(instance.getImages()); 
            fluent.withImport(instance.getImport()); 
            fluent.withRepository(instance.getRepository()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamImportStatusBuilder(ImageStreamImportStatus instance){
            this(instance,true);
    }
    public ImageStreamImportStatusBuilder(ImageStreamImportStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withImages(instance.getImages()); 
            this.withImport(instance.getImport()); 
            this.withRepository(instance.getRepository()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamImportStatusBuilder(Validator validator){
            this(new ImageStreamImportStatus(), true);
    }
    public ImageStreamImportStatusBuilder(ImageStreamImportStatusFluent<?> fluent,ImageStreamImportStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withImages(instance.getImages()); 
            fluent.withImport(instance.getImport()); 
            fluent.withRepository(instance.getRepository()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageStreamImportStatusBuilder(ImageStreamImportStatus instance,Validator validator){
            this.fluent = this; 
            this.withImages(instance.getImages()); 
            this.withImport(instance.getImport()); 
            this.withRepository(instance.getRepository()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageStreamImportStatus build(){
            ImageStreamImportStatus buildable = new ImageStreamImportStatus(fluent.getImages(),fluent.getImport(),fluent.getRepository());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageStreamImportStatusBuilder that = (ImageStreamImportStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
