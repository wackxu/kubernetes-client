package io.fabric8.kubernetes.api.model.apiextensions;

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

public interface CustomResourceSubresourcesFluent<A extends CustomResourceSubresourcesFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildScale instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceSubresourceScale getScale();
    public CustomResourceSubresourceScale buildScale();
    public A withScale(CustomResourceSubresourceScale scale);
    public Boolean hasScale();
    public A withNewScale(String labelSelectorPath,String specReplicasPath,String statusReplicasPath);
    public CustomResourceSubresourcesFluent.ScaleNested<A> withNewScale();
    public CustomResourceSubresourcesFluent.ScaleNested<A> withNewScaleLike(CustomResourceSubresourceScale item);
    public CustomResourceSubresourcesFluent.ScaleNested<A> editScale();
    public CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScale();
    public CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScaleLike(CustomResourceSubresourceScale item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceSubresourceStatus getStatus();
    public CustomResourceSubresourceStatus buildStatus();
    public A withStatus(CustomResourceSubresourceStatus status);
    public Boolean hasStatus();
    public CustomResourceSubresourcesFluent.StatusNested<A> withNewStatus();
    public CustomResourceSubresourcesFluent.StatusNested<A> withNewStatusLike(CustomResourceSubresourceStatus item);
    public CustomResourceSubresourcesFluent.StatusNested<A> editStatus();
    public CustomResourceSubresourcesFluent.StatusNested<A> editOrNewStatus();
    public CustomResourceSubresourcesFluent.StatusNested<A> editOrNewStatusLike(CustomResourceSubresourceStatus item);

    public interface ScaleNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceSubresourceScaleFluent<CustomResourceSubresourcesFluent.ScaleNested<N>>{

        
    public N and();    public N endScale();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceSubresourceStatusFluent<CustomResourceSubresourcesFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
