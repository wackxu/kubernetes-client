package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class NodeSelectorFluentImpl<A extends NodeSelectorFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NodeSelectorFluent<A>{

    private List<NodeSelectorTermBuilder> nodeSelectorTerms;

    public NodeSelectorFluentImpl(){
    }
    public NodeSelectorFluentImpl(NodeSelector instance){
            this.withNodeSelectorTerms(instance.getNodeSelectorTerms()); 
    }

    public A addToNodeSelectorTerms(int index,NodeSelectorTerm item){
            if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<NodeSelectorTermBuilder>();}
            NodeSelectorTermBuilder builder = new NodeSelectorTermBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.nodeSelectorTerms.add(index >= 0 ? index : nodeSelectorTerms.size(), builder); return (A)this;
    }

    public A setToNodeSelectorTerms(int index,NodeSelectorTerm item){
            if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<NodeSelectorTermBuilder>();}
            NodeSelectorTermBuilder builder = new NodeSelectorTermBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= nodeSelectorTerms.size()) { nodeSelectorTerms.add(builder); } else { nodeSelectorTerms.set(index, builder);}
             return (A)this;
    }

    public A addToNodeSelectorTerms(NodeSelectorTerm... items){
            if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<NodeSelectorTermBuilder>();}
            for (NodeSelectorTerm item : items) {NodeSelectorTermBuilder builder = new NodeSelectorTermBuilder(item);_visitables.add(builder);this.nodeSelectorTerms.add(builder);} return (A)this;
    }

    public A addAllToNodeSelectorTerms(Collection<NodeSelectorTerm> items){
            if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<NodeSelectorTermBuilder>();}
            for (NodeSelectorTerm item : items) {NodeSelectorTermBuilder builder = new NodeSelectorTermBuilder(item);_visitables.add(builder);this.nodeSelectorTerms.add(builder);} return (A)this;
    }

    public A removeFromNodeSelectorTerms(NodeSelectorTerm... items){
            for (NodeSelectorTerm item : items) {NodeSelectorTermBuilder builder = new NodeSelectorTermBuilder(item);_visitables.remove(builder);if (this.nodeSelectorTerms != null) {this.nodeSelectorTerms.remove(builder);}} return (A)this;
    }

    public A removeAllFromNodeSelectorTerms(Collection<NodeSelectorTerm> items){
            for (NodeSelectorTerm item : items) {NodeSelectorTermBuilder builder = new NodeSelectorTermBuilder(item);_visitables.remove(builder);if (this.nodeSelectorTerms != null) {this.nodeSelectorTerms.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildNodeSelectorTerms instead.
 * @return The buildable object.
 */
@Deprecated public List<NodeSelectorTerm> getNodeSelectorTerms(){
            return build(nodeSelectorTerms);
    }

    public List<NodeSelectorTerm> buildNodeSelectorTerms(){
            return build(nodeSelectorTerms);
    }

    public NodeSelectorTerm buildNodeSelectorTerm(int index){
            return this.nodeSelectorTerms.get(index).build();
    }

    public NodeSelectorTerm buildFirstNodeSelectorTerm(){
            return this.nodeSelectorTerms.get(0).build();
    }

    public NodeSelectorTerm buildLastNodeSelectorTerm(){
            return this.nodeSelectorTerms.get(nodeSelectorTerms.size() - 1).build();
    }

    public NodeSelectorTerm buildMatchingNodeSelectorTerm(io.fabric8.kubernetes.api.builder.Predicate<NodeSelectorTermBuilder> predicate){
            for (NodeSelectorTermBuilder item: nodeSelectorTerms) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withNodeSelectorTerms(List<NodeSelectorTerm> nodeSelectorTerms){
            if (this.nodeSelectorTerms != null) { _visitables.removeAll(this.nodeSelectorTerms);}
            if (nodeSelectorTerms != null) {this.nodeSelectorTerms = new ArrayList<NodeSelectorTermBuilder>(); for (NodeSelectorTerm item : nodeSelectorTerms){this.addToNodeSelectorTerms(item);}} else { this.nodeSelectorTerms = new ArrayList<NodeSelectorTermBuilder>();} return (A) this;
    }

    public A withNodeSelectorTerms(NodeSelectorTerm... nodeSelectorTerms){
            if (this.nodeSelectorTerms != null) {this.nodeSelectorTerms.clear();}
            if (nodeSelectorTerms != null) {for (NodeSelectorTerm item :nodeSelectorTerms){ this.addToNodeSelectorTerms(item);}} return (A) this;
    }

    public Boolean hasNodeSelectorTerms(){
            return nodeSelectorTerms != null && !nodeSelectorTerms.isEmpty();
    }

    public NodeSelectorFluent.NodeSelectorTermsNested<A> addNewNodeSelectorTerm(){
            return new NodeSelectorTermsNestedImpl();
    }

    public NodeSelectorFluent.NodeSelectorTermsNested<A> addNewNodeSelectorTermLike(NodeSelectorTerm item){
            return new NodeSelectorTermsNestedImpl(-1, item);
    }

    public NodeSelectorFluent.NodeSelectorTermsNested<A> setNewNodeSelectorTermLike(int index,NodeSelectorTerm item){
            return new NodeSelectorTermsNestedImpl(index, item);
    }

    public NodeSelectorFluent.NodeSelectorTermsNested<A> editNodeSelectorTerm(int index){
            if (nodeSelectorTerms.size() <= index) throw new RuntimeException("Can't edit nodeSelectorTerms. Index exceeds size.");
            return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
    }

    public NodeSelectorFluent.NodeSelectorTermsNested<A> editFirstNodeSelectorTerm(){
            if (nodeSelectorTerms.size() == 0) throw new RuntimeException("Can't edit first nodeSelectorTerms. The list is empty.");
            return setNewNodeSelectorTermLike(0, buildNodeSelectorTerm(0));
    }

    public NodeSelectorFluent.NodeSelectorTermsNested<A> editLastNodeSelectorTerm(){
            int index = nodeSelectorTerms.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last nodeSelectorTerms. The list is empty.");
            return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
    }

    public NodeSelectorFluent.NodeSelectorTermsNested<A> editMatchingNodeSelectorTerm(io.fabric8.kubernetes.api.builder.Predicate<NodeSelectorTermBuilder> predicate){
            int index = -1;
            for (int i=0;i<nodeSelectorTerms.size();i++) { 
            if (predicate.apply(nodeSelectorTerms.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching nodeSelectorTerms. No match found.");
            return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeSelectorFluentImpl that = (NodeSelectorFluentImpl) o;
            if (nodeSelectorTerms != null ? !nodeSelectorTerms.equals(that.nodeSelectorTerms) :that.nodeSelectorTerms != null) return false;
            return true;
    }


    public class NodeSelectorTermsNestedImpl<N> extends NodeSelectorTermFluentImpl<NodeSelectorFluent.NodeSelectorTermsNested<N>> implements NodeSelectorFluent.NodeSelectorTermsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeSelectorTermBuilder builder;
        private final int index;
    
            NodeSelectorTermsNestedImpl(int index,NodeSelectorTerm item){
                    this.index = index;
                    this.builder = new NodeSelectorTermBuilder(this, item);
            }
            NodeSelectorTermsNestedImpl(){
                    this.index = -1;
                    this.builder = new NodeSelectorTermBuilder(this);
            }
    
    public N and(){
            return (N) NodeSelectorFluentImpl.this.setToNodeSelectorTerms(index, builder.build());
    }
    public N endNodeSelectorTerm(){
            return and();
    }

}


}
