package io.fabric8.kubernetes.api.model.batch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface JobFluent<A extends JobFluent<A>> extends Fluent<A>{


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
    public JobFluent.MetadataNested<A> withNewMetadata();
    public JobFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public JobFluent.MetadataNested<A> editMetadata();
    public JobFluent.MetadataNested<A> editOrNewMetadata();
    public JobFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public JobSpec getSpec();
    public JobSpec buildSpec();
    public A withSpec(JobSpec spec);
    public Boolean hasSpec();
    public JobFluent.SpecNested<A> withNewSpec();
    public JobFluent.SpecNested<A> withNewSpecLike(JobSpec item);
    public JobFluent.SpecNested<A> editSpec();
    public JobFluent.SpecNested<A> editOrNewSpec();
    public JobFluent.SpecNested<A> editOrNewSpecLike(JobSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public JobStatus getStatus();
    public JobStatus buildStatus();
    public A withStatus(JobStatus status);
    public Boolean hasStatus();
    public JobFluent.StatusNested<A> withNewStatus();
    public JobFluent.StatusNested<A> withNewStatusLike(JobStatus item);
    public JobFluent.StatusNested<A> editStatus();
    public JobFluent.StatusNested<A> editOrNewStatus();
    public JobFluent.StatusNested<A> editOrNewStatusLike(JobStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<JobFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobSpecFluent<JobFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobStatusFluent<JobFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
