package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class PersistentVolumeClaimSpecFluentImpl<A extends PersistentVolumeClaimSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PersistentVolumeClaimSpecFluent<A>{

    private List<String> accessModes;
    private TypedLocalObjectReferenceBuilder dataSource;
    private ResourceRequirementsBuilder resources;
    private LabelSelectorBuilder selector;
    private String storageClassName;
    private String volumeMode;
    private String volumeName;

    public PersistentVolumeClaimSpecFluentImpl(){
    }
    public PersistentVolumeClaimSpecFluentImpl(PersistentVolumeClaimSpec instance){
            this.withAccessModes(instance.getAccessModes()); 
            this.withDataSource(instance.getDataSource()); 
            this.withResources(instance.getResources()); 
            this.withSelector(instance.getSelector()); 
            this.withStorageClassName(instance.getStorageClassName()); 
            this.withVolumeMode(instance.getVolumeMode()); 
            this.withVolumeName(instance.getVolumeName()); 
    }

    public A addToAccessModes(int index,String item){
            if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
            this.accessModes.add(index, item);
            return (A)this;
    }

    public A setToAccessModes(int index,String item){
            if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
            this.accessModes.set(index, item); return (A)this;
    }

    public A addToAccessModes(String... items){
            if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
            for (String item : items) {this.accessModes.add(item);} return (A)this;
    }

    public A addAllToAccessModes(Collection<String> items){
            if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
            for (String item : items) {this.accessModes.add(item);} return (A)this;
    }

    public A removeFromAccessModes(String... items){
            for (String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
    }

    public A removeAllFromAccessModes(Collection<String> items){
            for (String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
    }

    public List<String> getAccessModes(){
            return this.accessModes;
    }

    public String getAccessMode(int index){
            return this.accessModes.get(index);
    }

    public String getFirstAccessMode(){
            return this.accessModes.get(0);
    }

    public String getLastAccessMode(){
            return this.accessModes.get(accessModes.size() - 1);
    }

    public String getMatchingAccessMode(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: accessModes) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withAccessModes(List<String> accessModes){
            if (this.accessModes != null) { _visitables.removeAll(this.accessModes);}
            if (accessModes != null) {this.accessModes = new ArrayList<String>(); for (String item : accessModes){this.addToAccessModes(item);}} else { this.accessModes = new ArrayList<String>();} return (A) this;
    }

    public A withAccessModes(String... accessModes){
            if (this.accessModes != null) {this.accessModes.clear();}
            if (accessModes != null) {for (String item :accessModes){ this.addToAccessModes(item);}} return (A) this;
    }

    public Boolean hasAccessModes(){
            return accessModes != null && !accessModes.isEmpty();
    }

    
/**
 * This method has been deprecated, please use method buildDataSource instead.
 * @return The buildable object.
 */
@Deprecated public TypedLocalObjectReference getDataSource(){
            return this.dataSource!=null?this.dataSource.build():null;
    }

    public TypedLocalObjectReference buildDataSource(){
            return this.dataSource!=null?this.dataSource.build():null;
    }

    public A withDataSource(TypedLocalObjectReference dataSource){
            _visitables.remove(this.dataSource);
            if (dataSource!=null){ this.dataSource= new TypedLocalObjectReferenceBuilder(dataSource); _visitables.add(this.dataSource);} return (A) this;
    }

    public Boolean hasDataSource(){
            return this.dataSource != null;
    }

    public A withNewDataSource(String apiGroup,String kind,String name){
            return (A)withDataSource(new TypedLocalObjectReference(apiGroup, kind, name));
    }

    public PersistentVolumeClaimSpecFluent.DataSourceNested<A> withNewDataSource(){
            return new DataSourceNestedImpl();
    }

    public PersistentVolumeClaimSpecFluent.DataSourceNested<A> withNewDataSourceLike(TypedLocalObjectReference item){
            return new DataSourceNestedImpl(item);
    }

    public PersistentVolumeClaimSpecFluent.DataSourceNested<A> editDataSource(){
            return withNewDataSourceLike(getDataSource());
    }

    public PersistentVolumeClaimSpecFluent.DataSourceNested<A> editOrNewDataSource(){
            return withNewDataSourceLike(getDataSource() != null ? getDataSource(): new TypedLocalObjectReferenceBuilder().build());
    }

    public PersistentVolumeClaimSpecFluent.DataSourceNested<A> editOrNewDataSourceLike(TypedLocalObjectReference item){
            return withNewDataSourceLike(getDataSource() != null ? getDataSource(): item);
    }

    
/**
 * This method has been deprecated, please use method buildResources instead.
 * @return The buildable object.
 */
@Deprecated public ResourceRequirements getResources(){
            return this.resources!=null?this.resources.build():null;
    }

    public ResourceRequirements buildResources(){
            return this.resources!=null?this.resources.build():null;
    }

    public A withResources(ResourceRequirements resources){
            _visitables.remove(this.resources);
            if (resources!=null){ this.resources= new ResourceRequirementsBuilder(resources); _visitables.add(this.resources);} return (A) this;
    }

    public Boolean hasResources(){
            return this.resources != null;
    }

    public PersistentVolumeClaimSpecFluent.ResourcesNested<A> withNewResources(){
            return new ResourcesNestedImpl();
    }

    public PersistentVolumeClaimSpecFluent.ResourcesNested<A> withNewResourcesLike(ResourceRequirements item){
            return new ResourcesNestedImpl(item);
    }

    public PersistentVolumeClaimSpecFluent.ResourcesNested<A> editResources(){
            return withNewResourcesLike(getResources());
    }

    public PersistentVolumeClaimSpecFluent.ResourcesNested<A> editOrNewResources(){
            return withNewResourcesLike(getResources() != null ? getResources(): new ResourceRequirementsBuilder().build());
    }

    public PersistentVolumeClaimSpecFluent.ResourcesNested<A> editOrNewResourcesLike(ResourceRequirements item){
            return withNewResourcesLike(getResources() != null ? getResources(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getSelector(){
            return this.selector!=null?this.selector.build():null;
    }

    public LabelSelector buildSelector(){
            return this.selector!=null?this.selector.build():null;
    }

    public A withSelector(LabelSelector selector){
            _visitables.remove(this.selector);
            if (selector!=null){ this.selector= new LabelSelectorBuilder(selector); _visitables.add(this.selector);} return (A) this;
    }

    public Boolean hasSelector(){
            return this.selector != null;
    }

    public PersistentVolumeClaimSpecFluent.SelectorNested<A> withNewSelector(){
            return new SelectorNestedImpl();
    }

    public PersistentVolumeClaimSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item){
            return new SelectorNestedImpl(item);
    }

    public PersistentVolumeClaimSpecFluent.SelectorNested<A> editSelector(){
            return withNewSelectorLike(getSelector());
    }

    public PersistentVolumeClaimSpecFluent.SelectorNested<A> editOrNewSelector(){
            return withNewSelectorLike(getSelector() != null ? getSelector(): new LabelSelectorBuilder().build());
    }

    public PersistentVolumeClaimSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item){
            return withNewSelectorLike(getSelector() != null ? getSelector(): item);
    }

    public String getStorageClassName(){
            return this.storageClassName;
    }

    public A withStorageClassName(String storageClassName){
            this.storageClassName=storageClassName; return (A) this;
    }

    public Boolean hasStorageClassName(){
            return this.storageClassName != null;
    }

    public String getVolumeMode(){
            return this.volumeMode;
    }

    public A withVolumeMode(String volumeMode){
            this.volumeMode=volumeMode; return (A) this;
    }

    public Boolean hasVolumeMode(){
            return this.volumeMode != null;
    }

    public String getVolumeName(){
            return this.volumeName;
    }

    public A withVolumeName(String volumeName){
            this.volumeName=volumeName; return (A) this;
    }

    public Boolean hasVolumeName(){
            return this.volumeName != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeClaimSpecFluentImpl that = (PersistentVolumeClaimSpecFluentImpl) o;
            if (accessModes != null ? !accessModes.equals(that.accessModes) :that.accessModes != null) return false;
            if (dataSource != null ? !dataSource.equals(that.dataSource) :that.dataSource != null) return false;
            if (resources != null ? !resources.equals(that.resources) :that.resources != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (storageClassName != null ? !storageClassName.equals(that.storageClassName) :that.storageClassName != null) return false;
            if (volumeMode != null ? !volumeMode.equals(that.volumeMode) :that.volumeMode != null) return false;
            if (volumeName != null ? !volumeName.equals(that.volumeName) :that.volumeName != null) return false;
            return true;
    }


    public class DataSourceNestedImpl<N> extends TypedLocalObjectReferenceFluentImpl<PersistentVolumeClaimSpecFluent.DataSourceNested<N>> implements PersistentVolumeClaimSpecFluent.DataSourceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TypedLocalObjectReferenceBuilder builder;
    
            DataSourceNestedImpl(TypedLocalObjectReference item){
                    this.builder = new TypedLocalObjectReferenceBuilder(this, item);
            }
            DataSourceNestedImpl(){
                    this.builder = new TypedLocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeClaimSpecFluentImpl.this.withDataSource(builder.build());
    }
    public N endDataSource(){
            return and();
    }

}
    public class ResourcesNestedImpl<N> extends ResourceRequirementsFluentImpl<PersistentVolumeClaimSpecFluent.ResourcesNested<N>> implements PersistentVolumeClaimSpecFluent.ResourcesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceRequirementsBuilder builder;
    
            ResourcesNestedImpl(ResourceRequirements item){
                    this.builder = new ResourceRequirementsBuilder(this, item);
            }
            ResourcesNestedImpl(){
                    this.builder = new ResourceRequirementsBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeClaimSpecFluentImpl.this.withResources(builder.build());
    }
    public N endResources(){
            return and();
    }

}
    public class SelectorNestedImpl<N> extends LabelSelectorFluentImpl<PersistentVolumeClaimSpecFluent.SelectorNested<N>> implements PersistentVolumeClaimSpecFluent.SelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            SelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            SelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeClaimSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector(){
            return and();
    }

}


}
