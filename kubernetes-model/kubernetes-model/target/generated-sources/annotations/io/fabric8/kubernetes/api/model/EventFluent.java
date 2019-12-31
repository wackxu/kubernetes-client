package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface EventFluent<A extends EventFluent<A>> extends Fluent<A>{


    public String getAction();
    public A withAction(String action);
    public Boolean hasAction();
    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public Integer getCount();
    public A withCount(Integer count);
    public Boolean hasCount();
    
/**
 * This method has been deprecated, please use method buildEventTime instead.
 * @return The buildable object.
 */
@Deprecated public MicroTime getEventTime();
    public MicroTime buildEventTime();
    public A withEventTime(MicroTime eventTime);
    public Boolean hasEventTime();
    public A withNewEventTime(String time);
    public EventFluent.EventTimeNested<A> withNewEventTime();
    public EventFluent.EventTimeNested<A> withNewEventTimeLike(MicroTime item);
    public EventFluent.EventTimeNested<A> editEventTime();
    public EventFluent.EventTimeNested<A> editOrNewEventTime();
    public EventFluent.EventTimeNested<A> editOrNewEventTimeLike(MicroTime item);
    public String getFirstTimestamp();
    public A withFirstTimestamp(String firstTimestamp);
    public Boolean hasFirstTimestamp();
    
/**
 * This method has been deprecated, please use method buildInvolvedObject instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getInvolvedObject();
    public ObjectReference buildInvolvedObject();
    public A withInvolvedObject(ObjectReference involvedObject);
    public Boolean hasInvolvedObject();
    public EventFluent.InvolvedObjectNested<A> withNewInvolvedObject();
    public EventFluent.InvolvedObjectNested<A> withNewInvolvedObjectLike(ObjectReference item);
    public EventFluent.InvolvedObjectNested<A> editInvolvedObject();
    public EventFluent.InvolvedObjectNested<A> editOrNewInvolvedObject();
    public EventFluent.InvolvedObjectNested<A> editOrNewInvolvedObjectLike(ObjectReference item);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public String getLastTimestamp();
    public A withLastTimestamp(String lastTimestamp);
    public Boolean hasLastTimestamp();
    public String getMessage();
    public A withMessage(String message);
    public Boolean hasMessage();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public EventFluent.MetadataNested<A> withNewMetadata();
    public EventFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public EventFluent.MetadataNested<A> editMetadata();
    public EventFluent.MetadataNested<A> editOrNewMetadata();
    public EventFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public String getReason();
    public A withReason(String reason);
    public Boolean hasReason();
    
/**
 * This method has been deprecated, please use method buildRelated instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getRelated();
    public ObjectReference buildRelated();
    public A withRelated(ObjectReference related);
    public Boolean hasRelated();
    public EventFluent.RelatedNested<A> withNewRelated();
    public EventFluent.RelatedNested<A> withNewRelatedLike(ObjectReference item);
    public EventFluent.RelatedNested<A> editRelated();
    public EventFluent.RelatedNested<A> editOrNewRelated();
    public EventFluent.RelatedNested<A> editOrNewRelatedLike(ObjectReference item);
    public String getReportingComponent();
    public A withReportingComponent(String reportingComponent);
    public Boolean hasReportingComponent();
    public String getReportingInstance();
    public A withReportingInstance(String reportingInstance);
    public Boolean hasReportingInstance();
    
/**
 * This method has been deprecated, please use method buildSeries instead.
 * @return The buildable object.
 */
@Deprecated public EventSeries getSeries();
    public EventSeries buildSeries();
    public A withSeries(EventSeries series);
    public Boolean hasSeries();
    public EventFluent.SeriesNested<A> withNewSeries();
    public EventFluent.SeriesNested<A> withNewSeriesLike(EventSeries item);
    public EventFluent.SeriesNested<A> editSeries();
    public EventFluent.SeriesNested<A> editOrNewSeries();
    public EventFluent.SeriesNested<A> editOrNewSeriesLike(EventSeries item);
    
/**
 * This method has been deprecated, please use method buildSource instead.
 * @return The buildable object.
 */
@Deprecated public EventSource getSource();
    public EventSource buildSource();
    public A withSource(EventSource source);
    public Boolean hasSource();
    public A withNewSource(String component,String host);
    public EventFluent.SourceNested<A> withNewSource();
    public EventFluent.SourceNested<A> withNewSourceLike(EventSource item);
    public EventFluent.SourceNested<A> editSource();
    public EventFluent.SourceNested<A> editOrNewSource();
    public EventFluent.SourceNested<A> editOrNewSourceLike(EventSource item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface EventTimeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MicroTimeFluent<EventFluent.EventTimeNested<N>>{

        
    public N and();    public N endEventTime();
}
    public interface InvolvedObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<EventFluent.InvolvedObjectNested<N>>{

        
    public N and();    public N endInvolvedObject();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<EventFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface RelatedNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<EventFluent.RelatedNested<N>>{

        
    public N and();    public N endRelated();
}
    public interface SeriesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventSeriesFluent<EventFluent.SeriesNested<N>>{

        
    public N and();    public N endSeries();
}
    public interface SourceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventSourceFluent<EventFluent.SourceNested<N>>{

        
    public N and();    public N endSource();
}


}
