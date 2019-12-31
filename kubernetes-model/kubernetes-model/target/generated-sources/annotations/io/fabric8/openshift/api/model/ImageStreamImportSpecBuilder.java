package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageStreamImportSpecBuilder extends ImageStreamImportSpecFluentImpl<ImageStreamImportSpecBuilder> implements VisitableBuilder<ImageStreamImportSpec,ImageStreamImportSpecBuilder>{

    ImageStreamImportSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageStreamImportSpecBuilder(){
            this(true);
    }
    public ImageStreamImportSpecBuilder(Boolean validationEnabled){
            this(new ImageStreamImportSpec(), validationEnabled);
    }
    public ImageStreamImportSpecBuilder(ImageStreamImportSpecFluent<?> fluent){
            this(fluent, true);
    }
    public ImageStreamImportSpecBuilder(ImageStreamImportSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageStreamImportSpec(), validationEnabled);
    }
    public ImageStreamImportSpecBuilder(ImageStreamImportSpecFluent<?> fluent,ImageStreamImportSpec instance){
            this(fluent, instance, true);
    }
    public ImageStreamImportSpecBuilder(ImageStreamImportSpecFluent<?> fluent,ImageStreamImportSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withImages(instance.getImages()); 
            fluent.withImport(instance.getImport()); 
            fluent.withRepository(instance.getRepository()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamImportSpecBuilder(ImageStreamImportSpec instance){
            this(instance,true);
    }
    public ImageStreamImportSpecBuilder(ImageStreamImportSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withImages(instance.getImages()); 
            this.withImport(instance.getImport()); 
            this.withRepository(instance.getRepository()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamImportSpecBuilder(Validator validator){
            this(new ImageStreamImportSpec(), true);
    }
    public ImageStreamImportSpecBuilder(ImageStreamImportSpecFluent<?> fluent,ImageStreamImportSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withImages(instance.getImages()); 
            fluent.withImport(instance.getImport()); 
            fluent.withRepository(instance.getRepository()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageStreamImportSpecBuilder(ImageStreamImportSpec instance,Validator validator){
            this.fluent = this; 
            this.withImages(instance.getImages()); 
            this.withImport(instance.getImport()); 
            this.withRepository(instance.getRepository()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageStreamImportSpec build(){
            ImageStreamImportSpec buildable = new ImageStreamImportSpec(fluent.getImages(),fluent.isImport(),fluent.getRepository());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageStreamImportSpecBuilder that = (ImageStreamImportSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
