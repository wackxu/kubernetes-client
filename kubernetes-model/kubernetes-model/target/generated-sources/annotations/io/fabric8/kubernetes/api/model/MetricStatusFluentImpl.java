package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;

public class MetricStatusFluentImpl<A extends MetricStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements MetricStatusFluent<A>{

    private ExternalMetricStatusBuilder external;
    private ObjectMetricStatusBuilder object;
    private PodsMetricStatusBuilder pods;
    private ResourceMetricStatusBuilder resource;
    private String type;

    public MetricStatusFluentImpl(){
    }
    public MetricStatusFluentImpl(MetricStatus instance){
            this.withExternal(instance.getExternal()); 
            this.withObject(instance.getObject()); 
            this.withPods(instance.getPods()); 
            this.withResource(instance.getResource()); 
            this.withType(instance.getType()); 
    }

    
/**
 * This method has been deprecated, please use method buildExternal instead.
 * @return The buildable object.
 */
@Deprecated public ExternalMetricStatus getExternal(){
            return this.external!=null?this.external.build():null;
    }

    public ExternalMetricStatus buildExternal(){
            return this.external!=null?this.external.build():null;
    }

    public A withExternal(ExternalMetricStatus external){
            _visitables.remove(this.external);
            if (external!=null){ this.external= new ExternalMetricStatusBuilder(external); _visitables.add(this.external);} return (A) this;
    }

    public Boolean hasExternal(){
            return this.external != null;
    }

    public MetricStatusFluent.ExternalNested<A> withNewExternal(){
            return new ExternalNestedImpl();
    }

    public MetricStatusFluent.ExternalNested<A> withNewExternalLike(ExternalMetricStatus item){
            return new ExternalNestedImpl(item);
    }

    public MetricStatusFluent.ExternalNested<A> editExternal(){
            return withNewExternalLike(getExternal());
    }

    public MetricStatusFluent.ExternalNested<A> editOrNewExternal(){
            return withNewExternalLike(getExternal() != null ? getExternal(): new ExternalMetricStatusBuilder().build());
    }

    public MetricStatusFluent.ExternalNested<A> editOrNewExternalLike(ExternalMetricStatus item){
            return withNewExternalLike(getExternal() != null ? getExternal(): item);
    }

    
/**
 * This method has been deprecated, please use method buildObject instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMetricStatus getObject(){
            return this.object!=null?this.object.build():null;
    }

    public ObjectMetricStatus buildObject(){
            return this.object!=null?this.object.build():null;
    }

    public A withObject(ObjectMetricStatus object){
            _visitables.remove(this.object);
            if (object!=null){ this.object= new ObjectMetricStatusBuilder(object); _visitables.add(this.object);} return (A) this;
    }

    public Boolean hasObject(){
            return this.object != null;
    }

    public MetricStatusFluent.ObjectNested<A> withNewObject(){
            return new ObjectNestedImpl();
    }

    public MetricStatusFluent.ObjectNested<A> withNewObjectLike(ObjectMetricStatus item){
            return new ObjectNestedImpl(item);
    }

    public MetricStatusFluent.ObjectNested<A> editObject(){
            return withNewObjectLike(getObject());
    }

    public MetricStatusFluent.ObjectNested<A> editOrNewObject(){
            return withNewObjectLike(getObject() != null ? getObject(): new ObjectMetricStatusBuilder().build());
    }

    public MetricStatusFluent.ObjectNested<A> editOrNewObjectLike(ObjectMetricStatus item){
            return withNewObjectLike(getObject() != null ? getObject(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPods instead.
 * @return The buildable object.
 */
@Deprecated public PodsMetricStatus getPods(){
            return this.pods!=null?this.pods.build():null;
    }

    public PodsMetricStatus buildPods(){
            return this.pods!=null?this.pods.build():null;
    }

    public A withPods(PodsMetricStatus pods){
            _visitables.remove(this.pods);
            if (pods!=null){ this.pods= new PodsMetricStatusBuilder(pods); _visitables.add(this.pods);} return (A) this;
    }

    public Boolean hasPods(){
            return this.pods != null;
    }

    public MetricStatusFluent.PodsNested<A> withNewPods(){
            return new PodsNestedImpl();
    }

    public MetricStatusFluent.PodsNested<A> withNewPodsLike(PodsMetricStatus item){
            return new PodsNestedImpl(item);
    }

    public MetricStatusFluent.PodsNested<A> editPods(){
            return withNewPodsLike(getPods());
    }

