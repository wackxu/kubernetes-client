package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface ConfigFluent<A extends ConfigFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToClusters(int index,NamedCluster item);
    public A setToClusters(int index,NamedCluster item);
    public A addToClusters(NamedCluster... items);
    public A addAllToClusters(Collection<NamedCluster> items);
    public A removeFromClusters(NamedCluster... items);
    public A removeAllFromClusters(Collection<NamedCluster> items);
    
/**
 * This method has been deprecated, please use method buildClusters instead.
 * @return The buildable object.
 */
@Deprecated public List<NamedCluster> getClusters();
    public List<NamedCluster> buildClusters();
    public NamedCluster buildCluster(int index);
    public NamedCluster buildFirstCluster();
    public NamedCluster buildLastCluster();
    public NamedCluster buildMatchingCluster(io.fabric8.kubernetes.api.builder.Predicate<NamedClusterBuilder> predicate);
    public A withClusters(List<NamedCluster> clusters);
    public A withClusters(NamedCluster... clusters);
    public Boolean hasClusters();
    public ConfigFluent.ClustersNested<A> addNewCluster();
    public ConfigFluent.ClustersNested<A> addNewClusterLike(NamedCluster item);
    public ConfigFluent.ClustersNested<A> setNewClusterLike(int index,NamedCluster item);
    public ConfigFluent.ClustersNested<A> editCluster(int index);
    public ConfigFluent.ClustersNested<A> editFirstCluster();
    public ConfigFluent.ClustersNested<A> editLastCluster();
    public ConfigFluent.ClustersNested<A> editMatchingCluster(io.fabric8.kubernetes.api.builder.Predicate<NamedClusterBuilder> predicate);
    public A addToContexts(int index,NamedContext item);
    public A setToContexts(int index,NamedContext item);
    public A addToContexts(NamedContext... items);
    public A addAllToContexts(Collection<NamedContext> items);
    public A removeFromContexts(NamedContext... items);
    public A removeAllFromContexts(Collection<NamedContext> items);
    
/**
 * This method has been deprecated, please use method buildContexts instead.
 * @return The buildable object.
 */
@Deprecated public List<NamedContext> getContexts();
    public List<NamedContext> buildContexts();
    public NamedContext buildContext(int index);
    public NamedContext buildFirstContext();
    public NamedContext buildLastContext();
    public NamedContext buildMatchingContext(io.fabric8.kubernetes.api.builder.Predicate<NamedContextBuilder> predicate);
    public A withContexts(List<NamedContext> contexts);
    public A withContexts(NamedContext... contexts);
    public Boolean hasContexts();
    public ConfigFluent.ContextsNested<A> addNewContext();
    public ConfigFluent.ContextsNested<A> addNewContextLike(NamedContext item);
    public ConfigFluent.ContextsNested<A> setNewContextLike(int index,NamedContext item);
    public ConfigFluent.ContextsNested<A> editContext(int index);
    public ConfigFluent.ContextsNested<A> editFirstContext();
    public ConfigFluent.ContextsNested<A> editLastContext();
    public ConfigFluent.ContextsNested<A> editMatchingContext(io.fabric8.kubernetes.api.builder.Predicate<NamedContextBuilder> predicate);
    public String getCurrentContext();
    public A withCurrentContext(String currentContext);
    public Boolean hasCurrentContext();
    public A addToExtensions(int index,NamedExtension item);
    public A setToExtensions(int index,NamedExtension item);
    public A addToExtensions(NamedExtension... items);
    public A addAllToExtensions(Collection<NamedExtension> items);
    public A removeFromExtensions(NamedExtension... items);
    public A removeAllFromExtensions(Collection<NamedExtension> items);
    
/**
 * This method has been deprecated, please use method buildExtensions instead.
 * @return The buildable object.
 */
