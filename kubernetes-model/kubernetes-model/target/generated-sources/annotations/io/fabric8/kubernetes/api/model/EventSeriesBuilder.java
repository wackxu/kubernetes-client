package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EventSeriesBuilder extends EventSeriesFluentImpl<EventSeriesBuilder> implements VisitableBuilder<EventSeries,EventSeriesBuilder>{

    EventSeriesFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EventSeriesBuilder(){
            this(true);
    }
    public EventSeriesBuilder(Boolean validationEnabled){
            this(new EventSeries(), validationEnabled);
    }
    public EventSeriesBuilder(EventSeriesFluent<?> fluent){
            this(fluent, true);
    }
    public EventSeriesBuilder(EventSeriesFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new EventSeries(), validationEnabled);
    }
    public EventSeriesBuilder(EventSeriesFluent<?> fluent,EventSeries instance){
            this(fluent, instance, true);
    }
    public EventSeriesBuilder(EventSeriesFluent<?> fluent,EventSeries instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCount(instance.getCount()); 
            fluent.withLastObservedTime(instance.getLastObservedTime()); 
            fluent.withState(instance.getState()); 
            this.validationEnabled = validationEnabled; 
    }
    public EventSeriesBuilder(EventSeries instance){
            this(instance,true);
    }
    public EventSeriesBuilder(EventSeries instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCount(instance.getCount()); 
            this.withLastObservedTime(instance.getLastObservedTime()); 
            this.withState(instance.getState()); 
            this.validationEnabled = validationEnabled; 
    }
    public EventSeriesBuilder(Validator validator){
            this(new EventSeries(), true);
    }
    public EventSeriesBuilder(EventSeriesFluent<?> fluent,EventSeries instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCount(instance.getCount()); 
            fluent.withLastObservedTime(instance.getLastObservedTime()); 
            fluent.withState(instance.getState()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EventSeriesBuilder(EventSeries instance,Validator validator){
            this.fluent = this; 
            this.withCount(instance.getCount()); 
            this.withLastObservedTime(instance.getLastObservedTime()); 
            this.withState(instance.getState()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public EventSeries build(){
            EventSeries buildable = new EventSeries(fluent.getCount(),fluent.getLastObservedTime(),fluent.getState());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EventSeriesBuilder that = (EventSeriesBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
