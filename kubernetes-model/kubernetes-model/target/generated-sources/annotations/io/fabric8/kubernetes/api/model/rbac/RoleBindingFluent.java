package io.fabric8.kubernetes.api.model.rbac;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface RoleBindingFluent<A extends RoleBindingFluent<A>> extends Fluent<A>{


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
    public RoleBindingFluent.MetadataNested<A> withNewMetadata();
    public RoleBindingFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public RoleBindingFluent.MetadataNested<A> editMetadata();
    public RoleBindingFluent.MetadataNested<A> editOrNewMetadata();
    public RoleBindingFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildRoleRef instead.
 * @return The buildable object.
 */
@Deprecated public RoleRef getRoleRef();
    public RoleRef buildRoleRef();
    public A withRoleRef(RoleRef roleRef);
    public Boolean hasRoleRef();
    public A withNewRoleRef(String apiGroup,String kind,String name);
    public RoleBindingFluent.RoleRefNested<A> withNewRoleRef();
    public RoleBindingFluent.RoleRefNested<A> withNewRoleRefLike(RoleRef item);
    public RoleBindingFluent.RoleRefNested<A> editRoleRef();
    public RoleBindingFluent.RoleRefNested<A> editOrNewRoleRef();
    public RoleBindingFluent.RoleRefNested<A> editOrNewRoleRefLike(RoleRef item);
    public A addToSubjects(int index,Subject item);
    public A setToSubjects(int index,Subject item);
    public A addToSubjects(Subject... items);
    public A addAllToSubjects(Collection<Subject> items);
    public A removeFromSubjects(Subject... items);
    public A removeAllFromSubjects(Collection<Subject> items);
    
/**
 * This method has been deprecated, please use method buildSubjects instead.
 * @return The buildable object.
 */
@Deprecated public List<Subject> getSubjects();
    public List<Subject> buildSubjects();
    public Subject buildSubject(int index);
    public Subject buildFirstSubject();
    public Subject buildLastSubject();
    public Subject buildMatchingSubject(io.fabric8.kubernetes.api.builder.Predicate<SubjectBuilder> predicate);
    public A withSubjects(List<Subject> subjects);
    public A withSubjects(Subject... subjects);
    public Boolean hasSubjects();
    public A addNewSubject(String apiGroup,String kind,String name,String namespace);
    public RoleBindingFluent.SubjectsNested<A> addNewSubject();
    public RoleBindingFluent.SubjectsNested<A> addNewSubjectLike(Subject item);
    public RoleBindingFluent.SubjectsNested<A> setNewSubjectLike(int index,Subject item);
    public RoleBindingFluent.SubjectsNested<A> editSubject(int index);
    public RoleBindingFluent.SubjectsNested<A> editFirstSubject();
    public RoleBindingFluent.SubjectsNested<A> editLastSubject();
    public RoleBindingFluent.SubjectsNested<A> editMatchingSubject(io.fabric8.kubernetes.api.builder.Predicate<SubjectBuilder> predicate);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<RoleBindingFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface RoleRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleRefFluent<RoleBindingFluent.RoleRefNested<N>>{

        
    public N and();    public N endRoleRef();
}
    public interface SubjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectFluent<RoleBindingFluent.SubjectsNested<N>>{

        
    public N and();    public N endSubject();
}


}
