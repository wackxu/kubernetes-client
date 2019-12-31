package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface NamedClusterFluent<A extends NamedClusterFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildCluster instead.
 * @return The buildable object.
 */
@Deprecated public Cluster getCluster();
    public Cluster buildCluster();
    public A withCluster(Cluster cluster);
    public Boolean hasCluster();
    public NamedClusterFluent.ClusterNested<A> withNewCluster();
    public NamedClusterFluent.ClusterNested<A> withNewClusterLike(Cluster item);
    public NamedClusterFluent.ClusterNested<A> editCluster();
    public NamedClusterFluent.ClusterNested<A> editOrNewCluster();
    public NamedClusterFluent.ClusterNested<A> editOrNewClusterLike(Cluster item);
    public String getName();
    public A withName(String name);
    public Boolean hasName();

    public interface ClusterNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterFluent<NamedClusterFluent.ClusterNested<N>>{

        
    public N and();    public N endCluster();
}


}
