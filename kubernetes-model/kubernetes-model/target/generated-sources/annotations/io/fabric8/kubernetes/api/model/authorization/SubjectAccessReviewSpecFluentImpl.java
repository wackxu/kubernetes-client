package io.fabric8.kubernetes.api.model.authorization;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public class SubjectAccessReviewSpecFluentImpl<A extends SubjectAccessReviewSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SubjectAccessReviewSpecFluent<A>{

    private Map<String,ArrayList<String>> extra;
    private List<String> groups;
    private NonResourceAttributesBuilder nonResourceAttributes;
    private ResourceAttributesBuilder resourceAttributes;
    private String uid;
    private String user;

    public SubjectAccessReviewSpecFluentImpl(){
    }
    public SubjectAccessReviewSpecFluentImpl(SubjectAccessReviewSpec instance){
            this.withExtra(instance.getExtra()); 
            this.withGroups(instance.getGroups()); 
            this.withNonResourceAttributes(instance.getNonResourceAttributes()); 
            this.withResourceAttributes(instance.getResourceAttributes()); 
            this.withUid(instance.getUid()); 
            this.withUser(instance.getUser()); 
    }

    public A addToExtra(String key,ArrayList<String> value){
            if(this.extra == null && key != null && value != null) { this.extra = new LinkedHashMap<String,ArrayList<String>>(); }
            if(key != null && value != null) {this.extra.put(key, value);} return (A)this;
    }

    public A addToExtra(Map<String,ArrayList<String>> map){
            if(this.extra == null && map != null) { this.extra = new LinkedHashMap<String,ArrayList<String>>(); }
            if(map != null) { this.extra.putAll(map);} return (A)this;
    }

    public A removeFromExtra(String key){
            if(this.extra == null) { return (A) this; }
            if(key != null && this.extra != null) {this.extra.remove(key);} return (A)this;
    }

    public A removeFromExtra(Map<String,ArrayList<String>> map){
            if(this.extra == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.extra != null){this.extra.remove(key);}}} return (A)this;
    }

    public Map<String,ArrayList<String>> getExtra(){
            return this.extra;
    }

    public A withExtra(Map<String,ArrayList<String>> extra){
            if (extra == null) { this.extra =  new LinkedHashMap<String,ArrayList<String>>();} else {this.extra = new LinkedHashMap<String,ArrayList<String>>(extra);} return (A) this;
    }

    public Boolean hasExtra(){
            return this.extra != null;
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

    
/**
 * This method has been deprecated, please use method buildNonResourceAttributes instead.
 * @return The buildable object.
 */
@Deprecated public NonResourceAttributes getNonResourceAttributes(){
            return this.nonResourceAttributes!=null?this.nonResourceAttributes.build():null;
    }

    public NonResourceAttributes buildNonResourceAttributes(){
            return this.nonResourceAttributes!=null?this.nonResourceAttributes.build():null;
    }

    public A withNonResourceAttributes(NonResourceAttributes nonResourceAttributes){
            _visitables.remove(this.nonResourceAttributes);
            if (nonResourceAttributes!=null){ this.nonResourceAttributes= new NonResourceAttributesBuilder(nonResourceAttributes); _visitables.add(this.nonResourceAttributes);} return (A) this;
    }

    public Boolean hasNonResourceAttributes(){
            return this.nonResourceAttributes != null;
    }

    public A withNewNonResourceAttributes(String path,String verb){
            return (A)withNonResourceAttributes(new NonResourceAttributes(path, verb));
    }

    public SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributes(){
            return new NonResourceAttributesNestedImpl();
    }

    public SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributesLike(NonResourceAttributes item){
            return new NonResourceAttributesNestedImpl(item);
    }

    public SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editNonResourceAttributes(){
            return withNewNonResourceAttributesLike(getNonResourceAttributes());
    }

    public SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributes(){
            return withNewNonResourceAttributesLike(getNonResourceAttributes() != null ? getNonResourceAttributes(): new NonResourceAttributesBuilder().build());
    }

    public SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributesLike(NonResourceAttributes item){
            return withNewNonResourceAttributesLike(getNonResourceAttributes() != null ? getNonResourceAttributes(): item);
    }

    
/**
 * This method has been deprecated, please use method buildResourceAttributes instead.
 * @return The buildable object.
 */
@Deprecated public ResourceAttributes getResourceAttributes(){
            return this.resourceAttributes!=null?this.resourceAttributes.build():null;
    }

    public ResourceAttributes buildResourceAttributes(){
            return this.resourceAttributes!=null?this.resourceAttributes.build():null;
    }

    public A withResourceAttributes(ResourceAttributes resourceAttributes){
            _visitables.remove(this.resourceAttributes);
            if (resourceAttributes!=null){ this.resourceAttributes= new ResourceAttributesBuilder(resourceAttributes); _visitables.add(this.resourceAttributes);} return (A) this;
    }

    public Boolean hasResourceAttributes(){
            return this.resourceAttributes != null;
    }

    public SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributes(){
            return new ResourceAttributesNestedImpl();
    }

    public SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributesLike(ResourceAttributes item){
            return new ResourceAttributesNestedImpl(item);
    }

    public SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editResourceAttributes(){
            return withNewResourceAttributesLike(getResourceAttributes());
    }

    public SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributes(){
            return withNewResourceAttributesLike(getResourceAttributes() != null ? getResourceAttributes(): new ResourceAttributesBuilder().build());
    }

    public SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributesLike(ResourceAttributes item){
            return withNewResourceAttributesLike(getResourceAttributes() != null ? getResourceAttributes(): item);
    }

    public String getUid(){
            return this.uid;
    }

    public A withUid(String uid){
            this.uid=uid; return (A) this;
    }

    public Boolean hasUid(){
            return this.uid != null;
    }

    public String getUser(){
            return this.user;
    }

    public A withUser(String user){
            this.user=user; return (A) this;
    }

    public Boolean hasUser(){
            return this.user != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SubjectAccessReviewSpecFluentImpl that = (SubjectAccessReviewSpecFluentImpl) o;
            if (extra != null ? !extra.equals(that.extra) :that.extra != null) return false;
            if (groups != null ? !groups.equals(that.groups) :that.groups != null) return false;
            if (nonResourceAttributes != null ? !nonResourceAttributes.equals(that.nonResourceAttributes) :that.nonResourceAttributes != null) return false;
            if (resourceAttributes != null ? !resourceAttributes.equals(that.resourceAttributes) :that.resourceAttributes != null) return false;
            if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
            if (user != null ? !user.equals(that.user) :that.user != null) return false;
            return true;
    }


    public class NonResourceAttributesNestedImpl<N> extends NonResourceAttributesFluentImpl<SubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>> implements SubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NonResourceAttributesBuilder builder;
    
            NonResourceAttributesNestedImpl(NonResourceAttributes item){
                    this.builder = new NonResourceAttributesBuilder(this, item);
            }
            NonResourceAttributesNestedImpl(){
                    this.builder = new NonResourceAttributesBuilder(this);
            }
    
    public N and(){
            return (N) SubjectAccessReviewSpecFluentImpl.this.withNonResourceAttributes(builder.build());
    }
    public N endNonResourceAttributes(){
            return and();
    }

}
    public class ResourceAttributesNestedImpl<N> extends ResourceAttributesFluentImpl<SubjectAccessReviewSpecFluent.ResourceAttributesNested<N>> implements SubjectAccessReviewSpecFluent.ResourceAttributesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceAttributesBuilder builder;
    
            ResourceAttributesNestedImpl(ResourceAttributes item){
                    this.builder = new ResourceAttributesBuilder(this, item);
            }
            ResourceAttributesNestedImpl(){
                    this.builder = new ResourceAttributesBuilder(this);
            }
    
    public N and(){
            return (N) SubjectAccessReviewSpecFluentImpl.this.withResourceAttributes(builder.build());
    }
    public N endResourceAttributes(){
            return and();
    }

}


}
