package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EventBuilder extends EventFluentImpl<EventBuilder> implements VisitableBuilder<Event,EventBuilder>{

    EventFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EventBuilder(){
            this(true);
    }
    public EventBuilder(Boolean validationEnabled){
            this(new Event(), validationEnabled);
    }
    public EventBuilder(EventFluent<?> fluent){
            this(fluent, true);
    }
    public EventBuilder(EventFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Event(), validationEnabled);
    }
    public EventBuilder(EventFluent<?> fluent,Event instance){
            this(fluent, instance, true);
    }
    public EventBuilder(EventFluent<?> fluent,Event instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAction(instance.getAction()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withCount(instance.getCount()); 
            fluent.withEventTime(instance.getEventTime()); 
            fluent.withFirstTimestamp(instance.getFirstTimestamp()); 
            fluent.withInvolvedObject(instance.getInvolvedObject()); 
            fluent.withKind(instance.getKind()); 
            fluent.withLastTimestamp(instance.getLastTimestamp()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withReason(instance.getReason()); 
            fluent.withRelated(instance.getRelated()); 
            fluent.withReportingComponent(instance.getReportingComponent()); 
            fluent.withReportingInstance(instance.getReportingInstance()); 
            fluent.withSeries(instance.getSeries()); 
            fluent.withSource(instance.getSource()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public EventBuilder(Event instance){
            this(instance,true);
    }
    public EventBuilder(Event instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAction(instance.getAction()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withCount(instance.getCount()); 
            this.withEventTime(instance.getEventTime()); 
            this.withFirstTimestamp(instance.getFirstTimestamp()); 
            this.withInvolvedObject(instance.getInvolvedObject()); 
            this.withKind(instance.getKind()); 
            this.withLastTimestamp(instance.getLastTimestamp()); 
            this.withMessage(instance.getMessage()); 
            this.withMetadata(instance.getMetadata()); 
            this.withReason(instance.getReason()); 
            this.withRelated(instance.getRelated()); 
            this.withReportingComponent(instance.getReportingComponent()); 
            this.withReportingInstance(instance.getReportingInstance()); 
            this.withSeries(instance.getSeries()); 
            this.withSource(instance.getSource()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public EventBuilder(Validator validator){
            this(new Event(), true);
    }
    public EventBuilder(EventFluent<?> fluent,Event instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAction(instance.getAction()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withCount(instance.getCount()); 
            fluent.withEventTime(instance.getEventTime()); 
            fluent.withFirstTimestamp(instance.getFirstTimestamp()); 
            fluent.withInvolvedObject(instance.getInvolvedObject()); 
            fluent.withKind(instance.getKind()); 
            fluent.withLastTimestamp(instance.getLastTimestamp()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withReason(instance.getReason()); 
            fluent.withRelated(instance.getRelated()); 
            fluent.withReportingComponent(instance.getReportingComponent()); 
            fluent.withReportingInstance(instance.getReportingInstance()); 
            fluent.withSeries(instance.getSeries()); 
            fluent.withSource(instance.getSource()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EventBuilder(Event instance,Validator validator){
            this.fluent = this; 
            this.withAction(instance.getAction()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withCount(instance.getCount()); 
            this.withEventTime(instance.getEventTime()); 
            this.withFirstTimestamp(instance.getFirstTimestamp()); 
            this.withInvolvedObject(instance.getInvolvedObject()); 
            this.withKind(instance.getKind()); 
            this.withLastTimestamp(instance.getLastTimestamp()); 
            this.withMessage(instance.getMessage()); 
            this.withMetadata(instance.getMetadata()); 
            this.withReason(instance.getReason()); 
            this.withRelated(instance.getRelated()); 
            this.withReportingComponent(instance.getReportingComponent()); 
            this.withReportingInstance(instance.getReportingInstance()); 
            this.withSeries(instance.getSeries()); 
            this.withSource(instance.getSource()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Event build(){
            Event buildable = new Event(fluent.getAction(),fluent.getApiVersion(),fluent.getCount(),fluent.getEventTime(),fluent.getFirstTimestamp(),fluent.getInvolvedObject(),fluent.getKind(),fluent.getLastTimestamp(),fluent.getMessage(),fluent.getMetadata(),fluent.getReason(),fluent.getRelated(),fluent.getReportingComponent(),fluent.getReportingInstance(),fluent.getSeries(),fluent.getSource(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EventBuilder that = (EventBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
