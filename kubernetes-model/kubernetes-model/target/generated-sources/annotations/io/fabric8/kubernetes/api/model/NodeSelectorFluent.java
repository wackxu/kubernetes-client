package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
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

public interface NodeSelectorFluent<A extends NodeSelectorFluent<A>> extends Fluent<A>{


    public A addToNodeSelectorTerms(int index,NodeSelectorTerm item);
    public A setToNodeSelectorTerms(int index,NodeSelectorTerm item);
    public A addToNodeSelectorTerms(NodeSelectorTerm... items);
    public A addAllToNodeSelectorTerms(Collection<NodeSelectorTerm> items);
    public A removeFromNodeSelectorTerms(NodeSelectorTerm... items);
    public A removeAllFromNodeSelectorTerms(Collection<NodeSelectorTerm> items);
    
/**
 * This method has been deprecated, please use method buildNodeSelectorTerms instead.
 * @return The buildable object.
 */
@Deprecated public List<NodeSelectorTerm> getNodeSelectorTerms();
    public List<NodeSelectorTerm> buildNodeSelectorTerms();
    public NodeSelectorTerm buildNodeSelectorTerm(int index);
    public NodeSelectorTerm buildFirstNodeSelectorTerm();
    public NodeSelectorTerm buildLastNodeSelectorTerm();
    public NodeSelectorTerm buildMatchingNodeSelectorTerm(io.fabric8.kubernetes.api.builder.Predicate<NodeSelectorTermBuilder> predicate);
    public A withNodeSelectorTerms(List<NodeSelectorTerm> nodeSelectorTerms);
    public A withNodeSelectorTerms(NodeSelectorTerm... nodeSelectorTerms);
    public Boolean hasNodeSelectorTerms();
    public NodeSelectorFluent.NodeSelectorTermsNested<A> addNewNodeSelectorTerm();
    public NodeSelectorFluent.NodeSelectorTermsNested<A> addNewNodeSelectorTermLike(NodeSelectorTerm item);
    public NodeSelectorFluent.NodeSelectorTermsNested<A> setNewNodeSelectorTermLike(int index,NodeSelectorTerm item);
    public NodeSelectorFluent.NodeSelectorTermsNested<A> editNodeSelectorTerm(int index);
    public NodeSelectorFluent.NodeSelectorTermsNested<A> editFirstNodeSelectorTerm();
    public NodeSelectorFluent.NodeSelectorTermsNested<A> editLastNodeSelectorTerm();
    public NodeSelectorFluent.NodeSelectorTermsNested<A> editMatchingNodeSelectorTerm(io.fabric8.kubernetes.api.builder.Predicate<NodeSelectorTermBuilder> predicate);

    public interface NodeSelectorTermsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeSelectorTermFluent<NodeSelectorFluent.NodeSelectorTermsNested<N>>{

        
    public N and();    public N endNodeSelectorTerm();
}


}
