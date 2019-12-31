package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface UserFluent<A extends UserFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getFullName();
    public A withFullName(String fullName);
    public Boolean hasFullName();
    public A addToGroups(int index,String item);
    public A setToGroups(int index,String item);
    public A addToGroups(String... items);
    public A addAllToGroups(Collection<String> items);
    public A removeFromGroups(String... items);
    public A removeAllFromGroups(Collection<String> items);
    public List<String> getGroups();
    public String getGroup(int index);
    public String getFirstGroup();
    public String getLastGroup();
    public String getMatchingGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withGroups(List<String> groups);
    public A withGroups(String... groups);
    public Boolean hasGroups();
    public A addToIdentities(int index,String item);
    public A setToIdentities(int index,String item);
    public A addToIdentities(String... items);
    public A addAllToIdentities(Collection<String> items);
    public A removeFromIdentities(String... items);
    public A removeAllFromIdentities(Collection<String> items);
    public List<String> getIdentities();
    public String getIdentity(int index);
    public String getFirstIdentity();
    public String getLastIdentity();
    public String getMatchingIdentity(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withIdentities(List<String> identities);
    public A withIdentities(String... identities);
    public Boolean hasIdentities();
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
    public UserFluent.MetadataNested<A> withNewMetadata();
    public UserFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public UserFluent.MetadataNested<A> editMetadata();
    public UserFluent.MetadataNested<A> editOrNewMetadata();
    public UserFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<UserFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
