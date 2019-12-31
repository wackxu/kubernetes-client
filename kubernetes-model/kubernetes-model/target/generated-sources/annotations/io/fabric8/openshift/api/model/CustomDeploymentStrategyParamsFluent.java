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

public interface CustomDeploymentStrategyParamsFluent<A extends CustomDeploymentStrategyParamsFluent<A>> extends Fluent<A>{


    public A addToCommand(int index,String item);
    public A setToCommand(int index,String item);
    public A addToCommand(String... items);
    public A addAllToCommand(Collection<String> items);
    public A removeFromCommand(String... items);
    public A removeAllFromCommand(Collection<String> items);
    public List<String> getCommand();
    public String getCommand(int index);
    public String getFirstCommand();
    public String getLastCommand();
    public String getMatchingCommand(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withCommand(List<String> command);
    public A withCommand(String... command);
    public Boolean hasCommand();
    public A addToEnvironment(int index,EnvVar item);
    public A setToEnvironment(int index,EnvVar item);
    public A addToEnvironment(EnvVar... items);
    public A addAllToEnvironment(Collection<EnvVar> items);
    public A removeFromEnvironment(EnvVar... items);
    public A removeAllFromEnvironment(Collection<EnvVar> items);
    
/**
 * This method has been deprecated, please use method buildEnvironment instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getEnvironment();
    public List<EnvVar> buildEnvironment();
    public EnvVar buildEnvironment(int index);
    public EnvVar buildFirstEnvironment();
    public EnvVar buildLastEnvironment();
    public EnvVar buildMatchingEnvironment(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public A withEnvironment(List<EnvVar> environment);
    public A withEnvironment(EnvVar... environment);
    public Boolean hasEnvironment();
    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> addNewEnvironment();
    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> addNewEnvironmentLike(EnvVar item);
    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> setNewEnvironmentLike(int index,EnvVar item);
    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> editEnvironment(int index);
    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> editFirstEnvironment();
    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> editLastEnvironment();
    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> editMatchingEnvironment(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public String getImage();
    public A withImage(String image);
    public Boolean hasImage();

    public interface EnvironmentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarFluent<CustomDeploymentStrategyParamsFluent.EnvironmentNested<N>>{

        
    public N and();    public N endEnvironment();
}


}
