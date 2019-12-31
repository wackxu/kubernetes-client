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

public class UserFluentImpl<A extends UserFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements UserFluent<A>{

    private String apiVersion;
    private String fullName;
    private List<String> groups;
    private List<String> identities;
    private String kind;
    private ObjectMetaBuilder metadata;

    public UserFluentImpl(){
    }
    public UserFluentImpl(User instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withFullName(instance.getFullName()); 
            this.withGroups(instance.getGroups()); 
            this.withIdentities(instance.getIdentities()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
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

    public String getFullName(){
            return this.fullName;
    }

    public A withFullName(String fullName){
            this.fullName=fullName; return (A) this;
    }

    public Boolean hasFullName(){
            return this.fullName != null;
    }

    public A addToGroups(int index,String item){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            this.groups.add(index, item);
            return (A)this;
    }

    public A setToGroups(int index,String item){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            this.groups.set(index, item); return (A)this;
    }

    public A addToGroups(String... items){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            for (String item : items) {this.groups.add(item);} return (A)this;
    }

    public A addAllToGroups(Collection<String> items){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            for (String item : items) {this.groups.add(item);} return (A)this;
    }

    public A removeFromGroups(String... items){
            for (String item : items) {if (this.groups!= null){ this.groups.remove(item);}} return (A)this;
    }

    public A removeAllFromGroups(Collection<String> items){
            for (String item : items) {if (this.groups!= null){ this.groups.remove(item);}} return (A)this;
    }

    public List<String> getGroups(){
            return this.groups;
    }

    public String getGroup(int index){
            return this.groups.get(index);
    }

    public String getFirstGroup(){
            return this.groups.get(0);
    }

    public String getLastGroup(){
            return this.groups.get(groups.size() - 1);
    }

    public String getMatchingGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: groups) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withGroups(List<String> groups){
            if (this.groups != null) { _visitables.removeAll(this.groups);}
            if (groups != null) {this.groups = new ArrayList<String>(); for (String item : groups){this.addToGroups(item);}} else { this.groups = new ArrayList<String>();} return (A) this;
    }

    public A withGroups(String... groups){
            if (this.groups != null) {this.groups.clear();}
            if (groups != null) {for (String item :groups){ this.addToGroups(item);}} return (A) this;
    }

    public Boolean hasGroups(){
            return groups != null && !groups.isEmpty();
    }

    public A addToIdentities(int index,String item){
            if (this.identities == null) {this.identities = new ArrayList<String>();}
            this.identities.add(index, item);
            return (A)this;
    }

    public A setToIdentities(int index,String item){
            if (this.identities == null) {this.identities = new ArrayList<String>();}
            this.identities.set(index, item); return (A)this;
    }

    public A addToIdentities(String... items){
            if (this.identities == null) {this.identities = new ArrayList<String>();}
            for (String item : items) {this.identities.add(item);} return (A)this;
    }

    public A addAllToIdentities(Collection<String> items){
            if (this.identities == null) {this.identities = new ArrayList<String>();}
            for (String item : items) {this.identities.add(item);} return (A)this;
    }

    public A removeFromIdentities(String... items){
            for (String item : items) {if (this.identities!= null){ this.identities.remove(item);}} return (A)this;
    }

    public A removeAllFromIdentities(Collection<String> items){
            for (String item : items) {if (this.identities!= null){ this.identities.remove(item);}} return (A)this;
    }

    public List<String> getIdentities(){
            return this.identities;
    }

    public String getIdentity(int index){
            return this.identities.get(index);
    }

    public String getFirstIdentity(){
            return this.identities.get(0);
    }

    public String getLastIdentity(){
            return this.identities.get(identities.size() - 1);
    }

    public String getMatchingIdentity(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: identities) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withIdentities(List<String> identities){
            if (this.identities != null) { _visitables.removeAll(this.identities);}
            if (identities != null) {this.identities = new ArrayList<String>(); for (String item : identities){this.addToIdentities(item);}} else { this.identities = new ArrayList<String>();} return (A) this;
    }

    public A withIdentities(String... identities){
            if (this.identities != null) {this.identities.clear();}
            if (identities != null) {for (String item :identities){ this.addToIdentities(item);}} return (A) this;
    }

    public Boolean hasIdentities(){
            return identities != null && !identities.isEmpty();
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

    public UserFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public UserFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public UserFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public UserFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public UserFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            UserFluentImpl that = (UserFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (fullName != null ? !fullName.equals(that.fullName) :that.fullName != null) return false;
            if (groups != null ? !groups.equals(that.groups) :that.groups != null) return false;
            if (identities != null ? !identities.equals(that.identities) :that.identities != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<UserFluent.MetadataNested<N>> implements UserFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) UserFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
