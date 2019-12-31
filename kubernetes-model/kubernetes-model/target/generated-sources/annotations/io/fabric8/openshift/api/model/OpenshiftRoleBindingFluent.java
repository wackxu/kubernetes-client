package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface OpenshiftRoleBindingFluent<A extends OpenshiftRoleBindingFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToGroupNames(int index,String item);
    public A setToGroupNames(int index,String item);
    public A addToGroupNames(String... items);
    public A addAllToGroupNames(Collection<String> items);
    public A removeFromGroupNames(String... items);
    public A removeAllFromGroupNames(Collection<String> items);
    public List<String> getGroupNames();
    public String getGroupName(int index);
    public String getFirstGroupName();
    public String getLastGroupName();
    public String getMatchingGroupName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withGroupNames(List<String> groupNames);
    public A withGroupNames(String... groupNames);
    public Boolean hasGroupNames();
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
    public OpenshiftRoleBindingFluent.MetadataNested<A> withNewMetadata();
    public OpenshiftRoleBindingFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public OpenshiftRoleBindingFluent.MetadataNested<A> editMetadata();
    public OpenshiftRoleBindingFluent.MetadataNested<A> editOrNewMetadata();
    public OpenshiftRoleBindingFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildRoleRef instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getRoleRef();
    public ObjectReference buildRoleRef();
    public A withRoleRef(ObjectReference roleRef);
    public Boolean hasRoleRef();
    public OpenshiftRoleBindingFluent.RoleRefNested<A> withNewRoleRef();
    public OpenshiftRoleBindingFluent.RoleRefNested<A> withNewRoleRefLike(ObjectReference item);
    public OpenshiftRoleBindingFluent.RoleRefNested<A> editRoleRef();
    public OpenshiftRoleBindingFluent.RoleRefNested<A> editOrNewRoleRef();
    public OpenshiftRoleBindingFluent.RoleRefNested<A> editOrNewRoleRefLike(ObjectReference item);
    public A addToSubjects(int index,ObjectReference item);
    public A setToSubjects(int index,ObjectReference item);
    public A addToSubjects(ObjectReference... items);
    public A addAllToSubjects(Collection<ObjectReference> items);
    public A removeFromSubjects(ObjectReference... items);
    public A removeAllFromSubjects(Collection<ObjectReference> items);
    
/**
 * This method has been deprecated, please use method buildSubjects instead.
 * @return The buildable object.
 */
@Deprecated public List<ObjectReference> getSubjects();
    public List<ObjectReference> buildSubjects();
    public ObjectReference buildSubject(int index);
    public ObjectReference buildFirstSubject();
    public ObjectReference buildLastSubject();
    public ObjectReference buildMatchingSubject(io.fabric8.kubernetes.api.builder.Predicate<ObjectReferenceBuilder> predicate);
    public A withSubjects(List<ObjectReference> subjects);
    public A withSubjects(ObjectReference... subjects);
    public Boolean hasSubjects();
    public OpenshiftRoleBindingFluent.SubjectsNested<A> addNewSubject();
    public OpenshiftRoleBindingFluent.SubjectsNested<A> addNewSubjectLike(ObjectReference item);
    public OpenshiftRoleBindingFluent.SubjectsNested<A> setNewSubjectLike(int index,ObjectReference item);
    public OpenshiftRoleBindingFluent.SubjectsNested<A> editSubject(int index);
    public OpenshiftRoleBindingFluent.SubjectsNested<A> editFirstSubject();
    public OpenshiftRoleBindingFluent.SubjectsNested<A> editLastSubject();
    public OpenshiftRoleBindingFluent.SubjectsNested<A> editMatchingSubject(io.fabric8.kubernetes.api.builder.Predicate<ObjectReferenceBuilder> predicate);
    public A addToUserNames(int index,String item);
    public A setToUserNames(int index,String item);
    public A addToUserNames(String... items);
    public A addAllToUserNames(Collection<String> items);
    public A removeFromUserNames(String... items);
    public A removeAllFromUserNames(Collection<String> items);
    public List<String> getUserNames();
    public String getUserName(int index);
    public String getFirstUserName();
    public String getLastUserName();
    public String getMatchingUserName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withUserNames(List<String> userNames);
    public A withUserNames(String... userNames);
    public Boolean hasUserNames();

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<OpenshiftRoleBindingFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface RoleRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<OpenshiftRoleBindingFluent.RoleRefNested<N>>{

        
    public N and();    public N endRoleRef();
}
    public interface SubjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<OpenshiftRoleBindingFluent.SubjectsNested<N>>{

        
    public N and();    public N endSubject();
}


}
