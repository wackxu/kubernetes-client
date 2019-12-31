package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class JobTemplateSpecFluentImpl<A extends JobTemplateSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements JobTemplateSpecFluent<A>{

    private ObjectMetaBuilder metadata;
    private JobSpecBuilder spec;

    public JobTemplateSpecFluentImpl(){
    }
    public JobTemplateSpecFluentImpl(JobTemplateSpec instance){
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
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

    public JobTemplateSpecFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public JobTemplateSpecFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public JobTemplateSpecFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public JobTemplateSpecFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public JobTemplateSpecFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public JobSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public JobSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(JobSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new JobSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public JobTemplateSpecFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public JobTemplateSpecFluent.SpecNested<A> withNewSpecLike(JobSpec item){
            return new SpecNestedImpl(item);
    }

    public JobTemplateSpecFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public JobTemplateSpecFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new JobSpecBuilder().build());
    }

    public JobTemplateSpecFluent.SpecNested<A> editOrNewSpecLike(JobSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JobTemplateSpecFluentImpl that = (JobTemplateSpecFluentImpl) o;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<JobTemplateSpecFluent.MetadataNested<N>> implements JobTemplateSpecFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) JobTemplateSpecFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends JobSpecFluentImpl<JobTemplateSpecFluent.SpecNested<N>> implements JobTemplateSpecFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobSpecBuilder builder;
    
            SpecNestedImpl(JobSpec item){
                    this.builder = new JobSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new JobSpecBuilder(this);
            }
    
    public N and(){
            return (N) JobTemplateSpecFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}


}
