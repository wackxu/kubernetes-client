package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class NodeAffinityFluentImpl<A extends NodeAffinityFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NodeAffinityFluent<A>{

    private List<PreferredSchedulingTermBuilder> preferredDuringSchedulingIgnoredDuringExecution;
    private NodeSelectorBuilder requiredDuringSchedulingIgnoredDuringExecution;

    public NodeAffinityFluentImpl(){
    }
    public NodeAffinityFluentImpl(NodeAffinity instance){
            this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
    }

    public A addToPreferredDuringSchedulingIgnoredDuringExecution(int index,PreferredSchedulingTerm item){
            if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredSchedulingTermBuilder>();}
            PreferredSchedulingTermBuilder builder = new PreferredSchedulingTermBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(index >= 0 ? index : preferredDuringSchedulingIgnoredDuringExecution.size(), builder); return (A)this;
    }

    public A setToPreferredDuringSchedulingIgnoredDuringExecution(int index,PreferredSchedulingTerm item){
            if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredSchedulingTermBuilder>();}
            PreferredSchedulingTermBuilder builder = new PreferredSchedulingTermBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) { preferredDuringSchedulingIgnoredDuringExecution.add(builder); } else { preferredDuringSchedulingIgnoredDuringExecution.set(index, builder);}
             return (A)this;
    }

    public A addToPreferredDuringSchedulingIgnoredDuringExecution(PreferredSchedulingTerm... items){
            if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredSchedulingTermBuilder>();}
            for (PreferredSchedulingTerm item : items) {PreferredSchedulingTermBuilder builder = new PreferredSchedulingTermBuilder(item);_visitables.add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
    }

    public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(Collection<PreferredSchedulingTerm> items){
            if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredSchedulingTermBuilder>();}
            for (PreferredSchedulingTerm item : items) {PreferredSchedulingTermBuilder builder = new PreferredSchedulingTermBuilder(item);_visitables.add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
    }

    public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(PreferredSchedulingTerm... items){
            for (PreferredSchedulingTerm item : items) {PreferredSchedulingTermBuilder builder = new PreferredSchedulingTermBuilder(item);_visitables.remove(builder);if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
    }

    public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(Collection<PreferredSchedulingTerm> items){
            for (PreferredSchedulingTerm item : items) {PreferredSchedulingTermBuilder builder = new PreferredSchedulingTermBuilder(item);_visitables.remove(builder);if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildPreferredDuringSchedulingIgnoredDuringExecution instead.
 * @return The buildable object.
 */
@Deprecated public List<PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution(){
            return build(preferredDuringSchedulingIgnoredDuringExecution);
    }

    public List<PreferredSchedulingTerm> buildPreferredDuringSchedulingIgnoredDuringExecution(){
            return build(preferredDuringSchedulingIgnoredDuringExecution);
    }

    public PreferredSchedulingTerm buildPreferredDuringSchedulingIgnoredDuringExecution(int index){
            return this.preferredDuringSchedulingIgnoredDuringExecution.get(index).build();
    }

    public PreferredSchedulingTerm buildFirstPreferredDuringSchedulingIgnoredDuringExecution(){
            return this.preferredDuringSchedulingIgnoredDuringExecution.get(0).build();
    }

    public PreferredSchedulingTerm buildLastPreferredDuringSchedulingIgnoredDuringExecution(){
            return this.preferredDuringSchedulingIgnoredDuringExecution.get(preferredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
    }

    public PreferredSchedulingTerm buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(io.fabric8.kubernetes.api.builder.Predicate<PreferredSchedulingTermBuilder> predicate){
            for (PreferredSchedulingTermBuilder item: preferredDuringSchedulingIgnoredDuringExecution) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withPreferredDuringSchedulingIgnoredDuringExecution(List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution){
            if (this.preferredDuringSchedulingIgnoredDuringExecution != null) { _visitables.removeAll(this.preferredDuringSchedulingIgnoredDuringExecution);}
            if (preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredSchedulingTermBuilder>(); for (PreferredSchedulingTerm item : preferredDuringSchedulingIgnoredDuringExecution){this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);}} else { this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredSchedulingTermBuilder>();} return (A) this;
    }

    public A withPreferredDuringSchedulingIgnoredDuringExecution(PreferredSchedulingTerm... preferredDuringSchedulingIgnoredDuringExecution){
            if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.clear();}
            if (preferredDuringSchedulingIgnoredDuringExecution != null) {for (PreferredSchedulingTerm item :preferredDuringSchedulingIgnoredDuringExecution){ this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);}} return (A) this;
    }

    public Boolean hasPreferredDuringSchedulingIgnoredDuringExecution(){
            return preferredDuringSchedulingIgnoredDuringExecution != null && !preferredDuringSchedulingIgnoredDuringExecution.isEmpty();
    }

    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution(){
            return new PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl();
    }

    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(PreferredSchedulingTerm item){
            return new PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(-1, item);
    }

    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(int index,PreferredSchedulingTerm item){
            return new PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(index, item);
    }

    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(int index){
            if (preferredDuringSchedulingIgnoredDuringExecution.size() <= index) throw new RuntimeException("Can't edit preferredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
            return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
    }

    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution(){
            if (preferredDuringSchedulingIgnoredDuringExecution.size() == 0) throw new RuntimeException("Can't edit first preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
            return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(0, buildPreferredDuringSchedulingIgnoredDuringExecution(0));
    }

    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution(){
            int index = preferredDuringSchedulingIgnoredDuringExecution.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
            return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
    }

    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(io.fabric8.kubernetes.api.builder.Predicate<PreferredSchedulingTermBuilder> predicate){
            int index = -1;
            for (int i=0;i<preferredDuringSchedulingIgnoredDuringExecution.size();i++) { 
            if (predicate.apply(preferredDuringSchedulingIgnoredDuringExecution.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching preferredDuringSchedulingIgnoredDuringExecution. No match found.");
            return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
    }

    
/**
 * This method has been deprecated, please use method buildRequiredDuringSchedulingIgnoredDuringExecution instead.
 * @return The buildable object.
 */
@Deprecated public NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution(){
            return this.requiredDuringSchedulingIgnoredDuringExecution!=null?this.requiredDuringSchedulingIgnoredDuringExecution.build():null;
    }

    public NodeSelector buildRequiredDuringSchedulingIgnoredDuringExecution(){
            return this.requiredDuringSchedulingIgnoredDuringExecution!=null?this.requiredDuringSchedulingIgnoredDuringExecution.build():null;
    }

    public A withRequiredDuringSchedulingIgnoredDuringExecution(NodeSelector requiredDuringSchedulingIgnoredDuringExecution){
            _visitables.remove(this.requiredDuringSchedulingIgnoredDuringExecution);
            if (requiredDuringSchedulingIgnoredDuringExecution!=null){ this.requiredDuringSchedulingIgnoredDuringExecution= new NodeSelectorBuilder(requiredDuringSchedulingIgnoredDuringExecution); _visitables.add(this.requiredDuringSchedulingIgnoredDuringExecution);} return (A) this;
    }

    public Boolean hasRequiredDuringSchedulingIgnoredDuringExecution(){
            return this.requiredDuringSchedulingIgnoredDuringExecution != null;
    }

    public NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> withNewRequiredDuringSchedulingIgnoredDuringExecution(){
            return new RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl();
    }

    public NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(NodeSelector item){
            return new RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(item);
    }

    public NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution(){
            return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(getRequiredDuringSchedulingIgnoredDuringExecution());
    }

    public NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editOrNewRequiredDuringSchedulingIgnoredDuringExecution(){
            return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(getRequiredDuringSchedulingIgnoredDuringExecution() != null ? getRequiredDuringSchedulingIgnoredDuringExecution(): new NodeSelectorBuilder().build());
    }

    public NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editOrNewRequiredDuringSchedulingIgnoredDuringExecutionLike(NodeSelector item){
            return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(getRequiredDuringSchedulingIgnoredDuringExecution() != null ? getRequiredDuringSchedulingIgnoredDuringExecution(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeAffinityFluentImpl that = (NodeAffinityFluentImpl) o;
            if (preferredDuringSchedulingIgnoredDuringExecution != null ? !preferredDuringSchedulingIgnoredDuringExecution.equals(that.preferredDuringSchedulingIgnoredDuringExecution) :that.preferredDuringSchedulingIgnoredDuringExecution != null) return false;
            if (requiredDuringSchedulingIgnoredDuringExecution != null ? !requiredDuringSchedulingIgnoredDuringExecution.equals(that.requiredDuringSchedulingIgnoredDuringExecution) :that.requiredDuringSchedulingIgnoredDuringExecution != null) return false;
            return true;
    }


    public class PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl<N> extends PreferredSchedulingTermFluentImpl<NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> implements NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PreferredSchedulingTermBuilder builder;
        private final int index;
    
            PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(int index,PreferredSchedulingTerm item){
                    this.index = index;
                    this.builder = new PreferredSchedulingTermBuilder(this, item);
            }
            PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(){
                    this.index = -1;
                    this.builder = new PreferredSchedulingTermBuilder(this);
            }
    
    public N and(){
            return (N) NodeAffinityFluentImpl.this.setToPreferredDuringSchedulingIgnoredDuringExecution(index, builder.build());
    }
    public N endPreferredDuringSchedulingIgnoredDuringExecution(){
            return and();
    }

}
    public class RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl<N> extends NodeSelectorFluentImpl<NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> implements NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeSelectorBuilder builder;
    
            RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(NodeSelector item){
                    this.builder = new NodeSelectorBuilder(this, item);
            }
            RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(){
                    this.builder = new NodeSelectorBuilder(this);
            }
    
    public N and(){
            return (N) NodeAffinityFluentImpl.this.withRequiredDuringSchedulingIgnoredDuringExecution(builder.build());
    }
    public N endRequiredDuringSchedulingIgnoredDuringExecution(){
            return and();
    }

}


}
