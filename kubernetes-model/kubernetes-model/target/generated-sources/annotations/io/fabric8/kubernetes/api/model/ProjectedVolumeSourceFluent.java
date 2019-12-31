package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface ProjectedVolumeSourceFluent<A extends ProjectedVolumeSourceFluent<A>> extends Fluent<A>{


    public Integer getDefaultMode();
    public A withDefaultMode(Integer defaultMode);
    public Boolean hasDefaultMode();
    public A addToSources(int index,VolumeProjection item);
    public A setToSources(int index,VolumeProjection item);
    public A addToSources(VolumeProjection... items);
    public A addAllToSources(Collection<VolumeProjection> items);
    public A removeFromSources(VolumeProjection... items);
    public A removeAllFromSources(Collection<VolumeProjection> items);
    
/**
 * This method has been deprecated, please use method buildSources instead.
 * @return The buildable object.
 */
@Deprecated public List<VolumeProjection> getSources();
    public List<VolumeProjection> buildSources();
    public VolumeProjection buildSource(int index);
    public VolumeProjection buildFirstSource();
    public VolumeProjection buildLastSource();
    public VolumeProjection buildMatchingSource(io.fabric8.kubernetes.api.builder.Predicate<VolumeProjectionBuilder> predicate);
    public A withSources(List<VolumeProjection> sources);
    public A withSources(VolumeProjection... sources);
    public Boolean hasSources();
    public ProjectedVolumeSourceFluent.SourcesNested<A> addNewSource();
    public ProjectedVolumeSourceFluent.SourcesNested<A> addNewSourceLike(VolumeProjection item);
    public ProjectedVolumeSourceFluent.SourcesNested<A> setNewSourceLike(int index,VolumeProjection item);
    public ProjectedVolumeSourceFluent.SourcesNested<A> editSource(int index);
    public ProjectedVolumeSourceFluent.SourcesNested<A> editFirstSource();
    public ProjectedVolumeSourceFluent.SourcesNested<A> editLastSource();
    public ProjectedVolumeSourceFluent.SourcesNested<A> editMatchingSource(io.fabric8.kubernetes.api.builder.Predicate<VolumeProjectionBuilder> predicate);

    public interface SourcesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VolumeProjectionFluent<ProjectedVolumeSourceFluent.SourcesNested<N>>{

        
    public N and();    public N endSource();
}


}
