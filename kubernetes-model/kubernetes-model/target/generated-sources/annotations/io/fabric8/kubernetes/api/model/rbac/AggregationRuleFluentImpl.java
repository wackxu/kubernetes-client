package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.LabelSelectorFluentImpl;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class AggregationRuleFluentImpl<A extends AggregationRuleFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements AggregationRuleFluent<A>{

    private List<LabelSelectorBuilder> clusterRoleSelectors;

    public AggregationRuleFluentImpl(){
    }
    public AggregationRuleFluentImpl(AggregationRule instance){
            this.withClusterRoleSelectors(instance.getClusterRoleSelectors()); 
    }

    public A addToClusterRoleSelectors(int index,LabelSelector item){
            if (this.clusterRoleSelectors == null) {this.clusterRoleSelectors = new ArrayList<LabelSelectorBuilder>();}
            LabelSelectorBuilder builder = new LabelSelectorBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.clusterRoleSelectors.add(index >= 0 ? index : clusterRoleSelectors.size(), builder); return (A)this;
    }

    public A setToClusterRoleSelectors(int index,LabelSelector item){
            if (this.clusterRoleSelectors == null) {this.clusterRoleSelectors = new ArrayList<LabelSelectorBuilder>();}
            LabelSelectorBuilder builder = new LabelSelectorBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= clusterRoleSelectors.size()) { clusterRoleSelectors.add(builder); } else { clusterRoleSelectors.set(index, builder);}
             return (A)this;
    }

    public A addToClusterRoleSelectors(LabelSelector... items){
            if (this.clusterRoleSelectors == null) {this.clusterRoleSelectors = new ArrayList<LabelSelectorBuilder>();}
            for (LabelSelector item : items) {LabelSelectorBuilder builder = new LabelSelectorBuilder(item);_visitables.add(builder);this.clusterRoleSelectors.add(builder);} return (A)this;
    }

    public A addAllToClusterRoleSelectors(Collection<LabelSelector> items){
            if (this.clusterRoleSelectors == null) {this.clusterRoleSelectors = new ArrayList<LabelSelectorBuilder>();}
            for (LabelSelector item : items) {LabelSelectorBuilder builder = new LabelSelectorBuilder(item);_visitables.add(builder);this.clusterRoleSelectors.add(builder);} return (A)this;
    }

    public A removeFromClusterRoleSelectors(LabelSelector... items){
            for (LabelSelector item : items) {LabelSelectorBuilder builder = new LabelSelectorBuilder(item);_visitables.remove(builder);if (this.clusterRoleSelectors != null) {this.clusterRoleSelectors.remove(builder);}} return (A)this;
    }

    public A removeAllFromClusterRoleSelectors(Collection<LabelSelector> items){
            for (LabelSelector item : items) {LabelSelectorBuilder builder = new LabelSelectorBuilder(item);_visitables.remove(builder);if (this.clusterRoleSelectors != null) {this.clusterRoleSelectors.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildClusterRoleSelectors instead.
 * @return The buildable object.
 */
@Deprecated public List<LabelSelector> getClusterRoleSelectors(){
            return build(clusterRoleSelectors);
    }

    public List<LabelSelector> buildClusterRoleSelectors(){
            return build(clusterRoleSelectors);
    }

    public LabelSelector buildClusterRoleSelector(int index){
            return this.clusterRoleSelectors.get(index).build();
    }

    public LabelSelector buildFirstClusterRoleSelector(){
            return this.clusterRoleSelectors.get(0).build();
    }

    public LabelSelector buildLastClusterRoleSelector(){
            return this.clusterRoleSelectors.get(clusterRoleSelectors.size() - 1).build();
    }

    public LabelSelector buildMatchingClusterRoleSelector(io.fabric8.kubernetes.api.builder.Predicate<LabelSelectorBuilder> predicate){
            for (LabelSelectorBuilder item: clusterRoleSelectors) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withClusterRoleSelectors(List<LabelSelector> clusterRoleSelectors){
            if (this.clusterRoleSelectors != null) { _visitables.removeAll(this.clusterRoleSelectors);}
            if (clusterRoleSelectors != null) {this.clusterRoleSelectors = new ArrayList<LabelSelectorBuilder>(); for (LabelSelector item : clusterRoleSelectors){this.addToClusterRoleSelectors(item);}} else { this.clusterRoleSelectors = new ArrayList<LabelSelectorBuilder>();} return (A) this;
    }

    public A withClusterRoleSelectors(LabelSelector... clusterRoleSelectors){
            if (this.clusterRoleSelectors != null) {this.clusterRoleSelectors.clear();}
            if (clusterRoleSelectors != null) {for (LabelSelector item :clusterRoleSelectors){ this.addToClusterRoleSelectors(item);}} return (A) this;
    }

    public Boolean hasClusterRoleSelectors(){
            return clusterRoleSelectors != null && !clusterRoleSelectors.isEmpty();
    }

    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> addNewClusterRoleSelector(){
            return new ClusterRoleSelectorsNestedImpl();
    }

    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> addNewClusterRoleSelectorLike(LabelSelector item){
            return new ClusterRoleSelectorsNestedImpl(-1, item);
    }

    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> setNewClusterRoleSelectorLike(int index,LabelSelector item){
            return new ClusterRoleSelectorsNestedImpl(index, item);
    }

    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> editClusterRoleSelector(int index){
            if (clusterRoleSelectors.size() <= index) throw new RuntimeException("Can't edit clusterRoleSelectors. Index exceeds size.");
            return setNewClusterRoleSelectorLike(index, buildClusterRoleSelector(index));
    }

    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> editFirstClusterRoleSelector(){
            if (clusterRoleSelectors.size() == 0) throw new RuntimeException("Can't edit first clusterRoleSelectors. The list is empty.");
            return setNewClusterRoleSelectorLike(0, buildClusterRoleSelector(0));
    }

    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> editLastClusterRoleSelector(){
            int index = clusterRoleSelectors.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last clusterRoleSelectors. The list is empty.");
            return setNewClusterRoleSelectorLike(index, buildClusterRoleSelector(index));
    }

    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> editMatchingClusterRoleSelector(io.fabric8.kubernetes.api.builder.Predicate<LabelSelectorBuilder> predicate){
            int index = -1;
            for (int i=0;i<clusterRoleSelectors.size();i++) { 
            if (predicate.apply(clusterRoleSelectors.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching clusterRoleSelectors. No match found.");
            return setNewClusterRoleSelectorLike(index, buildClusterRoleSelector(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AggregationRuleFluentImpl that = (AggregationRuleFluentImpl) o;
            if (clusterRoleSelectors != null ? !clusterRoleSelectors.equals(that.clusterRoleSelectors) :that.clusterRoleSelectors != null) return false;
            return true;
    }


    public class ClusterRoleSelectorsNestedImpl<N> extends LabelSelectorFluentImpl<AggregationRuleFluent.ClusterRoleSelectorsNested<N>> implements AggregationRuleFluent.ClusterRoleSelectorsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
        private final int index;
    
            ClusterRoleSelectorsNestedImpl(int index,LabelSelector item){
                    this.index = index;
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            ClusterRoleSelectorsNestedImpl(){
                    this.index = -1;
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) AggregationRuleFluentImpl.this.setToClusterRoleSelectors(index, builder.build());
    }
    public N endClusterRoleSelector(){
            return and();
    }

}


}
