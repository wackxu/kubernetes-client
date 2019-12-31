package io.fabric8.kubernetes.api.model.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.EventSourceFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.EventSourceBuilder;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.MicroTime;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.MicroTimeFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.MicroTimeBuilder;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import java.lang.Integer;
import io.fabric8.kubernetes.api.model.EventSource;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Object;

public class EventFluentImpl<A extends io.fabric8.kubernetes.api.model.events.EventFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.kubernetes.api.model.events.EventFluent<A>{

    private String action;
    private String apiVersion;
    private Integer deprecatedCount;
    private String deprecatedFirstTimestamp;
    private String deprecatedLastTimestamp;
    private EventSourceBuilder deprecatedSource;
    private MicroTimeBuilder eventTime;
    private String kind;
    private ObjectMetaBuilder metadata;
    private String note;
    private String reason;
    private ObjectReferenceBuilder regarding;
    private ObjectReferenceBuilder related;
    private String reportingController;
    private String reportingInstance;
    private io.fabric8.kubernetes.api.model.events.EventSeriesBuilder series;
    private String type;

    public EventFluentImpl(){
    }
    public EventFluentImpl(io.fabric8.kubernetes.api.model.events.Event instance){
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
    }

    public String getAction(){
            return this.action;
    }

    public A withAction(String action){
            this.action=action; return (A) this;
    }

