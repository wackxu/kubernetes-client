package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface StatusFluent<A extends StatusFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public Integer getCode();
    public A withCode(Integer code);
    public Boolean hasCode();
    
/**
 * This method has been deprecated, please use method buildDetails instead.
 * @return The buildable object.
 */
@Deprecated public StatusDetails getDetails();
    public StatusDetails buildDetails();
    public A withDetails(StatusDetails details);
    public Boolean hasDetails();
    public StatusFluent.DetailsNested<A> withNewDetails();
    public StatusFluent.DetailsNested<A> withNewDetailsLike(StatusDetails item);
    public StatusFluent.DetailsNested<A> editDetails();
    public StatusFluent.DetailsNested<A> editOrNewDetails();
    public StatusFluent.DetailsNested<A> editOrNewDetailsLike(StatusDetails item);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public String getMessage();
    public A withMessage(String message);
    public Boolean hasMessage();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ListMeta getMetadata();
    public ListMeta buildMetadata();
    public A withMetadata(ListMeta metadata);
    public Boolean hasMetadata();
    public A withNewMetadata(String _continue,String resourceVersion,String selfLink);
    public StatusFluent.MetadataNested<A> withNewMetadata();
    public StatusFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public StatusFluent.MetadataNested<A> editMetadata();
    public StatusFluent.MetadataNested<A> editOrNewMetadata();
    public StatusFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);
    public String getReason();
    public A withReason(String reason);
    public Boolean hasReason();
    public String getStatus();
    public A withStatus(String status);
    public Boolean hasStatus();

    public interface DetailsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatusDetailsFluent<StatusFluent.DetailsNested<N>>{

        
    public N and();    public N endDetails();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<StatusFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
