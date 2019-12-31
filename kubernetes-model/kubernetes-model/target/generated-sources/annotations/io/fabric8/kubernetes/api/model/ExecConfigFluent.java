package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface ExecConfigFluent<A extends ExecConfigFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToArgs(int index,String item);
    public A setToArgs(int index,String item);
    public A addToArgs(String... items);
    public A addAllToArgs(Collection<String> items);
    public A removeFromArgs(String... items);
    public A removeAllFromArgs(Collection<String> items);
    public List<String> getArgs();
    public String getArg(int index);
    public String getFirstArg();
    public String getLastArg();
    public String getMatchingArg(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withArgs(List<String> args);
    public A withArgs(String... args);
    public Boolean hasArgs();
    public String getCommand();
    public A withCommand(String command);
    public Boolean hasCommand();
    public A addToEnv(int index,ExecEnvVar item);
    public A setToEnv(int index,ExecEnvVar item);
    public A addToEnv(ExecEnvVar... items);
    public A addAllToEnv(Collection<ExecEnvVar> items);
    public A removeFromEnv(ExecEnvVar... items);
    public A removeAllFromEnv(Collection<ExecEnvVar> items);
    
/**
 * This method has been deprecated, please use method buildEnv instead.
 * @return The buildable object.
 */
@Deprecated public List<ExecEnvVar> getEnv();
    public List<ExecEnvVar> buildEnv();
    public ExecEnvVar buildEnv(int index);
    public ExecEnvVar buildFirstEnv();
    public ExecEnvVar buildLastEnv();
    public ExecEnvVar buildMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<ExecEnvVarBuilder> predicate);
    public A withEnv(List<ExecEnvVar> env);
    public A withEnv(ExecEnvVar... env);
    public Boolean hasEnv();
    public A addNewEnv(String name,String value);
    public ExecConfigFluent.EnvNested<A> addNewEnv();
    public ExecConfigFluent.EnvNested<A> addNewEnvLike(ExecEnvVar item);
    public ExecConfigFluent.EnvNested<A> setNewEnvLike(int index,ExecEnvVar item);
    public ExecConfigFluent.EnvNested<A> editEnv(int index);
    public ExecConfigFluent.EnvNested<A> editFirstEnv();
    public ExecConfigFluent.EnvNested<A> editLastEnv();
    public ExecConfigFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<ExecEnvVarBuilder> predicate);

    public interface EnvNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExecEnvVarFluent<ExecConfigFluent.EnvNested<N>>{

        
    public N and();    public N endEnv();
}


}
