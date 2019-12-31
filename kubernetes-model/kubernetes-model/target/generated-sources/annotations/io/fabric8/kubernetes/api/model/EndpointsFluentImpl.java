package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class EndpointsFluentImpl<A extends EndpointsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements EndpointsFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private List<EndpointSubsetBuilder> subsets;

    public EndpointsFluentImpl(){
    }
    public EndpointsFluentImpl(Endpoints instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSubsets(instance.getSubsets()); 
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

    public EndpointsFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public EndpointsFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public EndpointsFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public EndpointsFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public EndpointsFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public A addToSubsets(int index,EndpointSubset item){
            if (this.subsets == null) {this.subsets = new ArrayList<EndpointSubsetBuilder>();}
            EndpointSubsetBuilder builder = new EndpointSubsetBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.subsets.add(index >= 0 ? index : subsets.size(), builder); return (A)this;
    }

    public A setToSubsets(int index,EndpointSubset item){
            if (this.subsets == null) {this.subsets = new ArrayList<EndpointSubsetBuilder>();}
            EndpointSubsetBuilder builder = new EndpointSubsetBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= subsets.size()) { subsets.add(builder); } else { subsets.set(index, builder);}
             return (A)this;
    }

    public A addToSubsets(EndpointSubset... items){
            if (this.subsets == null) {this.subsets = new ArrayList<EndpointSubsetBuilder>();}
            for (EndpointSubset item : items) {EndpointSubsetBuilder builder = new EndpointSubsetBuilder(item);_visitables.add(builder);this.subsets.add(builder);} return (A)this;
    }

    public A addAllToSubsets(Collection<EndpointSubset> items){
            if (this.subsets == null) {this.subsets = new ArrayList<EndpointSubsetBuilder>();}
            for (EndpointSubset item : items) {EndpointSubsetBuilder builder = new EndpointSubsetBuilder(item);_visitables.add(builder);this.subsets.add(builder);} return (A)this;
    }

    public A removeFromSubsets(EndpointSubset... items){
            for (EndpointSubset item : items) {EndpointSubsetBuilder builder = new EndpointSubsetBuilder(item);_visitables.remove(builder);if (this.subsets != null) {this.subsets.remove(builder);}} return (A)this;
    }

    public A removeAllFromSubsets(Collection<EndpointSubset> items){
            for (EndpointSubset item : items) {EndpointSubsetBuilder builder = new EndpointSubsetBuilder(item);_visitables.remove(builder);if (this.subsets != null) {this.subsets.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildSubsets instead.
 * @return The buildable object.
 */
@Deprecated public List<EndpointSubset> getSubsets(){
            return build(subsets);
    }

    public List<EndpointSubset> buildSubsets(){
            return build(subsets);
    }

    public EndpointSubset buildSubset(int index){
            return this.subsets.get(index).build();
    }

    public EndpointSubset buildFirstSubset(){
            return this.subsets.get(0).build();
    }

    public EndpointSubset buildLastSubset(){
            return this.subsets.get(subsets.size() - 1).build();
    }

    public EndpointSubset buildMatchingSubset(io.fabric8.kubernetes.api.builder.Predicate<EndpointSubsetBuilder> predicate){
            for (EndpointSubsetBuilder item: subsets) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withSubsets(List<EndpointSubset> subsets){
            if (this.subsets != null) { _visitables.removeAll(this.subsets);}
            if (subsets != null) {this.subsets = new ArrayList<EndpointSubsetBuilder>(); for (EndpointSubset item : subsets){this.addToSubsets(item);}} else { this.subsets = new ArrayList<EndpointSubsetBuilder>();} return (A) this;
    }

    public A withSubsets(EndpointSubset... subsets){
            if (this.subsets != null) {this.subsets.clear();}
            if (subsets != null) {for (EndpointSubset item :subsets){ this.addToSubsets(item);}} return (A) this;
    }

    public Boolean hasSubsets(){
            return subsets != null && !subsets.isEmpty();
    }

    public EndpointsFluent.SubsetsNested<A> addNewSubset(){
            return new SubsetsNestedImpl();
    }

    public EndpointsFluent.SubsetsNested<A> addNewSubsetLike(EndpointSubset item){
            return new SubsetsNestedImpl(-1, item);
    }

    public EndpointsFluent.SubsetsNested<A> setNewSubsetLike(int index,EndpointSubset item){
            return new SubsetsNestedImpl(index, item);
    }

    public EndpointsFluent.SubsetsNested<A> editSubset(int index){
            if (subsets.size() <= index) throw new RuntimeException("Can't edit subsets. Index exceeds size.");
            return setNewSubsetLike(index, buildSubset(index));
    }

    public EndpointsFluent.SubsetsNested<A> editFirstSubset(){
            if (subsets.size() == 0) throw new RuntimeException("Can't edit first subsets. The list is empty.");
            return setNewSubsetLike(0, buildSubset(0));
    }

    public EndpointsFluent.SubsetsNested<A> editLastSubset(){
            int index = subsets.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last subsets. The list is empty.");
            return setNewSubsetLike(index, buildSubset(index));
    }

    public EndpointsFluent.SubsetsNested<A> editMatchingSubset(io.fabric8.kubernetes.api.builder.Predicate<EndpointSubsetBuilder> predicate){
            int index = -1;
            for (int i=0;i<subsets.size();i++) { 
            if (predicate.apply(subsets.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching subsets. No match found.");
            return setNewSubsetLike(index, buildSubset(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EndpointsFluentImpl that = (EndpointsFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (subsets != null ? !subsets.equals(that.subsets) :that.subsets != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<EndpointsFluent.MetadataNested<N>> implements EndpointsFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) EndpointsFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SubsetsNestedImpl<N> extends EndpointSubsetFluentImpl<EndpointsFluent.SubsetsNested<N>> implements EndpointsFluent.SubsetsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointSubsetBuilder builder;
        private final int index;
    
            SubsetsNestedImpl(int index,EndpointSubset item){
                    this.index = index;
                    this.builder = new EndpointSubsetBuilder(this, item);
            }
            SubsetsNestedImpl(){
                    this.index = -1;
                    this.builder = new EndpointSubsetBuilder(this);
            }
    
    public N and(){
            return (N) EndpointsFluentImpl.this.setToSubsets(index, builder.build());
    }
    public N endSubset(){
            return and();
    }

}


}
