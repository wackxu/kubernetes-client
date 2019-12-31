package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageStreamTagListBuilder extends ImageStreamTagListFluentImpl<ImageStreamTagListBuilder> implements VisitableBuilder<ImageStreamTagList,ImageStreamTagListBuilder>{

    ImageStreamTagListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageStreamTagListBuilder(){
            this(true);
    }
    public ImageStreamTagListBuilder(Boolean validationEnabled){
            this(new ImageStreamTagList(), validationEnabled);
    }
    public ImageStreamTagListBuilder(ImageStreamTagListFluent<?> fluent){
            this(fluent, true);
    }
    public ImageStreamTagListBuilder(ImageStreamTagListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageStreamTagList(), validationEnabled);
    }
    public ImageStreamTagListBuilder(ImageStreamTagListFluent<?> fluent,ImageStreamTagList instance){
            this(fluent, instance, true);
    }
    public ImageStreamTagListBuilder(ImageStreamTagListFluent<?> fluent,ImageStreamTagList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamTagListBuilder(ImageStreamTagList instance){
            this(instance,true);
    }
    public ImageStreamTagListBuilder(ImageStreamTagList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamTagListBuilder(Validator validator){
            this(new ImageStreamTagList(), true);
    }
    public ImageStreamTagListBuilder(ImageStreamTagListFluent<?> fluent,ImageStreamTagList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageStreamTagListBuilder(ImageStreamTagList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageStreamTagList build(){
            ImageStreamTagList buildable = new ImageStreamTagList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageStreamTagListBuilder that = (ImageStreamTagListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
