package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.EnvVarFluent;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.EnvVarBuilder;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.EnvVar;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface DockerStrategyOptionsFluent<A extends DockerStrategyOptionsFluent<A>> extends Fluent<A>{


    public A addToBuildArgs(int index,EnvVar item);
    public A setToBuildArgs(int index,EnvVar item);
    public A addToBuildArgs(EnvVar... items);
    public A addAllToBuildArgs(Collection<EnvVar> items);
    public A removeFromBuildArgs(EnvVar... items);
    public A removeAllFromBuildArgs(Collection<EnvVar> items);
    
/**
 * This method has been deprecated, please use method buildBuildArgs instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getBuildArgs();
    public List<EnvVar> buildBuildArgs();
    public EnvVar buildBuildArg(int index);
    public EnvVar buildFirstBuildArg();
    public EnvVar buildLastBuildArg();
    public EnvVar buildMatchingBuildArg(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public A withBuildArgs(List<EnvVar> buildArgs);
    public A withBuildArgs(EnvVar... buildArgs);
    public Boolean hasBuildArgs();
    public DockerStrategyOptionsFluent.BuildArgsNested<A> addNewBuildArg();
    public DockerStrategyOptionsFluent.BuildArgsNested<A> addNewBuildArgLike(EnvVar item);
    public DockerStrategyOptionsFluent.BuildArgsNested<A> setNewBuildArgLike(int index,EnvVar item);
    public DockerStrategyOptionsFluent.BuildArgsNested<A> editBuildArg(int index);
    public DockerStrategyOptionsFluent.BuildArgsNested<A> editFirstBuildArg();
    public DockerStrategyOptionsFluent.BuildArgsNested<A> editLastBuildArg();
    public DockerStrategyOptionsFluent.BuildArgsNested<A> editMatchingBuildArg(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public Boolean isNoCache();
    public A withNoCache(Boolean noCache);
    public Boolean hasNoCache();
    public A withNewNoCache(String arg1);
    public A withNewNoCache(boolean arg1);

    public interface BuildArgsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarFluent<DockerStrategyOptionsFluent.BuildArgsNested<N>>{

        
    public N and();    public N endBuildArg();
}


}
