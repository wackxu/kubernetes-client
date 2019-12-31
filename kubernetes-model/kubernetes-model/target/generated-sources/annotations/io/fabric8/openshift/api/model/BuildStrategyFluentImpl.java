package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;

public class BuildStrategyFluentImpl<A extends BuildStrategyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildStrategyFluent<A>{

    private CustomBuildStrategyBuilder customStrategy;
    private DockerBuildStrategyBuilder dockerStrategy;
    private JenkinsPipelineBuildStrategyBuilder jenkinsPipelineStrategy;
    private SourceBuildStrategyBuilder sourceStrategy;
    private String type;

    public BuildStrategyFluentImpl(){
    }
    public BuildStrategyFluentImpl(BuildStrategy instance){
            this.withCustomStrategy(instance.getCustomStrategy()); 
            this.withDockerStrategy(instance.getDockerStrategy()); 
            this.withJenkinsPipelineStrategy(instance.getJenkinsPipelineStrategy()); 
            this.withSourceStrategy(instance.getSourceStrategy()); 
            this.withType(instance.getType()); 
    }

    
/**
 * This method has been deprecated, please use method buildCustomStrategy instead.
 * @return The buildable object.
 */
@Deprecated public CustomBuildStrategy getCustomStrategy(){
            return this.customStrategy!=null?this.customStrategy.build():null;
    }

    public CustomBuildStrategy buildCustomStrategy(){
            return this.customStrategy!=null?this.customStrategy.build():null;
    }

    public A withCustomStrategy(CustomBuildStrategy customStrategy){
            _visitables.remove(this.customStrategy);
            if (customStrategy!=null){ this.customStrategy= new CustomBuildStrategyBuilder(customStrategy); _visitables.add(this.customStrategy);} return (A) this;
    }

    public Boolean hasCustomStrategy(){
            return this.customStrategy != null;
    }

    public BuildStrategyFluent.CustomStrategyNested<A> withNewCustomStrategy(){
            return new CustomStrategyNestedImpl();
    }

    public BuildStrategyFluent.CustomStrategyNested<A> withNewCustomStrategyLike(CustomBuildStrategy item){
            return new CustomStrategyNestedImpl(item);
    }

    public BuildStrategyFluent.CustomStrategyNested<A> editCustomStrategy(){
            return withNewCustomStrategyLike(getCustomStrategy());
    }

    public BuildStrategyFluent.CustomStrategyNested<A> editOrNewCustomStrategy(){
            return withNewCustomStrategyLike(getCustomStrategy() != null ? getCustomStrategy(): new CustomBuildStrategyBuilder().build());
    }

    public BuildStrategyFluent.CustomStrategyNested<A> editOrNewCustomStrategyLike(CustomBuildStrategy item){
            return withNewCustomStrategyLike(getCustomStrategy() != null ? getCustomStrategy(): item);
    }

    
/**
 * This method has been deprecated, please use method buildDockerStrategy instead.
 * @return The buildable object.
 */
@Deprecated public DockerBuildStrategy getDockerStrategy(){
            return this.dockerStrategy!=null?this.dockerStrategy.build():null;
    }

    public DockerBuildStrategy buildDockerStrategy(){
            return this.dockerStrategy!=null?this.dockerStrategy.build():null;
    }

    public A withDockerStrategy(DockerBuildStrategy dockerStrategy){
            _visitables.remove(this.dockerStrategy);
            if (dockerStrategy!=null){ this.dockerStrategy= new DockerBuildStrategyBuilder(dockerStrategy); _visitables.add(this.dockerStrategy);} return (A) this;
    }

    public Boolean hasDockerStrategy(){
            return this.dockerStrategy != null;
    }

    public BuildStrategyFluent.DockerStrategyNested<A> withNewDockerStrategy(){
            return new DockerStrategyNestedImpl();
    }

    public BuildStrategyFluent.DockerStrategyNested<A> withNewDockerStrategyLike(DockerBuildStrategy item){
            return new DockerStrategyNestedImpl(item);
    }

    public BuildStrategyFluent.DockerStrategyNested<A> editDockerStrategy(){
            return withNewDockerStrategyLike(getDockerStrategy());
    }

