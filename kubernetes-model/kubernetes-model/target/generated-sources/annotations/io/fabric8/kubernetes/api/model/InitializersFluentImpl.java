package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class InitializersFluentImpl<A extends InitializersFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements InitializersFluent<A>{

    private List<InitializerBuilder> pending;
    private StatusBuilder result;

    public InitializersFluentImpl(){
    }
    public InitializersFluentImpl(Initializers instance){
            this.withPending(instance.getPending()); 
            this.withResult(instance.getResult()); 
    }

    public A addToPending(int index,Initializer item){
            if (this.pending == null) {this.pending = new ArrayList<InitializerBuilder>();}
            InitializerBuilder builder = new InitializerBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.pending.add(index >= 0 ? index : pending.size(), builder); return (A)this;
    }

    public A setToPending(int index,Initializer item){
            if (this.pending == null) {this.pending = new ArrayList<InitializerBuilder>();}
            InitializerBuilder builder = new InitializerBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= pending.size()) { pending.add(builder); } else { pending.set(index, builder);}
             return (A)this;
    }

    public A addToPending(Initializer... items){
            if (this.pending == null) {this.pending = new ArrayList<InitializerBuilder>();}
            for (Initializer item : items) {InitializerBuilder builder = new InitializerBuilder(item);_visitables.add(builder);this.pending.add(builder);} return (A)this;
    }

    public A addAllToPending(Collection<Initializer> items){
            if (this.pending == null) {this.pending = new ArrayList<InitializerBuilder>();}
            for (Initializer item : items) {InitializerBuilder builder = new InitializerBuilder(item);_visitables.add(builder);this.pending.add(builder);} return (A)this;
    }

    public A removeFromPending(Initializer... items){
            for (Initializer item : items) {InitializerBuilder builder = new InitializerBuilder(item);_visitables.remove(builder);if (this.pending != null) {this.pending.remove(builder);}} return (A)this;
    }

    public A removeAllFromPending(Collection<Initializer> items){
            for (Initializer item : items) {InitializerBuilder builder = new InitializerBuilder(item);_visitables.remove(builder);if (this.pending != null) {this.pending.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildPending instead.
 * @return The buildable object.
 */
@Deprecated public List<Initializer> getPending(){
            return build(pending);
    }

    public List<Initializer> buildPending(){
            return build(pending);
    }

    public Initializer buildPending(int index){
            return this.pending.get(index).build();
    }

    public Initializer buildFirstPending(){
            return this.pending.get(0).build();
    }

    public Initializer buildLastPending(){
            return this.pending.get(pending.size() - 1).build();
    }

    public Initializer buildMatchingPending(io.fabric8.kubernetes.api.builder.Predicate<InitializerBuilder> predicate){
            for (InitializerBuilder item: pending) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withPending(List<Initializer> pending){
            if (this.pending != null) { _visitables.removeAll(this.pending);}
            if (pending != null) {this.pending = new ArrayList<InitializerBuilder>(); for (Initializer item : pending){this.addToPending(item);}} else { this.pending = new ArrayList<InitializerBuilder>();} return (A) this;
    }

    public A withPending(Initializer... pending){
            if (this.pending != null) {this.pending.clear();}
            if (pending != null) {for (Initializer item :pending){ this.addToPending(item);}} return (A) this;
    }

    public Boolean hasPending(){
            return pending != null && !pending.isEmpty();
    }

    public A addNewPending(String name){
            return (A)addToPending(new Initializer(name));
    }

    public InitializersFluent.PendingNested<A> addNewPending(){
            return new PendingNestedImpl();
    }

    public InitializersFluent.PendingNested<A> addNewPendingLike(Initializer item){
            return new PendingNestedImpl(-1, item);
    }

    public InitializersFluent.PendingNested<A> setNewPendingLike(int index,Initializer item){
            return new PendingNestedImpl(index, item);
    }

    public InitializersFluent.PendingNested<A> editPending(int index){
            if (pending.size() <= index) throw new RuntimeException("Can't edit pending. Index exceeds size.");
            return setNewPendingLike(index, buildPending(index));
    }

    public InitializersFluent.PendingNested<A> editFirstPending(){
            if (pending.size() == 0) throw new RuntimeException("Can't edit first pending. The list is empty.");
            return setNewPendingLike(0, buildPending(0));
    }

    public InitializersFluent.PendingNested<A> editLastPending(){
            int index = pending.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last pending. The list is empty.");
            return setNewPendingLike(index, buildPending(index));
    }

    public InitializersFluent.PendingNested<A> editMatchingPending(io.fabric8.kubernetes.api.builder.Predicate<InitializerBuilder> predicate){
            int index = -1;
            for (int i=0;i<pending.size();i++) { 
            if (predicate.apply(pending.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching pending. No match found.");
            return setNewPendingLike(index, buildPending(index));
    }

    
/**
 * This method has been deprecated, please use method buildResult instead.
 * @return The buildable object.
 */
@Deprecated public Status getResult(){
            return this.result!=null?this.result.build():null;
    }

    public Status buildResult(){
            return this.result!=null?this.result.build():null;
    }

    public A withResult(Status result){
            _visitables.remove(this.result);
            if (result!=null){ this.result= new StatusBuilder(result); _visitables.add(this.result);} return (A) this;
    }

    public Boolean hasResult(){
            return this.result != null;
    }

    public InitializersFluent.ResultNested<A> withNewResult(){
            return new ResultNestedImpl();
    }

    public InitializersFluent.ResultNested<A> withNewResultLike(Status item){
            return new ResultNestedImpl(item);
    }

    public InitializersFluent.ResultNested<A> editResult(){
            return withNewResultLike(getResult());
    }

    public InitializersFluent.ResultNested<A> editOrNewResult(){
            return withNewResultLike(getResult() != null ? getResult(): new StatusBuilder().build());
    }

    public InitializersFluent.ResultNested<A> editOrNewResultLike(Status item){
            return withNewResultLike(getResult() != null ? getResult(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            InitializersFluentImpl that = (InitializersFluentImpl) o;
            if (pending != null ? !pending.equals(that.pending) :that.pending != null) return false;
            if (result != null ? !result.equals(that.result) :that.result != null) return false;
            return true;
    }


    public class PendingNestedImpl<N> extends InitializerFluentImpl<InitializersFluent.PendingNested<N>> implements InitializersFluent.PendingNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final InitializerBuilder builder;
        private final int index;
    
            PendingNestedImpl(int index,Initializer item){
                    this.index = index;
                    this.builder = new InitializerBuilder(this, item);
            }
            PendingNestedImpl(){
                    this.index = -1;
                    this.builder = new InitializerBuilder(this);
            }
    
    public N and(){
            return (N) InitializersFluentImpl.this.setToPending(index, builder.build());
    }
    public N endPending(){
            return and();
    }

}
    public class ResultNestedImpl<N> extends StatusFluentImpl<InitializersFluent.ResultNested<N>> implements InitializersFluent.ResultNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatusBuilder builder;
    
            ResultNestedImpl(Status item){
                    this.builder = new StatusBuilder(this, item);
            }
            ResultNestedImpl(){
                    this.builder = new StatusBuilder(this);
            }
    
    public N and(){
            return (N) InitializersFluentImpl.this.withResult(builder.build());
    }
    public N endResult(){
            return and();
    }

}


}
