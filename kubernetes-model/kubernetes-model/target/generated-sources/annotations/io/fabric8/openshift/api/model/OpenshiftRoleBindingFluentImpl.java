package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.util.Collection;
import java.lang.Object;

public class OpenshiftRoleBindingFluentImpl<A extends OpenshiftRoleBindingFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements OpenshiftRoleBindingFluent<A>{

    private String apiVersion;
    private List<String> groupNames;
    private String kind;
    private ObjectMetaBuilder metadata;
    private ObjectReferenceBuilder roleRef;
    private List<ObjectReferenceBuilder> subjects;
    private List<String> userNames;

    public OpenshiftRoleBindingFluentImpl(){
    }
    public OpenshiftRoleBindingFluentImpl(OpenshiftRoleBinding instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withGroupNames(instance.getGroupNames()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRoleRef(instance.getRoleRef()); 
            this.withSubjects(instance.getSubjects()); 
            this.withUserNames(instance.getUserNames()); 
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

    public A addToGroupNames(int index,String item){
            if (this.groupNames == null) {this.groupNames = new ArrayList<String>();}
            this.groupNames.add(index, item);
            return (A)this;
    }

    public A setToGroupNames(int index,String item){
            if (this.groupNames == null) {this.groupNames = new ArrayList<String>();}
            this.groupNames.set(index, item); return (A)this;
    }

    public A addToGroupNames(String... items){
            if (this.groupNames == null) {this.groupNames = new ArrayList<String>();}
            for (String item : items) {this.groupNames.add(item);} return (A)this;
    }

    public A addAllToGroupNames(Collection<String> items){
            if (this.groupNames == null) {this.groupNames = new ArrayList<String>();}
            for (String item : items) {this.groupNames.add(item);} return (A)this;
    }

    public A removeFromGroupNames(String... items){
            for (String item : items) {if (this.groupNames!= null){ this.groupNames.remove(item);}} return (A)this;
    }

    public A removeAllFromGroupNames(Collection<String> items){
            for (String item : items) {if (this.groupNames!= null){ this.groupNames.remove(item);}} return (A)this;
    }

    public List<String> getGroupNames(){
            return this.groupNames;
    }

    public String getGroupName(int index){
            return this.groupNames.get(index);
    }

    public String getFirstGroupName(){
            return this.groupNames.get(0);
    }

    public String getLastGroupName(){
            return this.groupNames.get(groupNames.size() - 1);
    }

    public String getMatchingGroupName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: groupNames) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withGroupNames(List<String> groupNames){
            if (this.groupNames != null) { _visitables.removeAll(this.groupNames);}
            if (groupNames != null) {this.groupNames = new ArrayList<String>(); for (String item : groupNames){this.addToGroupNames(item);}} else { this.groupNames = new ArrayList<String>();} return (A) this;
    }

    public A withGroupNames(String... groupNames){
            if (this.groupNames != null) {this.groupNames.clear();}
            if (groupNames != null) {for (String item :groupNames){ this.addToGroupNames(item);}} return (A) this;
    }

    public Boolean hasGroupNames(){
            return groupNames != null && !groupNames.isEmpty();
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

    public OpenshiftRoleBindingFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public OpenshiftRoleBindingFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public OpenshiftRoleBindingFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public OpenshiftRoleBindingFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public OpenshiftRoleBindingFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRoleRef instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getRoleRef(){
            return this.roleRef!=null?this.roleRef.build():null;
    }

    public ObjectReference buildRoleRef(){
            return this.roleRef!=null?this.roleRef.build():null;
    }

    public A withRoleRef(ObjectReference roleRef){
            _visitables.remove(this.roleRef);
            if (roleRef!=null){ this.roleRef= new ObjectReferenceBuilder(roleRef); _visitables.add(this.roleRef);} return (A) this;
    }

    public Boolean hasRoleRef(){
            return this.roleRef != null;
    }

    public OpenshiftRoleBindingFluent.RoleRefNested<A> withNewRoleRef(){
            return new RoleRefNestedImpl();
    }

    public OpenshiftRoleBindingFluent.RoleRefNested<A> withNewRoleRefLike(ObjectReference item){
            return new RoleRefNestedImpl(item);
    }

    public OpenshiftRoleBindingFluent.RoleRefNested<A> editRoleRef(){
            return withNewRoleRefLike(getRoleRef());
    }

    public OpenshiftRoleBindingFluent.RoleRefNested<A> editOrNewRoleRef(){
            return withNewRoleRefLike(getRoleRef() != null ? getRoleRef(): new ObjectReferenceBuilder().build());
    }

    public OpenshiftRoleBindingFluent.RoleRefNested<A> editOrNewRoleRefLike(ObjectReference item){
            return withNewRoleRefLike(getRoleRef() != null ? getRoleRef(): item);
    }

    public A addToSubjects(int index,ObjectReference item){
            if (this.subjects == null) {this.subjects = new ArrayList<ObjectReferenceBuilder>();}
            ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.subjects.add(index >= 0 ? index : subjects.size(), builder); return (A)this;
    }

    public A setToSubjects(int index,ObjectReference item){
            if (this.subjects == null) {this.subjects = new ArrayList<ObjectReferenceBuilder>();}
            ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= subjects.size()) { subjects.add(builder); } else { subjects.set(index, builder);}
             return (A)this;
    }

    public A addToSubjects(ObjectReference... items){
            if (this.subjects == null) {this.subjects = new ArrayList<ObjectReferenceBuilder>();}
            for (ObjectReference item : items) {ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.add(builder);this.subjects.add(builder);} return (A)this;
    }

    public A addAllToSubjects(Collection<ObjectReference> items){
            if (this.subjects == null) {this.subjects = new ArrayList<ObjectReferenceBuilder>();}
            for (ObjectReference item : items) {ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.add(builder);this.subjects.add(builder);} return (A)this;
    }

    public A removeFromSubjects(ObjectReference... items){
            for (ObjectReference item : items) {ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.remove(builder);if (this.subjects != null) {this.subjects.remove(builder);}} return (A)this;
    }

    public A removeAllFromSubjects(Collection<ObjectReference> items){
            for (ObjectReference item : items) {ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.remove(builder);if (this.subjects != null) {this.subjects.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildSubjects instead.
 * @return The buildable object.
 */
@Deprecated public List<ObjectReference> getSubjects(){
            return build(subjects);
    }

    public List<ObjectReference> buildSubjects(){
            return build(subjects);
    }

    public ObjectReference buildSubject(int index){
            return this.subjects.get(index).build();
    }

    public ObjectReference buildFirstSubject(){
            return this.subjects.get(0).build();
    }

    public ObjectReference buildLastSubject(){
            return this.subjects.get(subjects.size() - 1).build();
    }

    public ObjectReference buildMatchingSubject(io.fabric8.kubernetes.api.builder.Predicate<ObjectReferenceBuilder> predicate){
            for (ObjectReferenceBuilder item: subjects) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withSubjects(List<ObjectReference> subjects){
            if (this.subjects != null) { _visitables.removeAll(this.subjects);}
            if (subjects != null) {this.subjects = new ArrayList<ObjectReferenceBuilder>(); for (ObjectReference item : subjects){this.addToSubjects(item);}} else { this.subjects = new ArrayList<ObjectReferenceBuilder>();} return (A) this;
    }

    public A withSubjects(ObjectReference... subjects){
            if (this.subjects != null) {this.subjects.clear();}
            if (subjects != null) {for (ObjectReference item :subjects){ this.addToSubjects(item);}} return (A) this;
    }

    public Boolean hasSubjects(){
            return subjects != null && !subjects.isEmpty();
    }

    public OpenshiftRoleBindingFluent.SubjectsNested<A> addNewSubject(){
            return new SubjectsNestedImpl();
    }

    public OpenshiftRoleBindingFluent.SubjectsNested<A> addNewSubjectLike(ObjectReference item){
            return new SubjectsNestedImpl(-1, item);
    }

    public OpenshiftRoleBindingFluent.SubjectsNested<A> setNewSubjectLike(int index,ObjectReference item){
            return new SubjectsNestedImpl(index, item);
    }

    public OpenshiftRoleBindingFluent.SubjectsNested<A> editSubject(int index){
            if (subjects.size() <= index) throw new RuntimeException("Can't edit subjects. Index exceeds size.");
            return setNewSubjectLike(index, buildSubject(index));
    }

    public OpenshiftRoleBindingFluent.SubjectsNested<A> editFirstSubject(){
            if (subjects.size() == 0) throw new RuntimeException("Can't edit first subjects. The list is empty.");
            return setNewSubjectLike(0, buildSubject(0));
    }

    public OpenshiftRoleBindingFluent.SubjectsNested<A> editLastSubject(){
            int index = subjects.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last subjects. The list is empty.");
            return setNewSubjectLike(index, buildSubject(index));
    }

    public OpenshiftRoleBindingFluent.SubjectsNested<A> editMatchingSubject(io.fabric8.kubernetes.api.builder.Predicate<ObjectReferenceBuilder> predicate){
            int index = -1;
            for (int i=0;i<subjects.size();i++) { 
            if (predicate.apply(subjects.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching subjects. No match found.");
            return setNewSubjectLike(index, buildSubject(index));
    }

    public A addToUserNames(int index,String item){
            if (this.userNames == null) {this.userNames = new ArrayList<String>();}
            this.userNames.add(index, item);
            return (A)this;
    }

    public A setToUserNames(int index,String item){
            if (this.userNames == null) {this.userNames = new ArrayList<String>();}
            this.userNames.set(index, item); return (A)this;
    }

    public A addToUserNames(String... items){
            if (this.userNames == null) {this.userNames = new ArrayList<String>();}
            for (String item : items) {this.userNames.add(item);} return (A)this;
    }

    public A addAllToUserNames(Collection<String> items){
            if (this.userNames == null) {this.userNames = new ArrayList<String>();}
            for (String item : items) {this.userNames.add(item);} return (A)this;
    }

    public A removeFromUserNames(String... items){
            for (String item : items) {if (this.userNames!= null){ this.userNames.remove(item);}} return (A)this;
    }

    public A removeAllFromUserNames(Collection<String> items){
            for (String item : items) {if (this.userNames!= null){ this.userNames.remove(item);}} return (A)this;
    }

    public List<String> getUserNames(){
            return this.userNames;
    }

    public String getUserName(int index){
            return this.userNames.get(index);
    }

    public String getFirstUserName(){
            return this.userNames.get(0);
    }

    public String getLastUserName(){
            return this.userNames.get(userNames.size() - 1);
    }

    public String getMatchingUserName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: userNames) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withUserNames(List<String> userNames){
            if (this.userNames != null) { _visitables.removeAll(this.userNames);}
            if (userNames != null) {this.userNames = new ArrayList<String>(); for (String item : userNames){this.addToUserNames(item);}} else { this.userNames = new ArrayList<String>();} return (A) this;
    }

    public A withUserNames(String... userNames){
            if (this.userNames != null) {this.userNames.clear();}
            if (userNames != null) {for (String item :userNames){ this.addToUserNames(item);}} return (A) this;
    }

    public Boolean hasUserNames(){
            return userNames != null && !userNames.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftRoleBindingFluentImpl that = (OpenshiftRoleBindingFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (groupNames != null ? !groupNames.equals(that.groupNames) :that.groupNames != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (roleRef != null ? !roleRef.equals(that.roleRef) :that.roleRef != null) return false;
            if (subjects != null ? !subjects.equals(that.subjects) :that.subjects != null) return false;
            if (userNames != null ? !userNames.equals(that.userNames) :that.userNames != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<OpenshiftRoleBindingFluent.MetadataNested<N>> implements OpenshiftRoleBindingFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) OpenshiftRoleBindingFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class RoleRefNestedImpl<N> extends ObjectReferenceFluentImpl<OpenshiftRoleBindingFluent.RoleRefNested<N>> implements OpenshiftRoleBindingFluent.RoleRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            RoleRefNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            RoleRefNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) OpenshiftRoleBindingFluentImpl.this.withRoleRef(builder.build());
    }
    public N endRoleRef(){
            return and();
    }

}
    public class SubjectsNestedImpl<N> extends ObjectReferenceFluentImpl<OpenshiftRoleBindingFluent.SubjectsNested<N>> implements OpenshiftRoleBindingFluent.SubjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
        private final int index;
    
            SubjectsNestedImpl(int index,ObjectReference item){
                    this.index = index;
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            SubjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) OpenshiftRoleBindingFluentImpl.this.setToSubjects(index, builder.build());
    }
    public N endSubject(){
            return and();
    }

}


}
