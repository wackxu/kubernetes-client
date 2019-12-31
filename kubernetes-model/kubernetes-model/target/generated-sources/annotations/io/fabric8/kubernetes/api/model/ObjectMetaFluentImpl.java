package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
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
import javax.validation.constraints.Pattern;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public class ObjectMetaFluentImpl<A extends ObjectMetaFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ObjectMetaFluent<A>{

    private Map<String,String> annotations;
    private String clusterName;
    private String creationTimestamp;
    private Long deletionGracePeriodSeconds;
    private String deletionTimestamp;
    private List<String> finalizers;
    private String generateName;
    private Long generation;
    private InitializersBuilder initializers;
    private Map<String,String> labels;
    private String name;
    private String namespace;
    private List<OwnerReferenceBuilder> ownerReferences;
    private String resourceVersion;
    private String selfLink;
    private String uid;

    public ObjectMetaFluentImpl(){
    }
    public ObjectMetaFluentImpl(ObjectMeta instance){
            this.withAnnotations(instance.getAnnotations()); 
            this.withClusterName(instance.getClusterName()); 
            this.withCreationTimestamp(instance.getCreationTimestamp()); 
            this.withDeletionGracePeriodSeconds(instance.getDeletionGracePeriodSeconds()); 
            this.withDeletionTimestamp(instance.getDeletionTimestamp()); 
            this.withFinalizers(instance.getFinalizers()); 
            this.withGenerateName(instance.getGenerateName()); 
            this.withGeneration(instance.getGeneration()); 
            this.withInitializers(instance.getInitializers()); 
            this.withLabels(instance.getLabels()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withOwnerReferences(instance.getOwnerReferences()); 
            this.withResourceVersion(instance.getResourceVersion()); 
            this.withSelfLink(instance.getSelfLink()); 
            this.withUid(instance.getUid()); 
    }

    public A addToAnnotations(String key,String value){
            if(this.annotations == null && key != null && value != null) { this.annotations = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.annotations.put(key, value);} return (A)this;
    }

    public A addToAnnotations(Map<String,String> map){
            if(this.annotations == null && map != null) { this.annotations = new LinkedHashMap<String,String>(); }
            if(map != null) { this.annotations.putAll(map);} return (A)this;
    }

    public A removeFromAnnotations(String key){
            if(this.annotations == null) { return (A) this; }
            if(key != null && this.annotations != null) {this.annotations.remove(key);} return (A)this;
    }

    public A removeFromAnnotations(Map<String,String> map){
            if(this.annotations == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.annotations != null){this.annotations.remove(key);}}} return (A)this;
    }

    public Map<String,String> getAnnotations(){
            return this.annotations;
    }

    public A withAnnotations(Map<String,String> annotations){
            if (annotations == null) { this.annotations =  new LinkedHashMap<String,String>();} else {this.annotations = new LinkedHashMap<String,String>(annotations);} return (A) this;
    }

    public Boolean hasAnnotations(){
            return this.annotations != null;
    }

    public String getClusterName(){
            return this.clusterName;
    }

    public A withClusterName(String clusterName){
            this.clusterName=clusterName; return (A) this;
    }

    public Boolean hasClusterName(){
            return this.clusterName != null;
    }

    public String getCreationTimestamp(){
            return this.creationTimestamp;
    }

    public A withCreationTimestamp(String creationTimestamp){
            this.creationTimestamp=creationTimestamp; return (A) this;
    }

    public Boolean hasCreationTimestamp(){
            return this.creationTimestamp != null;
    }

    public Long getDeletionGracePeriodSeconds(){
            return this.deletionGracePeriodSeconds;
    }

    public A withDeletionGracePeriodSeconds(Long deletionGracePeriodSeconds){
            this.deletionGracePeriodSeconds=deletionGracePeriodSeconds; return (A) this;
    }

    public Boolean hasDeletionGracePeriodSeconds(){
            return this.deletionGracePeriodSeconds != null;
    }

    public A withNewDeletionGracePeriodSeconds(String arg1){
            return (A)withDeletionGracePeriodSeconds(new Long(arg1));
    }

    public A withNewDeletionGracePeriodSeconds(long arg1){
            return (A)withDeletionGracePeriodSeconds(new Long(arg1));
    }

    public String getDeletionTimestamp(){
            return this.deletionTimestamp;
    }

    public A withDeletionTimestamp(String deletionTimestamp){
            this.deletionTimestamp=deletionTimestamp; return (A) this;
    }

    public Boolean hasDeletionTimestamp(){
            return this.deletionTimestamp != null;
    }

    public A addToFinalizers(int index,String item){
            if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
            this.finalizers.add(index, item);
            return (A)this;
    }

    public A setToFinalizers(int index,String item){
            if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
            this.finalizers.set(index, item); return (A)this;
    }

    public A addToFinalizers(String... items){
            if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
            for (String item : items) {this.finalizers.add(item);} return (A)this;
    }

    public A addAllToFinalizers(Collection<String> items){
            if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
            for (String item : items) {this.finalizers.add(item);} return (A)this;
    }

    public A removeFromFinalizers(String... items){
            for (String item : items) {if (this.finalizers!= null){ this.finalizers.remove(item);}} return (A)this;
    }

    public A removeAllFromFinalizers(Collection<String> items){
            for (String item : items) {if (this.finalizers!= null){ this.finalizers.remove(item);}} return (A)this;
    }

    public List<String> getFinalizers(){
            return this.finalizers;
    }

    public String getFinalizer(int index){
            return this.finalizers.get(index);
    }

    public String getFirstFinalizer(){
            return this.finalizers.get(0);
    }

    public String getLastFinalizer(){
            return this.finalizers.get(finalizers.size() - 1);
    }

    public String getMatchingFinalizer(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: finalizers) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withFinalizers(List<String> finalizers){
            if (this.finalizers != null) { _visitables.removeAll(this.finalizers);}
            if (finalizers != null) {this.finalizers = new ArrayList<String>(); for (String item : finalizers){this.addToFinalizers(item);}} else { this.finalizers = new ArrayList<String>();} return (A) this;
    }

    public A withFinalizers(String... finalizers){
            if (this.finalizers != null) {this.finalizers.clear();}
            if (finalizers != null) {for (String item :finalizers){ this.addToFinalizers(item);}} return (A) this;
    }

    public Boolean hasFinalizers(){
            return finalizers != null && !finalizers.isEmpty();
    }

    public String getGenerateName(){
            return this.generateName;
    }

    public A withGenerateName(String generateName){
            this.generateName=generateName; return (A) this;
    }

    public Boolean hasGenerateName(){
            return this.generateName != null;
    }

    public Long getGeneration(){
            return this.generation;
    }

    public A withGeneration(Long generation){
            this.generation=generation; return (A) this;
    }

    public Boolean hasGeneration(){
            return this.generation != null;
    }

    public A withNewGeneration(String arg1){
            return (A)withGeneration(new Long(arg1));
    }

    public A withNewGeneration(long arg1){
            return (A)withGeneration(new Long(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildInitializers instead.
 * @return The buildable object.
 */
@Deprecated public Initializers getInitializers(){
            return this.initializers!=null?this.initializers.build():null;
    }

    public Initializers buildInitializers(){
            return this.initializers!=null?this.initializers.build():null;
    }

    public A withInitializers(Initializers initializers){
            _visitables.remove(this.initializers);
            if (initializers!=null){ this.initializers= new InitializersBuilder(initializers); _visitables.add(this.initializers);} return (A) this;
    }

    public Boolean hasInitializers(){
            return this.initializers != null;
    }

    public ObjectMetaFluent.InitializersNested<A> withNewInitializers(){
            return new InitializersNestedImpl();
    }

    public ObjectMetaFluent.InitializersNested<A> withNewInitializersLike(Initializers item){
            return new InitializersNestedImpl(item);
    }

    public ObjectMetaFluent.InitializersNested<A> editInitializers(){
            return withNewInitializersLike(getInitializers());
    }

    public ObjectMetaFluent.InitializersNested<A> editOrNewInitializers(){
            return withNewInitializersLike(getInitializers() != null ? getInitializers(): new InitializersBuilder().build());
    }

    public ObjectMetaFluent.InitializersNested<A> editOrNewInitializersLike(Initializers item){
            return withNewInitializersLike(getInitializers() != null ? getInitializers(): item);
    }

    public A addToLabels(String key,String value){
            if(this.labels == null && key != null && value != null) { this.labels = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.labels.put(key, value);} return (A)this;
    }

    public A addToLabels(Map<String,String> map){
            if(this.labels == null && map != null) { this.labels = new LinkedHashMap<String,String>(); }
            if(map != null) { this.labels.putAll(map);} return (A)this;
    }

    public A removeFromLabels(String key){
            if(this.labels == null) { return (A) this; }
            if(key != null && this.labels != null) {this.labels.remove(key);} return (A)this;
    }

    public A removeFromLabels(Map<String,String> map){
            if(this.labels == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.labels != null){this.labels.remove(key);}}} return (A)this;
    }

    public Map<String,String> getLabels(){
            return this.labels;
    }

    public A withLabels(Map<String,String> labels){
            if (labels == null) { this.labels =  new LinkedHashMap<String,String>();} else {this.labels = new LinkedHashMap<String,String>(labels);} return (A) this;
    }

    public Boolean hasLabels(){
            return this.labels != null;
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public String getNamespace(){
            return this.namespace;
    }

    public A withNamespace(String namespace){
            this.namespace=namespace; return (A) this;
    }

    public Boolean hasNamespace(){
            return this.namespace != null;
    }

    public A addToOwnerReferences(int index,OwnerReference item){
            if (this.ownerReferences == null) {this.ownerReferences = new ArrayList<OwnerReferenceBuilder>();}
            OwnerReferenceBuilder builder = new OwnerReferenceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.ownerReferences.add(index >= 0 ? index : ownerReferences.size(), builder); return (A)this;
    }

    public A setToOwnerReferences(int index,OwnerReference item){
            if (this.ownerReferences == null) {this.ownerReferences = new ArrayList<OwnerReferenceBuilder>();}
            OwnerReferenceBuilder builder = new OwnerReferenceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= ownerReferences.size()) { ownerReferences.add(builder); } else { ownerReferences.set(index, builder);}
             return (A)this;
    }

    public A addToOwnerReferences(OwnerReference... items){
            if (this.ownerReferences == null) {this.ownerReferences = new ArrayList<OwnerReferenceBuilder>();}
            for (OwnerReference item : items) {OwnerReferenceBuilder builder = new OwnerReferenceBuilder(item);_visitables.add(builder);this.ownerReferences.add(builder);} return (A)this;
    }

    public A addAllToOwnerReferences(Collection<OwnerReference> items){
            if (this.ownerReferences == null) {this.ownerReferences = new ArrayList<OwnerReferenceBuilder>();}
            for (OwnerReference item : items) {OwnerReferenceBuilder builder = new OwnerReferenceBuilder(item);_visitables.add(builder);this.ownerReferences.add(builder);} return (A)this;
    }

    public A removeFromOwnerReferences(OwnerReference... items){
            for (OwnerReference item : items) {OwnerReferenceBuilder builder = new OwnerReferenceBuilder(item);_visitables.remove(builder);if (this.ownerReferences != null) {this.ownerReferences.remove(builder);}} return (A)this;
    }

    public A removeAllFromOwnerReferences(Collection<OwnerReference> items){
            for (OwnerReference item : items) {OwnerReferenceBuilder builder = new OwnerReferenceBuilder(item);_visitables.remove(builder);if (this.ownerReferences != null) {this.ownerReferences.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildOwnerReferences instead.
 * @return The buildable object.
 */
@Deprecated public List<OwnerReference> getOwnerReferences(){
            return build(ownerReferences);
    }

    public List<OwnerReference> buildOwnerReferences(){
            return build(ownerReferences);
    }

    public OwnerReference buildOwnerReference(int index){
            return this.ownerReferences.get(index).build();
    }

    public OwnerReference buildFirstOwnerReference(){
            return this.ownerReferences.get(0).build();
    }

    public OwnerReference buildLastOwnerReference(){
            return this.ownerReferences.get(ownerReferences.size() - 1).build();
    }

    public OwnerReference buildMatchingOwnerReference(io.fabric8.kubernetes.api.builder.Predicate<OwnerReferenceBuilder> predicate){
            for (OwnerReferenceBuilder item: ownerReferences) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withOwnerReferences(List<OwnerReference> ownerReferences){
            if (this.ownerReferences != null) { _visitables.removeAll(this.ownerReferences);}
            if (ownerReferences != null) {this.ownerReferences = new ArrayList<OwnerReferenceBuilder>(); for (OwnerReference item : ownerReferences){this.addToOwnerReferences(item);}} else { this.ownerReferences = new ArrayList<OwnerReferenceBuilder>();} return (A) this;
    }

    public A withOwnerReferences(OwnerReference... ownerReferences){
            if (this.ownerReferences != null) {this.ownerReferences.clear();}
            if (ownerReferences != null) {for (OwnerReference item :ownerReferences){ this.addToOwnerReferences(item);}} return (A) this;
    }

    public Boolean hasOwnerReferences(){
            return ownerReferences != null && !ownerReferences.isEmpty();
    }

    public ObjectMetaFluent.OwnerReferencesNested<A> addNewOwnerReference(){
            return new OwnerReferencesNestedImpl();
    }

    public ObjectMetaFluent.OwnerReferencesNested<A> addNewOwnerReferenceLike(OwnerReference item){
            return new OwnerReferencesNestedImpl(-1, item);
    }

    public ObjectMetaFluent.OwnerReferencesNested<A> setNewOwnerReferenceLike(int index,OwnerReference item){
            return new OwnerReferencesNestedImpl(index, item);
    }

    public ObjectMetaFluent.OwnerReferencesNested<A> editOwnerReference(int index){
            if (ownerReferences.size() <= index) throw new RuntimeException("Can't edit ownerReferences. Index exceeds size.");
            return setNewOwnerReferenceLike(index, buildOwnerReference(index));
    }

    public ObjectMetaFluent.OwnerReferencesNested<A> editFirstOwnerReference(){
            if (ownerReferences.size() == 0) throw new RuntimeException("Can't edit first ownerReferences. The list is empty.");
            return setNewOwnerReferenceLike(0, buildOwnerReference(0));
    }

    public ObjectMetaFluent.OwnerReferencesNested<A> editLastOwnerReference(){
            int index = ownerReferences.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last ownerReferences. The list is empty.");
            return setNewOwnerReferenceLike(index, buildOwnerReference(index));
    }

    public ObjectMetaFluent.OwnerReferencesNested<A> editMatchingOwnerReference(io.fabric8.kubernetes.api.builder.Predicate<OwnerReferenceBuilder> predicate){
            int index = -1;
            for (int i=0;i<ownerReferences.size();i++) { 
            if (predicate.apply(ownerReferences.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching ownerReferences. No match found.");
            return setNewOwnerReferenceLike(index, buildOwnerReference(index));
    }

    public String getResourceVersion(){
            return this.resourceVersion;
    }

    public A withResourceVersion(String resourceVersion){
            this.resourceVersion=resourceVersion; return (A) this;
    }

    public Boolean hasResourceVersion(){
            return this.resourceVersion != null;
    }

    public String getSelfLink(){
            return this.selfLink;
    }

    public A withSelfLink(String selfLink){
            this.selfLink=selfLink; return (A) this;
    }

    public Boolean hasSelfLink(){
            return this.selfLink != null;
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ObjectMetaFluentImpl that = (ObjectMetaFluentImpl) o;
            if (annotations != null ? !annotations.equals(that.annotations) :that.annotations != null) return false;
            if (clusterName != null ? !clusterName.equals(that.clusterName) :that.clusterName != null) return false;
            if (creationTimestamp != null ? !creationTimestamp.equals(that.creationTimestamp) :that.creationTimestamp != null) return false;
            if (deletionGracePeriodSeconds != null ? !deletionGracePeriodSeconds.equals(that.deletionGracePeriodSeconds) :that.deletionGracePeriodSeconds != null) return false;
            if (deletionTimestamp != null ? !deletionTimestamp.equals(that.deletionTimestamp) :that.deletionTimestamp != null) return false;
            if (finalizers != null ? !finalizers.equals(that.finalizers) :that.finalizers != null) return false;
            if (generateName != null ? !generateName.equals(that.generateName) :that.generateName != null) return false;
            if (generation != null ? !generation.equals(that.generation) :that.generation != null) return false;
            if (initializers != null ? !initializers.equals(that.initializers) :that.initializers != null) return false;
            if (labels != null ? !labels.equals(that.labels) :that.labels != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
            if (ownerReferences != null ? !ownerReferences.equals(that.ownerReferences) :that.ownerReferences != null) return false;
            if (resourceVersion != null ? !resourceVersion.equals(that.resourceVersion) :that.resourceVersion != null) return false;
            if (selfLink != null ? !selfLink.equals(that.selfLink) :that.selfLink != null) return false;
            if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
            return true;
    }


    public class InitializersNestedImpl<N> extends InitializersFluentImpl<ObjectMetaFluent.InitializersNested<N>> implements ObjectMetaFluent.InitializersNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final InitializersBuilder builder;
    
            InitializersNestedImpl(Initializers item){
                    this.builder = new InitializersBuilder(this, item);
            }
            InitializersNestedImpl(){
                    this.builder = new InitializersBuilder(this);
            }
    
    public N and(){
            return (N) ObjectMetaFluentImpl.this.withInitializers(builder.build());
    }
    public N endInitializers(){
            return and();
    }

}
    public class OwnerReferencesNestedImpl<N> extends OwnerReferenceFluentImpl<ObjectMetaFluent.OwnerReferencesNested<N>> implements ObjectMetaFluent.OwnerReferencesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OwnerReferenceBuilder builder;
        private final int index;
    
            OwnerReferencesNestedImpl(int index,OwnerReference item){
                    this.index = index;
                    this.builder = new OwnerReferenceBuilder(this, item);
            }
            OwnerReferencesNestedImpl(){
                    this.index = -1;
                    this.builder = new OwnerReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ObjectMetaFluentImpl.this.setToOwnerReferences(index, builder.build());
    }
    public N endOwnerReference(){
            return and();
    }

}


}