    public MetricStatusFluent.PodsNested<A> editOrNewPods(){
            return withNewPodsLike(getPods() != null ? getPods(): new PodsMetricStatusBuilder().build());
    }

    public MetricStatusFluent.PodsNested<A> editOrNewPodsLike(PodsMetricStatus item){
            return withNewPodsLike(getPods() != null ? getPods(): item);
    }

    
/**
 * This method has been deprecated, please use method buildResource instead.
 * @return The buildable object.
 */
@Deprecated public ResourceMetricStatus getResource(){
            return this.resource!=null?this.resource.build():null;
    }

    public ResourceMetricStatus buildResource(){
            return this.resource!=null?this.resource.build():null;
    }

    public A withResource(ResourceMetricStatus resource){
            _visitables.remove(this.resource);
            if (resource!=null){ this.resource= new ResourceMetricStatusBuilder(resource); _visitables.add(this.resource);} return (A) this;
    }

    public Boolean hasResource(){
            return this.resource != null;
    }

    public MetricStatusFluent.ResourceNested<A> withNewResource(){
            return new ResourceNestedImpl();
    }

    public MetricStatusFluent.ResourceNested<A> withNewResourceLike(ResourceMetricStatus item){
            return new ResourceNestedImpl(item);
    }

    public MetricStatusFluent.ResourceNested<A> editResource(){
            return withNewResourceLike(getResource());
    }

    public MetricStatusFluent.ResourceNested<A> editOrNewResource(){
            return withNewResourceLike(getResource() != null ? getResource(): new ResourceMetricStatusBuilder().build());
    }

    public MetricStatusFluent.ResourceNested<A> editOrNewResourceLike(ResourceMetricStatus item){
            return withNewResourceLike(getResource() != null ? getResource(): item);
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            MetricStatusFluentImpl that = (MetricStatusFluentImpl) o;
            if (external != null ? !external.equals(that.external) :that.external != null) return false;
            if (object != null ? !object.equals(that.object) :that.object != null) return false;
            if (pods != null ? !pods.equals(that.pods) :that.pods != null) return false;
            if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class ExternalNestedImpl<N> extends ExternalMetricStatusFluentImpl<MetricStatusFluent.ExternalNested<N>> implements MetricStatusFluent.ExternalNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExternalMetricStatusBuilder builder;
    
            ExternalNestedImpl(ExternalMetricStatus item){
                    this.builder = new ExternalMetricStatusBuilder(this, item);
            }
            ExternalNestedImpl(){
                    this.builder = new ExternalMetricStatusBuilder(this);
            }
    
    public N and(){
            return (N) MetricStatusFluentImpl.this.withExternal(builder.build());
    }
    public N endExternal(){
            return and();
    }

}
    public class ObjectNestedImpl<N> extends ObjectMetricStatusFluentImpl<MetricStatusFluent.ObjectNested<N>> implements MetricStatusFluent.ObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetricStatusBuilder builder;
    
            ObjectNestedImpl(ObjectMetricStatus item){
                    this.builder = new ObjectMetricStatusBuilder(this, item);
            }
            ObjectNestedImpl(){
                    this.builder = new ObjectMetricStatusBuilder(this);
            }
    
    public N and(){
            return (N) MetricStatusFluentImpl.this.withObject(builder.build());
    }
    public N endObject(){
            return and();
    }

}
    public class PodsNestedImpl<N> extends PodsMetricStatusFluentImpl<MetricStatusFluent.PodsNested<N>> implements MetricStatusFluent.PodsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodsMetricStatusBuilder builder;
    
            PodsNestedImpl(PodsMetricStatus item){
                    this.builder = new PodsMetricStatusBuilder(this, item);
            }
            PodsNestedImpl(){
                    this.builder = new PodsMetricStatusBuilder(this);
            }
    
    public N and(){
            return (N) MetricStatusFluentImpl.this.withPods(builder.build());
    }
    public N endPods(){
            return and();
    }

}
    public class ResourceNestedImpl<N> extends ResourceMetricStatusFluentImpl<MetricStatusFluent.ResourceNested<N>> implements MetricStatusFluent.ResourceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceMetricStatusBuilder builder;
    
            ResourceNestedImpl(ResourceMetricStatus item){
                    this.builder = new ResourceMetricStatusBuilder(this, item);
            }
            ResourceNestedImpl(){
                    this.builder = new ResourceMetricStatusBuilder(this);
            }
    
    public N and(){
            return (N) MetricStatusFluentImpl.this.withResource(builder.build());
    }
    public N endResource(){
            return and();
    }

}


}
