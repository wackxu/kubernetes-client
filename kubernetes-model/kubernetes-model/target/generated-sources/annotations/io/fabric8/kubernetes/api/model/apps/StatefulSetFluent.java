package io.fabric8.kubernetes.api.model.apps;

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

public interface StatefulSetFluent<A extends StatefulSetFluent<A>> extends Fluent<A>{


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
    public StatefulSetFluent.MetadataNested<A> withNewMetadata();
    public StatefulSetFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public StatefulSetFluent.MetadataNested<A> editMetadata();
    public StatefulSetFluent.MetadataNested<A> editOrNewMetadata();
    public StatefulSetFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public StatefulSetSpec getSpec();
    public StatefulSetSpec buildSpec();
    public A withSpec(StatefulSetSpec spec);
    public Boolean hasSpec();
    public StatefulSetFluent.SpecNested<A> withNewSpec();
    public StatefulSetFluent.SpecNested<A> withNewSpecLike(StatefulSetSpec item);
    public StatefulSetFluent.SpecNested<A> editSpec();
    public StatefulSetFluent.SpecNested<A> editOrNewSpec();
    public StatefulSetFluent.SpecNested<A> editOrNewSpecLike(StatefulSetSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public StatefulSetStatus getStatus();
    public StatefulSetStatus buildStatus();
    public A withStatus(StatefulSetStatus status);
    public Boolean hasStatus();
    public StatefulSetFluent.StatusNested<A> withNewStatus();
    public StatefulSetFluent.StatusNested<A> withNewStatusLike(StatefulSetStatus item);
    public StatefulSetFluent.StatusNested<A> editStatus();
    public StatefulSetFluent.StatusNested<A> editOrNewStatus();
    public StatefulSetFluent.StatusNested<A> editOrNewStatusLike(StatefulSetStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<StatefulSetFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetSpecFluent<StatefulSetFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetStatusFluent<StatefulSetFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
