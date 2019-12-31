package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageChangeTriggerBuilder extends ImageChangeTriggerFluentImpl<ImageChangeTriggerBuilder> implements VisitableBuilder<ImageChangeTrigger,ImageChangeTriggerBuilder>{

    ImageChangeTriggerFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageChangeTriggerBuilder(){
            this(true);
    }
    public ImageChangeTriggerBuilder(Boolean validationEnabled){
            this(new ImageChangeTrigger(), validationEnabled);
    }
    public ImageChangeTriggerBuilder(ImageChangeTriggerFluent<?> fluent){
            this(fluent, true);
    }
    public ImageChangeTriggerBuilder(ImageChangeTriggerFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageChangeTrigger(), validationEnabled);
    }
    public ImageChangeTriggerBuilder(ImageChangeTriggerFluent<?> fluent,ImageChangeTrigger instance){
            this(fluent, instance, true);
    }
    public ImageChangeTriggerBuilder(ImageChangeTriggerFluent<?> fluent,ImageChangeTrigger instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFrom(instance.getFrom()); 
            fluent.withLastTriggeredImageID(instance.getLastTriggeredImageID()); 
            fluent.withPaused(instance.getPaused()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageChangeTriggerBuilder(ImageChangeTrigger instance){
            this(instance,true);
    }
    public ImageChangeTriggerBuilder(ImageChangeTrigger instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFrom(instance.getFrom()); 
            this.withLastTriggeredImageID(instance.getLastTriggeredImageID()); 
            this.withPaused(instance.getPaused()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageChangeTriggerBuilder(Validator validator){
            this(new ImageChangeTrigger(), true);
    }
    public ImageChangeTriggerBuilder(ImageChangeTriggerFluent<?> fluent,ImageChangeTrigger instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFrom(instance.getFrom()); 
            fluent.withLastTriggeredImageID(instance.getLastTriggeredImageID()); 
            fluent.withPaused(instance.getPaused()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageChangeTriggerBuilder(ImageChangeTrigger instance,Validator validator){
            this.fluent = this; 
            this.withFrom(instance.getFrom()); 
            this.withLastTriggeredImageID(instance.getLastTriggeredImageID()); 
            this.withPaused(instance.getPaused()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageChangeTrigger build(){
            ImageChangeTrigger buildable = new ImageChangeTrigger(fluent.getFrom(),fluent.getLastTriggeredImageID(),fluent.isPaused());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageChangeTriggerBuilder that = (ImageChangeTriggerBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