    public BuildStrategyFluent.DockerStrategyNested<A> editOrNewDockerStrategy(){
            return withNewDockerStrategyLike(getDockerStrategy() != null ? getDockerStrategy(): new DockerBuildStrategyBuilder().build());
    }

    public BuildStrategyFluent.DockerStrategyNested<A> editOrNewDockerStrategyLike(DockerBuildStrategy item){
            return withNewDockerStrategyLike(getDockerStrategy() != null ? getDockerStrategy(): item);
    }

    
/**
 * This method has been deprecated, please use method buildJenkinsPipelineStrategy instead.
 * @return The buildable object.
 */
@Deprecated public JenkinsPipelineBuildStrategy getJenkinsPipelineStrategy(){
            return this.jenkinsPipelineStrategy!=null?this.jenkinsPipelineStrategy.build():null;
    }

    public JenkinsPipelineBuildStrategy buildJenkinsPipelineStrategy(){
            return this.jenkinsPipelineStrategy!=null?this.jenkinsPipelineStrategy.build():null;
    }

    public A withJenkinsPipelineStrategy(JenkinsPipelineBuildStrategy jenkinsPipelineStrategy){
            _visitables.remove(this.jenkinsPipelineStrategy);
            if (jenkinsPipelineStrategy!=null){ this.jenkinsPipelineStrategy= new JenkinsPipelineBuildStrategyBuilder(jenkinsPipelineStrategy); _visitables.add(this.jenkinsPipelineStrategy);} return (A) this;
    }

    public Boolean hasJenkinsPipelineStrategy(){
            return this.jenkinsPipelineStrategy != null;
    }

    public BuildStrategyFluent.JenkinsPipelineStrategyNested<A> withNewJenkinsPipelineStrategy(){
            return new JenkinsPipelineStrategyNestedImpl();
    }

    public BuildStrategyFluent.JenkinsPipelineStrategyNested<A> withNewJenkinsPipelineStrategyLike(JenkinsPipelineBuildStrategy item){
            return new JenkinsPipelineStrategyNestedImpl(item);
    }

    public BuildStrategyFluent.JenkinsPipelineStrategyNested<A> editJenkinsPipelineStrategy(){
            return withNewJenkinsPipelineStrategyLike(getJenkinsPipelineStrategy());
    }

    public BuildStrategyFluent.JenkinsPipelineStrategyNested<A> editOrNewJenkinsPipelineStrategy(){
            return withNewJenkinsPipelineStrategyLike(getJenkinsPipelineStrategy() != null ? getJenkinsPipelineStrategy(): new JenkinsPipelineBuildStrategyBuilder().build());
    }

