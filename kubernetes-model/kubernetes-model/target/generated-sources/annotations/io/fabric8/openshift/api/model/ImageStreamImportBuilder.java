package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageStreamImportBuilder extends ImageStreamImportFluentImpl<ImageStreamImportBuilder> implements VisitableBuilder<ImageStreamImport,ImageStreamImportBuilder>{

    ImageStreamImportFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageStreamImportBuilder(){
            this(true);
    }
    public ImageStreamImportBuilder(Boolean validationEnabled){
            this(new ImageStreamImport(), validationEnabled);
    }
    public ImageStreamImportBuilder(ImageStreamImportFluent<?> fluent){
            this(fluent, true);
    }
    public ImageStreamImportBuilder(ImageStreamImportFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageStreamImport(), validationEnabled);
    }
    public ImageStreamImportBuilder(ImageStreamImportFluent<?> fluent,ImageStreamImport instance){
            this(fluent, instance, true);
    }
    public ImageStreamImportBuilder(ImageStreamImportFluent<?> fluent,ImageStreamImport instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamImportBuilder(ImageStreamImport instance){
            this(instance,true);
    }
    public ImageStreamImportBuilder(ImageStreamImport instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamImportBuilder(Validator validator){
            this(new ImageStreamImport(), true);
    }
    public ImageStreamImportBuilder(ImageStreamImportFluent<?> fluent,ImageStreamImport instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageStreamImportBuilder(ImageStreamImport instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageStreamImport build(){
            ImageStreamImport buildable = new ImageStreamImport(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageStreamImportBuilder that = (ImageStreamImportBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
