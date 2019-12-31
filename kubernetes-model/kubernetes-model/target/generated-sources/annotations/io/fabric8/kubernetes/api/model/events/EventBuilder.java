package io.fabric8.kubernetes.api.model.events;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EventBuilder extends io.fabric8.kubernetes.api.model.events.EventFluentImpl<io.fabric8.kubernetes.api.model.events.EventBuilder> implements VisitableBuilder<io.fabric8.kubernetes.api.model.events.Event,io.fabric8.kubernetes.api.model.events.EventBuilder>{

    io.fabric8.kubernetes.api.model.events.EventFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EventBuilder(){
            this(true);
    }
    public EventBuilder(Boolean validationEnabled){
            this(new Event(), validationEnabled);
    }
    public EventBuilder(io.fabric8.kubernetes.api.model.events.EventFluent<?> fluent){
            this(fluent, true);
    }
    public EventBuilder(io.fabric8.kubernetes.api.model.events.EventFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Event(), validationEnabled);
    }
    public EventBuilder(io.fabric8.kubernetes.api.model.events.EventFluent<?> fluent,io.fabric8.kubernetes.api.model.events.Event instance){
            this(fluent, instance, true);
    }
    public EventBuilder(io.fabric8.kubernetes.api.model.events.EventFluent<?> fluent,io.fabric8.kubernetes.api.model.events.Event instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAction(instance.getAction()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withDeprecatedCount(instance.getDeprecatedCount()); 
            fluent.withDeprecatedFirstTimestamp(instance.getDeprecatedFirstTimestamp()); 
            fluent.withDeprecatedLastTimestamp(instance.getDeprecatedLastTimestamp()); 
            fluent.withDeprecatedSource(instance.getDeprecatedSource()); 
            fluent.withEventTime(instance.getEventTime()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withNote(instance.getNote()); 
            fluent.withReason(instance.getReason()); 
            fluent.withRegarding(instance.getRegarding()); 
            fluent.withRelated(instance.getRelated()); 
            fluent.withReportingController(instance.getReportingController()); 
            fluent.withReportingInstance(instance.getReportingInstance()); 
            fluent.withSeries(instance.getSeries()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public EventBuilder(io.fabric8.kubernetes.api.model.events.Event instance){
            this(instance,true);
    }
    public EventBuilder(io.fabric8.kubernetes.api.model.events.Event instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAction(instance.getAction()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withDeprecatedCount(instance.getDeprecatedCount()); 
            this.withDeprecatedFirstTimestamp(instance.getDeprecatedFirstTimestamp()); 
            this.withDeprecatedLastTimestamp(instance.getDeprecatedLastTimestamp()); 
            this.withDeprecatedSource(instance.getDeprecatedSource()); 
            this.withEventTime(instance.getEventTime()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withNote(instance.getNote()); 
            this.withReason(instance.getReason()); 
            this.withRegarding(instance.getRegarding()); 
            this.withRelated(instance.getRelated()); 
            this.withReportingController(instance.getReportingController()); 
            this.withReportingInstance(instance.getReportingInstance()); 
            this.withSeries(instance.getSeries()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public EventBuilder(Validator validator){
            this(new Event(), true);
    }
    public EventBuilder(io.fabric8.kubernetes.api.model.events.EventFluent<?> fluent,io.fabric8.kubernetes.api.model.events.Event instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAction(instance.getAction()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withDeprecatedCount(instance.getDeprecatedCount()); 
            fluent.withDeprecatedFirstTimestamp(instance.getDeprecatedFirstTimestamp()); 
            fluent.withDeprecatedLastTimestamp(instance.getDeprecatedLastTimestamp()); 
            fluent.withDeprecatedSource(instance.getDeprecatedSource()); 
            fluent.withEventTime(instance.getEventTime()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withNote(instance.getNote()); 
            fluent.withReason(instance.getReason()); 
            fluent.withRegarding(instance.getRegarding()); 
            fluent.withRelated(instance.getRelated()); 
            fluent.withReportingController(instance.getReportingController()); 
            fluent.withReportingInstance(instance.getReportingInstance()); 
            fluent.withSeries(instance.getSeries()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EventBuilder(io.fabric8.kubernetes.api.model.events.Event instance,Validator validator){
            this.fluent = this; 
            this.withAction(instance.getAction()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withDeprecatedCount(instance.getDeprecatedCount()); 
            this.withDeprecatedFirstTimestamp(instance.getDeprecatedFirstTimestamp()); 
            this.withDeprecatedLastTimestamp(instance.getDeprecatedLastTimestamp()); 
            this.withDeprecatedSource(instance.getDeprecatedSource()); 
            this.withEventTime(instance.getEventTime()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withNote(instance.getNote()); 
            this.withReason(instance.getReason()); 
            this.withRegarding(instance.getRegarding()); 
            this.withRelated(instance.getRelated()); 
            this.withReportingController(instance.getReportingController()); 
            this.withReportingInstance(instance.getReportingInstance()); 
            this.withSeries(instance.getSeries()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public io.fabric8.kubernetes.api.model.events.Event build(){
            Event buildable = new Event(fluent.getAction(),fluent.getApiVersion(),fluent.getDeprecatedCount(),fluent.getDeprecatedFirstTimestamp(),fluent.getDeprecatedLastTimestamp(),fluent.getDeprecatedSource(),fluent.getEventTime(),fluent.getKind(),fluent.getMetadata(),fluent.getNote(),fluent.getReason(),fluent.getRegarding(),fluent.getRelated(),fluent.getReportingController(),fluent.getReportingInstance(),fluent.getSeries(),fluent.getType());
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
