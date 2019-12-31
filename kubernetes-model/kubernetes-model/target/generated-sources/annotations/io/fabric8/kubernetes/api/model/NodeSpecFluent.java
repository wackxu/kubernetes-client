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

public interface NodeSpecFluent<A extends NodeSpecFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildConfigSource instead.
 * @return The buildable object.
 */
@Deprecated public NodeConfigSource getConfigSource();
    public NodeConfigSource buildConfigSource();
    public A withConfigSource(NodeConfigSource configSource);
    public Boolean hasConfigSource();
    public NodeSpecFluent.ConfigSourceNested<A> withNewConfigSource();
    public NodeSpecFluent.ConfigSourceNested<A> withNewConfigSourceLike(NodeConfigSource item);
    public NodeSpecFluent.ConfigSourceNested<A> editConfigSource();
    public NodeSpecFluent.ConfigSourceNested<A> editOrNewConfigSource();
    public NodeSpecFluent.ConfigSourceNested<A> editOrNewConfigSourceLike(NodeConfigSource item);
    public String getExternalID();
    public A withExternalID(String externalID);
    public Boolean hasExternalID();
    public String getPodCIDR();
    public A withPodCIDR(String podCIDR);
    public Boolean hasPodCIDR();
    public String getProviderID();
    public A withProviderID(String providerID);
    public Boolean hasProviderID();
    public A addToTaints(int index,Taint item);
    public A setToTaints(int index,Taint item);
    public A addToTaints(Taint... items);
    public A addAllToTaints(Collection<Taint> items);
    public A removeFromTaints(Taint... items);
    public A removeAllFromTaints(Collection<Taint> items);
    
/**
 * This method has been deprecated, please use method buildTaints instead.
 * @return The buildable object.
 */
@Deprecated public List<Taint> getTaints();
    public List<Taint> buildTaints();
    public Taint buildTaint(int index);
    public Taint buildFirstTaint();
    public Taint buildLastTaint();
    public Taint buildMatchingTaint(io.fabric8.kubernetes.api.builder.Predicate<TaintBuilder> predicate);
    public A withTaints(List<Taint> taints);
    public A withTaints(Taint... taints);
    public Boolean hasTaints();
    public A addNewTaint(String effect,String key,String timeAdded,String value);
    public NodeSpecFluent.TaintsNested<A> addNewTaint();
    public NodeSpecFluent.TaintsNested<A> addNewTaintLike(Taint item);
    public NodeSpecFluent.TaintsNested<A> setNewTaintLike(int index,Taint item);
    public NodeSpecFluent.TaintsNested<A> editTaint(int index);
    public NodeSpecFluent.TaintsNested<A> editFirstTaint();
    public NodeSpecFluent.TaintsNested<A> editLastTaint();
    public NodeSpecFluent.TaintsNested<A> editMatchingTaint(io.fabric8.kubernetes.api.builder.Predicate<TaintBuilder> predicate);
    public Boolean isUnschedulable();
    public A withUnschedulable(Boolean unschedulable);
    public Boolean hasUnschedulable();
    public A withNewUnschedulable(String arg1);
    public A withNewUnschedulable(boolean arg1);

    public interface ConfigSourceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeConfigSourceFluent<NodeSpecFluent.ConfigSourceNested<N>>{

        
    public N and();    public N endConfigSource();
}
    public interface TaintsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TaintFluent<NodeSpecFluent.TaintsNested<N>>{

        
    public N and();    public N endTaint();
}


}
