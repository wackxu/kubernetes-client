package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;

public class EventFluentImpl<A extends EventFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements EventFluent<A>{

    private String action;
    private String apiVersion;
    private Integer count;
    private MicroTimeBuilder eventTime;
    private String firstTimestamp;
    private ObjectReferenceBuilder involvedObject;
    private String kind;
    private String lastTimestamp;
    private String message;
    private ObjectMetaBuilder metadata;
    private String reason;
    private ObjectReferenceBuilder related;
    private String reportingComponent;
    private String reportingInstance;
    private EventSeriesBuilder series;
    private EventSourceBuilder source;
    private String type;

    public EventFluentImpl(){
    }
    public EventFluentImpl(Event instance){
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

    public String getFirstTimestamp(){
            return this.firstTimestamp;
    }

    public A withFirstTimestamp(String firstTimestamp){
            this.firstTimestamp=firstTimestamp; return (A) this;
    }

    public Boolean hasFirstTimestamp(){
            return this.firstTimestamp != null;
    }

    
/**
 * This method has been deprecated, please use method buildInvolvedObject instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getInvolvedObject(){
            return this.involvedObject!=null?this.involvedObject.build():null;
    }

    public ObjectReference buildInvolvedObject(){
            return this.involvedObject!=null?this.involvedObject.build():null;
    }

    public A withInvolvedObject(ObjectReference involvedObject){
            _visitables.remove(this.involvedObject);
            if (involvedObject!=null){ this.involvedObject= new ObjectReferenceBuilder(involvedObject); _visitables.add(this.involvedObject);} return (A) this;
    }

    public Boolean hasInvolvedObject(){
            return this.involvedObject != null;
    }

    public EventFluent.InvolvedObjectNested<A> withNewInvolvedObject(){
            return new InvolvedObjectNestedImpl();
    }

    public EventFluent.InvolvedObjectNested<A> withNewInvolvedObjectLike(ObjectReference item){
            return new InvolvedObjectNestedImpl(item);
    }

    public EventFluent.InvolvedObjectNested<A> editInvolvedObject(){
            return withNewInvolvedObjectLike(getInvolvedObject());
    }

    public EventFluent.InvolvedObjectNested<A> editOrNewInvolvedObject(){
            return withNewInvolvedObjectLike(getInvolvedObject() != null ? getInvolvedObject(): new ObjectReferenceBuilder().build());
    }

    public EventFluent.InvolvedObjectNested<A> editOrNewInvolvedObjectLike(ObjectReference item){
            return withNewInvolvedObjectLike(getInvolvedObject() != null ? getInvolvedObject(): item);
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

    public String getLastTimestamp(){
            return this.lastTimestamp;
    }

    public A withLastTimestamp(String lastTimestamp){
            this.lastTimestamp=lastTimestamp; return (A) this;
    }

    public Boolean hasLastTimestamp(){
            return this.lastTimestamp != null;
    }

    public String getMessage(){
            return this.message;
    }

    public A withMessage(String message){
            this.message=message; return (A) this;
    }

    public Boolean hasMessage(){
            return this.message != null;
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

    public String getReportingComponent(){
            return this.reportingComponent;
    }

    public A withReportingComponent(String reportingComponent){
            this.reportingComponent=reportingComponent; return (A) this;
    }

    public Boolean hasReportingComponent(){
            return this.reportingComponent != null;
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
@Deprecated public EventSeries getSeries(){
            return this.series!=null?this.series.build():null;
    }

    public EventSeries buildSeries(){
            return this.series!=null?this.series.build():null;
    }

    public A withSeries(EventSeries series){
            _visitables.remove(this.series);
            if (series!=null){ this.series= new EventSeriesBuilder(series); _visitables.add(this.series);} return (A) this;
    }

    public Boolean hasSeries(){
            return this.series != null;
    }

    public EventFluent.SeriesNested<A> withNewSeries(){
            return new SeriesNestedImpl();
    }

    public EventFluent.SeriesNested<A> withNewSeriesLike(EventSeries item){
            return new SeriesNestedImpl(item);
    }

    public EventFluent.SeriesNested<A> editSeries(){
            return withNewSeriesLike(getSeries());
    }

    public EventFluent.SeriesNested<A> editOrNewSeries(){
            return withNewSeriesLike(getSeries() != null ? getSeries(): new EventSeriesBuilder().build());
    }

    public EventFluent.SeriesNested<A> editOrNewSeriesLike(EventSeries item){
            return withNewSeriesLike(getSeries() != null ? getSeries(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSource instead.
 * @return The buildable object.
 */
@Deprecated public EventSource getSource(){
            return this.source!=null?this.source.build():null;
    }

    public EventSource buildSource(){
            return this.source!=null?this.source.build():null;
    }

    public A withSource(EventSource source){
            _visitables.remove(this.source);
            if (source!=null){ this.source= new EventSourceBuilder(source); _visitables.add(this.source);} return (A) this;
    }

    public Boolean hasSource(){
            return this.source != null;
    }

    public A withNewSource(String component,String host){
            return (A)withSource(new EventSource(component, host));
    }

    public EventFluent.SourceNested<A> withNewSource(){
            return new SourceNestedImpl();
    }

    public EventFluent.SourceNested<A> withNewSourceLike(EventSource item){
            return new SourceNestedImpl(item);
    }

    public EventFluent.SourceNested<A> editSource(){
            return withNewSourceLike(getSource());
    }

    public EventFluent.SourceNested<A> editOrNewSource(){
            return withNewSourceLike(getSource() != null ? getSource(): new EventSourceBuilder().build());
    }

    public EventFluent.SourceNested<A> editOrNewSourceLike(EventSource item){
            return withNewSourceLike(getSource() != null ? getSource(): item);
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
            if (count != null ? !count.equals(that.count) :that.count != null) return false;
            if (eventTime != null ? !eventTime.equals(that.eventTime) :that.eventTime != null) return false;
            if (firstTimestamp != null ? !firstTimestamp.equals(that.firstTimestamp) :that.firstTimestamp != null) return false;
            if (involvedObject != null ? !involvedObject.equals(that.involvedObject) :that.involvedObject != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (lastTimestamp != null ? !lastTimestamp.equals(that.lastTimestamp) :that.lastTimestamp != null) return false;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
            if (related != null ? !related.equals(that.related) :that.related != null) return false;
            if (reportingComponent != null ? !reportingComponent.equals(that.reportingComponent) :that.reportingComponent != null) return false;
            if (reportingInstance != null ? !reportingInstance.equals(that.reportingInstance) :that.reportingInstance != null) return false;
            if (series != null ? !series.equals(that.series) :that.series != null) return false;
            if (source != null ? !source.equals(that.source) :that.source != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
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
    public class InvolvedObjectNestedImpl<N> extends ObjectReferenceFluentImpl<EventFluent.InvolvedObjectNested<N>> implements EventFluent.InvolvedObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            InvolvedObjectNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            InvolvedObjectNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) EventFluentImpl.this.withInvolvedObject(builder.build());
    }
    public N endInvolvedObject(){
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
    public class SeriesNestedImpl<N> extends EventSeriesFluentImpl<EventFluent.SeriesNested<N>> implements EventFluent.SeriesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventSeriesBuilder builder;
    
            SeriesNestedImpl(EventSeries item){
                    this.builder = new EventSeriesBuilder(this, item);
            }
            SeriesNestedImpl(){
                    this.builder = new EventSeriesBuilder(this);
            }
    
    public N and(){
            return (N) EventFluentImpl.this.withSeries(builder.build());
    }
    public N endSeries(){
            return and();
    }

}
    public class SourceNestedImpl<N> extends EventSourceFluentImpl<EventFluent.SourceNested<N>> implements EventFluent.SourceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventSourceBuilder builder;
    
            SourceNestedImpl(EventSource item){
                    this.builder = new EventSourceBuilder(this, item);
            }
            SourceNestedImpl(){
                    this.builder = new EventSourceBuilder(this);
            }
    
    public N and(){
            return (N) EventFluentImpl.this.withSource(builder.build());
    }
    public N endSource(){
            return and();
    }

}


}
