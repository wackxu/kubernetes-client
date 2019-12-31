package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface DeleteOptionsFluent<A extends DeleteOptionsFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToDryRun(int index,String item);
    public A setToDryRun(int index,String item);
    public A addToDryRun(String... items);
    public A addAllToDryRun(Collection<String> items);
    public A removeFromDryRun(String... items);
    public A removeAllFromDryRun(Collection<String> items);
    public List<String> getDryRun();
    public String getDryRun(int index);
    public String getFirstDryRun();
    public String getLastDryRun();
    public String getMatchingDryRun(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withDryRun(List<String> dryRun);
    public A withDryRun(String... dryRun);
    public Boolean hasDryRun();
    public Long getGracePeriodSeconds();
    public A withGracePeriodSeconds(Long gracePeriodSeconds);
    public Boolean hasGracePeriodSeconds();
    public A withNewGracePeriodSeconds(String arg1);
    public A withNewGracePeriodSeconds(long arg1);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public Boolean isOrphanDependents();
    public A withOrphanDependents(Boolean orphanDependents);
    public Boolean hasOrphanDependents();
    public A withNewOrphanDependents(String arg1);
    public A withNewOrphanDependents(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildPreconditions instead.
 * @return The buildable object.
 */
@Deprecated public Preconditions getPreconditions();
    public Preconditions buildPreconditions();
    public A withPreconditions(Preconditions preconditions);
    public Boolean hasPreconditions();
    public A withNewPreconditions(String uid);
    public DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditions();
    public DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditionsLike(Preconditions item);
    public DeleteOptionsFluent.PreconditionsNested<A> editPreconditions();
    public DeleteOptionsFluent.PreconditionsNested<A> editOrNewPreconditions();
    public DeleteOptionsFluent.PreconditionsNested<A> editOrNewPreconditionsLike(Preconditions item);
    public String getPropagationPolicy();
    public A withPropagationPolicy(String propagationPolicy);
    public Boolean hasPropagationPolicy();

    public interface PreconditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PreconditionsFluent<DeleteOptionsFluent.PreconditionsNested<N>>{

        
    public N and();    public N endPreconditions();
}


}
