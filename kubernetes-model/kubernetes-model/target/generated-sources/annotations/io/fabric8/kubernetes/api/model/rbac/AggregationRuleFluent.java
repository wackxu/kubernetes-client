package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.LabelSelector;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import io.fabric8.kubernetes.api.model.LabelSelectorFluent;
import java.lang.Boolean;
import java.util.Map;

public interface AggregationRuleFluent<A extends AggregationRuleFluent<A>> extends Fluent<A>{


    public A addToClusterRoleSelectors(int index,LabelSelector item);
    public A setToClusterRoleSelectors(int index,LabelSelector item);
    public A addToClusterRoleSelectors(LabelSelector... items);
    public A addAllToClusterRoleSelectors(Collection<LabelSelector> items);
    public A removeFromClusterRoleSelectors(LabelSelector... items);
    public A removeAllFromClusterRoleSelectors(Collection<LabelSelector> items);
    
/**
 * This method has been deprecated, please use method buildClusterRoleSelectors instead.
 * @return The buildable object.
 */
@Deprecated public List<LabelSelector> getClusterRoleSelectors();
    public List<LabelSelector> buildClusterRoleSelectors();
    public LabelSelector buildClusterRoleSelector(int index);
    public LabelSelector buildFirstClusterRoleSelector();
    public LabelSelector buildLastClusterRoleSelector();
    public LabelSelector buildMatchingClusterRoleSelector(io.fabric8.kubernetes.api.builder.Predicate<LabelSelectorBuilder> predicate);
    public A withClusterRoleSelectors(List<LabelSelector> clusterRoleSelectors);
    public A withClusterRoleSelectors(LabelSelector... clusterRoleSelectors);
    public Boolean hasClusterRoleSelectors();
    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> addNewClusterRoleSelector();
    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> addNewClusterRoleSelectorLike(LabelSelector item);
    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> setNewClusterRoleSelectorLike(int index,LabelSelector item);
    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> editClusterRoleSelector(int index);
    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> editFirstClusterRoleSelector();
    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> editLastClusterRoleSelector();
    public AggregationRuleFluent.ClusterRoleSelectorsNested<A> editMatchingClusterRoleSelector(io.fabric8.kubernetes.api.builder.Predicate<LabelSelectorBuilder> predicate);

    public interface ClusterRoleSelectorsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<AggregationRuleFluent.ClusterRoleSelectorsNested<N>>{

        
    public N and();    public N endClusterRoleSelector();
}


}
