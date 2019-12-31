package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class DeploymentDetailsFluentImpl<A extends DeploymentDetailsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DeploymentDetailsFluent<A>{

    private List<DeploymentCauseBuilder> causes;
    private String message;

    public DeploymentDetailsFluentImpl(){
    }
    public DeploymentDetailsFluentImpl(DeploymentDetails instance){
            this.withCauses(instance.getCauses()); 
            this.withMessage(instance.getMessage()); 
    }

    public A addToCauses(int index,DeploymentCause item){
            if (this.causes == null) {this.causes = new ArrayList<DeploymentCauseBuilder>();}
            DeploymentCauseBuilder builder = new DeploymentCauseBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.causes.add(index >= 0 ? index : causes.size(), builder); return (A)this;
    }

    public A setToCauses(int index,DeploymentCause item){
            if (this.causes == null) {this.causes = new ArrayList<DeploymentCauseBuilder>();}
            DeploymentCauseBuilder builder = new DeploymentCauseBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= causes.size()) { causes.add(builder); } else { causes.set(index, builder);}
             return (A)this;
    }

    public A addToCauses(DeploymentCause... items){
            if (this.causes == null) {this.causes = new ArrayList<DeploymentCauseBuilder>();}
            for (DeploymentCause item : items) {DeploymentCauseBuilder builder = new DeploymentCauseBuilder(item);_visitables.add(builder);this.causes.add(builder);} return (A)this;
    }

    public A addAllToCauses(Collection<DeploymentCause> items){
            if (this.causes == null) {this.causes = new ArrayList<DeploymentCauseBuilder>();}
            for (DeploymentCause item : items) {DeploymentCauseBuilder builder = new DeploymentCauseBuilder(item);_visitables.add(builder);this.causes.add(builder);} return (A)this;
    }

    public A removeFromCauses(DeploymentCause... items){
            for (DeploymentCause item : items) {DeploymentCauseBuilder builder = new DeploymentCauseBuilder(item);_visitables.remove(builder);if (this.causes != null) {this.causes.remove(builder);}} return (A)this;
    }

    public A removeAllFromCauses(Collection<DeploymentCause> items){
            for (DeploymentCause item : items) {DeploymentCauseBuilder builder = new DeploymentCauseBuilder(item);_visitables.remove(builder);if (this.causes != null) {this.causes.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildCauses instead.
 * @return The buildable object.
 */
@Deprecated public List<DeploymentCause> getCauses(){
            return build(causes);
    }

    public List<DeploymentCause> buildCauses(){
            return build(causes);
    }

    public DeploymentCause buildCause(int index){
            return this.causes.get(index).build();
    }

    public DeploymentCause buildFirstCause(){
            return this.causes.get(0).build();
    }

    public DeploymentCause buildLastCause(){
            return this.causes.get(causes.size() - 1).build();
    }

    public DeploymentCause buildMatchingCause(io.fabric8.kubernetes.api.builder.Predicate<DeploymentCauseBuilder> predicate){
            for (DeploymentCauseBuilder item: causes) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withCauses(List<DeploymentCause> causes){
            if (this.causes != null) { _visitables.removeAll(this.causes);}
            if (causes != null) {this.causes = new ArrayList<DeploymentCauseBuilder>(); for (DeploymentCause item : causes){this.addToCauses(item);}} else { this.causes = new ArrayList<DeploymentCauseBuilder>();} return (A) this;
    }

    public A withCauses(DeploymentCause... causes){
            if (this.causes != null) {this.causes.clear();}
            if (causes != null) {for (DeploymentCause item :causes){ this.addToCauses(item);}} return (A) this;
    }

    public Boolean hasCauses(){
            return causes != null && !causes.isEmpty();
    }

    public DeploymentDetailsFluent.CausesNested<A> addNewCause(){
            return new CausesNestedImpl();
    }

    public DeploymentDetailsFluent.CausesNested<A> addNewCauseLike(DeploymentCause item){
            return new CausesNestedImpl(-1, item);
    }

    public DeploymentDetailsFluent.CausesNested<A> setNewCauseLike(int index,DeploymentCause item){
            return new CausesNestedImpl(index, item);
    }

    public DeploymentDetailsFluent.CausesNested<A> editCause(int index){
            if (causes.size() <= index) throw new RuntimeException("Can't edit causes. Index exceeds size.");
            return setNewCauseLike(index, buildCause(index));
    }

    public DeploymentDetailsFluent.CausesNested<A> editFirstCause(){
            if (causes.size() == 0) throw new RuntimeException("Can't edit first causes. The list is empty.");
            return setNewCauseLike(0, buildCause(0));
    }

    public DeploymentDetailsFluent.CausesNested<A> editLastCause(){
            int index = causes.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last causes. The list is empty.");
            return setNewCauseLike(index, buildCause(index));
    }

    public DeploymentDetailsFluent.CausesNested<A> editMatchingCause(io.fabric8.kubernetes.api.builder.Predicate<DeploymentCauseBuilder> predicate){
            int index = -1;
            for (int i=0;i<causes.size();i++) { 
            if (predicate.apply(causes.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching causes. No match found.");
            return setNewCauseLike(index, buildCause(index));
    }

    public String getMessage(){
            return this.message;
    }

    public A withMessage(String message){
            this.message=message; return (A) this;
    }

    public Boolean hasMessage(){
            return this.message != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentDetailsFluentImpl that = (DeploymentDetailsFluentImpl) o;
            if (causes != null ? !causes.equals(that.causes) :that.causes != null) return false;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            return true;
    }


    public class CausesNestedImpl<N> extends DeploymentCauseFluentImpl<DeploymentDetailsFluent.CausesNested<N>> implements DeploymentDetailsFluent.CausesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentCauseBuilder builder;
        private final int index;
    
            CausesNestedImpl(int index,DeploymentCause item){
                    this.index = index;
                    this.builder = new DeploymentCauseBuilder(this, item);
            }
            CausesNestedImpl(){
                    this.index = -1;
                    this.builder = new DeploymentCauseBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentDetailsFluentImpl.this.setToCauses(index, builder.build());
    }
    public N endCause(){
            return and();
    }

}


}
