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

public interface ExecNewPodHookFluent<A extends ExecNewPodHookFluent<A>> extends Fluent<A>{


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
    public String getContainerName();
    public A withContainerName(String containerName);
    public Boolean hasContainerName();
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
    public ExecNewPodHookFluent.EnvNested<A> addNewEnv();
    public ExecNewPodHookFluent.EnvNested<A> addNewEnvLike(EnvVar item);
    public ExecNewPodHookFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item);
    public ExecNewPodHookFluent.EnvNested<A> editEnv(int index);
    public ExecNewPodHookFluent.EnvNested<A> editFirstEnv();
    public ExecNewPodHookFluent.EnvNested<A> editLastEnv();
    public ExecNewPodHookFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public A addToVolumes(int index,String item);
    public A setToVolumes(int index,String item);
    public A addToVolumes(String... items);
    public A addAllToVolumes(Collection<String> items);
    public A removeFromVolumes(String... items);
    public A removeAllFromVolumes(Collection<String> items);
    public List<String> getVolumes();
    public String getVolume(int index);
    public String getFirstVolume();
    public String getLastVolume();
    public String getMatchingVolume(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withVolumes(List<String> volumes);
    public A withVolumes(String... volumes);
    public Boolean hasVolumes();

    public interface EnvNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarFluent<ExecNewPodHookFluent.EnvNested<N>>{

        
    public N and();    public N endEnv();
}


}
