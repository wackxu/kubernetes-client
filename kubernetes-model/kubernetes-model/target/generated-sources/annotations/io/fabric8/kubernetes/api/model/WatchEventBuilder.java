package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class WatchEventBuilder extends WatchEventFluentImpl<WatchEventBuilder> implements VisitableBuilder<WatchEvent,WatchEventBuilder>{

    WatchEventFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public WatchEventBuilder(){
            this(true);
    }
    public WatchEventBuilder(Boolean validationEnabled){
            this(new WatchEvent(), validationEnabled);
    }
    public WatchEventBuilder(WatchEventFluent<?> fluent){
            this(fluent, true);
    }
    public WatchEventBuilder(WatchEventFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new WatchEvent(), validationEnabled);
    }
    public WatchEventBuilder(WatchEventFluent<?> fluent,WatchEvent instance){
            this(fluent, instance, true);
    }
    public WatchEventBuilder(WatchEventFluent<?> fluent,WatchEvent instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withObject(instance.getObject()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public WatchEventBuilder(WatchEvent instance){
            this(instance,true);
    }
    public WatchEventBuilder(WatchEvent instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withObject(instance.getObject()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public WatchEventBuilder(Validator validator){
            this(new WatchEvent(), true);
    }
    public WatchEventBuilder(WatchEventFluent<?> fluent,WatchEvent instance,Validator validator){
            this.fluent = fluent; 
            fluent.withObject(instance.getObject()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public WatchEventBuilder(WatchEvent instance,Validator validator){
            this.fluent = this; 
            this.withObject(instance.getObject()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public WatchEvent build(){
            WatchEvent buildable = new WatchEvent(fluent.getObject(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            WatchEventBuilder that = (WatchEventBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
