package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageListBuilder extends ImageListFluentImpl<ImageListBuilder> implements VisitableBuilder<ImageList,ImageListBuilder>{

    ImageListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageListBuilder(){
            this(true);
    }
    public ImageListBuilder(Boolean validationEnabled){
            this(new ImageList(), validationEnabled);
    }
    public ImageListBuilder(ImageListFluent<?> fluent){
            this(fluent, true);
    }
    public ImageListBuilder(ImageListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageList(), validationEnabled);
    }
    public ImageListBuilder(ImageListFluent<?> fluent,ImageList instance){
            this(fluent, instance, true);
    }
    public ImageListBuilder(ImageListFluent<?> fluent,ImageList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageListBuilder(ImageList instance){
            this(instance,true);
    }
    public ImageListBuilder(ImageList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageListBuilder(Validator validator){
            this(new ImageList(), true);
    }
    public ImageListBuilder(ImageListFluent<?> fluent,ImageList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageListBuilder(ImageList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageList build(){
            ImageList buildable = new ImageList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageListBuilder that = (ImageListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
