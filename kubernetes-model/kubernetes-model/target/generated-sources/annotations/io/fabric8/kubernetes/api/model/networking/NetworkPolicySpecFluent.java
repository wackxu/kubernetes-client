package io.fabric8.kubernetes.api.model.networking;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.LabelSelector;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.LabelSelectorFluent;
import java.util.Map;

public interface NetworkPolicySpecFluent<A extends NetworkPolicySpecFluent<A>> extends Fluent<A>{


    public A addToEgress(int index,NetworkPolicyEgressRule item);
    public A setToEgress(int index,NetworkPolicyEgressRule item);
    public A addToEgress(NetworkPolicyEgressRule... items);
    public A addAllToEgress(Collection<NetworkPolicyEgressRule> items);
    public A removeFromEgress(NetworkPolicyEgressRule... items);
    public A removeAllFromEgress(Collection<NetworkPolicyEgressRule> items);
    
/**
 * This method has been deprecated, please use method buildEgress instead.
 * @return The buildable object.
 */
@Deprecated public List<NetworkPolicyEgressRule> getEgress();
    public List<NetworkPolicyEgressRule> buildEgress();
    public NetworkPolicyEgressRule buildEgress(int index);
    public NetworkPolicyEgressRule buildFirstEgress();
    public NetworkPolicyEgressRule buildLastEgress();
    public NetworkPolicyEgressRule buildMatchingEgress(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyEgressRuleBuilder> predicate);
    public A withEgress(List<NetworkPolicyEgressRule> egress);
    public A withEgress(NetworkPolicyEgressRule... egress);
    public Boolean hasEgress();
    public NetworkPolicySpecFluent.EgressNested<A> addNewEgress();
    public NetworkPolicySpecFluent.EgressNested<A> addNewEgressLike(NetworkPolicyEgressRule item);
    public NetworkPolicySpecFluent.EgressNested<A> setNewEgressLike(int index,NetworkPolicyEgressRule item);
    public NetworkPolicySpecFluent.EgressNested<A> editEgress(int index);
    public NetworkPolicySpecFluent.EgressNested<A> editFirstEgress();
    public NetworkPolicySpecFluent.EgressNested<A> editLastEgress();
    public NetworkPolicySpecFluent.EgressNested<A> editMatchingEgress(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyEgressRuleBuilder> predicate);
    public A addToIngress(int index,NetworkPolicyIngressRule item);
    public A setToIngress(int index,NetworkPolicyIngressRule item);
    public A addToIngress(NetworkPolicyIngressRule... items);
    public A addAllToIngress(Collection<NetworkPolicyIngressRule> items);
    public A removeFromIngress(NetworkPolicyIngressRule... items);
    public A removeAllFromIngress(Collection<NetworkPolicyIngressRule> items);
    
/**
 * This method has been deprecated, please use method buildIngress instead.
 * @return The buildable object.
 */
@Deprecated public List<NetworkPolicyIngressRule> getIngress();
    public List<NetworkPolicyIngressRule> buildIngress();
    public NetworkPolicyIngressRule buildIngress(int index);
    public NetworkPolicyIngressRule buildFirstIngress();
    public NetworkPolicyIngressRule buildLastIngress();
    public NetworkPolicyIngressRule buildMatchingIngress(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyIngressRuleBuilder> predicate);
    public A withIngress(List<NetworkPolicyIngressRule> ingress);
    public A withIngress(NetworkPolicyIngressRule... ingress);
    public Boolean hasIngress();
    public NetworkPolicySpecFluent.IngressNested<A> addNewIngress();
    public NetworkPolicySpecFluent.IngressNested<A> addNewIngressLike(NetworkPolicyIngressRule item);
    public NetworkPolicySpecFluent.IngressNested<A> setNewIngressLike(int index,NetworkPolicyIngressRule item);
    public NetworkPolicySpecFluent.IngressNested<A> editIngress(int index);
    public NetworkPolicySpecFluent.IngressNested<A> editFirstIngress();
    public NetworkPolicySpecFluent.IngressNested<A> editLastIngress();
    public NetworkPolicySpecFluent.IngressNested<A> editMatchingIngress(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyIngressRuleBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildPodSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getPodSelector();
    public LabelSelector buildPodSelector();
    public A withPodSelector(LabelSelector podSelector);
    public Boolean hasPodSelector();
    public NetworkPolicySpecFluent.PodSelectorNested<A> withNewPodSelector();
    public NetworkPolicySpecFluent.PodSelectorNested<A> withNewPodSelectorLike(LabelSelector item);
    public NetworkPolicySpecFluent.PodSelectorNested<A> editPodSelector();
    public NetworkPolicySpecFluent.PodSelectorNested<A> editOrNewPodSelector();
    public NetworkPolicySpecFluent.PodSelectorNested<A> editOrNewPodSelectorLike(LabelSelector item);
    public A addToPolicyTypes(int index,String item);
    public A setToPolicyTypes(int index,String item);
    public A addToPolicyTypes(String... items);
    public A addAllToPolicyTypes(Collection<String> items);
    public A removeFromPolicyTypes(String... items);
    public A removeAllFromPolicyTypes(Collection<String> items);
    public List<String> getPolicyTypes();
    public String getPolicyType(int index);
    public String getFirstPolicyType();
    public String getLastPolicyType();
    public String getMatchingPolicyType(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withPolicyTypes(List<String> policyTypes);
    public A withPolicyTypes(String... policyTypes);
    public Boolean hasPolicyTypes();

    public interface EgressNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyEgressRuleFluent<NetworkPolicySpecFluent.EgressNested<N>>{

        
    public N and();    public N endEgress();
}
    public interface IngressNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyIngressRuleFluent<NetworkPolicySpecFluent.IngressNested<N>>{

        
    public N and();    public N endIngress();
}
    public interface PodSelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<NetworkPolicySpecFluent.PodSelectorNested<N>>{

        
    public N and();    public N endPodSelector();
}


}
