package io.fabric8.kubernetes.api.model.rbac;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class ClusterRoleBindingFluentImpl<A extends ClusterRoleBindingFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ClusterRoleBindingFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private RoleRefBuilder roleRef;
    private List<SubjectBuilder> subjects;

    public ClusterRoleBindingFluentImpl(){
    }
    public ClusterRoleBindingFluentImpl(ClusterRoleBinding instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRoleRef(instance.getRoleRef()); 
            this.withSubjects(instance.getSubjects()); 
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

    public ClusterRoleBindingFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public ClusterRoleBindingFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public ClusterRoleBindingFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public ClusterRoleBindingFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public ClusterRoleBindingFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRoleRef instead.
 * @return The buildable object.
 */
@Deprecated public RoleRef getRoleRef(){
            return this.roleRef!=null?this.roleRef.build():null;
    }

    public RoleRef buildRoleRef(){
            return this.roleRef!=null?this.roleRef.build():null;
    }

    public A withRoleRef(RoleRef roleRef){
            _visitables.remove(this.roleRef);
            if (roleRef!=null){ this.roleRef= new RoleRefBuilder(roleRef); _visitables.add(this.roleRef);} return (A) this;
    }

    public Boolean hasRoleRef(){
            return this.roleRef != null;
    }

    public A withNewRoleRef(String apiGroup,String kind,String name){
            return (A)withRoleRef(new RoleRef(apiGroup, kind, name));
    }

    public ClusterRoleBindingFluent.RoleRefNested<A> withNewRoleRef(){
            return new RoleRefNestedImpl();
    }

    public ClusterRoleBindingFluent.RoleRefNested<A> withNewRoleRefLike(RoleRef item){
            return new RoleRefNestedImpl(item);
    }

    public ClusterRoleBindingFluent.RoleRefNested<A> editRoleRef(){
            return withNewRoleRefLike(getRoleRef());
    }

    public ClusterRoleBindingFluent.RoleRefNested<A> editOrNewRoleRef(){
            return withNewRoleRefLike(getRoleRef() != null ? getRoleRef(): new RoleRefBuilder().build());
    }

    public ClusterRoleBindingFluent.RoleRefNested<A> editOrNewRoleRefLike(RoleRef item){
            return withNewRoleRefLike(getRoleRef() != null ? getRoleRef(): item);
    }

    public A addToSubjects(int index,Subject item){
            if (this.subjects == null) {this.subjects = new ArrayList<SubjectBuilder>();}
            SubjectBuilder builder = new SubjectBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.subjects.add(index >= 0 ? index : subjects.size(), builder); return (A)this;
    }

    public A setToSubjects(int index,Subject item){
            if (this.subjects == null) {this.subjects = new ArrayList<SubjectBuilder>();}
            SubjectBuilder builder = new SubjectBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= subjects.size()) { subjects.add(builder); } else { subjects.set(index, builder);}
             return (A)this;
    }

    public A addToSubjects(Subject... items){
            if (this.subjects == null) {this.subjects = new ArrayList<SubjectBuilder>();}
            for (Subject item : items) {SubjectBuilder builder = new SubjectBuilder(item);_visitables.add(builder);this.subjects.add(builder);} return (A)this;
    }

    public A addAllToSubjects(Collection<Subject> items){
            if (this.subjects == null) {this.subjects = new ArrayList<SubjectBuilder>();}
            for (Subject item : items) {SubjectBuilder builder = new SubjectBuilder(item);_visitables.add(builder);this.subjects.add(builder);} return (A)this;
    }

    public A removeFromSubjects(Subject... items){
            for (Subject item : items) {SubjectBuilder builder = new SubjectBuilder(item);_visitables.remove(builder);if (this.subjects != null) {this.subjects.remove(builder);}} return (A)this;
    }

    public A removeAllFromSubjects(Collection<Subject> items){
            for (Subject item : items) {SubjectBuilder builder = new SubjectBuilder(item);_visitables.remove(builder);if (this.subjects != null) {this.subjects.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildSubjects instead.
 * @return The buildable object.
 */
@Deprecated public List<Subject> getSubjects(){
            return build(subjects);
    }

    public List<Subject> buildSubjects(){
            return build(subjects);
    }

    public Subject buildSubject(int index){
            return this.subjects.get(index).build();
    }

    public Subject buildFirstSubject(){
            return this.subjects.get(0).build();
    }

    public Subject buildLastSubject(){
            return this.subjects.get(subjects.size() - 1).build();
    }

    public Subject buildMatchingSubject(io.fabric8.kubernetes.api.builder.Predicate<SubjectBuilder> predicate){
            for (SubjectBuilder item: subjects) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withSubjects(List<Subject> subjects){
            if (this.subjects != null) { _visitables.removeAll(this.subjects);}
            if (subjects != null) {this.subjects = new ArrayList<SubjectBuilder>(); for (Subject item : subjects){this.addToSubjects(item);}} else { this.subjects = new ArrayList<SubjectBuilder>();} return (A) this;
    }

    public A withSubjects(Subject... subjects){
            if (this.subjects != null) {this.subjects.clear();}
            if (subjects != null) {for (Subject item :subjects){ this.addToSubjects(item);}} return (A) this;
    }

    public Boolean hasSubjects(){
            return subjects != null && !subjects.isEmpty();
    }

    public A addNewSubject(String apiGroup,String kind,String name,String namespace){
            return (A)addToSubjects(new Subject(apiGroup, kind, name, namespace));
    }

    public ClusterRoleBindingFluent.SubjectsNested<A> addNewSubject(){
            return new SubjectsNestedImpl();
    }

    public ClusterRoleBindingFluent.SubjectsNested<A> addNewSubjectLike(Subject item){
            return new SubjectsNestedImpl(-1, item);
    }

    public ClusterRoleBindingFluent.SubjectsNested<A> setNewSubjectLike(int index,Subject item){
            return new SubjectsNestedImpl(index, item);
    }

    public ClusterRoleBindingFluent.SubjectsNested<A> editSubject(int index){
            if (subjects.size() <= index) throw new RuntimeException("Can't edit subjects. Index exceeds size.");
            return setNewSubjectLike(index, buildSubject(index));
    }

    public ClusterRoleBindingFluent.SubjectsNested<A> editFirstSubject(){
            if (subjects.size() == 0) throw new RuntimeException("Can't edit first subjects. The list is empty.");
            return setNewSubjectLike(0, buildSubject(0));
    }

    public ClusterRoleBindingFluent.SubjectsNested<A> editLastSubject(){
            int index = subjects.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last subjects. The list is empty.");
            return setNewSubjectLike(index, buildSubject(index));
    }

    public ClusterRoleBindingFluent.SubjectsNested<A> editMatchingSubject(io.fabric8.kubernetes.api.builder.Predicate<SubjectBuilder> predicate){
            int index = -1;
            for (int i=0;i<subjects.size();i++) { 
            if (predicate.apply(subjects.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching subjects. No match found.");
            return setNewSubjectLike(index, buildSubject(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ClusterRoleBindingFluentImpl that = (ClusterRoleBindingFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (roleRef != null ? !roleRef.equals(that.roleRef) :that.roleRef != null) return false;
            if (subjects != null ? !subjects.equals(that.subjects) :that.subjects != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<ClusterRoleBindingFluent.MetadataNested<N>> implements ClusterRoleBindingFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) ClusterRoleBindingFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class RoleRefNestedImpl<N> extends RoleRefFluentImpl<ClusterRoleBindingFluent.RoleRefNested<N>> implements ClusterRoleBindingFluent.RoleRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleRefBuilder builder;
    
            RoleRefNestedImpl(RoleRef item){
                    this.builder = new RoleRefBuilder(this, item);
            }
            RoleRefNestedImpl(){
                    this.builder = new RoleRefBuilder(this);
            }
    
    public N and(){
            return (N) ClusterRoleBindingFluentImpl.this.withRoleRef(builder.build());
    }
    public N endRoleRef(){
            return and();
    }

}
    public class SubjectsNestedImpl<N> extends SubjectFluentImpl<ClusterRoleBindingFluent.SubjectsNested<N>> implements ClusterRoleBindingFluent.SubjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectBuilder builder;
        private final int index;
    
            SubjectsNestedImpl(int index,Subject item){
                    this.index = index;
                    this.builder = new SubjectBuilder(this, item);
            }
            SubjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new SubjectBuilder(this);
            }
    
    public N and(){
            return (N) ClusterRoleBindingFluentImpl.this.setToSubjects(index, builder.build());
    }
    public N endSubject(){
            return and();
    }

}


}
