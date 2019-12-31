package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class NamedClusterFluentImpl<A extends NamedClusterFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NamedClusterFluent<A>{

    private ClusterBuilder cluster;
    private String name;

    public NamedClusterFluentImpl(){
    }
    public NamedClusterFluentImpl(NamedCluster instance){
            this.withCluster(instance.getCluster()); 
            this.withName(instance.getName()); 
    }

    
/**
 * This method has been deprecated, please use method buildCluster instead.
 * @return The buildable object.
 */
@Deprecated public Cluster getCluster(){
            return this.cluster!=null?this.cluster.build():null;
    }

    public Cluster buildCluster(){
            return this.cluster!=null?this.cluster.build():null;
    }

    public A withCluster(Cluster cluster){
            _visitables.remove(this.cluster);
            if (cluster!=null){ this.cluster= new ClusterBuilder(cluster); _visitables.add(this.cluster);} return (A) this;
    }

    public Boolean hasCluster(){
            return this.cluster != null;
    }

    public NamedClusterFluent.ClusterNested<A> withNewCluster(){
            return new ClusterNestedImpl();
    }

    public NamedClusterFluent.ClusterNested<A> withNewClusterLike(Cluster item){
            return new ClusterNestedImpl(item);
    }

    public NamedClusterFluent.ClusterNested<A> editCluster(){
            return withNewClusterLike(getCluster());
    }

    public NamedClusterFluent.ClusterNested<A> editOrNewCluster(){
            return withNewClusterLike(getCluster() != null ? getCluster(): new ClusterBuilder().build());
    }

    public NamedClusterFluent.ClusterNested<A> editOrNewClusterLike(Cluster item){
            return withNewClusterLike(getCluster() != null ? getCluster(): item);
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamedClusterFluentImpl that = (NamedClusterFluentImpl) o;
            if (cluster != null ? !cluster.equals(that.cluster) :that.cluster != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            return true;
    }


    public class ClusterNestedImpl<N> extends ClusterFluentImpl<NamedClusterFluent.ClusterNested<N>> implements NamedClusterFluent.ClusterNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterBuilder builder;
    
            ClusterNestedImpl(Cluster item){
                    this.builder = new ClusterBuilder(this, item);
            }
            ClusterNestedImpl(){
                    this.builder = new ClusterBuilder(this);
            }
    
    public N and(){
            return (N) NamedClusterFluentImpl.this.withCluster(builder.build());
    }
    public N endCluster(){
            return and();
    }

}


}
