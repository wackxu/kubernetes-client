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

public class PodAntiAffinityFluentImpl<A extends PodAntiAffinityFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodAntiAffinityFluent<A>{

    private List<WeightedPodAffinityTermBuilder> preferredDuringSchedulingIgnoredDuringExecution;
    private List<PodAffinityTermBuilder> requiredDuringSchedulingIgnoredDuringExecution;

    public PodAntiAffinityFluentImpl(){
    }
    public PodAntiAffinityFluentImpl(PodAntiAffinity instance){
            this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
    }

    public A addToPreferredDuringSchedulingIgnoredDuringExecution(int index,WeightedPodAffinityTerm item){
            if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<WeightedPodAffinityTermBuilder>();}
            WeightedPodAffinityTermBuilder builder = new WeightedPodAffinityTermBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(index >= 0 ? index : preferredDuringSchedulingIgnoredDuringExecution.size(), builder); return (A)this;
    }

    public A setToPreferredDuringSchedulingIgnoredDuringExecution(int index,WeightedPodAffinityTerm item){
            if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<WeightedPodAffinityTermBuilder>();}
            WeightedPodAffinityTermBuilder builder = new WeightedPodAffinityTermBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) { preferredDuringSchedulingIgnoredDuringExecution.add(builder); } else { preferredDuringSchedulingIgnoredDuringExecution.set(index, builder);}
             return (A)this;
    }

    public A addToPreferredDuringSchedulingIgnoredDuringExecution(WeightedPodAffinityTerm... items){
            if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<WeightedPodAffinityTermBuilder>();}
            for (WeightedPodAffinityTerm item : items) {WeightedPodAffinityTermBuilder builder = new WeightedPodAffinityTermBuilder(item);_visitables.add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
    }

    public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(Collection<WeightedPodAffinityTerm> items){
            if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<WeightedPodAffinityTermBuilder>();}
            for (WeightedPodAffinityTerm item : items) {WeightedPodAffinityTermBuilder builder = new WeightedPodAffinityTermBuilder(item);_visitables.add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
    }

    public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(WeightedPodAffinityTerm... items){
            for (WeightedPodAffinityTerm item : items) {WeightedPodAffinityTermBuilder builder = new WeightedPodAffinityTermBuilder(item);_visitables.remove(builder);if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
    }

    public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(Collection<WeightedPodAffinityTerm> items){
            for (WeightedPodAffinityTerm item : items) {WeightedPodAffinityTermBuilder builder = new WeightedPodAffinityTermBuilder(item);_visitables.remove(builder);if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildPreferredDuringSchedulingIgnoredDuringExecution instead.
 * @return The buildable object.
 */
@Deprecated public List<WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution(){
            return build(preferredDuringSchedulingIgnoredDuringExecution);
    }

    public List<WeightedPodAffinityTerm> buildPreferredDuringSchedulingIgnoredDuringExecution(){
            return build(preferredDuringSchedulingIgnoredDuringExecution);
    }

    public WeightedPodAffinityTerm buildPreferredDuringSchedulingIgnoredDuringExecution(int index){
            return this.preferredDuringSchedulingIgnoredDuringExecution.get(index).build();
    }

    public WeightedPodAffinityTerm buildFirstPreferredDuringSchedulingIgnoredDuringExecution(){
            return this.preferredDuringSchedulingIgnoredDuringExecution.get(0).build();
    }

    public WeightedPodAffinityTerm buildLastPreferredDuringSchedulingIgnoredDuringExecution(){
            return this.preferredDuringSchedulingIgnoredDuringExecution.get(preferredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
    }

    public WeightedPodAffinityTerm buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(io.fabric8.kubernetes.api.builder.Predicate<WeightedPodAffinityTermBuilder> predicate){
            for (WeightedPodAffinityTermBuilder item: preferredDuringSchedulingIgnoredDuringExecution) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withPreferredDuringSchedulingIgnoredDuringExecution(List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution){
            if (this.preferredDuringSchedulingIgnoredDuringExecution != null) { _visitables.removeAll(this.preferredDuringSchedulingIgnoredDuringExecution);}
            if (preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<WeightedPodAffinityTermBuilder>(); for (WeightedPodAffinityTerm item : preferredDuringSchedulingIgnoredDuringExecution){this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);}} else { this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<WeightedPodAffinityTermBuilder>();} return (A) this;
    }

    public A withPreferredDuringSchedulingIgnoredDuringExecution(WeightedPodAffinityTerm... preferredDuringSchedulingIgnoredDuringExecution){
            if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.clear();}
            if (preferredDuringSchedulingIgnoredDuringExecution != null) {for (WeightedPodAffinityTerm item :preferredDuringSchedulingIgnoredDuringExecution){ this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);}} return (A) this;
    }

    public Boolean hasPreferredDuringSchedulingIgnoredDuringExecution(){
            return preferredDuringSchedulingIgnoredDuringExecution != null && !preferredDuringSchedulingIgnoredDuringExecution.isEmpty();
    }

    public PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution(){
            return new PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl();
    }

    public PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(WeightedPodAffinityTerm item){
            return new PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(-1, item);
    }

    public PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(int index,WeightedPodAffinityTerm item){
            return new PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(index, item);
    }

    public PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(int index){
            if (preferredDuringSchedulingIgnoredDuringExecution.size() <= index) throw new RuntimeException("Can't edit preferredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
            return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
    }

    public PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution(){
            if (preferredDuringSchedulingIgnoredDuringExecution.size() == 0) throw new RuntimeException("Can't edit first preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
            return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(0, buildPreferredDuringSchedulingIgnoredDuringExecution(0));
    }

    public PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution(){
            int index = preferredDuringSchedulingIgnoredDuringExecution.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
            return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
    }

    public PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(io.fabric8.kubernetes.api.builder.Predicate<WeightedPodAffinityTermBuilder> predicate){
            int index = -1;
            for (int i=0;i<preferredDuringSchedulingIgnoredDuringExecution.size();i++) { 
            if (predicate.apply(preferredDuringSchedulingIgnoredDuringExecution.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching preferredDuringSchedulingIgnoredDuringExecution. No match found.");
            return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
    }

    public A addToRequiredDuringSchedulingIgnoredDuringExecution(int index,PodAffinityTerm item){
            if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<PodAffinityTermBuilder>();}
            PodAffinityTermBuilder builder = new PodAffinityTermBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.requiredDuringSchedulingIgnoredDuringExecution.add(index >= 0 ? index : requiredDuringSchedulingIgnoredDuringExecution.size(), builder); return (A)this;
    }

    public A setToRequiredDuringSchedulingIgnoredDuringExecution(int index,PodAffinityTerm item){
            if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<PodAffinityTermBuilder>();}
            PodAffinityTermBuilder builder = new PodAffinityTermBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= requiredDuringSchedulingIgnoredDuringExecution.size()) { requiredDuringSchedulingIgnoredDuringExecution.add(builder); } else { requiredDuringSchedulingIgnoredDuringExecution.set(index, builder);}
             return (A)this;
    }

    public A addToRequiredDuringSchedulingIgnoredDuringExecution(PodAffinityTerm... items){
            if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<PodAffinityTermBuilder>();}
            for (PodAffinityTerm item : items) {PodAffinityTermBuilder builder = new PodAffinityTermBuilder(item);_visitables.add(builder);this.requiredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
    }

    public A addAllToRequiredDuringSchedulingIgnoredDuringExecution(Collection<PodAffinityTerm> items){
            if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<PodAffinityTermBuilder>();}
            for (PodAffinityTerm item : items) {PodAffinityTermBuilder builder = new PodAffinityTermBuilder(item);_visitables.add(builder);this.requiredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
    }

    public A removeFromRequiredDuringSchedulingIgnoredDuringExecution(PodAffinityTerm... items){
            for (PodAffinityTerm item : items) {PodAffinityTermBuilder builder = new PodAffinityTermBuilder(item);_visitables.remove(builder);if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {this.requiredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
    }

    public A removeAllFromRequiredDuringSchedulingIgnoredDuringExecution(Collection<PodAffinityTerm> items){
            for (PodAffinityTerm item : items) {PodAffinityTermBuilder builder = new PodAffinityTermBuilder(item);_visitables.remove(builder);if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {this.requiredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildRequiredDuringSchedulingIgnoredDuringExecution instead.
 * @return The buildable object.
 */
@Deprecated public List<PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution(){
            return build(requiredDuringSchedulingIgnoredDuringExecution);
    }

    public List<PodAffinityTerm> buildRequiredDuringSchedulingIgnoredDuringExecution(){
            return build(requiredDuringSchedulingIgnoredDuringExecution);
    }

    public PodAffinityTerm buildRequiredDuringSchedulingIgnoredDuringExecution(int index){
            return this.requiredDuringSchedulingIgnoredDuringExecution.get(index).build();
    }

    public PodAffinityTerm buildFirstRequiredDuringSchedulingIgnoredDuringExecution(){
            return this.requiredDuringSchedulingIgnoredDuringExecution.get(0).build();
    }

    public PodAffinityTerm buildLastRequiredDuringSchedulingIgnoredDuringExecution(){
            return this.requiredDuringSchedulingIgnoredDuringExecution.get(requiredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
    }

    public PodAffinityTerm buildMatchingRequiredDuringSchedulingIgnoredDuringExecution(io.fabric8.kubernetes.api.builder.Predicate<PodAffinityTermBuilder> predicate){
            for (PodAffinityTermBuilder item: requiredDuringSchedulingIgnoredDuringExecution) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withRequiredDuringSchedulingIgnoredDuringExecution(List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution){
            if (this.requiredDuringSchedulingIgnoredDuringExecution != null) { _visitables.removeAll(this.requiredDuringSchedulingIgnoredDuringExecution);}
            if (requiredDuringSchedulingIgnoredDuringExecution != null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<PodAffinityTermBuilder>(); for (PodAffinityTerm item : requiredDuringSchedulingIgnoredDuringExecution){this.addToRequiredDuringSchedulingIgnoredDuringExecution(item);}} else { this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<PodAffinityTermBuilder>();} return (A) this;
    }

    public A withRequiredDuringSchedulingIgnoredDuringExecution(PodAffinityTerm... requiredDuringSchedulingIgnoredDuringExecution){
            if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {this.requiredDuringSchedulingIgnoredDuringExecution.clear();}
            if (requiredDuringSchedulingIgnoredDuringExecution != null) {for (PodAffinityTerm item :requiredDuringSchedulingIgnoredDuringExecution){ this.addToRequiredDuringSchedulingIgnoredDuringExecution(item);}} return (A) this;
    }

    public Boolean hasRequiredDuringSchedulingIgnoredDuringExecution(){
            return requiredDuringSchedulingIgnoredDuringExecution != null && !requiredDuringSchedulingIgnoredDuringExecution.isEmpty();
    }

    public PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecution(){
            return new RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl();
    }

    public PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecutionLike(PodAffinityTerm item){
            return new RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(-1, item);
    }

    public PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(int index,PodAffinityTerm item){
            return new RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(index, item);
    }

    public PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution(int index){
            if (requiredDuringSchedulingIgnoredDuringExecution.size() <= index) throw new RuntimeException("Can't edit requiredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
            return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
    }

    public PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstRequiredDuringSchedulingIgnoredDuringExecution(){
            if (requiredDuringSchedulingIgnoredDuringExecution.size() == 0) throw new RuntimeException("Can't edit first requiredDuringSchedulingIgnoredDuringExecution. The list is empty.");
            return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(0, buildRequiredDuringSchedulingIgnoredDuringExecution(0));
    }

    public PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editLastRequiredDuringSchedulingIgnoredDuringExecution(){
            int index = requiredDuringSchedulingIgnoredDuringExecution.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last requiredDuringSchedulingIgnoredDuringExecution. The list is empty.");
            return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
    }

    public PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingRequiredDuringSchedulingIgnoredDuringExecution(io.fabric8.kubernetes.api.builder.Predicate<PodAffinityTermBuilder> predicate){
            int index = -1;
            for (int i=0;i<requiredDuringSchedulingIgnoredDuringExecution.size();i++) { 
            if (predicate.apply(requiredDuringSchedulingIgnoredDuringExecution.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching requiredDuringSchedulingIgnoredDuringExecution. No match found.");
            return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodAntiAffinityFluentImpl that = (PodAntiAffinityFluentImpl) o;
            if (preferredDuringSchedulingIgnoredDuringExecution != null ? !preferredDuringSchedulingIgnoredDuringExecution.equals(that.preferredDuringSchedulingIgnoredDuringExecution) :that.preferredDuringSchedulingIgnoredDuringExecution != null) return false;
            if (requiredDuringSchedulingIgnoredDuringExecution != null ? !requiredDuringSchedulingIgnoredDuringExecution.equals(that.requiredDuringSchedulingIgnoredDuringExecution) :that.requiredDuringSchedulingIgnoredDuringExecution != null) return false;
            return true;
    }


    public class PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl<N> extends WeightedPodAffinityTermFluentImpl<PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> implements PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WeightedPodAffinityTermBuilder builder;
        private final int index;
    
            PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(int index,WeightedPodAffinityTerm item){
                    this.index = index;
                    this.builder = new WeightedPodAffinityTermBuilder(this, item);
            }
            PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(){
                    this.index = -1;
                    this.builder = new WeightedPodAffinityTermBuilder(this);
            }
    
    public N and(){
            return (N) PodAntiAffinityFluentImpl.this.setToPreferredDuringSchedulingIgnoredDuringExecution(index, builder.build());
    }
    public N endPreferredDuringSchedulingIgnoredDuringExecution(){
            return and();
    }

}
    public class RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl<N> extends PodAffinityTermFluentImpl<PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> implements PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodAffinityTermBuilder builder;
        private final int index;
    
            RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(int index,PodAffinityTerm item){
                    this.index = index;
                    this.builder = new PodAffinityTermBuilder(this, item);
            }
            RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(){
                    this.index = -1;
                    this.builder = new PodAffinityTermBuilder(this);
            }
    
    public N and(){
            return (N) PodAntiAffinityFluentImpl.this.setToRequiredDuringSchedulingIgnoredDuringExecution(index, builder.build());
    }
    public N endRequiredDuringSchedulingIgnoredDuringExecution(){
            return and();
    }

}


}
