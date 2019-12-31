package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageStreamStatusBuilder extends ImageStreamStatusFluentImpl<ImageStreamStatusBuilder> implements VisitableBuilder<ImageStreamStatus,ImageStreamStatusBuilder>{

    ImageStreamStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageStreamStatusBuilder(){
            this(true);
    }
    public ImageStreamStatusBuilder(Boolean validationEnabled){
            this(new ImageStreamStatus(), validationEnabled);
    }
    public ImageStreamStatusBuilder(ImageStreamStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ImageStreamStatusBuilder(ImageStreamStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageStreamStatus(), validationEnabled);
    }
    public ImageStreamStatusBuilder(ImageStreamStatusFluent<?> fluent,ImageStreamStatus instance){
            this(fluent, instance, true);
    }
    public ImageStreamStatusBuilder(ImageStreamStatusFluent<?> fluent,ImageStreamStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDockerImageRepository(instance.getDockerImageRepository()); 
            fluent.withPublicDockerImageRepository(instance.getPublicDockerImageRepository()); 
            fluent.withTags(instance.getTags()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamStatusBuilder(ImageStreamStatus instance){
            this(instance,true);
    }
    public ImageStreamStatusBuilder(ImageStreamStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDockerImageRepository(instance.getDockerImageRepository()); 
            this.withPublicDockerImageRepository(instance.getPublicDockerImageRepository()); 
            this.withTags(instance.getTags()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamStatusBuilder(Validator validator){
            this(new ImageStreamStatus(), true);
    }
    public ImageStreamStatusBuilder(ImageStreamStatusFluent<?> fluent,ImageStreamStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDockerImageRepository(instance.getDockerImageRepository()); 
            fluent.withPublicDockerImageRepository(instance.getPublicDockerImageRepository()); 
            fluent.withTags(instance.getTags()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageStreamStatusBuilder(ImageStreamStatus instance,Validator validator){
            this.fluent = this; 
            this.withDockerImageRepository(instance.getDockerImageRepository()); 
            this.withPublicDockerImageRepository(instance.getPublicDockerImageRepository()); 
            this.withTags(instance.getTags()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageStreamStatus build(){
            ImageStreamStatus buildable = new ImageStreamStatus(fluent.getDockerImageRepository(),fluent.getPublicDockerImageRepository(),fluent.getTags());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageStreamStatusBuilder that = (ImageStreamStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
