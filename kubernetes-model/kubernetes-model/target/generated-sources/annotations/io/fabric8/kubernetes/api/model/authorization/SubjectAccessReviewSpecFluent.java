package io.fabric8.kubernetes.api.model.authorization;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface SubjectAccessReviewSpecFluent<A extends SubjectAccessReviewSpecFluent<A>> extends Fluent<A>{


    public A addToExtra(String key,ArrayList<String> value);
    public A addToExtra(Map<String,ArrayList<String>> map);
    public A removeFromExtra(String key);
    public A removeFromExtra(Map<String,ArrayList<String>> map);
    public Map<String,ArrayList<String>> getExtra();
    public A withExtra(Map<String,ArrayList<String>> extra);
    public Boolean hasExtra();
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
    
/**
 * This method has been deprecated, please use method buildNonResourceAttributes instead.
 * @return The buildable object.
 */
@Deprecated public NonResourceAttributes getNonResourceAttributes();
    public NonResourceAttributes buildNonResourceAttributes();
    public A withNonResourceAttributes(NonResourceAttributes nonResourceAttributes);
    public Boolean hasNonResourceAttributes();
    public A withNewNonResourceAttributes(String path,String verb);
    public SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributes();
    public SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributesLike(NonResourceAttributes item);
    public SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editNonResourceAttributes();
    public SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributes();
    public SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributesLike(NonResourceAttributes item);
    
/**
 * This method has been deprecated, please use method buildResourceAttributes instead.
 * @return The buildable object.
 */
@Deprecated public ResourceAttributes getResourceAttributes();
    public ResourceAttributes buildResourceAttributes();
    public A withResourceAttributes(ResourceAttributes resourceAttributes);
    public Boolean hasResourceAttributes();
    public SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributes();
    public SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributesLike(ResourceAttributes item);
    public SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editResourceAttributes();
    public SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributes();
    public SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributesLike(ResourceAttributes item);
    public String getUid();
    public A withUid(String uid);
    public Boolean hasUid();
    public String getUser();
    public A withUser(String user);
    public Boolean hasUser();

    public interface NonResourceAttributesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NonResourceAttributesFluent<SubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>>{

        
    public N and();    public N endNonResourceAttributes();
}
    public interface ResourceAttributesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceAttributesFluent<SubjectAccessReviewSpecFluent.ResourceAttributesNested<N>>{

        
    public N and();    public N endResourceAttributes();
}


}
