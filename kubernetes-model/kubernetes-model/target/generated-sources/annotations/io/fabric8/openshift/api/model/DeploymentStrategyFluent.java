package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.ResourceRequirementsBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.ResourceRequirementsFluent;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Long;
import java.lang.Object;
import java.util.Map;

public interface DeploymentStrategyFluent<A extends io.fabric8.openshift.api.model.DeploymentStrategyFluent<A>> extends Fluent<A>{


    public Long getActiveDeadlineSeconds();
    public A withActiveDeadlineSeconds(Long activeDeadlineSeconds);
    public Boolean hasActiveDeadlineSeconds();
    public A withNewActiveDeadlineSeconds(String arg1);
    public A withNewActiveDeadlineSeconds(long arg1);
    public A addToAnnotations(String key,String value);
    public A addToAnnotations(Map<String,String> map);
    public A removeFromAnnotations(String key);
    public A removeFromAnnotations(Map<String,String> map);
    public Map<String,String> getAnnotations();
    public A withAnnotations(Map<String,String> annotations);
    public Boolean hasAnnotations();
    
/**
 * This method has been deprecated, please use method buildCustomParams instead.
 * @return The buildable object.
 */
@Deprecated public CustomDeploymentStrategyParams getCustomParams();
    public CustomDeploymentStrategyParams buildCustomParams();
    public A withCustomParams(CustomDeploymentStrategyParams customParams);
    public Boolean hasCustomParams();
    public DeploymentStrategyFluent.CustomParamsNested<A> withNewCustomParams();
    public DeploymentStrategyFluent.CustomParamsNested<A> withNewCustomParamsLike(CustomDeploymentStrategyParams item);
    public DeploymentStrategyFluent.CustomParamsNested<A> editCustomParams();
    public DeploymentStrategyFluent.CustomParamsNested<A> editOrNewCustomParams();
    public DeploymentStrategyFluent.CustomParamsNested<A> editOrNewCustomParamsLike(CustomDeploymentStrategyParams item);
    public A addToLabels(String key,String value);
    public A addToLabels(Map<String,String> map);
    public A removeFromLabels(String key);
    public A removeFromLabels(Map<String,String> map);
    public Map<String,String> getLabels();
    public A withLabels(Map<String,String> labels);
    public Boolean hasLabels();
    
/**
 * This method has been deprecated, please use method buildRecreateParams instead.
 * @return The buildable object.
 */
@Deprecated public RecreateDeploymentStrategyParams getRecreateParams();
    public RecreateDeploymentStrategyParams buildRecreateParams();
    public A withRecreateParams(RecreateDeploymentStrategyParams recreateParams);
    public Boolean hasRecreateParams();
    public DeploymentStrategyFluent.RecreateParamsNested<A> withNewRecreateParams();
    public DeploymentStrategyFluent.RecreateParamsNested<A> withNewRecreateParamsLike(RecreateDeploymentStrategyParams item);
    public DeploymentStrategyFluent.RecreateParamsNested<A> editRecreateParams();
    public DeploymentStrategyFluent.RecreateParamsNested<A> editOrNewRecreateParams();
    public DeploymentStrategyFluent.RecreateParamsNested<A> editOrNewRecreateParamsLike(RecreateDeploymentStrategyParams item);
    
/**
 * This method has been deprecated, please use method buildResources instead.
 * @return The buildable object.
 */
@Deprecated public ResourceRequirements getResources();
    public ResourceRequirements buildResources();
    public A withResources(ResourceRequirements resources);
    public Boolean hasResources();
    public DeploymentStrategyFluent.ResourcesNested<A> withNewResources();
    public DeploymentStrategyFluent.ResourcesNested<A> withNewResourcesLike(ResourceRequirements item);
    public DeploymentStrategyFluent.ResourcesNested<A> editResources();
    public DeploymentStrategyFluent.ResourcesNested<A> editOrNewResources();
    public DeploymentStrategyFluent.ResourcesNested<A> editOrNewResourcesLike(ResourceRequirements item);
    
/**
 * This method has been deprecated, please use method buildRollingParams instead.
 * @return The buildable object.
 */
@Deprecated public RollingDeploymentStrategyParams getRollingParams();
    public RollingDeploymentStrategyParams buildRollingParams();
    public A withRollingParams(RollingDeploymentStrategyParams rollingParams);
    public Boolean hasRollingParams();
    public DeploymentStrategyFluent.RollingParamsNested<A> withNewRollingParams();
    public DeploymentStrategyFluent.RollingParamsNested<A> withNewRollingParamsLike(RollingDeploymentStrategyParams item);
    public DeploymentStrategyFluent.RollingParamsNested<A> editRollingParams();
    public DeploymentStrategyFluent.RollingParamsNested<A> editOrNewRollingParams();
    public DeploymentStrategyFluent.RollingParamsNested<A> editOrNewRollingParamsLike(RollingDeploymentStrategyParams item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface CustomParamsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomDeploymentStrategyParamsFluent<DeploymentStrategyFluent.CustomParamsNested<N>>{

        
    public N and();    public N endCustomParams();
}
    public interface RecreateParamsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RecreateDeploymentStrategyParamsFluent<DeploymentStrategyFluent.RecreateParamsNested<N>>{

        
    public N and();    public N endRecreateParams();
}
    public interface ResourcesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceRequirementsFluent<DeploymentStrategyFluent.ResourcesNested<N>>{

        
    public N and();    public N endResources();
}
    public interface RollingParamsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RollingDeploymentStrategyParamsFluent<DeploymentStrategyFluent.RollingParamsNested<N>>{

        
    public N and();    public N endRollingParams();
}


}
