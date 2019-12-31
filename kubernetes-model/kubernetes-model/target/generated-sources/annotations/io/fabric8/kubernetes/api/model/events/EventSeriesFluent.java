package io.fabric8.kubernetes.api.model.events;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.MicroTimeBuilder;
import java.lang.String;
import io.fabric8.kubernetes.api.model.MicroTimeFluent;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.MicroTime;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface EventSeriesFluent<A extends io.fabric8.kubernetes.api.model.events.EventSeriesFluent<A>> extends Fluent<A>{


    public Integer getCount();
    public A withCount(Integer count);
    public Boolean hasCount();
    
/**
 * This method has been deprecated, please use method buildLastObservedTime instead.
 * @return The buildable object.
 */
@Deprecated public MicroTime getLastObservedTime();
    public MicroTime buildLastObservedTime();
    public A withLastObservedTime(MicroTime lastObservedTime);
    public Boolean hasLastObservedTime();
    public A withNewLastObservedTime(String time);
    public EventSeriesFluent.LastObservedTimeNested<A> withNewLastObservedTime();
    public EventSeriesFluent.LastObservedTimeNested<A> withNewLastObservedTimeLike(MicroTime item);
    public EventSeriesFluent.LastObservedTimeNested<A> editLastObservedTime();
    public EventSeriesFluent.LastObservedTimeNested<A> editOrNewLastObservedTime();
    public EventSeriesFluent.LastObservedTimeNested<A> editOrNewLastObservedTimeLike(MicroTime item);
    public String getState();
    public A withState(String state);
    public Boolean hasState();

    public interface LastObservedTimeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MicroTimeFluent<EventSeriesFluent.LastObservedTimeNested<N>>{

        
    public N and();    public N endLastObservedTime();
}


}
