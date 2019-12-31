package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface PodAffinityTermFluent<A extends PodAffinityTermFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildLabelSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getLabelSelector();
    public LabelSelector buildLabelSelector();
    public A withLabelSelector(LabelSelector labelSelector);
    public Boolean hasLabelSelector();
    public PodAffinityTermFluent.LabelSelectorNested<A> withNewLabelSelector();
    public PodAffinityTermFluent.LabelSelectorNested<A> withNewLabelSelectorLike(LabelSelector item);
    public PodAffinityTermFluent.LabelSelectorNested<A> editLabelSelector();
    public PodAffinityTermFluent.LabelSelectorNested<A> editOrNewLabelSelector();
    public PodAffinityTermFluent.LabelSelectorNested<A> editOrNewLabelSelectorLike(LabelSelector item);
    public A addToNamespaces(int index,String item);
    public A setToNamespaces(int index,String item);
    public A addToNamespaces(String... items);
    public A addAllToNamespaces(Collection<String> items);
    public A removeFromNamespaces(String... items);
    public A removeAllFromNamespaces(Collection<String> items);
    public List<String> getNamespaces();
    public String getNamespace(int index);
    public String getFirstNamespace();
    public String getLastNamespace();
    public String getMatchingNamespace(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withNamespaces(List<String> namespaces);
    public A withNamespaces(String... namespaces);
    public Boolean hasNamespaces();
    public String getTopologyKey();
    public A withTopologyKey(String topologyKey);
    public Boolean hasTopologyKey();

    public interface LabelSelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<PodAffinityTermFluent.LabelSelectorNested<N>>{

        
    public N and();    public N endLabelSelector();
}


}
