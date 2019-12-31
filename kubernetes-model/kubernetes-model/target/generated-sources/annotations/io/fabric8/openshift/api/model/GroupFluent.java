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

public interface GroupFluent<A extends GroupFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
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
    public GroupFluent.MetadataNested<A> withNewMetadata();
    public GroupFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public GroupFluent.MetadataNested<A> editMetadata();
    public GroupFluent.MetadataNested<A> editOrNewMetadata();
    public GroupFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public A addToUsers(int index,String item);
    public A setToUsers(int index,String item);
    public A addToUsers(String... items);
    public A addAllToUsers(Collection<String> items);
    public A removeFromUsers(String... items);
    public A removeAllFromUsers(Collection<String> items);
    public List<String> getUsers();
    public String getUser(int index);
    public String getFirstUser();
    public String getLastUser();
    public String getMatchingUser(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withUsers(List<String> users);
    public A withUsers(String... users);
    public Boolean hasUsers();

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<GroupFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
