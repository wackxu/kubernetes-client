package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class GroupFluentImpl<A extends GroupFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements GroupFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private List<String> users;

    public GroupFluentImpl(){
    }
    public GroupFluentImpl(Group instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
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

    public GroupFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public GroupFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public GroupFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public GroupFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public GroupFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public A addToUsers(int index,String item){
            if (this.users == null) {this.users = new ArrayList<String>();}
            this.users.add(index, item);
            return (A)this;
    }

    public A setToUsers(int index,String item){
            if (this.users == null) {this.users = new ArrayList<String>();}
            this.users.set(index, item); return (A)this;
    }

    public A addToUsers(String... items){
            if (this.users == null) {this.users = new ArrayList<String>();}
            for (String item : items) {this.users.add(item);} return (A)this;
    }

    public A addAllToUsers(Collection<String> items){
            if (this.users == null) {this.users = new ArrayList<String>();}
            for (String item : items) {this.users.add(item);} return (A)this;
    }

    public A removeFromUsers(String... items){
            for (String item : items) {if (this.users!= null){ this.users.remove(item);}} return (A)this;
    }

    public A removeAllFromUsers(Collection<String> items){
            for (String item : items) {if (this.users!= null){ this.users.remove(item);}} return (A)this;
    }

    public List<String> getUsers(){
            return this.users;
    }

    public String getUser(int index){
            return this.users.get(index);
    }

    public String getFirstUser(){
            return this.users.get(0);
    }

    public String getLastUser(){
            return this.users.get(users.size() - 1);
    }

    public String getMatchingUser(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: users) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withUsers(List<String> users){
            if (this.users != null) { _visitables.removeAll(this.users);}
            if (users != null) {this.users = new ArrayList<String>(); for (String item : users){this.addToUsers(item);}} else { this.users = new ArrayList<String>();} return (A) this;
    }

    public A withUsers(String... users){
            if (this.users != null) {this.users.clear();}
            if (users != null) {for (String item :users){ this.addToUsers(item);}} return (A) this;
    }

    public Boolean hasUsers(){
            return users != null && !users.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GroupFluentImpl that = (GroupFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (users != null ? !users.equals(that.users) :that.users != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<GroupFluent.MetadataNested<N>> implements GroupFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) GroupFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
