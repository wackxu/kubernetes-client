package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageImportSpecBuilder extends ImageImportSpecFluentImpl<ImageImportSpecBuilder> implements VisitableBuilder<ImageImportSpec,ImageImportSpecBuilder>{

    ImageImportSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageImportSpecBuilder(){
            this(true);
    }
    public ImageImportSpecBuilder(Boolean validationEnabled){
            this(new ImageImportSpec(), validationEnabled);
    }
    public ImageImportSpecBuilder(ImageImportSpecFluent<?> fluent){
            this(fluent, true);
    }
    public ImageImportSpecBuilder(ImageImportSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageImportSpec(), validationEnabled);
    }
    public ImageImportSpecBuilder(ImageImportSpecFluent<?> fluent,ImageImportSpec instance){
            this(fluent, instance, true);
    }
    public ImageImportSpecBuilder(ImageImportSpecFluent<?> fluent,ImageImportSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFrom(instance.getFrom()); 
            fluent.withImportPolicy(instance.getImportPolicy()); 
            fluent.withIncludeManifest(instance.getIncludeManifest()); 
            fluent.withReferencePolicy(instance.getReferencePolicy()); 
            fluent.withTo(instance.getTo()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageImportSpecBuilder(ImageImportSpec instance){
            this(instance,true);
    }
    public ImageImportSpecBuilder(ImageImportSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFrom(instance.getFrom()); 
            this.withImportPolicy(instance.getImportPolicy()); 
            this.withIncludeManifest(instance.getIncludeManifest()); 
            this.withReferencePolicy(instance.getReferencePolicy()); 
            this.withTo(instance.getTo()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageImportSpecBuilder(Validator validator){
            this(new ImageImportSpec(), true);
    }
    public ImageImportSpecBuilder(ImageImportSpecFluent<?> fluent,ImageImportSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFrom(instance.getFrom()); 
            fluent.withImportPolicy(instance.getImportPolicy()); 
            fluent.withIncludeManifest(instance.getIncludeManifest()); 
            fluent.withReferencePolicy(instance.getReferencePolicy()); 
            fluent.withTo(instance.getTo()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageImportSpecBuilder(ImageImportSpec instance,Validator validator){
            this.fluent = this; 
            this.withFrom(instance.getFrom()); 
            this.withImportPolicy(instance.getImportPolicy()); 
            this.withIncludeManifest(instance.getIncludeManifest()); 
            this.withReferencePolicy(instance.getReferencePolicy()); 
            this.withTo(instance.getTo()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageImportSpec build(){
            ImageImportSpec buildable = new ImageImportSpec(fluent.getFrom(),fluent.getImportPolicy(),fluent.isIncludeManifest(),fluent.getReferencePolicy(),fluent.getTo());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageImportSpecBuilder that = (ImageImportSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
