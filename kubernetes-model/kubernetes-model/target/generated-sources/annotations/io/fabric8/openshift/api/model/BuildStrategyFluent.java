package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface BuildStrategyFluent<A extends BuildStrategyFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildCustomStrategy instead.
 * @return The buildable object.
 */
@Deprecated public CustomBuildStrategy getCustomStrategy();
    public CustomBuildStrategy buildCustomStrategy();
    public A withCustomStrategy(CustomBuildStrategy customStrategy);
    public Boolean hasCustomStrategy();
    public BuildStrategyFluent.CustomStrategyNested<A> withNewCustomStrategy();
    public BuildStrategyFluent.CustomStrategyNested<A> withNewCustomStrategyLike(CustomBuildStrategy item);
    public BuildStrategyFluent.CustomStrategyNested<A> editCustomStrategy();
    public BuildStrategyFluent.CustomStrategyNested<A> editOrNewCustomStrategy();
    public BuildStrategyFluent.CustomStrategyNested<A> editOrNewCustomStrategyLike(CustomBuildStrategy item);
    
/**
 * This method has been deprecated, please use method buildDockerStrategy instead.
 * @return The buildable object.
 */
@Deprecated public DockerBuildStrategy getDockerStrategy();
    public DockerBuildStrategy buildDockerStrategy();
    public A withDockerStrategy(DockerBuildStrategy dockerStrategy);
    public Boolean hasDockerStrategy();
    public BuildStrategyFluent.DockerStrategyNested<A> withNewDockerStrategy();
    public BuildStrategyFluent.DockerStrategyNested<A> withNewDockerStrategyLike(DockerBuildStrategy item);
    public BuildStrategyFluent.DockerStrategyNested<A> editDockerStrategy();
    public BuildStrategyFluent.DockerStrategyNested<A> editOrNewDockerStrategy();
    public BuildStrategyFluent.DockerStrategyNested<A> editOrNewDockerStrategyLike(DockerBuildStrategy item);
    
/**
 * This method has been deprecated, please use method buildJenkinsPipelineStrategy instead.
 * @return The buildable object.
 */
@Deprecated public JenkinsPipelineBuildStrategy getJenkinsPipelineStrategy();
    public JenkinsPipelineBuildStrategy buildJenkinsPipelineStrategy();
    public A withJenkinsPipelineStrategy(JenkinsPipelineBuildStrategy jenkinsPipelineStrategy);
    public Boolean hasJenkinsPipelineStrategy();
    public BuildStrategyFluent.JenkinsPipelineStrategyNested<A> withNewJenkinsPipelineStrategy();
    public BuildStrategyFluent.JenkinsPipelineStrategyNested<A> withNewJenkinsPipelineStrategyLike(JenkinsPipelineBuildStrategy item);
    public BuildStrategyFluent.JenkinsPipelineStrategyNested<A> editJenkinsPipelineStrategy();
    public BuildStrategyFluent.JenkinsPipelineStrategyNested<A> editOrNewJenkinsPipelineStrategy();
    public BuildStrategyFluent.JenkinsPipelineStrategyNested<A> editOrNewJenkinsPipelineStrategyLike(JenkinsPipelineBuildStrategy item);
    
/**
 * This method has been deprecated, please use method buildSourceStrategy instead.
 * @return The buildable object.
 */
@Deprecated public SourceBuildStrategy getSourceStrategy();
    public SourceBuildStrategy buildSourceStrategy();
    public A withSourceStrategy(SourceBuildStrategy sourceStrategy);
    public Boolean hasSourceStrategy();
    public BuildStrategyFluent.SourceStrategyNested<A> withNewSourceStrategy();
    public BuildStrategyFluent.SourceStrategyNested<A> withNewSourceStrategyLike(SourceBuildStrategy item);
    public BuildStrategyFluent.SourceStrategyNested<A> editSourceStrategy();
    public BuildStrategyFluent.SourceStrategyNested<A> editOrNewSourceStrategy();
    public BuildStrategyFluent.SourceStrategyNested<A> editOrNewSourceStrategyLike(SourceBuildStrategy item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface CustomStrategyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomBuildStrategyFluent<BuildStrategyFluent.CustomStrategyNested<N>>{

        
    public N and();    public N endCustomStrategy();
}
    public interface DockerStrategyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DockerBuildStrategyFluent<BuildStrategyFluent.DockerStrategyNested<N>>{

        
    public N and();    public N endDockerStrategy();
}
    public interface JenkinsPipelineStrategyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JenkinsPipelineBuildStrategyFluent<BuildStrategyFluent.JenkinsPipelineStrategyNested<N>>{

        
    public N and();    public N endJenkinsPipelineStrategy();
}
    public interface SourceStrategyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SourceBuildStrategyFluent<BuildStrategyFluent.SourceStrategyNested<N>>{

        
    public N and();    public N endSourceStrategy();
}


}
