package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface LimitRangeFluent<A extends LimitRangeFluent<A>> extends Fluent<A>{


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
    public LimitRangeFluent.MetadataNested<A> withNewMetadata();
    public LimitRangeFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public LimitRangeFluent.MetadataNested<A> editMetadata();
    public LimitRangeFluent.MetadataNested<A> editOrNewMetadata();
    public LimitRangeFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public LimitRangeSpec getSpec();
    public LimitRangeSpec buildSpec();
    public A withSpec(LimitRangeSpec spec);
    public Boolean hasSpec();
    public LimitRangeFluent.SpecNested<A> withNewSpec();
    public LimitRangeFluent.SpecNested<A> withNewSpecLike(LimitRangeSpec item);
    public LimitRangeFluent.SpecNested<A> editSpec();
    public LimitRangeFluent.SpecNested<A> editOrNewSpec();
    public LimitRangeFluent.SpecNested<A> editOrNewSpecLike(LimitRangeSpec item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<LimitRangeFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeSpecFluent<LimitRangeFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}


}