    public BuildStrategyFluent.JenkinsPipelineStrategyNested<A> editOrNewJenkinsPipelineStrategyLike(JenkinsPipelineBuildStrategy item){
            return withNewJenkinsPipelineStrategyLike(getJenkinsPipelineStrategy() != null ? getJenkinsPipelineStrategy(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSourceStrategy instead.
 * @return The buildable object.
 */
@Deprecated public SourceBuildStrategy getSourceStrategy(){
            return this.sourceStrategy!=null?this.sourceStrategy.build():null;
    }

    public SourceBuildStrategy buildSourceStrategy(){
            return this.sourceStrategy!=null?this.sourceStrategy.build():null;
    }

    public A withSourceStrategy(SourceBuildStrategy sourceStrategy){
            _visitables.remove(this.sourceStrategy);
            if (sourceStrategy!=null){ this.sourceStrategy= new SourceBuildStrategyBuilder(sourceStrategy); _visitables.add(this.sourceStrategy);} return (A) this;
    }

    public Boolean hasSourceStrategy(){
            return this.sourceStrategy != null;
    }

    public BuildStrategyFluent.SourceStrategyNested<A> withNewSourceStrategy(){
            return new SourceStrategyNestedImpl();
    }

    public BuildStrategyFluent.SourceStrategyNested<A> withNewSourceStrategyLike(SourceBuildStrategy item){
            return new SourceStrategyNestedImpl(item);
    }

    public BuildStrategyFluent.SourceStrategyNested<A> editSourceStrategy(){
            return withNewSourceStrategyLike(getSourceStrategy());
    }

    public BuildStrategyFluent.SourceStrategyNested<A> editOrNewSourceStrategy(){
            return withNewSourceStrategyLike(getSourceStrategy() != null ? getSourceStrategy(): new SourceBuildStrategyBuilder().build());
    }

    public BuildStrategyFluent.SourceStrategyNested<A> editOrNewSourceStrategyLike(SourceBuildStrategy item){
            return withNewSourceStrategyLike(getSourceStrategy() != null ? getSourceStrategy(): item);
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildStrategyFluentImpl that = (BuildStrategyFluentImpl) o;
            if (customStrategy != null ? !customStrategy.equals(that.customStrategy) :that.customStrategy != null) return false;
            if (dockerStrategy != null ? !dockerStrategy.equals(that.dockerStrategy) :that.dockerStrategy != null) return false;
            if (jenkinsPipelineStrategy != null ? !jenkinsPipelineStrategy.equals(that.jenkinsPipelineStrategy) :that.jenkinsPipelineStrategy != null) return false;
            if (sourceStrategy != null ? !sourceStrategy.equals(that.sourceStrategy) :that.sourceStrategy != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class CustomStrategyNestedImpl<N> extends CustomBuildStrategyFluentImpl<BuildStrategyFluent.CustomStrategyNested<N>> implements BuildStrategyFluent.CustomStrategyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomBuildStrategyBuilder builder;
    
            CustomStrategyNestedImpl(CustomBuildStrategy item){
                    this.builder = new CustomBuildStrategyBuilder(this, item);
            }
            CustomStrategyNestedImpl(){
                    this.builder = new CustomBuildStrategyBuilder(this);
            }
    
    public N and(){
            return (N) BuildStrategyFluentImpl.this.withCustomStrategy(builder.build());
    }
    public N endCustomStrategy(){
            return and();
    }

}
    public class DockerStrategyNestedImpl<N> extends DockerBuildStrategyFluentImpl<BuildStrategyFluent.DockerStrategyNested<N>> implements BuildStrategyFluent.DockerStrategyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DockerBuildStrategyBuilder builder;
    
            DockerStrategyNestedImpl(DockerBuildStrategy item){
                    this.builder = new DockerBuildStrategyBuilder(this, item);
            }
            DockerStrategyNestedImpl(){
                    this.builder = new DockerBuildStrategyBuilder(this);
            }
    
    public N and(){
            return (N) BuildStrategyFluentImpl.this.withDockerStrategy(builder.build());
    }
    public N endDockerStrategy(){
            return and();
    }

}
    public class JenkinsPipelineStrategyNestedImpl<N> extends JenkinsPipelineBuildStrategyFluentImpl<BuildStrategyFluent.JenkinsPipelineStrategyNested<N>> implements BuildStrategyFluent.JenkinsPipelineStrategyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JenkinsPipelineBuildStrategyBuilder builder;
    
            JenkinsPipelineStrategyNestedImpl(JenkinsPipelineBuildStrategy item){
                    this.builder = new JenkinsPipelineBuildStrategyBuilder(this, item);
            }
            JenkinsPipelineStrategyNestedImpl(){
                    this.builder = new JenkinsPipelineBuildStrategyBuilder(this);
            }
    
    public N and(){
            return (N) BuildStrategyFluentImpl.this.withJenkinsPipelineStrategy(builder.build());
    }
    public N endJenkinsPipelineStrategy(){
            return and();
    }

}
    public class SourceStrategyNestedImpl<N> extends SourceBuildStrategyFluentImpl<BuildStrategyFluent.SourceStrategyNested<N>> implements BuildStrategyFluent.SourceStrategyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SourceBuildStrategyBuilder builder;
    
            SourceStrategyNestedImpl(SourceBuildStrategy item){
                    this.builder = new SourceBuildStrategyBuilder(this, item);
            }
            SourceStrategyNestedImpl(){
                    this.builder = new SourceBuildStrategyBuilder(this);
            }
    
    public N and(){
            return (N) BuildStrategyFluentImpl.this.withSourceStrategy(builder.build());
    }
    public N endSourceStrategy(){
            return and();
    }

}


}