@Deprecated public List<NamedExtension> getExtensions();
    public List<NamedExtension> buildExtensions();
    public NamedExtension buildExtension(int index);
    public NamedExtension buildFirstExtension();
    public NamedExtension buildLastExtension();
    public NamedExtension buildMatchingExtension(io.fabric8.kubernetes.api.builder.Predicate<NamedExtensionBuilder> predicate);
    public A withExtensions(List<NamedExtension> extensions);
    public A withExtensions(NamedExtension... extensions);
    public Boolean hasExtensions();
    public ConfigFluent.ExtensionsNested<A> addNewExtension();
    public ConfigFluent.ExtensionsNested<A> addNewExtensionLike(NamedExtension item);
    public ConfigFluent.ExtensionsNested<A> setNewExtensionLike(int index,NamedExtension item);
    public ConfigFluent.ExtensionsNested<A> editExtension(int index);
    public ConfigFluent.ExtensionsNested<A> editFirstExtension();
    public ConfigFluent.ExtensionsNested<A> editLastExtension();
    public ConfigFluent.ExtensionsNested<A> editMatchingExtension(io.fabric8.kubernetes.api.builder.Predicate<NamedExtensionBuilder> predicate);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildPreferences instead.
 * @return The buildable object.
 */
@Deprecated public Preferences getPreferences();
    public Preferences buildPreferences();
    public A withPreferences(Preferences preferences);
    public Boolean hasPreferences();
    public ConfigFluent.PreferencesNested<A> withNewPreferences();
    public ConfigFluent.PreferencesNested<A> withNewPreferencesLike(Preferences item);
    public ConfigFluent.PreferencesNested<A> editPreferences();
    public ConfigFluent.PreferencesNested<A> editOrNewPreferences();
    public ConfigFluent.PreferencesNested<A> editOrNewPreferencesLike(Preferences item);
    public A addToUsers(int index,NamedAuthInfo item);
    public A setToUsers(int index,NamedAuthInfo item);
    public A addToUsers(NamedAuthInfo... items);
    public A addAllToUsers(Collection<NamedAuthInfo> items);
    public A removeFromUsers(NamedAuthInfo... items);
    public A removeAllFromUsers(Collection<NamedAuthInfo> items);
    
/**
 * This method has been deprecated, please use method buildUsers instead.
 * @return The buildable object.
 */
@Deprecated public List<NamedAuthInfo> getUsers();
    public List<NamedAuthInfo> buildUsers();
    public NamedAuthInfo buildUser(int index);
    public NamedAuthInfo buildFirstUser();
    public NamedAuthInfo buildLastUser();
    public NamedAuthInfo buildMatchingUser(io.fabric8.kubernetes.api.builder.Predicate<NamedAuthInfoBuilder> predicate);
    public A withUsers(List<NamedAuthInfo> users);
    public A withUsers(NamedAuthInfo... users);
    public Boolean hasUsers();
    public ConfigFluent.UsersNested<A> addNewUser();
    public ConfigFluent.UsersNested<A> addNewUserLike(NamedAuthInfo item);
    public ConfigFluent.UsersNested<A> setNewUserLike(int index,NamedAuthInfo item);
    public ConfigFluent.UsersNested<A> editUser(int index);
    public ConfigFluent.UsersNested<A> editFirstUser();
    public ConfigFluent.UsersNested<A> editLastUser();
    public ConfigFluent.UsersNested<A> editMatchingUser(io.fabric8.kubernetes.api.builder.Predicate<NamedAuthInfoBuilder> predicate);

    public interface ClustersNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedClusterFluent<ConfigFluent.ClustersNested<N>>{

        
    public N and();    public N endCluster();
}
    public interface ContextsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedContextFluent<ConfigFluent.ContextsNested<N>>{

        
    public N and();    public N endContext();
}
    public interface ExtensionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedExtensionFluent<ConfigFluent.ExtensionsNested<N>>{

        
    public N and();    public N endExtension();
}
    public interface PreferencesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PreferencesFluent<ConfigFluent.PreferencesNested<N>>{

        
    public N and();    public N endPreferences();
}
    public interface UsersNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedAuthInfoFluent<ConfigFluent.UsersNested<N>>{

        
    public N and();    public N endUser();
}


}
