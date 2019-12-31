package io.fabric8.kubernetes.api.model.events;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.EventSourceBuilder;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.MicroTime;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.EventSourceFluent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.MicroTimeBuilder;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.api.model.MicroTimeFluent;
import java.lang.Integer;
import io.fabric8.kubernetes.api.model.EventSource;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Object;
import java.util.Map;

public interface EventFluent<A extends io.fabric8.kubernetes.api.model.events.EventFluent<A>> extends Fluent<A>{


    public String getAction();
    public A withAction(String action);
    public Boolean hasAction();
    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public Integer getDeprecatedCount();
    public A withDeprecatedCount(Integer deprecatedCount);
    public Boolean hasDeprecatedCount();
    public String getDeprecatedFirstTimestamp();
    public A withDeprecatedFirstTimestamp(String deprecatedFirstTimestamp);
    public Boolean hasDeprecatedFirstTimestamp();
    public String getDeprecatedLastTimestamp();
    public A withDeprecatedLastTimestamp(String deprecatedLastTimestamp);
    public Boolean hasDeprecatedLastTimestamp();
    
/**
 * This method has been deprecated, please use method buildDeprecatedSource instead.
 * @return The buildable object.
 */
@Deprecated public EventSource getDeprecatedSource();
    public EventSource buildDeprecatedSource();
    public A withDeprecatedSource(EventSource deprecatedSource);
    public Boolean hasDeprecatedSource();
    public A withNewDeprecatedSource(String component,String host);
    public EventFluent.DeprecatedSourceNested<A> withNewDeprecatedSource();
    public EventFluent.DeprecatedSourceNested<A> withNewDeprecatedSourceLike(EventSource item);
    public EventFluent.DeprecatedSourceNested<A> editDeprecatedSource();
    public EventFluent.DeprecatedSourceNested<A> editOrNewDeprecatedSource();
    public EventFluent.DeprecatedSourceNested<A> editOrNewDeprecatedSourceLike(EventSource item);
    
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
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
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
    public String getNote();
    public A withNote(String note);
    public Boolean hasNote();
    public String getReason();
    public A withReason(String reason);
    public Boolean hasReason();
    
/**
 * This method has been deprecated, please use method buildRegarding instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getRegarding();
    public ObjectReference buildRegarding();
    public A withRegarding(ObjectReference regarding);
    public Boolean hasRegarding();
    public EventFluent.RegardingNested<A> withNewRegarding();
    public EventFluent.RegardingNested<A> withNewRegardingLike(ObjectReference item);
    public EventFluent.RegardingNested<A> editRegarding();
    public EventFluent.RegardingNested<A> editOrNewRegarding();
    public EventFluent.RegardingNested<A> editOrNewRegardingLike(ObjectReference item);
    
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
    public String getReportingController();
    public A withReportingController(String reportingController);
    public Boolean hasReportingController();
    public String getReportingInstance();
    public A withReportingInstance(String reportingInstance);
    public Boolean hasReportingInstance();
    
/**
 * This method has been deprecated, please use method buildSeries instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.kubernetes.api.model.events.EventSeries getSeries();
    public io.fabric8.kubernetes.api.model.events.EventSeries buildSeries();
    public A withSeries(io.fabric8.kubernetes.api.model.events.EventSeries series);
    public Boolean hasSeries();
    public EventFluent.SeriesNested<A> withNewSeries();
    public EventFluent.SeriesNested<A> withNewSeriesLike(io.fabric8.kubernetes.api.model.events.EventSeries item);
    public EventFluent.SeriesNested<A> editSeries();
    public EventFluent.SeriesNested<A> editOrNewSeries();
    public EventFluent.SeriesNested<A> editOrNewSeriesLike(io.fabric8.kubernetes.api.model.events.EventSeries item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface DeprecatedSourceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventSourceFluent<EventFluent.DeprecatedSourceNested<N>>{

        
    public N and();    public N endDeprecatedSource();
}
    public interface EventTimeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MicroTimeFluent<EventFluent.EventTimeNested<N>>{

        
    public N and();    public N endEventTime();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<EventFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface RegardingNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<EventFluent.RegardingNested<N>>{

        
    public N and();    public N endRegarding();
}
    public interface RelatedNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<EventFluent.RelatedNested<N>>{

        
    public N and();    public N endRelated();
}
    public interface SeriesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.events.EventSeriesFluent<EventFluent.SeriesNested<N>>{

        
    public N and();    public N endSeries();
}


}
