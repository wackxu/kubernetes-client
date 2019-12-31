package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageStreamListBuilder extends ImageStreamListFluentImpl<ImageStreamListBuilder> implements VisitableBuilder<ImageStreamList,ImageStreamListBuilder>{

    ImageStreamListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageStreamListBuilder(){
            this(true);
    }
    public ImageStreamListBuilder(Boolean validationEnabled){
            this(new ImageStreamList(), validationEnabled);
    }
    public ImageStreamListBuilder(ImageStreamListFluent<?> fluent){
            this(fluent, true);
    }
    public ImageStreamListBuilder(ImageStreamListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageStreamList(), validationEnabled);
    }
    public ImageStreamListBuilder(ImageStreamListFluent<?> fluent,ImageStreamList instance){
            this(fluent, instance, true);
    }
    public ImageStreamListBuilder(ImageStreamListFluent<?> fluent,ImageStreamList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamListBuilder(ImageStreamList instance){
            this(instance,true);
    }
    public ImageStreamListBuilder(ImageStreamList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageStreamListBuilder(Validator validator){
            this(new ImageStreamList(), true);
    }
    public ImageStreamListBuilder(ImageStreamListFluent<?> fluent,ImageStreamList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageStreamListBuilder(ImageStreamList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageStreamList build(){
            ImageStreamList buildable = new ImageStreamList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageStreamListBuilder that = (ImageStreamListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
