package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class ProjectedVolumeSourceFluentImpl<A extends ProjectedVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ProjectedVolumeSourceFluent<A>{

    private Integer defaultMode;
    private List<VolumeProjectionBuilder> sources;

    public ProjectedVolumeSourceFluentImpl(){
    }
    public ProjectedVolumeSourceFluentImpl(ProjectedVolumeSource instance){
            this.withDefaultMode(instance.getDefaultMode()); 
            this.withSources(instance.getSources()); 
    }

    public Integer getDefaultMode(){
            return this.defaultMode;
    }

    public A withDefaultMode(Integer defaultMode){
            this.defaultMode=defaultMode; return (A) this;
    }

    public Boolean hasDefaultMode(){
            return this.defaultMode != null;
    }

    public A addToSources(int index,VolumeProjection item){
            if (this.sources == null) {this.sources = new ArrayList<VolumeProjectionBuilder>();}
            VolumeProjectionBuilder builder = new VolumeProjectionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.sources.add(index >= 0 ? index : sources.size(), builder); return (A)this;
    }

    public A setToSources(int index,VolumeProjection item){
            if (this.sources == null) {this.sources = new ArrayList<VolumeProjectionBuilder>();}
            VolumeProjectionBuilder builder = new VolumeProjectionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= sources.size()) { sources.add(builder); } else { sources.set(index, builder);}
             return (A)this;
    }

    public A addToSources(VolumeProjection... items){
            if (this.sources == null) {this.sources = new ArrayList<VolumeProjectionBuilder>();}
            for (VolumeProjection item : items) {VolumeProjectionBuilder builder = new VolumeProjectionBuilder(item);_visitables.add(builder);this.sources.add(builder);} return (A)this;
    }

    public A addAllToSources(Collection<VolumeProjection> items){
            if (this.sources == null) {this.sources = new ArrayList<VolumeProjectionBuilder>();}
            for (VolumeProjection item : items) {VolumeProjectionBuilder builder = new VolumeProjectionBuilder(item);_visitables.add(builder);this.sources.add(builder);} return (A)this;
    }

    public A removeFromSources(VolumeProjection... items){
            for (VolumeProjection item : items) {VolumeProjectionBuilder builder = new VolumeProjectionBuilder(item);_visitables.remove(builder);if (this.sources != null) {this.sources.remove(builder);}} return (A)this;
    }

    public A removeAllFromSources(Collection<VolumeProjection> items){
            for (VolumeProjection item : items) {VolumeProjectionBuilder builder = new VolumeProjectionBuilder(item);_visitables.remove(builder);if (this.sources != null) {this.sources.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildSources instead.
 * @return The buildable object.
 */
@Deprecated public List<VolumeProjection> getSources(){
            return build(sources);
    }

    public List<VolumeProjection> buildSources(){
            return build(sources);
    }

    public VolumeProjection buildSource(int index){
            return this.sources.get(index).build();
    }

    public VolumeProjection buildFirstSource(){
            return this.sources.get(0).build();
    }

    public VolumeProjection buildLastSource(){
            return this.sources.get(sources.size() - 1).build();
    }

    public VolumeProjection buildMatchingSource(io.fabric8.kubernetes.api.builder.Predicate<VolumeProjectionBuilder> predicate){
            for (VolumeProjectionBuilder item: sources) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withSources(List<VolumeProjection> sources){
            if (this.sources != null) { _visitables.removeAll(this.sources);}
            if (sources != null) {this.sources = new ArrayList<VolumeProjectionBuilder>(); for (VolumeProjection item : sources){this.addToSources(item);}} else { this.sources = new ArrayList<VolumeProjectionBuilder>();} return (A) this;
    }

    public A withSources(VolumeProjection... sources){
            if (this.sources != null) {this.sources.clear();}
            if (sources != null) {for (VolumeProjection item :sources){ this.addToSources(item);}} return (A) this;
    }

    public Boolean hasSources(){
            return sources != null && !sources.isEmpty();
    }

    public ProjectedVolumeSourceFluent.SourcesNested<A> addNewSource(){
            return new SourcesNestedImpl();
    }

    public ProjectedVolumeSourceFluent.SourcesNested<A> addNewSourceLike(VolumeProjection item){
            return new SourcesNestedImpl(-1, item);
    }

    public ProjectedVolumeSourceFluent.SourcesNested<A> setNewSourceLike(int index,VolumeProjection item){
            return new SourcesNestedImpl(index, item);
    }

    public ProjectedVolumeSourceFluent.SourcesNested<A> editSource(int index){
            if (sources.size() <= index) throw new RuntimeException("Can't edit sources. Index exceeds size.");
            return setNewSourceLike(index, buildSource(index));
    }

    public ProjectedVolumeSourceFluent.SourcesNested<A> editFirstSource(){
            if (sources.size() == 0) throw new RuntimeException("Can't edit first sources. The list is empty.");
            return setNewSourceLike(0, buildSource(0));
    }

    public ProjectedVolumeSourceFluent.SourcesNested<A> editLastSource(){
            int index = sources.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last sources. The list is empty.");
            return setNewSourceLike(index, buildSource(index));
    }

    public ProjectedVolumeSourceFluent.SourcesNested<A> editMatchingSource(io.fabric8.kubernetes.api.builder.Predicate<VolumeProjectionBuilder> predicate){
            int index = -1;
            for (int i=0;i<sources.size();i++) { 
            if (predicate.apply(sources.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching sources. No match found.");
            return setNewSourceLike(index, buildSource(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ProjectedVolumeSourceFluentImpl that = (ProjectedVolumeSourceFluentImpl) o;
            if (defaultMode != null ? !defaultMode.equals(that.defaultMode) :that.defaultMode != null) return false;
            if (sources != null ? !sources.equals(that.sources) :that.sources != null) return false;
            return true;
    }


    public class SourcesNestedImpl<N> extends VolumeProjectionFluentImpl<ProjectedVolumeSourceFluent.SourcesNested<N>> implements ProjectedVolumeSourceFluent.SourcesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VolumeProjectionBuilder builder;
        private final int index;
    
            SourcesNestedImpl(int index,VolumeProjection item){
                    this.index = index;
                    this.builder = new VolumeProjectionBuilder(this, item);
            }
            SourcesNestedImpl(){
                    this.index = -1;
                    this.builder = new VolumeProjectionBuilder(this);
            }
    
    public N and(){
            return (N) ProjectedVolumeSourceFluentImpl.this.setToSources(index, builder.build());
    }
    public N endSource(){
            return and();
    }

}


}
