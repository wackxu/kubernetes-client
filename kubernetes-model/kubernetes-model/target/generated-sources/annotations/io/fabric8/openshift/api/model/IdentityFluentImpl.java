package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Object;
import java.util.Map;

public class IdentityFluentImpl<A extends IdentityFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements IdentityFluent<A>{

    private String apiVersion;
    private Map<String,String> extra;
    private String kind;
    private ObjectMetaBuilder metadata;
    private String providerName;
    private String providerUserName;
    private ObjectReferenceBuilder user;

    public IdentityFluentImpl(){
    }
    public IdentityFluentImpl(Identity instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withExtra(instance.getExtra()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withProviderName(instance.getProviderName()); 
            this.withProviderUserName(instance.getProviderUserName()); 
            this.withUser(instance.getUser()); 
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

    public A addToExtra(String key,String value){
            if(this.extra == null && key != null && value != null) { this.extra = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.extra.put(key, value);} return (A)this;
    }

    public A addToExtra(Map<String,String> map){
            if(this.extra == null && map != null) { this.extra = new LinkedHashMap<String,String>(); }
            if(map != null) { this.extra.putAll(map);} return (A)this;
    }

    public A removeFromExtra(String key){
            if(this.extra == null) { return (A) this; }
            if(key != null && this.extra != null) {this.extra.remove(key);} return (A)this;
    }

    public A removeFromExtra(Map<String,String> map){
            if(this.extra == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.extra != null){this.extra.remove(key);}}} return (A)this;
    }

    public Map<String,String> getExtra(){
            return this.extra;
    }

    public A withExtra(Map<String,String> extra){
            if (extra == null) { this.extra =  new LinkedHashMap<String,String>();} else {this.extra = new LinkedHashMap<String,String>(extra);} return (A) this;
    }

    public Boolean hasExtra(){
            return this.extra != null;
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
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ObjectMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ObjectMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ObjectMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public IdentityFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public IdentityFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public IdentityFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public IdentityFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public IdentityFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public String getProviderName(){
            return this.providerName;
    }

    public A withProviderName(String providerName){
            this.providerName=providerName; return (A) this;
    }

    public Boolean hasProviderName(){
            return this.providerName != null;
    }

    public String getProviderUserName(){
            return this.providerUserName;
    }

    public A withProviderUserName(String providerUserName){
            this.providerUserName=providerUserName; return (A) this;
    }

    public Boolean hasProviderUserName(){
            return this.providerUserName != null;
    }

    
/**
 * This method has been deprecated, please use method buildUser instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getUser(){
            return this.user!=null?this.user.build():null;
    }

    public ObjectReference buildUser(){
            return this.user!=null?this.user.build():null;
    }

    public A withUser(ObjectReference user){
            _visitables.remove(this.user);
            if (user!=null){ this.user= new ObjectReferenceBuilder(user); _visitables.add(this.user);} return (A) this;
    }

    public Boolean hasUser(){
            return this.user != null;
    }

    public IdentityFluent.UserNested<A> withNewUser(){
            return new UserNestedImpl();
    }

    public IdentityFluent.UserNested<A> withNewUserLike(ObjectReference item){
            return new UserNestedImpl(item);
    }

    public IdentityFluent.UserNested<A> editUser(){
            return withNewUserLike(getUser());
    }

    public IdentityFluent.UserNested<A> editOrNewUser(){
            return withNewUserLike(getUser() != null ? getUser(): new ObjectReferenceBuilder().build());
    }

    public IdentityFluent.UserNested<A> editOrNewUserLike(ObjectReference item){
            return withNewUserLike(getUser() != null ? getUser(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IdentityFluentImpl that = (IdentityFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (extra != null ? !extra.equals(that.extra) :that.extra != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (providerName != null ? !providerName.equals(that.providerName) :that.providerName != null) return false;
            if (providerUserName != null ? !providerUserName.equals(that.providerUserName) :that.providerUserName != null) return false;
            if (user != null ? !user.equals(that.user) :that.user != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<IdentityFluent.MetadataNested<N>> implements IdentityFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) IdentityFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class UserNestedImpl<N> extends ObjectReferenceFluentImpl<IdentityFluent.UserNested<N>> implements IdentityFluent.UserNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            UserNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            UserNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) IdentityFluentImpl.this.withUser(builder.build());
    }
    public N endUser(){
            return and();
    }

}


}
