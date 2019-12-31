package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class EventSeriesFluentImpl<A extends EventSeriesFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements EventSeriesFluent<A>{

    private Integer count;
    private MicroTimeBuilder lastObservedTime;
    private String state;

    public EventSeriesFluentImpl(){
    }
    public EventSeriesFluentImpl(EventSeries instance){
            this.withCount(instance.getCount()); 
            this.withLastObservedTime(instance.getLastObservedTime()); 
            this.withState(instance.getState()); 
    }

    public Integer getCount(){
            return this.count;
    }

    public A withCount(Integer count){
            this.count=count; return (A) this;
    }

    public Boolean hasCount(){
            return this.count != null;
    }

    
/**
 * This method has been deprecated, please use method buildLastObservedTime instead.
 * @return The buildable object.
 */
@Deprecated public MicroTime getLastObservedTime(){
            return this.lastObservedTime!=null?this.lastObservedTime.build():null;
    }

    public MicroTime buildLastObservedTime(){
            return this.lastObservedTime!=null?this.lastObservedTime.build():null;
    }

    public A withLastObservedTime(MicroTime lastObservedTime){
            _visitables.remove(this.lastObservedTime);
            if (lastObservedTime!=null){ this.lastObservedTime= new MicroTimeBuilder(lastObservedTime); _visitables.add(this.lastObservedTime);} return (A) this;
    }

    public Boolean hasLastObservedTime(){
            return this.lastObservedTime != null;
    }

    public A withNewLastObservedTime(String time){
            return (A)withLastObservedTime(new MicroTime(time));
    }

    public EventSeriesFluent.LastObservedTimeNested<A> withNewLastObservedTime(){
            return new LastObservedTimeNestedImpl();
    }

    public EventSeriesFluent.LastObservedTimeNested<A> withNewLastObservedTimeLike(MicroTime item){
            return new LastObservedTimeNestedImpl(item);
    }

    public EventSeriesFluent.LastObservedTimeNested<A> editLastObservedTime(){
            return withNewLastObservedTimeLike(getLastObservedTime());
    }

    public EventSeriesFluent.LastObservedTimeNested<A> editOrNewLastObservedTime(){
            return withNewLastObservedTimeLike(getLastObservedTime() != null ? getLastObservedTime(): new MicroTimeBuilder().build());
    }

    public EventSeriesFluent.LastObservedTimeNested<A> editOrNewLastObservedTimeLike(MicroTime item){
            return withNewLastObservedTimeLike(getLastObservedTime() != null ? getLastObservedTime(): item);
    }

    public String getState(){
            return this.state;
    }

    public A withState(String state){
            this.state=state; return (A) this;
    }

    public Boolean hasState(){
            return this.state != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EventSeriesFluentImpl that = (EventSeriesFluentImpl) o;
            if (count != null ? !count.equals(that.count) :that.count != null) return false;
            if (lastObservedTime != null ? !lastObservedTime.equals(that.lastObservedTime) :that.lastObservedTime != null) return false;
            if (state != null ? !state.equals(that.state) :that.state != null) return false;
            return true;
    }


    public class LastObservedTimeNestedImpl<N> extends MicroTimeFluentImpl<EventSeriesFluent.LastObservedTimeNested<N>> implements EventSeriesFluent.LastObservedTimeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MicroTimeBuilder builder;
    
            LastObservedTimeNestedImpl(MicroTime item){
                    this.builder = new MicroTimeBuilder(this, item);
            }
            LastObservedTimeNestedImpl(){
                    this.builder = new MicroTimeBuilder(this);
            }
    
    public N and(){
            return (N) EventSeriesFluentImpl.this.withLastObservedTime(builder.build());
    }
    public N endLastObservedTime(){
            return and();
    }

}


}
