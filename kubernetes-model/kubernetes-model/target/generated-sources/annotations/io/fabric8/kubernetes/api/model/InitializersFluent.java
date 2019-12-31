package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface InitializersFluent<A extends InitializersFluent<A>> extends Fluent<A>{


    public A addToPending(int index,Initializer item);
    public A setToPending(int index,Initializer item);
    public A addToPending(Initializer... items);
    public A addAllToPending(Collection<Initializer> items);
    public A removeFromPending(Initializer... items);
    public A removeAllFromPending(Collection<Initializer> items);
    
/**
 * This method has been deprecated, please use method buildPending instead.
 * @return The buildable object.
 */
@Deprecated public List<Initializer> getPending();
    public List<Initializer> buildPending();
    public Initializer buildPending(int index);
    public Initializer buildFirstPending();
    public Initializer buildLastPending();
    public Initializer buildMatchingPending(io.fabric8.kubernetes.api.builder.Predicate<InitializerBuilder> predicate);
    public A withPending(List<Initializer> pending);
    public A withPending(Initializer... pending);
    public Boolean hasPending();
    public A addNewPending(String name);
    public InitializersFluent.PendingNested<A> addNewPending();
    public InitializersFluent.PendingNested<A> addNewPendingLike(Initializer item);
    public InitializersFluent.PendingNested<A> setNewPendingLike(int index,Initializer item);
    public InitializersFluent.PendingNested<A> editPending(int index);
    public InitializersFluent.PendingNested<A> editFirstPending();
    public InitializersFluent.PendingNested<A> editLastPending();
    public InitializersFluent.PendingNested<A> editMatchingPending(io.fabric8.kubernetes.api.builder.Predicate<InitializerBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildResult instead.
 * @return The buildable object.
 */
@Deprecated public Status getResult();
    public Status buildResult();
    public A withResult(Status result);
    public Boolean hasResult();
    public InitializersFluent.ResultNested<A> withNewResult();
    public InitializersFluent.ResultNested<A> withNewResultLike(Status item);
    public InitializersFluent.ResultNested<A> editResult();
    public InitializersFluent.ResultNested<A> editOrNewResult();
    public InitializersFluent.ResultNested<A> editOrNewResultLike(Status item);

    public interface PendingNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,InitializerFluent<InitializersFluent.PendingNested<N>>{

        
    public N and();    public N endPending();
}
    public interface ResultNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatusFluent<InitializersFluent.ResultNested<N>>{

        
    public N and();    public N endResult();
}


}
