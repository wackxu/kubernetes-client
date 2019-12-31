package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EventListBuilder extends EventListFluentImpl<EventListBuilder> implements VisitableBuilder<EventList,EventListBuilder>{

    EventListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EventListBuilder(){
            this(true);
    }
    public EventListBuilder(Boolean validationEnabled){
            this(new EventList(), validationEnabled);
    }
    public EventListBuilder(EventListFluent<?> fluent){
            this(fluent, true);
    }
    public EventListBuilder(EventListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new EventList(), validationEnabled);
    }
    public EventListBuilder(EventListFluent<?> fluent,EventList instance){
            this(fluent, instance, true);
    }
    public EventListBuilder(EventListFluent<?> fluent,EventList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public EventListBuilder(EventList instance){
            this(instance,true);
    }
    public EventListBuilder(EventList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public EventListBuilder(Validator validator){
            this(new EventList(), true);
    }
    public EventListBuilder(EventListFluent<?> fluent,EventList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EventListBuilder(EventList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public EventList build(){
            EventList buildable = new EventList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EventListBuilder that = (EventListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
