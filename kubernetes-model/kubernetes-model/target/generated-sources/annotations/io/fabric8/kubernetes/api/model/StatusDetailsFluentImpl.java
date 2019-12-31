package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class StatusDetailsFluentImpl<A extends StatusDetailsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements StatusDetailsFluent<A>{

    private List<StatusCauseBuilder> causes;
    private String group;
    private String kind;
    private String name;
    private Integer retryAfterSeconds;
    private String uid;

    public StatusDetailsFluentImpl(){
    }
    public StatusDetailsFluentImpl(StatusDetails instance){
            this.withCauses(instance.getCauses()); 
            this.withGroup(instance.getGroup()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withRetryAfterSeconds(instance.getRetryAfterSeconds()); 
            this.withUid(instance.getUid()); 
    }

    public A addToCauses(int index,StatusCause item){
            if (this.causes == null) {this.causes = new ArrayList<StatusCauseBuilder>();}
            StatusCauseBuilder builder = new StatusCauseBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.causes.add(index >= 0 ? index : causes.size(), builder); return (A)this;
    }

    public A setToCauses(int index,StatusCause item){
            if (this.causes == null) {this.causes = new ArrayList<StatusCauseBuilder>();}
            StatusCauseBuilder builder = new StatusCauseBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= causes.size()) { causes.add(builder); } else { causes.set(index, builder);}
             return (A)this;
    }

    public A addToCauses(StatusCause... items){
            if (this.causes == null) {this.causes = new ArrayList<StatusCauseBuilder>();}
            for (StatusCause item : items) {StatusCauseBuilder builder = new StatusCauseBuilder(item);_visitables.add(builder);this.causes.add(builder);} return (A)this;
    }

    public A addAllToCauses(Collection<StatusCause> items){
            if (this.causes == null) {this.causes = new ArrayList<StatusCauseBuilder>();}
            for (StatusCause item : items) {StatusCauseBuilder builder = new StatusCauseBuilder(item);_visitables.add(builder);this.causes.add(builder);} return (A)this;
    }

    public A removeFromCauses(StatusCause... items){
            for (StatusCause item : items) {StatusCauseBuilder builder = new StatusCauseBuilder(item);_visitables.remove(builder);if (this.causes != null) {this.causes.remove(builder);}} return (A)this;
    }

    public A removeAllFromCauses(Collection<StatusCause> items){
            for (StatusCause item : items) {StatusCauseBuilder builder = new StatusCauseBuilder(item);_visitables.remove(builder);if (this.causes != null) {this.causes.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildCauses instead.
 * @return The buildable object.
 */
@Deprecated public List<StatusCause> getCauses(){
            return build(causes);
    }

    public List<StatusCause> buildCauses(){
            return build(causes);
    }

    public StatusCause buildCause(int index){
            return this.causes.get(index).build();
    }

    public StatusCause buildFirstCause(){
            return this.causes.get(0).build();
    }

    public StatusCause buildLastCause(){
            return this.causes.get(causes.size() - 1).build();
    }

    public StatusCause buildMatchingCause(io.fabric8.kubernetes.api.builder.Predicate<StatusCauseBuilder> predicate){
            for (StatusCauseBuilder item: causes) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withCauses(List<StatusCause> causes){
            if (this.causes != null) { _visitables.removeAll(this.causes);}
            if (causes != null) {this.causes = new ArrayList<StatusCauseBuilder>(); for (StatusCause item : causes){this.addToCauses(item);}} else { this.causes = new ArrayList<StatusCauseBuilder>();} return (A) this;
    }

    public A withCauses(StatusCause... causes){
            if (this.causes != null) {this.causes.clear();}
            if (causes != null) {for (StatusCause item :causes){ this.addToCauses(item);}} return (A) this;
    }

    public Boolean hasCauses(){
            return causes != null && !causes.isEmpty();
    }

    public A addNewCause(String field,String message,String reason){
            return (A)addToCauses(new StatusCause(field, message, reason));
    }

    public StatusDetailsFluent.CausesNested<A> addNewCause(){
            return new CausesNestedImpl();
    }

    public StatusDetailsFluent.CausesNested<A> addNewCauseLike(StatusCause item){
            return new CausesNestedImpl(-1, item);
    }

    public StatusDetailsFluent.CausesNested<A> setNewCauseLike(int index,StatusCause item){
            return new CausesNestedImpl(index, item);
    }

    public StatusDetailsFluent.CausesNested<A> editCause(int index){
            if (causes.size() <= index) throw new RuntimeException("Can't edit causes. Index exceeds size.");
            return setNewCauseLike(index, buildCause(index));
    }

    public StatusDetailsFluent.CausesNested<A> editFirstCause(){
            if (causes.size() == 0) throw new RuntimeException("Can't edit first causes. The list is empty.");
            return setNewCauseLike(0, buildCause(0));
    }

    public StatusDetailsFluent.CausesNested<A> editLastCause(){
            int index = causes.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last causes. The list is empty.");
            return setNewCauseLike(index, buildCause(index));
    }

    public StatusDetailsFluent.CausesNested<A> editMatchingCause(io.fabric8.kubernetes.api.builder.Predicate<StatusCauseBuilder> predicate){
            int index = -1;
            for (int i=0;i<causes.size();i++) { 
            if (predicate.apply(causes.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching causes. No match found.");
            return setNewCauseLike(index, buildCause(index));
    }

    public String getGroup(){
            return this.group;
    }

    public A withGroup(String group){
            this.group=group; return (A) this;
    }

    public Boolean hasGroup(){
            return this.group != null;
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public Integer getRetryAfterSeconds(){
            return this.retryAfterSeconds;
    }

    public A withRetryAfterSeconds(Integer retryAfterSeconds){
            this.retryAfterSeconds=retryAfterSeconds; return (A) this;
    }

    public Boolean hasRetryAfterSeconds(){
            return this.retryAfterSeconds != null;
    }

    public String getUid(){
            return this.uid;
    }

    public A withUid(String uid){
            this.uid=uid; return (A) this;
    }

    public Boolean hasUid(){
            return this.uid != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StatusDetailsFluentImpl that = (StatusDetailsFluentImpl) o;
            if (causes != null ? !causes.equals(that.causes) :that.causes != null) return false;
            if (group != null ? !group.equals(that.group) :that.group != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (retryAfterSeconds != null ? !retryAfterSeconds.equals(that.retryAfterSeconds) :that.retryAfterSeconds != null) return false;
            if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
            return true;
    }


    public class CausesNestedImpl<N> extends StatusCauseFluentImpl<StatusDetailsFluent.CausesNested<N>> implements StatusDetailsFluent.CausesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatusCauseBuilder builder;
        private final int index;
    
            CausesNestedImpl(int index,StatusCause item){
                    this.index = index;
                    this.builder = new StatusCauseBuilder(this, item);
            }
            CausesNestedImpl(){
                    this.index = -1;
                    this.builder = new StatusCauseBuilder(this);
            }
    
    public N and(){
            return (N) StatusDetailsFluentImpl.this.setToCauses(index, builder.build());
    }
    public N endCause(){
            return and();
    }

}


}
