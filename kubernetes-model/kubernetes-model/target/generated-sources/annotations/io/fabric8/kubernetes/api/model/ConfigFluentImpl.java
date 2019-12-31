package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class ConfigFluentImpl<A extends ConfigFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ConfigFluent<A>{

    private String apiVersion;
    private List<NamedClusterBuilder> clusters;
    private List<NamedContextBuilder> contexts;
    private String currentContext;
    private List<NamedExtensionBuilder> extensions;
    private String kind;
    private PreferencesBuilder preferences;
    private List<NamedAuthInfoBuilder> users;

    public ConfigFluentImpl(){
    }
    public ConfigFluentImpl(Config instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withClusters(instance.getClusters()); 
            this.withContexts(instance.getContexts()); 
            this.withCurrentContext(instance.getCurrentContext()); 
            this.withExtensions(instance.getExtensions()); 
            this.withKind(instance.getKind()); 
            this.withPreferences(instance.getPreferences()); 
            this.withUsers(instance.getUsers()); 
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public A addToClusters(int index,NamedCluster item){
            if (this.clusters == null) {this.clusters = new ArrayList<NamedClusterBuilder>();}
            NamedClusterBuilder builder = new NamedClusterBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.clusters.add(index >= 0 ? index : clusters.size(), builder); return (A)this;
    }

    public A setToClusters(int index,NamedCluster item){
            if (this.clusters == null) {this.clusters = new ArrayList<NamedClusterBuilder>();}
            NamedClusterBuilder builder = new NamedClusterBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= clusters.size()) { clusters.add(builder); } else { clusters.set(index, builder);}
             return (A)this;
    }

    public A addToClusters(NamedCluster... items){
            if (this.clusters == null) {this.clusters = new ArrayList<NamedClusterBuilder>();}
            for (NamedCluster item : items) {NamedClusterBuilder builder = new NamedClusterBuilder(item);_visitables.add(builder);this.clusters.add(builder);} return (A)this;
    }

    public A addAllToClusters(Collection<NamedCluster> items){
            if (this.clusters == null) {this.clusters = new ArrayList<NamedClusterBuilder>();}
            for (NamedCluster item : items) {NamedClusterBuilder builder = new NamedClusterBuilder(item);_visitables.add(builder);this.clusters.add(builder);} return (A)this;
    }

    public A removeFromClusters(NamedCluster... items){
            for (NamedCluster item : items) {NamedClusterBuilder builder = new NamedClusterBuilder(item);_visitables.remove(builder);if (this.clusters != null) {this.clusters.remove(builder);}} return (A)this;
    }

    public A removeAllFromClusters(Collection<NamedCluster> items){
            for (NamedCluster item : items) {NamedClusterBuilder builder = new NamedClusterBuilder(item);_visitables.remove(builder);if (this.clusters != null) {this.clusters.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildClusters instead.
 * @return The buildable object.
 */
@Deprecated public List<NamedCluster> getClusters(){
            return build(clusters);
    }

    public List<NamedCluster> buildClusters(){
            return build(clusters);
    }

    public NamedCluster buildCluster(int index){
            return this.clusters.get(index).build();
    }

    public NamedCluster buildFirstCluster(){
            return this.clusters.get(0).build();
    }

    public NamedCluster buildLastCluster(){
            return this.clusters.get(clusters.size() - 1).build();
    }

    public NamedCluster buildMatchingCluster(io.fabric8.kubernetes.api.builder.Predicate<NamedClusterBuilder> predicate){
            for (NamedClusterBuilder item: clusters) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withClusters(List<NamedCluster> clusters){
            if (this.clusters != null) { _visitables.removeAll(this.clusters);}
            if (clusters != null) {this.clusters = new ArrayList<NamedClusterBuilder>(); for (NamedCluster item : clusters){this.addToClusters(item);}} else { this.clusters = new ArrayList<NamedClusterBuilder>();} return (A) this;
    }

    public A withClusters(NamedCluster... clusters){
            if (this.clusters != null) {this.clusters.clear();}
            if (clusters != null) {for (NamedCluster item :clusters){ this.addToClusters(item);}} return (A) this;
    }

    public Boolean hasClusters(){
            return clusters != null && !clusters.isEmpty();
    }

    public ConfigFluent.ClustersNested<A> addNewCluster(){
            return new ClustersNestedImpl();
    }

    public ConfigFluent.ClustersNested<A> addNewClusterLike(NamedCluster item){
            return new ClustersNestedImpl(-1, item);
    }

    public ConfigFluent.ClustersNested<A> setNewClusterLike(int index,NamedCluster item){
            return new ClustersNestedImpl(index, item);
    }

    public ConfigFluent.ClustersNested<A> editCluster(int index){
            if (clusters.size() <= index) throw new RuntimeException("Can't edit clusters. Index exceeds size.");
            return setNewClusterLike(index, buildCluster(index));
    }

    public ConfigFluent.ClustersNested<A> editFirstCluster(){
            if (clusters.size() == 0) throw new RuntimeException("Can't edit first clusters. The list is empty.");
            return setNewClusterLike(0, buildCluster(0));
    }

    public ConfigFluent.ClustersNested<A> editLastCluster(){
            int index = clusters.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last clusters. The list is empty.");
            return setNewClusterLike(index, buildCluster(index));
    }

    public ConfigFluent.ClustersNested<A> editMatchingCluster(io.fabric8.kubernetes.api.builder.Predicate<NamedClusterBuilder> predicate){
            int index = -1;
            for (int i=0;i<clusters.size();i++) { 
            if (predicate.apply(clusters.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching clusters. No match found.");
            return setNewClusterLike(index, buildCluster(index));
    }

    public A addToContexts(int index,NamedContext item){
            if (this.contexts == null) {this.contexts = new ArrayList<NamedContextBuilder>();}
            NamedContextBuilder builder = new NamedContextBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.contexts.add(index >= 0 ? index : contexts.size(), builder); return (A)this;
    }

    public A setToContexts(int index,NamedContext item){
            if (this.contexts == null) {this.contexts = new ArrayList<NamedContextBuilder>();}
            NamedContextBuilder builder = new NamedContextBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= contexts.size()) { contexts.add(builder); } else { contexts.set(index, builder);}
             return (A)this;
    }

    public A addToContexts(NamedContext... items){
            if (this.contexts == null) {this.contexts = new ArrayList<NamedContextBuilder>();}
            for (NamedContext item : items) {NamedContextBuilder builder = new NamedContextBuilder(item);_visitables.add(builder);this.contexts.add(builder);} return (A)this;
    }

    public A addAllToContexts(Collection<NamedContext> items){
            if (this.contexts == null) {this.contexts = new ArrayList<NamedContextBuilder>();}
            for (NamedContext item : items) {NamedContextBuilder builder = new NamedContextBuilder(item);_visitables.add(builder);this.contexts.add(builder);} return (A)this;
    }

    public A removeFromContexts(NamedContext... items){
            for (NamedContext item : items) {NamedContextBuilder builder = new NamedContextBuilder(item);_visitables.remove(builder);if (this.contexts != null) {this.contexts.remove(builder);}} return (A)this;
    }

    public A removeAllFromContexts(Collection<NamedContext> items){
            for (NamedContext item : items) {NamedContextBuilder builder = new NamedContextBuilder(item);_visitables.remove(builder);if (this.contexts != null) {this.contexts.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildContexts instead.
 * @return The buildable object.
 */
@Deprecated public List<NamedContext> getContexts(){
            return build(contexts);
    }

    public List<NamedContext> buildContexts(){
            return build(contexts);
    }

    public NamedContext buildContext(int index){
            return this.contexts.get(index).build();
    }

    public NamedContext buildFirstContext(){
            return this.contexts.get(0).build();
    }

    public NamedContext buildLastContext(){
            return this.contexts.get(contexts.size() - 1).build();
    }

    public NamedContext buildMatchingContext(io.fabric8.kubernetes.api.builder.Predicate<NamedContextBuilder> predicate){
            for (NamedContextBuilder item: contexts) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withContexts(List<NamedContext> contexts){
            if (this.contexts != null) { _visitables.removeAll(this.contexts);}
            if (contexts != null) {this.contexts = new ArrayList<NamedContextBuilder>(); for (NamedContext item : contexts){this.addToContexts(item);}} else { this.contexts = new ArrayList<NamedContextBuilder>();} return (A) this;
    }

    public A withContexts(NamedContext... contexts){
            if (this.contexts != null) {this.contexts.clear();}
            if (contexts != null) {for (NamedContext item :contexts){ this.addToContexts(item);}} return (A) this;
    }

    public Boolean hasContexts(){
            return contexts != null && !contexts.isEmpty();
    }

    public ConfigFluent.ContextsNested<A> addNewContext(){
            return new ContextsNestedImpl();
    }

    public ConfigFluent.ContextsNested<A> addNewContextLike(NamedContext item){
            return new ContextsNestedImpl(-1, item);
    }

    public ConfigFluent.ContextsNested<A> setNewContextLike(int index,NamedContext item){
            return new ContextsNestedImpl(index, item);
    }

    public ConfigFluent.ContextsNested<A> editContext(int index){
            if (contexts.size() <= index) throw new RuntimeException("Can't edit contexts. Index exceeds size.");
            return setNewContextLike(index, buildContext(index));
    }

    public ConfigFluent.ContextsNested<A> editFirstContext(){
            if (contexts.size() == 0) throw new RuntimeException("Can't edit first contexts. The list is empty.");
            return setNewContextLike(0, buildContext(0));
    }

    public ConfigFluent.ContextsNested<A> editLastContext(){
            int index = contexts.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last contexts. The list is empty.");
            return setNewContextLike(index, buildContext(index));
    }

    public ConfigFluent.ContextsNested<A> editMatchingContext(io.fabric8.kubernetes.api.builder.Predicate<NamedContextBuilder> predicate){
            int index = -1;
            for (int i=0;i<contexts.size();i++) { 
            if (predicate.apply(contexts.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching contexts. No match found.");
            return setNewContextLike(index, buildContext(index));
    }

    public String getCurrentContext(){
            return this.currentContext;
    }

    public A withCurrentContext(String currentContext){
            this.currentContext=currentContext; return (A) this;
    }

    public Boolean hasCurrentContext(){
            return this.currentContext != null;
    }

    public A addToExtensions(int index,NamedExtension item){
            if (this.extensions == null) {this.extensions = new ArrayList<NamedExtensionBuilder>();}
            NamedExtensionBuilder builder = new NamedExtensionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.extensions.add(index >= 0 ? index : extensions.size(), builder); return (A)this;
    }

    public A setToExtensions(int index,NamedExtension item){
            if (this.extensions == null) {this.extensions = new ArrayList<NamedExtensionBuilder>();}
            NamedExtensionBuilder builder = new NamedExtensionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= extensions.size()) { extensions.add(builder); } else { extensions.set(index, builder);}
             return (A)this;
    }

    public A addToExtensions(NamedExtension... items){
            if (this.extensions == null) {this.extensions = new ArrayList<NamedExtensionBuilder>();}
            for (NamedExtension item : items) {NamedExtensionBuilder builder = new NamedExtensionBuilder(item);_visitables.add(builder);this.extensions.add(builder);} return (A)this;
    }

    public A addAllToExtensions(Collection<NamedExtension> items){
            if (this.extensions == null) {this.extensions = new ArrayList<NamedExtensionBuilder>();}
            for (NamedExtension item : items) {NamedExtensionBuilder builder = new NamedExtensionBuilder(item);_visitables.add(builder);this.extensions.add(builder);} return (A)this;
    }

    public A removeFromExtensions(NamedExtension... items){
            for (NamedExtension item : items) {NamedExtensionBuilder builder = new NamedExtensionBuilder(item);_visitables.remove(builder);if (this.extensions != null) {this.extensions.remove(builder);}} return (A)this;
    }

    public A removeAllFromExtensions(Collection<NamedExtension> items){
            for (NamedExtension item : items) {NamedExtensionBuilder builder = new NamedExtensionBuilder(item);_visitables.remove(builder);if (this.extensions != null) {this.extensions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildExtensions instead.
 * @return The buildable object.
 */
@Deprecated public List<NamedExtension> getExtensions(){
            return build(extensions);
    }

    public List<NamedExtension> buildExtensions(){
            return build(extensions);
    }

    public NamedExtension buildExtension(int index){
            return this.extensions.get(index).build();
    }

    public NamedExtension buildFirstExtension(){
            return this.extensions.get(0).build();
    }

    public NamedExtension buildLastExtension(){
            return this.extensions.get(extensions.size() - 1).build();
    }

    public NamedExtension buildMatchingExtension(io.fabric8.kubernetes.api.builder.Predicate<NamedExtensionBuilder> predicate){
            for (NamedExtensionBuilder item: extensions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withExtensions(List<NamedExtension> extensions){
            if (this.extensions != null) { _visitables.removeAll(this.extensions);}
            if (extensions != null) {this.extensions = new ArrayList<NamedExtensionBuilder>(); for (NamedExtension item : extensions){this.addToExtensions(item);}} else { this.extensions = new ArrayList<NamedExtensionBuilder>();} return (A) this;
    }

    public A withExtensions(NamedExtension... extensions){
            if (this.extensions != null) {this.extensions.clear();}
            if (extensions != null) {for (NamedExtension item :extensions){ this.addToExtensions(item);}} return (A) this;
    }

    public Boolean hasExtensions(){
            return extensions != null && !extensions.isEmpty();
    }

    public ConfigFluent.ExtensionsNested<A> addNewExtension(){
            return new ExtensionsNestedImpl();
    }

    public ConfigFluent.ExtensionsNested<A> addNewExtensionLike(NamedExtension item){
            return new ExtensionsNestedImpl(-1, item);
    }

    public ConfigFluent.ExtensionsNested<A> setNewExtensionLike(int index,NamedExtension item){
            return new ExtensionsNestedImpl(index, item);
    }

    public ConfigFluent.ExtensionsNested<A> editExtension(int index){
            if (extensions.size() <= index) throw new RuntimeException("Can't edit extensions. Index exceeds size.");
            return setNewExtensionLike(index, buildExtension(index));
    }

    public ConfigFluent.ExtensionsNested<A> editFirstExtension(){
            if (extensions.size() == 0) throw new RuntimeException("Can't edit first extensions. The list is empty.");
            return setNewExtensionLike(0, buildExtension(0));
    }

    public ConfigFluent.ExtensionsNested<A> editLastExtension(){
            int index = extensions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last extensions. The list is empty.");
            return setNewExtensionLike(index, buildExtension(index));
    }

    public ConfigFluent.ExtensionsNested<A> editMatchingExtension(io.fabric8.kubernetes.api.builder.Predicate<NamedExtensionBuilder> predicate){
            int index = -1;
            for (int i=0;i<extensions.size();i++) { 
            if (predicate.apply(extensions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching extensions. No match found.");
            return setNewExtensionLike(index, buildExtension(index));
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    
/**
 * This method has been deprecated, please use method buildPreferences instead.
 * @return The buildable object.
 */
@Deprecated public Preferences getPreferences(){
            return this.preferences!=null?this.preferences.build():null;
    }

    public Preferences buildPreferences(){
            return this.preferences!=null?this.preferences.build():null;
    }

    public A withPreferences(Preferences preferences){
            _visitables.remove(this.preferences);
            if (preferences!=null){ this.preferences= new PreferencesBuilder(preferences); _visitables.add(this.preferences);} return (A) this;
    }

    public Boolean hasPreferences(){
            return this.preferences != null;
    }

    public ConfigFluent.PreferencesNested<A> withNewPreferences(){
            return new PreferencesNestedImpl();
    }

    public ConfigFluent.PreferencesNested<A> withNewPreferencesLike(Preferences item){
            return new PreferencesNestedImpl(item);
    }

    public ConfigFluent.PreferencesNested<A> editPreferences(){
            return withNewPreferencesLike(getPreferences());
    }

    public ConfigFluent.PreferencesNested<A> editOrNewPreferences(){
            return withNewPreferencesLike(getPreferences() != null ? getPreferences(): new PreferencesBuilder().build());
    }

    public ConfigFluent.PreferencesNested<A> editOrNewPreferencesLike(Preferences item){
            return withNewPreferencesLike(getPreferences() != null ? getPreferences(): item);
    }

    public A addToUsers(int index,NamedAuthInfo item){
            if (this.users == null) {this.users = new ArrayList<NamedAuthInfoBuilder>();}
            NamedAuthInfoBuilder builder = new NamedAuthInfoBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.users.add(index >= 0 ? index : users.size(), builder); return (A)this;
    }

    public A setToUsers(int index,NamedAuthInfo item){
            if (this.users == null) {this.users = new ArrayList<NamedAuthInfoBuilder>();}
            NamedAuthInfoBuilder builder = new NamedAuthInfoBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= users.size()) { users.add(builder); } else { users.set(index, builder);}
             return (A)this;
    }

    public A addToUsers(NamedAuthInfo... items){
            if (this.users == null) {this.users = new ArrayList<NamedAuthInfoBuilder>();}
            for (NamedAuthInfo item : items) {NamedAuthInfoBuilder builder = new NamedAuthInfoBuilder(item);_visitables.add(builder);this.users.add(builder);} return (A)this;
    }

    public A addAllToUsers(Collection<NamedAuthInfo> items){
            if (this.users == null) {this.users = new ArrayList<NamedAuthInfoBuilder>();}
            for (NamedAuthInfo item : items) {NamedAuthInfoBuilder builder = new NamedAuthInfoBuilder(item);_visitables.add(builder);this.users.add(builder);} return (A)this;
    }

    public A removeFromUsers(NamedAuthInfo... items){
            for (NamedAuthInfo item : items) {NamedAuthInfoBuilder builder = new NamedAuthInfoBuilder(item);_visitables.remove(builder);if (this.users != null) {this.users.remove(builder);}} return (A)this;
    }

    public A removeAllFromUsers(Collection<NamedAuthInfo> items){
            for (NamedAuthInfo item : items) {NamedAuthInfoBuilder builder = new NamedAuthInfoBuilder(item);_visitables.remove(builder);if (this.users != null) {this.users.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildUsers instead.
 * @return The buildable object.
 */
@Deprecated public List<NamedAuthInfo> getUsers(){
            return build(users);
    }

    public List<NamedAuthInfo> buildUsers(){
            return build(users);
    }

    public NamedAuthInfo buildUser(int index){
            return this.users.get(index).build();
    }

    public NamedAuthInfo buildFirstUser(){
            return this.users.get(0).build();
    }

    public NamedAuthInfo buildLastUser(){
            return this.users.get(users.size() - 1).build();
    }

    public NamedAuthInfo buildMatchingUser(io.fabric8.kubernetes.api.builder.Predicate<NamedAuthInfoBuilder> predicate){
            for (NamedAuthInfoBuilder item: users) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withUsers(List<NamedAuthInfo> users){
            if (this.users != null) { _visitables.removeAll(this.users);}
            if (users != null) {this.users = new ArrayList<NamedAuthInfoBuilder>(); for (NamedAuthInfo item : users){this.addToUsers(item);}} else { this.users = new ArrayList<NamedAuthInfoBuilder>();} return (A) this;
    }

    public A withUsers(NamedAuthInfo... users){
            if (this.users != null) {this.users.clear();}
            if (users != null) {for (NamedAuthInfo item :users){ this.addToUsers(item);}} return (A) this;
    }

    public Boolean hasUsers(){
            return users != null && !users.isEmpty();
    }

    public ConfigFluent.UsersNested<A> addNewUser(){
            return new UsersNestedImpl();
    }

    public ConfigFluent.UsersNested<A> addNewUserLike(NamedAuthInfo item){
            return new UsersNestedImpl(-1, item);
    }

    public ConfigFluent.UsersNested<A> setNewUserLike(int index,NamedAuthInfo item){
            return new UsersNestedImpl(index, item);
    }

    public ConfigFluent.UsersNested<A> editUser(int index){
            if (users.size() <= index) throw new RuntimeException("Can't edit users. Index exceeds size.");
            return setNewUserLike(index, buildUser(index));
    }

    public ConfigFluent.UsersNested<A> editFirstUser(){
            if (users.size() == 0) throw new RuntimeException("Can't edit first users. The list is empty.");
            return setNewUserLike(0, buildUser(0));
    }

    public ConfigFluent.UsersNested<A> editLastUser(){
            int index = users.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last users. The list is empty.");
            return setNewUserLike(index, buildUser(index));
    }

    public ConfigFluent.UsersNested<A> editMatchingUser(io.fabric8.kubernetes.api.builder.Predicate<NamedAuthInfoBuilder> predicate){
            int index = -1;
            for (int i=0;i<users.size();i++) { 
            if (predicate.apply(users.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching users. No match found.");
            return setNewUserLike(index, buildUser(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigFluentImpl that = (ConfigFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (clusters != null ? !clusters.equals(that.clusters) :that.clusters != null) return false;
            if (contexts != null ? !contexts.equals(that.contexts) :that.contexts != null) return false;
            if (currentContext != null ? !currentContext.equals(that.currentContext) :that.currentContext != null) return false;
            if (extensions != null ? !extensions.equals(that.extensions) :that.extensions != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (preferences != null ? !preferences.equals(that.preferences) :that.preferences != null) return false;
            if (users != null ? !users.equals(that.users) :that.users != null) return false;
            return true;
    }


    public class ClustersNestedImpl<N> extends NamedClusterFluentImpl<ConfigFluent.ClustersNested<N>> implements ConfigFluent.ClustersNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamedClusterBuilder builder;
        private final int index;
    
            ClustersNestedImpl(int index,NamedCluster item){
                    this.index = index;
                    this.builder = new NamedClusterBuilder(this, item);
            }
            ClustersNestedImpl(){
                    this.index = -1;
                    this.builder = new NamedClusterBuilder(this);
            }
    
    public N and(){
            return (N) ConfigFluentImpl.this.setToClusters(index, builder.build());
    }
    public N endCluster(){
            return and();
    }

}
    public class ContextsNestedImpl<N> extends NamedContextFluentImpl<ConfigFluent.ContextsNested<N>> implements ConfigFluent.ContextsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamedContextBuilder builder;
        private final int index;
    
            ContextsNestedImpl(int index,NamedContext item){
                    this.index = index;
                    this.builder = new NamedContextBuilder(this, item);
            }
            ContextsNestedImpl(){
                    this.index = -1;
                    this.builder = new NamedContextBuilder(this);
            }
    
    public N and(){
            return (N) ConfigFluentImpl.this.setToContexts(index, builder.build());
    }
    public N endContext(){
            return and();
    }

}
    public class ExtensionsNestedImpl<N> extends NamedExtensionFluentImpl<ConfigFluent.ExtensionsNested<N>> implements ConfigFluent.ExtensionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamedExtensionBuilder builder;
        private final int index;
    
            ExtensionsNestedImpl(int index,NamedExtension item){
                    this.index = index;
                    this.builder = new NamedExtensionBuilder(this, item);
            }
            ExtensionsNestedImpl(){
                    this.index = -1;
                    this.builder = new NamedExtensionBuilder(this);
            }
    
    public N and(){
            return (N) ConfigFluentImpl.this.setToExtensions(index, builder.build());
    }
    public N endExtension(){
            return and();
    }

}
    public class PreferencesNestedImpl<N> extends PreferencesFluentImpl<ConfigFluent.PreferencesNested<N>> implements ConfigFluent.PreferencesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PreferencesBuilder builder;
    
            PreferencesNestedImpl(Preferences item){
                    this.builder = new PreferencesBuilder(this, item);
            }
            PreferencesNestedImpl(){
                    this.builder = new PreferencesBuilder(this);
            }
    
    public N and(){
            return (N) ConfigFluentImpl.this.withPreferences(builder.build());
    }
    public N endPreferences(){
            return and();
    }

}
    public class UsersNestedImpl<N> extends NamedAuthInfoFluentImpl<ConfigFluent.UsersNested<N>> implements ConfigFluent.UsersNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamedAuthInfoBuilder builder;
        private final int index;
    
            UsersNestedImpl(int index,NamedAuthInfo item){
                    this.index = index;
                    this.builder = new NamedAuthInfoBuilder(this, item);
            }
            UsersNestedImpl(){
                    this.index = -1;
                    this.builder = new NamedAuthInfoBuilder(this);
            }
    
    public N and(){
            return (N) ConfigFluentImpl.this.setToUsers(index, builder.build());
    }
    public N endUser(){
            return and();
    }

}


}