    public Boolean hasAction(){
            return this.action != null;
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public Integer getDeprecatedCount(){
            return this.deprecatedCount;
    }

    public A withDeprecatedCount(Integer deprecatedCount){
            this.deprecatedCount=deprecatedCount; return (A) this;
    }

    public Boolean hasDeprecatedCount(){
            return this.deprecatedCount != null;
    }

    public String getDeprecatedFirstTimestamp(){
            return this.deprecatedFirstTimestamp;
    }

    public A withDeprecatedFirstTimestamp(String deprecatedFirstTimestamp){
            this.deprecatedFirstTimestamp=deprecatedFirstTimestamp; return (A) this;
    }

    public Boolean hasDeprecatedFirstTimestamp(){
            return this.deprecatedFirstTimestamp != null;
    }

    public String getDeprecatedLastTimestamp(){
            return this.deprecatedLastTimestamp;
    }

    public A withDeprecatedLastTimestamp(String deprecatedLastTimestamp){
            this.deprecatedLastTimestamp=deprecatedLastTimestamp; return (A) this;
    }

    public Boolean hasDeprecatedLastTimestamp(){
            return this.deprecatedLastTimestamp != null;
    }

    
/**
 * This method has been deprecated, please use method buildDeprecatedSource instead.
 * @return The buildable object.
 */
@Deprecated public EventSource getDeprecatedSource(){
            return this.deprecatedSource!=null?this.deprecatedSource.build():null;
    }

    public EventSource buildDeprecatedSource(){
            return this.deprecatedSource!=null?this.deprecatedSource.build():null;
    }

    public A withDeprecatedSource(EventSource deprecatedSource){
            _visitables.remove(this.deprecatedSource);
            if (deprecatedSource!=null){ this.deprecatedSource= new EventSourceBuilder(deprecatedSource); _visitables.add(this.deprecatedSource);} return (A) this;
    }

    public Boolean hasDeprecatedSource(){
            return this.deprecatedSource != null;
    }

    public A withNewDeprecatedSource(String component,String host){
            return (A)withDeprecatedSource(new EventSource(component, host));
    }

    public EventFluent.DeprecatedSourceNested<A> withNewDeprecatedSource(){
            return new DeprecatedSourceNestedImpl();
    }

    public EventFluent.DeprecatedSourceNested<A> withNewDeprecatedSourceLike(EventSource item){
            return new DeprecatedSourceNestedImpl(item);
    }

    public EventFluent.DeprecatedSourceNested<A> editDeprecatedSource(){
            return withNewDeprecatedSourceLike(getDeprecatedSource());
    }

    public EventFluent.DeprecatedSourceNested<A> editOrNewDeprecatedSource(){
            return withNewDeprecatedSourceLike(getDeprecatedSource() != null ? getDeprecatedSource(): new EventSourceBuilder().build());
    }

    public EventFluent.DeprecatedSourceNested<A> editOrNewDeprecatedSourceLike(EventSource item){
            return withNewDeprecatedSourceLike(getDeprecatedSource() != null ? getDeprecatedSource(): item);
    }

    
/**
 * This method has been deprecated, please use method buildEventTime instead.
 * @return The buildable object.
 */
@Deprecated public MicroTime getEventTime(){
            return this.eventTime!=null?this.eventTime.build():null;
    }

    public MicroTime buildEventTime(){
            return this.eventTime!=null?this.eventTime.build():null;
    }

    public A withEventTime(MicroTime eventTime){
            _visitables.remove(this.eventTime);
            if (eventTime!=null){ this.eventTime= new MicroTimeBuilder(eventTime); _visitables.add(this.eventTime);} return (A) this;
    }

    public Boolean hasEventTime(){
            return this.eventTime != null;
    }

    public A withNewEventTime(String time){
            return (A)withEventTime(new MicroTime(time));
    }

    public EventFluent.EventTimeNested<A> withNewEventTime(){
            return new EventTimeNestedImpl();
    }

    public EventFluent.EventTimeNested<A> withNewEventTimeLike(MicroTime item){
            return new EventTimeNestedImpl(item);
    }

    public EventFluent.EventTimeNested<A> editEventTime(){
            return withNewEventTimeLike(getEventTime());
    }

    public EventFluent.EventTimeNested<A> editOrNewEventTime(){
            return withNewEventTimeLike(getEventTime() != null ? getEventTime(): new MicroTimeBuilder().build());
    }

    public EventFluent.EventTimeNested<A> editOrNewEventTimeLike(MicroTime item){
            return withNewEventTimeLike(getEventTime() != null ? getEventTime(): item);
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ObjectMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ObjectMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ObjectMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public EventFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public EventFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public EventFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public EventFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public EventFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public String getNote(){
            return this.note;
    }

    public A withNote(String note){
            this.note=note; return (A) this;
    }

    public Boolean hasNote(){
            return this.note != null;
    }

    public String getReason(){
            return this.reason;
    }

    public A withReason(String reason){
            this.reason=reason; return (A) this;
    }

    public Boolean hasReason(){
            return this.reason != null;
    }

    
/**
 * This method has been deprecated, please use method buildRegarding instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getRegarding(){
            return this.regarding!=null?this.regarding.build():null;
    }

    public ObjectReference buildRegarding(){
            return this.regarding!=null?this.regarding.build():null;
    }

    public A withRegarding(ObjectReference regarding){
            _visitables.remove(this.regarding);
            if (regarding!=null){ this.regarding= new ObjectReferenceBuilder(regarding); _visitables.add(this.regarding);} return (A) this;
    }

    public Boolean hasRegarding(){
            return this.regarding != null;
    }

    public EventFluent.RegardingNested<A> withNewRegarding(){
            return new RegardingNestedImpl();
    }

    public EventFluent.RegardingNested<A> withNewRegardingLike(ObjectReference item){
            return new RegardingNestedImpl(item);
    }

    public EventFluent.RegardingNested<A> editRegarding(){
            return withNewRegardingLike(getRegarding());
    }

    public EventFluent.RegardingNested<A> editOrNewRegarding(){
            return withNewRegardingLike(getRegarding() != null ? getRegarding(): new ObjectReferenceBuilder().build());
    }

    public EventFluent.RegardingNested<A> editOrNewRegardingLike(ObjectReference item){
            return withNewRegardingLike(getRegarding() != null ? getRegarding(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRelated instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getRelated(){
            return this.related!=null?this.related.build():null;
    }

    public ObjectReference buildRelated(){
            return this.related!=null?this.related.build():null;
    }

    public A withRelated(ObjectReference related){
            _visitables.remove(this.related);
            if (related!=null){ this.related= new ObjectReferenceBuilder(related); _visitables.add(this.related);} return (A) this;
    }

    public Boolean hasRelated(){
            return this.related != null;
    }

    public EventFluent.RelatedNested<A> withNewRelated(){
            return new RelatedNestedImpl();
    }

    public EventFluent.RelatedNested<A> withNewRelatedLike(ObjectReference item){
            return new RelatedNestedImpl(item);
    }

    public EventFluent.RelatedNested<A> editRelated(){
            return withNewRelatedLike(getRelated());
    }

    public EventFluent.RelatedNested<A> editOrNewRelated(){
            return withNewRelatedLike(getRelated() != null ? getRelated(): new ObjectReferenceBuilder().build());
    }

    public EventFluent.RelatedNested<A> editOrNewRelatedLike(ObjectReference item){
            return withNewRelatedLike(getRelated() != null ? getRelated(): item);
    }

    public String getReportingController(){
            return this.reportingController;
    }

    public A withReportingController(String reportingController){
            this.reportingController=reportingController; return (A) this;
    }

    public Boolean hasReportingController(){
            return this.reportingController != null;
    }

    public String getReportingInstance(){
            return this.reportingInstance;
    }

    public A withReportingInstance(String reportingInstance){
            this.reportingInstance=reportingInstance; return (A) this;
    }

    public Boolean hasReportingInstance(){
            return this.reportingInstance != null;
    }

    
/**
 * This method has been deprecated, please use method buildSeries instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.kubernetes.api.model.events.EventSeries getSeries(){
            return this.series!=null?this.series.build():null;
    }

    public io.fabric8.kubernetes.api.model.events.EventSeries buildSeries(){
            return this.series!=null?this.series.build():null;
    }

    public A withSeries(io.fabric8.kubernetes.api.model.events.EventSeries series){
            _visitables.remove(this.series);
            if (series!=null){ this.series= new io.fabric8.kubernetes.api.model.events.EventSeriesBuilder(series); _visitables.add(this.series);} return (A) this;
    }

    public Boolean hasSeries(){
            return this.series != null;
    }

    public EventFluent.SeriesNested<A> withNewSeries(){
            return new SeriesNestedImpl();
    }

    public EventFluent.SeriesNested<A> withNewSeriesLike(io.fabric8.kubernetes.api.model.events.EventSeries item){
            return new SeriesNestedImpl(item);
    }

    public EventFluent.SeriesNested<A> editSeries(){
            return withNewSeriesLike(getSeries());
    }

    public EventFluent.SeriesNested<A> editOrNewSeries(){
            return withNewSeriesLike(getSeries() != null ? getSeries(): new io.fabric8.kubernetes.api.model.events.EventSeriesBuilder().build());
    }

    public EventFluent.SeriesNested<A> editOrNewSeriesLike(io.fabric8.kubernetes.api.model.events.EventSeries item){
            return withNewSeriesLike(getSeries() != null ? getSeries(): item);
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EventFluentImpl that = (EventFluentImpl) o;
            if (action != null ? !action.equals(that.action) :that.action != null) return false;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (deprecatedCount != null ? !deprecatedCount.equals(that.deprecatedCount) :that.deprecatedCount != null) return false;
            if (deprecatedFirstTimestamp != null ? !deprecatedFirstTimestamp.equals(that.deprecatedFirstTimestamp) :that.deprecatedFirstTimestamp != null) return false;
            if (deprecatedLastTimestamp != null ? !deprecatedLastTimestamp.equals(that.deprecatedLastTimestamp) :that.deprecatedLastTimestamp != null) return false;
            if (deprecatedSource != null ? !deprecatedSource.equals(that.deprecatedSource) :that.deprecatedSource != null) return false;
            if (eventTime != null ? !eventTime.equals(that.eventTime) :that.eventTime != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (note != null ? !note.equals(that.note) :that.note != null) return false;
            if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
            if (regarding != null ? !regarding.equals(that.regarding) :that.regarding != null) return false;
            if (related != null ? !related.equals(that.related) :that.related != null) return false;
            if (reportingController != null ? !reportingController.equals(that.reportingController) :that.reportingController != null) return false;
            if (reportingInstance != null ? !reportingInstance.equals(that.reportingInstance) :that.reportingInstance != null) return false;
            if (series != null ? !series.equals(that.series) :that.series != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class DeprecatedSourceNestedImpl<N> extends EventSourceFluentImpl<EventFluent.DeprecatedSourceNested<N>> implements EventFluent.DeprecatedSourceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventSourceBuilder builder;
    
            DeprecatedSourceNestedImpl(EventSource item){
                    this.builder = new EventSourceBuilder(this, item);
            }
            DeprecatedSourceNestedImpl(){
                    this.builder = new EventSourceBuilder(this);
            }
    
    public N and(){
            return (N) EventFluentImpl.this.withDeprecatedSource(builder.build());
    }
    public N endDeprecatedSource(){
            return and();
    }

}
    public class EventTimeNestedImpl<N> extends MicroTimeFluentImpl<EventFluent.EventTimeNested<N>> implements EventFluent.EventTimeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MicroTimeBuilder builder;
    
            EventTimeNestedImpl(MicroTime item){
                    this.builder = new MicroTimeBuilder(this, item);
            }
            EventTimeNestedImpl(){
                    this.builder = new MicroTimeBuilder(this);
            }
    
    public N and(){
            return (N) EventFluentImpl.this.withEventTime(builder.build());
    }
    public N endEventTime(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<EventFluent.MetadataNested<N>> implements EventFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) EventFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class RegardingNestedImpl<N> extends ObjectReferenceFluentImpl<EventFluent.RegardingNested<N>> implements EventFluent.RegardingNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            RegardingNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            RegardingNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) EventFluentImpl.this.withRegarding(builder.build());
    }
    public N endRegarding(){
            return and();
    }

}
    public class RelatedNestedImpl<N> extends ObjectReferenceFluentImpl<EventFluent.RelatedNested<N>> implements EventFluent.RelatedNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            RelatedNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            RelatedNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) EventFluentImpl.this.withRelated(builder.build());
    }
    public N endRelated(){
            return and();
    }

}
    public class SeriesNestedImpl<N> extends io.fabric8.kubernetes.api.model.events.EventSeriesFluentImpl<EventFluent.SeriesNested<N>> implements EventFluent.SeriesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.events.EventSeriesBuilder builder;
    
            SeriesNestedImpl(io.fabric8.kubernetes.api.model.events.EventSeries item){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventSeriesBuilder(this, item);
            }
            SeriesNestedImpl(){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventSeriesBuilder(this);
            }
    
    public N and(){
            return (N) EventFluentImpl.this.withSeries(builder.build());
    }
    public N endSeries(){
            return and();
    }

}


}
