package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class DeleteOptionsFluentImpl<A extends DeleteOptionsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DeleteOptionsFluent<A>{

    private String apiVersion;
    private List<String> dryRun;
    private Long gracePeriodSeconds;
    private String kind;
    private Boolean orphanDependents;
    private PreconditionsBuilder preconditions;
    private String propagationPolicy;

    public DeleteOptionsFluentImpl(){
    }
    public DeleteOptionsFluentImpl(DeleteOptions instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withDryRun(instance.getDryRun()); 
            this.withGracePeriodSeconds(instance.getGracePeriodSeconds()); 
            this.withKind(instance.getKind()); 
            this.withOrphanDependents(instance.getOrphanDependents()); 
            this.withPreconditions(instance.getPreconditions()); 
            this.withPropagationPolicy(instance.getPropagationPolicy()); 
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public A addToDryRun(int index,String item){
            if (this.dryRun == null) {this.dryRun = new ArrayList<String>();}
            this.dryRun.add(index, item);
            return (A)this;
    }

    public A setToDryRun(int index,String item){
            if (this.dryRun == null) {this.dryRun = new ArrayList<String>();}
            this.dryRun.set(index, item); return (A)this;
    }

    public A addToDryRun(String... items){
            if (this.dryRun == null) {this.dryRun = new ArrayList<String>();}
            for (String item : items) {this.dryRun.add(item);} return (A)this;
    }

    public A addAllToDryRun(Collection<String> items){
            if (this.dryRun == null) {this.dryRun = new ArrayList<String>();}
            for (String item : items) {this.dryRun.add(item);} return (A)this;
    }

    public A removeFromDryRun(String... items){
            for (String item : items) {if (this.dryRun!= null){ this.dryRun.remove(item);}} return (A)this;
    }

    public A removeAllFromDryRun(Collection<String> items){
            for (String item : items) {if (this.dryRun!= null){ this.dryRun.remove(item);}} return (A)this;
    }

    public List<String> getDryRun(){
            return this.dryRun;
    }

    public String getDryRun(int index){
            return this.dryRun.get(index);
    }

    public String getFirstDryRun(){
            return this.dryRun.get(0);
    }

    public String getLastDryRun(){
            return this.dryRun.get(dryRun.size() - 1);
    }

    public String getMatchingDryRun(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: dryRun) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withDryRun(List<String> dryRun){
            if (this.dryRun != null) { _visitables.removeAll(this.dryRun);}
            if (dryRun != null) {this.dryRun = new ArrayList<String>(); for (String item : dryRun){this.addToDryRun(item);}} else { this.dryRun = new ArrayList<String>();} return (A) this;
    }

    public A withDryRun(String... dryRun){
            if (this.dryRun != null) {this.dryRun.clear();}
            if (dryRun != null) {for (String item :dryRun){ this.addToDryRun(item);}} return (A) this;
    }

    public Boolean hasDryRun(){
            return dryRun != null && !dryRun.isEmpty();
    }

    public Long getGracePeriodSeconds(){
            return this.gracePeriodSeconds;
    }

    public A withGracePeriodSeconds(Long gracePeriodSeconds){
            this.gracePeriodSeconds=gracePeriodSeconds; return (A) this;
    }

    public Boolean hasGracePeriodSeconds(){
            return this.gracePeriodSeconds != null;
    }

    public A withNewGracePeriodSeconds(String arg1){
            return (A)withGracePeriodSeconds(new Long(arg1));
    }

    public A withNewGracePeriodSeconds(long arg1){
            return (A)withGracePeriodSeconds(new Long(arg1));
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

    public Boolean isOrphanDependents(){
            return this.orphanDependents;
    }

    public A withOrphanDependents(Boolean orphanDependents){
            this.orphanDependents=orphanDependents; return (A) this;
    }

    public Boolean hasOrphanDependents(){
            return this.orphanDependents != null;
    }

    public A withNewOrphanDependents(String arg1){
            return (A)withOrphanDependents(new Boolean(arg1));
    }

    public A withNewOrphanDependents(boolean arg1){
            return (A)withOrphanDependents(new Boolean(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildPreconditions instead.
 * @return The buildable object.
 */
@Deprecated public Preconditions getPreconditions(){
            return this.preconditions!=null?this.preconditions.build():null;
    }

    public Preconditions buildPreconditions(){
            return this.preconditions!=null?this.preconditions.build():null;
    }

    public A withPreconditions(Preconditions preconditions){
            _visitables.remove(this.preconditions);
            if (preconditions!=null){ this.preconditions= new PreconditionsBuilder(preconditions); _visitables.add(this.preconditions);} return (A) this;
    }

    public Boolean hasPreconditions(){
            return this.preconditions != null;
    }

    public A withNewPreconditions(String uid){
            return (A)withPreconditions(new Preconditions(uid));
    }

    public DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditions(){
            return new PreconditionsNestedImpl();
    }

    public DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditionsLike(Preconditions item){
            return new PreconditionsNestedImpl(item);
    }

    public DeleteOptionsFluent.PreconditionsNested<A> editPreconditions(){
            return withNewPreconditionsLike(getPreconditions());
    }

    public DeleteOptionsFluent.PreconditionsNested<A> editOrNewPreconditions(){
            return withNewPreconditionsLike(getPreconditions() != null ? getPreconditions(): new PreconditionsBuilder().build());
    }

    public DeleteOptionsFluent.PreconditionsNested<A> editOrNewPreconditionsLike(Preconditions item){
            return withNewPreconditionsLike(getPreconditions() != null ? getPreconditions(): item);
    }

    public String getPropagationPolicy(){
            return this.propagationPolicy;
    }

    public A withPropagationPolicy(String propagationPolicy){
            this.propagationPolicy=propagationPolicy; return (A) this;
    }

    public Boolean hasPropagationPolicy(){
            return this.propagationPolicy != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeleteOptionsFluentImpl that = (DeleteOptionsFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (dryRun != null ? !dryRun.equals(that.dryRun) :that.dryRun != null) return false;
            if (gracePeriodSeconds != null ? !gracePeriodSeconds.equals(that.gracePeriodSeconds) :that.gracePeriodSeconds != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (orphanDependents != null ? !orphanDependents.equals(that.orphanDependents) :that.orphanDependents != null) return false;
            if (preconditions != null ? !preconditions.equals(that.preconditions) :that.preconditions != null) return false;
            if (propagationPolicy != null ? !propagationPolicy.equals(that.propagationPolicy) :that.propagationPolicy != null) return false;
            return true;
    }


    public class PreconditionsNestedImpl<N> extends PreconditionsFluentImpl<DeleteOptionsFluent.PreconditionsNested<N>> implements DeleteOptionsFluent.PreconditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PreconditionsBuilder builder;
    
            PreconditionsNestedImpl(Preconditions item){
                    this.builder = new PreconditionsBuilder(this, item);
            }
            PreconditionsNestedImpl(){
                    this.builder = new PreconditionsBuilder(this);
            }
    
    public N and(){
            return (N) DeleteOptionsFluentImpl.this.withPreconditions(builder.build());
    }
    public N endPreconditions(){
            return and();
    }

}


}
