package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EventSourceBuilder extends EventSourceFluentImpl<EventSourceBuilder> implements VisitableBuilder<EventSource,EventSourceBuilder>{

    EventSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EventSourceBuilder(){
            this(true);
    }
    public EventSourceBuilder(Boolean validationEnabled){
            this(new EventSource(), validationEnabled);
    }
    public EventSourceBuilder(EventSourceFluent<?> fluent){
            this(fluent, true);
    }
    public EventSourceBuilder(EventSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new EventSource(), validationEnabled);
    }
    public EventSourceBuilder(EventSourceFluent<?> fluent,EventSource instance){
            this(fluent, instance, true);
    }
    public EventSourceBuilder(EventSourceFluent<?> fluent,EventSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withComponent(instance.getComponent()); 
            fluent.withHost(instance.getHost()); 
            this.validationEnabled = validationEnabled; 
    }
    public EventSourceBuilder(EventSource instance){
            this(instance,true);
    }
    public EventSourceBuilder(EventSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withComponent(instance.getComponent()); 
            this.withHost(instance.getHost()); 
            this.validationEnabled = validationEnabled; 
    }
    public EventSourceBuilder(Validator validator){
            this(new EventSource(), true);
    }
    public EventSourceBuilder(EventSourceFluent<?> fluent,EventSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withComponent(instance.getComponent()); 
            fluent.withHost(instance.getHost()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EventSourceBuilder(EventSource instance,Validator validator){
            this.fluent = this; 
            this.withComponent(instance.getComponent()); 
            this.withHost(instance.getHost()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public EventSource build(){
            EventSource buildable = new EventSource(fluent.getComponent(),fluent.getHost());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EventSourceBuilder that = (EventSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
