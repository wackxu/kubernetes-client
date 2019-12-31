package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface BuildPostCommitSpecFluent<A extends BuildPostCommitSpecFluent<A>> extends Fluent<A>{


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
    public String getScript();
    public A withScript(String script);
    public Boolean hasScript();



}
