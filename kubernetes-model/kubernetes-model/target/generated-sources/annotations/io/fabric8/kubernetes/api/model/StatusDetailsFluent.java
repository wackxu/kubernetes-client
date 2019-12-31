package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface StatusDetailsFluent<A extends StatusDetailsFluent<A>> extends Fluent<A>{


    public A addToCauses(int index,StatusCause item);
    public A setToCauses(int index,StatusCause item);
    public A addToCauses(StatusCause... items);
    public A addAllToCauses(Collection<StatusCause> items);
    public A removeFromCauses(StatusCause... items);
    public A removeAllFromCauses(Collection<StatusCause> items);
    
/**
 * This method has been deprecated, please use method buildCauses instead.
 * @return The buildable object.
 */
@Deprecated public List<StatusCause> getCauses();
    public List<StatusCause> buildCauses();
    public StatusCause buildCause(int index);
    public StatusCause buildFirstCause();
    public StatusCause buildLastCause();
    public StatusCause buildMatchingCause(io.fabric8.kubernetes.api.builder.Predicate<StatusCauseBuilder> predicate);
    public A withCauses(List<StatusCause> causes);
    public A withCauses(StatusCause... causes);
    public Boolean hasCauses();
    public A addNewCause(String field,String message,String reason);
    public StatusDetailsFluent.CausesNested<A> addNewCause();
    public StatusDetailsFluent.CausesNested<A> addNewCauseLike(StatusCause item);
    public StatusDetailsFluent.CausesNested<A> setNewCauseLike(int index,StatusCause item);
    public StatusDetailsFluent.CausesNested<A> editCause(int index);
    public StatusDetailsFluent.CausesNested<A> editFirstCause();
    public StatusDetailsFluent.CausesNested<A> editLastCause();
    public StatusDetailsFluent.CausesNested<A> editMatchingCause(io.fabric8.kubernetes.api.builder.Predicate<StatusCauseBuilder> predicate);
    public String getGroup();
    public A withGroup(String group);
    public Boolean hasGroup();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public Integer getRetryAfterSeconds();
    public A withRetryAfterSeconds(Integer retryAfterSeconds);
    public Boolean hasRetryAfterSeconds();
    public String getUid();
    public A withUid(String uid);
    public Boolean hasUid();

    public interface CausesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatusCauseFluent<StatusDetailsFluent.CausesNested<N>>{

        
    public N and();    public N endCause();
}


}
