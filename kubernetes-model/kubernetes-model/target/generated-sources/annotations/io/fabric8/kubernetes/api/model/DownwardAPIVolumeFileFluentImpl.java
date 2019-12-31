package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class DownwardAPIVolumeFileFluentImpl<A extends DownwardAPIVolumeFileFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DownwardAPIVolumeFileFluent<A>{

    private ObjectFieldSelectorBuilder fieldRef;
    private Integer mode;
    private String path;
    private ResourceFieldSelectorBuilder resourceFieldRef;

    public DownwardAPIVolumeFileFluentImpl(){
    }
    public DownwardAPIVolumeFileFluentImpl(DownwardAPIVolumeFile instance){
            this.withFieldRef(instance.getFieldRef()); 
            this.withMode(instance.getMode()); 
            this.withPath(instance.getPath()); 
            this.withResourceFieldRef(instance.getResourceFieldRef()); 
    }

    
/**
 * This method has been deprecated, please use method buildFieldRef instead.
 * @return The buildable object.
 */
@Deprecated public ObjectFieldSelector getFieldRef(){
            return this.fieldRef!=null?this.fieldRef.build():null;
    }

    public ObjectFieldSelector buildFieldRef(){
            return this.fieldRef!=null?this.fieldRef.build():null;
    }

    public A withFieldRef(ObjectFieldSelector fieldRef){
            _visitables.remove(this.fieldRef);
            if (fieldRef!=null){ this.fieldRef= new ObjectFieldSelectorBuilder(fieldRef); _visitables.add(this.fieldRef);} return (A) this;
    }

    public Boolean hasFieldRef(){
            return this.fieldRef != null;
    }

    public A withNewFieldRef(String apiVersion,String fieldPath){
            return (A)withFieldRef(new ObjectFieldSelector(apiVersion, fieldPath));
    }

    public DownwardAPIVolumeFileFluent.FieldRefNested<A> withNewFieldRef(){
            return new FieldRefNestedImpl();
    }

    public DownwardAPIVolumeFileFluent.FieldRefNested<A> withNewFieldRefLike(ObjectFieldSelector item){
            return new FieldRefNestedImpl(item);
    }

    public DownwardAPIVolumeFileFluent.FieldRefNested<A> editFieldRef(){
            return withNewFieldRefLike(getFieldRef());
    }

    public DownwardAPIVolumeFileFluent.FieldRefNested<A> editOrNewFieldRef(){
            return withNewFieldRefLike(getFieldRef() != null ? getFieldRef(): new ObjectFieldSelectorBuilder().build());
    }

    public DownwardAPIVolumeFileFluent.FieldRefNested<A> editOrNewFieldRefLike(ObjectFieldSelector item){
            return withNewFieldRefLike(getFieldRef() != null ? getFieldRef(): item);
    }

    public Integer getMode(){
            return this.mode;
    }

    public A withMode(Integer mode){
            this.mode=mode; return (A) this;
    }

    public Boolean hasMode(){
            return this.mode != null;
    }

    public String getPath(){
            return this.path;
    }

    public A withPath(String path){
            this.path=path; return (A) this;
    }

    public Boolean hasPath(){
            return this.path != null;
    }

    
/**
 * This method has been deprecated, please use method buildResourceFieldRef instead.
 * @return The buildable object.
 */
@Deprecated public ResourceFieldSelector getResourceFieldRef(){
            return this.resourceFieldRef!=null?this.resourceFieldRef.build():null;
    }

    public ResourceFieldSelector buildResourceFieldRef(){
            return this.resourceFieldRef!=null?this.resourceFieldRef.build():null;
    }

    public A withResourceFieldRef(ResourceFieldSelector resourceFieldRef){
            _visitables.remove(this.resourceFieldRef);
            if (resourceFieldRef!=null){ this.resourceFieldRef= new ResourceFieldSelectorBuilder(resourceFieldRef); _visitables.add(this.resourceFieldRef);} return (A) this;
    }

    public Boolean hasResourceFieldRef(){
            return this.resourceFieldRef != null;
    }

    public DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> withNewResourceFieldRef(){
            return new ResourceFieldRefNestedImpl();
    }

    public DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> withNewResourceFieldRefLike(ResourceFieldSelector item){
            return new ResourceFieldRefNestedImpl(item);
    }

    public DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editResourceFieldRef(){
            return withNewResourceFieldRefLike(getResourceFieldRef());
    }

    public DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRef(){
            return withNewResourceFieldRefLike(getResourceFieldRef() != null ? getResourceFieldRef(): new ResourceFieldSelectorBuilder().build());
    }

    public DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(ResourceFieldSelector item){
            return withNewResourceFieldRefLike(getResourceFieldRef() != null ? getResourceFieldRef(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DownwardAPIVolumeFileFluentImpl that = (DownwardAPIVolumeFileFluentImpl) o;
            if (fieldRef != null ? !fieldRef.equals(that.fieldRef) :that.fieldRef != null) return false;
            if (mode != null ? !mode.equals(that.mode) :that.mode != null) return false;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            if (resourceFieldRef != null ? !resourceFieldRef.equals(that.resourceFieldRef) :that.resourceFieldRef != null) return false;
            return true;
    }


    public class FieldRefNestedImpl<N> extends ObjectFieldSelectorFluentImpl<DownwardAPIVolumeFileFluent.FieldRefNested<N>> implements DownwardAPIVolumeFileFluent.FieldRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectFieldSelectorBuilder builder;
    
            FieldRefNestedImpl(ObjectFieldSelector item){
                    this.builder = new ObjectFieldSelectorBuilder(this, item);
            }
            FieldRefNestedImpl(){
                    this.builder = new ObjectFieldSelectorBuilder(this);
            }
    
    public N and(){
            return (N) DownwardAPIVolumeFileFluentImpl.this.withFieldRef(builder.build());
    }
    public N endFieldRef(){
            return and();
    }

}
    public class ResourceFieldRefNestedImpl<N> extends ResourceFieldSelectorFluentImpl<DownwardAPIVolumeFileFluent.ResourceFieldRefNested<N>> implements DownwardAPIVolumeFileFluent.ResourceFieldRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceFieldSelectorBuilder builder;
    
            ResourceFieldRefNestedImpl(ResourceFieldSelector item){
                    this.builder = new ResourceFieldSelectorBuilder(this, item);
            }
            ResourceFieldRefNestedImpl(){
                    this.builder = new ResourceFieldSelectorBuilder(this);
            }
    
    public N and(){
            return (N) DownwardAPIVolumeFileFluentImpl.this.withResourceFieldRef(builder.build());
    }
    public N endResourceFieldRef(){
            return and();
    }

}


}
