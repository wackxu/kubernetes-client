package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface JobTemplateSpecFluent<A extends JobTemplateSpecFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public JobTemplateSpecFluent.MetadataNested<A> withNewMetadata();
    public JobTemplateSpecFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public JobTemplateSpecFluent.MetadataNested<A> editMetadata();
    public JobTemplateSpecFluent.MetadataNested<A> editOrNewMetadata();
    public JobTemplateSpecFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public JobSpec getSpec();
    public JobSpec buildSpec();
    public A withSpec(JobSpec spec);
    public Boolean hasSpec();
    public JobTemplateSpecFluent.SpecNested<A> withNewSpec();
    public JobTemplateSpecFluent.SpecNested<A> withNewSpecLike(JobSpec item);
    public JobTemplateSpecFluent.SpecNested<A> editSpec();
    public JobTemplateSpecFluent.SpecNested<A> editOrNewSpec();
    public JobTemplateSpecFluent.SpecNested<A> editOrNewSpecLike(JobSpec item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<JobTemplateSpecFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobSpecFluent<JobTemplateSpecFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}


}
