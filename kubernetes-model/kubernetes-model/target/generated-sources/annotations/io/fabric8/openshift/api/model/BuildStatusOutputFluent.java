package io.fabric8.openshift.api.model;

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

public interface BuildStatusOutputFluent<A extends BuildStatusOutputFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildTo instead.
 * @return The buildable object.
 */
@Deprecated public BuildStatusOutputTo getTo();
    public BuildStatusOutputTo buildTo();
    public A withTo(BuildStatusOutputTo to);
    public Boolean hasTo();
    public A withNewTo(String imageDigest);
    public BuildStatusOutputFluent.ToNested<A> withNewTo();
    public BuildStatusOutputFluent.ToNested<A> withNewToLike(BuildStatusOutputTo item);
    public BuildStatusOutputFluent.ToNested<A> editTo();
    public BuildStatusOutputFluent.ToNested<A> editOrNewTo();
    public BuildStatusOutputFluent.ToNested<A> editOrNewToLike(BuildStatusOutputTo item);

    public interface ToNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildStatusOutputToFluent<BuildStatusOutputFluent.ToNested<N>>{

        
    public N and();    public N endTo();
}


}
