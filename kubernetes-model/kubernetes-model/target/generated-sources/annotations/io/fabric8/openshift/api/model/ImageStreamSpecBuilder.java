package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageStreamSpecBuilder extends ImageStreamSpecFluentImpl<ImageStreamSpecBuilder> implements VisitableBuilder<ImageStreamSpec,ImageStreamSpecBuilder>{

    ImageStreamSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageStreamSpecBuilder(){
            this(true);
    }
    public ImageStreamSpecBuilder(Boolean validationEnabled){
            this(new ImageStreamSpec(), validationEnabled);
    }
    public ImageStreamSpecBuilder(ImageStreamSpecFluent<?> fluent){
            this(fluent, true);
    }
    public ImageStreamSpecBuilder(ImageStreamSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageStreamSpec(), validationEnabled);
    }
    public ImageStreamSpecBuilder(ImageStreamSpecFluent<?> fluent,ImageStreamSpec instance){
            this(fluent, instance, true);
    }
    public ImageStreamSpecBuilder(ImageStreamSpecFluent<?> fluent,ImageStreamSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDockerImageRepository(instance.getDockerImageRepository()); 
            fluent.withLookupPolicy(instance.getLookupPolicy()); 
            fluent.withTags(instance.getTags()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamSpecBuilder(ImageStreamSpec instance){
            this(instance,true);
    }
    public ImageStreamSpecBuilder(ImageStreamSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDockerImageRepository(instance.getDockerImageRepository()); 
            this.withLookupPolicy(instance.getLookupPolicy()); 
            this.withTags(instance.getTags()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamSpecBuilder(Validator validator){
            this(new ImageStreamSpec(), true);
    }
    public ImageStreamSpecBuilder(ImageStreamSpecFluent<?> fluent,ImageStreamSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDockerImageRepository(instance.getDockerImageRepository()); 
            fluent.withLookupPolicy(instance.getLookupPolicy()); 
            fluent.withTags(instance.getTags()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageStreamSpecBuilder(ImageStreamSpec instance,Validator validator){
            this.fluent = this; 
            this.withDockerImageRepository(instance.getDockerImageRepository()); 
            this.withLookupPolicy(instance.getLookupPolicy()); 
            this.withTags(instance.getTags()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageStreamSpec build(){
            ImageStreamSpec buildable = new ImageStreamSpec(fluent.getDockerImageRepository(),fluent.getLookupPolicy(),fluent.getTags());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageStreamSpecBuilder that = (ImageStreamSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
