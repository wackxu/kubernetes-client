package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface NetNamespaceFluent<A extends NetNamespaceFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToEgressIPs(int index,String item);
    public A setToEgressIPs(int index,String item);
    public A addToEgressIPs(String... items);
    public A addAllToEgressIPs(Collection<String> items);
    public A removeFromEgressIPs(String... items);
    public A removeAllFromEgressIPs(Collection<String> items);
    public List<String> getEgressIPs();
    public String getEgressIP(int index);
    public String getFirstEgressIP();
    public String getLastEgressIP();
    public String getMatchingEgressIP(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withEgressIPs(List<String> egressIPs);
    public A withEgressIPs(String... egressIPs);
    public Boolean hasEgressIPs();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public NetNamespaceFluent.MetadataNested<A> withNewMetadata();
    public NetNamespaceFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public NetNamespaceFluent.MetadataNested<A> editMetadata();
    public NetNamespaceFluent.MetadataNested<A> editOrNewMetadata();
    public NetNamespaceFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public Integer getNetid();
    public A withNetid(Integer netid);
    public Boolean hasNetid();
    public String getNetname();
    public A withNetname(String netname);
    public Boolean hasNetname();

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<NetNamespaceFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
