package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;

public class MetricSpecFluentImpl<A extends MetricSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements MetricSpecFluent<A>{

    private ExternalMetricSourceBuilder external;
    private ObjectMetricSourceBuilder object;
    private PodsMetricSourceBuilder pods;
    private ResourceMetricSourceBuilder resource;
    private String type;

    public MetricSpecFluentImpl(){
    }
    public MetricSpecFluentImpl(MetricSpec instance){
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
@Deprecated public ExternalMetricSource getExternal(){
            return this.external!=null?this.external.build():null;
    }

    public ExternalMetricSource buildExternal(){
            return this.external!=null?this.external.build():null;
    }

    public A withExternal(ExternalMetricSource external){
            _visitables.remove(this.external);
            if (external!=null){ this.external= new ExternalMetricSourceBuilder(external); _visitables.add(this.external);} return (A) this;
    }

    public Boolean hasExternal(){
            return this.external != null;
    }

    public MetricSpecFluent.ExternalNested<A> withNewExternal(){
            return new ExternalNestedImpl();
    }

    public MetricSpecFluent.ExternalNested<A> withNewExternalLike(ExternalMetricSource item){
            return new ExternalNestedImpl(item);
    }

    public MetricSpecFluent.ExternalNested<A> editExternal(){
            return withNewExternalLike(getExternal());
    }

    public MetricSpecFluent.ExternalNested<A> editOrNewExternal(){
            return withNewExternalLike(getExternal() != null ? getExternal(): new ExternalMetricSourceBuilder().build());
    }

    public MetricSpecFluent.ExternalNested<A> editOrNewExternalLike(ExternalMetricSource item){
            return withNewExternalLike(getExternal() != null ? getExternal(): item);
    }

    
/**
 * This method has been deprecated, please use method buildObject instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMetricSource getObject(){
            return this.object!=null?this.object.build():null;
    }

    public ObjectMetricSource buildObject(){
            return this.object!=null?this.object.build():null;
    }

    public A withObject(ObjectMetricSource object){
            _visitables.remove(this.object);
            if (object!=null){ this.object= new ObjectMetricSourceBuilder(object); _visitables.add(this.object);} return (A) this;
    }

    public Boolean hasObject(){
            return this.object != null;
    }

    public MetricSpecFluent.ObjectNested<A> withNewObject(){
            return new ObjectNestedImpl();
    }

    public MetricSpecFluent.ObjectNested<A> withNewObjectLike(ObjectMetricSource item){
            return new ObjectNestedImpl(item);
    }

    public MetricSpecFluent.ObjectNested<A> editObject(){
            return withNewObjectLike(getObject());
    }

    public MetricSpecFluent.ObjectNested<A> editOrNewObject(){
            return withNewObjectLike(getObject() != null ? getObject(): new ObjectMetricSourceBuilder().build());
    }

    public MetricSpecFluent.ObjectNested<A> editOrNewObjectLike(ObjectMetricSource item){
            return withNewObjectLike(getObject() != null ? getObject(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPods instead.
 * @return The buildable object.
 */
@Deprecated public PodsMetricSource getPods(){
            return this.pods!=null?this.pods.build():null;
    }

    public PodsMetricSource buildPods(){
            return this.pods!=null?this.pods.build():null;
    }

    public A withPods(PodsMetricSource pods){
            _visitables.remove(this.pods);
            if (pods!=null){ this.pods= new PodsMetricSourceBuilder(pods); _visitables.add(this.pods);} return (A) this;
    }

    public Boolean hasPods(){
            return this.pods != null;
    }

    public MetricSpecFluent.PodsNested<A> withNewPods(){
            return new PodsNestedImpl();
    }

    public MetricSpecFluent.PodsNested<A> withNewPodsLike(PodsMetricSource item){
            return new PodsNestedImpl(item);
    }

    public MetricSpecFluent.PodsNested<A> editPods(){
            return withNewPodsLike(getPods());
    }

    public MetricSpecFluent.PodsNested<A> editOrNewPods(){
            return withNewPodsLike(getPods() != null ? getPods(): new PodsMetricSourceBuilder().build());
    }

    public MetricSpecFluent.PodsNested<A> editOrNewPodsLike(PodsMetricSource item){
            return withNewPodsLike(getPods() != null ? getPods(): item);
    }

    
/**
 * This method has been deprecated, please use method buildResource instead.
 * @return The buildable object.
 */
@Deprecated public ResourceMetricSource getResource(){
            return this.resource!=null?this.resource.build():null;
    }

    public ResourceMetricSource buildResource(){
            return this.resource!=null?this.resource.build():null;
    }

    public A withResource(ResourceMetricSource resource){
            _visitables.remove(this.resource);
            if (resource!=null){ this.resource= new ResourceMetricSourceBuilder(resource); _visitables.add(this.resource);} return (A) this;
    }

    public Boolean hasResource(){
            return this.resource != null;
    }

    public MetricSpecFluent.ResourceNested<A> withNewResource(){
            return new ResourceNestedImpl();
    }

    public MetricSpecFluent.ResourceNested<A> withNewResourceLike(ResourceMetricSource item){
            return new ResourceNestedImpl(item);
    }

    public MetricSpecFluent.ResourceNested<A> editResource(){
            return withNewResourceLike(getResource());
    }

    public MetricSpecFluent.ResourceNested<A> editOrNewResource(){
            return withNewResourceLike(getResource() != null ? getResource(): new ResourceMetricSourceBuilder().build());
    }

    public MetricSpecFluent.ResourceNested<A> editOrNewResourceLike(ResourceMetricSource item){
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
            MetricSpecFluentImpl that = (MetricSpecFluentImpl) o;
            if (external != null ? !external.equals(that.external) :that.external != null) return false;
            if (object != null ? !object.equals(that.object) :that.object != null) return false;
            if (pods != null ? !pods.equals(that.pods) :that.pods != null) return false;
            if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class ExternalNestedImpl<N> extends ExternalMetricSourceFluentImpl<MetricSpecFluent.ExternalNested<N>> implements MetricSpecFluent.ExternalNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExternalMetricSourceBuilder builder;
    
            ExternalNestedImpl(ExternalMetricSource item){
                    this.builder = new ExternalMetricSourceBuilder(this, item);
            }
            ExternalNestedImpl(){
                    this.builder = new ExternalMetricSourceBuilder(this);
            }
    
    public N and(){
            return (N) MetricSpecFluentImpl.this.withExternal(builder.build());
    }
    public N endExternal(){
            return and();
    }

}
    public class ObjectNestedImpl<N> extends ObjectMetricSourceFluentImpl<MetricSpecFluent.ObjectNested<N>> implements MetricSpecFluent.ObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetricSourceBuilder builder;
    
            ObjectNestedImpl(ObjectMetricSource item){
                    this.builder = new ObjectMetricSourceBuilder(this, item);
            }
            ObjectNestedImpl(){
                    this.builder = new ObjectMetricSourceBuilder(this);
            }
    
    public N and(){
            return (N) MetricSpecFluentImpl.this.withObject(builder.build());
    }
    public N endObject(){
            return and();
    }

}
    public class PodsNestedImpl<N> extends PodsMetricSourceFluentImpl<MetricSpecFluent.PodsNested<N>> implements MetricSpecFluent.PodsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodsMetricSourceBuilder builder;
    
            PodsNestedImpl(PodsMetricSource item){
                    this.builder = new PodsMetricSourceBuilder(this, item);
            }
            PodsNestedImpl(){
                    this.builder = new PodsMetricSourceBuilder(this);
            }
    
    public N and(){
            return (N) MetricSpecFluentImpl.this.withPods(builder.build());
    }
    public N endPods(){
            return and();
    }

}
    public class ResourceNestedImpl<N> extends ResourceMetricSourceFluentImpl<MetricSpecFluent.ResourceNested<N>> implements MetricSpecFluent.ResourceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceMetricSourceBuilder builder;
    
            ResourceNestedImpl(ResourceMetricSource item){
                    this.builder = new ResourceMetricSourceBuilder(this, item);
            }
            ResourceNestedImpl(){
                    this.builder = new ResourceMetricSourceBuilder(this);
            }
    
    public N and(){
            return (N) MetricSpecFluentImpl.this.withResource(builder.build());
    }
    public N endResource(){
            return and();
    }

}


}
