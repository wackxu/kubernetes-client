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

public interface JenkinsPipelineBuildStrategyFluent<A extends JenkinsPipelineBuildStrategyFluent<A>> extends Fluent<A>{


    public A addToEnv(int index,EnvVar item);
    public A setToEnv(int index,EnvVar item);
    public A addToEnv(EnvVar... items);
    public A addAllToEnv(Collection<EnvVar> items);
    public A removeFromEnv(EnvVar... items);
    public A removeAllFromEnv(Collection<EnvVar> items);
    
/**
 * This method has been deprecated, please use method buildEnv instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getEnv();
    public List<EnvVar> buildEnv();
    public EnvVar buildEnv(int index);
    public EnvVar buildFirstEnv();
    public EnvVar buildLastEnv();
    public EnvVar buildMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public A withEnv(List<EnvVar> env);
    public A withEnv(EnvVar... env);
    public Boolean hasEnv();
    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> addNewEnv();
    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> addNewEnvLike(EnvVar item);
    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item);
    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> editEnv(int index);
    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> editFirstEnv();
    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> editLastEnv();
    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public String getJenkinsfile();
    public A withJenkinsfile(String jenkinsfile);
    public Boolean hasJenkinsfile();
    public String getJenkinsfilePath();
    public A withJenkinsfilePath(String jenkinsfilePath);
    public Boolean hasJenkinsfilePath();

    public interface EnvNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarFluent<JenkinsPipelineBuildStrategyFluent.EnvNested<N>>{

        
    public N and();    public N endEnv();
}


}
