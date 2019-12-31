package io.fabric8.kubernetes.api.model.events;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EventSeriesBuilder extends io.fabric8.kubernetes.api.model.events.EventSeriesFluentImpl<io.fabric8.kubernetes.api.model.events.EventSeriesBuilder> implements VisitableBuilder<io.fabric8.kubernetes.api.model.events.EventSeries,io.fabric8.kubernetes.api.model.events.EventSeriesBuilder>{

    io.fabric8.kubernetes.api.model.events.EventSeriesFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EventSeriesBuilder(){
            this(true);
    }
    public EventSeriesBuilder(Boolean validationEnabled){
            this(new EventSeries(), validationEnabled);
    }
    public EventSeriesBuilder(io.fabric8.kubernetes.api.model.events.EventSeriesFluent<?> fluent){
            this(fluent, true);
    }
    public EventSeriesBuilder(io.fabric8.kubernetes.api.model.events.EventSeriesFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new EventSeries(), validationEnabled);
    }
    public EventSeriesBuilder(io.fabric8.kubernetes.api.model.events.EventSeriesFluent<?> fluent,io.fabric8.kubernetes.api.model.events.EventSeries instance){
            this(fluent, instance, true);
    }
    public EventSeriesBuilder(io.fabric8.kubernetes.api.model.events.EventSeriesFluent<?> fluent,io.fabric8.kubernetes.api.model.events.EventSeries instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCount(instance.getCount()); 
            fluent.withLastObservedTime(instance.getLastObservedTime()); 
            fluent.withState(instance.getState()); 
            this.validationEnabled = validationEnabled; 
    }
    public EventSeriesBuilder(io.fabric8.kubernetes.api.model.events.EventSeries instance){
            this(instance,true);
    }
    public EventSeriesBuilder(io.fabric8.kubernetes.api.model.events.EventSeries instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCount(instance.getCount()); 
            this.withLastObservedTime(instance.getLastObservedTime()); 
            this.withState(instance.getState()); 
            this.validationEnabled = validationEnabled; 
    }
    public EventSeriesBuilder(Validator validator){
            this(new EventSeries(), true);
    }
    public EventSeriesBuilder(io.fabric8.kubernetes.api.model.events.EventSeriesFluent<?> fluent,io.fabric8.kubernetes.api.model.events.EventSeries instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCount(instance.getCount()); 
            fluent.withLastObservedTime(instance.getLastObservedTime()); 
            fluent.withState(instance.getState()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EventSeriesBuilder(io.fabric8.kubernetes.api.model.events.EventSeries instance,Validator validator){
            this.fluent = this; 
            this.withCount(instance.getCount()); 
            this.withLastObservedTime(instance.getLastObservedTime()); 
            this.withState(instance.getState()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public io.fabric8.kubernetes.api.model.events.EventSeries build(){
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
