package io.fabric8.kubernetes.api.model.certificates;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
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

public class CertificateSigningRequestStatusFluentImpl<A extends CertificateSigningRequestStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CertificateSigningRequestStatusFluent<A>{

    private String certificate;
    private List<CertificateSigningRequestConditionBuilder> conditions;

    public CertificateSigningRequestStatusFluentImpl(){
    }
    public CertificateSigningRequestStatusFluentImpl(CertificateSigningRequestStatus instance){
            this.withCertificate(instance.getCertificate()); 
            this.withConditions(instance.getConditions()); 
    }

    public String getCertificate(){
            return this.certificate;
    }

    public A withCertificate(String certificate){
            this.certificate=certificate; return (A) this;
    }

    public Boolean hasCertificate(){
            return this.certificate != null;
    }

    public A addToConditions(int index,CertificateSigningRequestCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<CertificateSigningRequestConditionBuilder>();}
            CertificateSigningRequestConditionBuilder builder = new CertificateSigningRequestConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,CertificateSigningRequestCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<CertificateSigningRequestConditionBuilder>();}
            CertificateSigningRequestConditionBuilder builder = new CertificateSigningRequestConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(CertificateSigningRequestCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<CertificateSigningRequestConditionBuilder>();}
            for (CertificateSigningRequestCondition item : items) {CertificateSigningRequestConditionBuilder builder = new CertificateSigningRequestConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<CertificateSigningRequestCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<CertificateSigningRequestConditionBuilder>();}
            for (CertificateSigningRequestCondition item : items) {CertificateSigningRequestConditionBuilder builder = new CertificateSigningRequestConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(CertificateSigningRequestCondition... items){
            for (CertificateSigningRequestCondition item : items) {CertificateSigningRequestConditionBuilder builder = new CertificateSigningRequestConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<CertificateSigningRequestCondition> items){
            for (CertificateSigningRequestCondition item : items) {CertificateSigningRequestConditionBuilder builder = new CertificateSigningRequestConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<CertificateSigningRequestCondition> getConditions(){
            return build(conditions);
    }

    public List<CertificateSigningRequestCondition> buildConditions(){
            return build(conditions);
    }

    public CertificateSigningRequestCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public CertificateSigningRequestCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public CertificateSigningRequestCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public CertificateSigningRequestCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<CertificateSigningRequestConditionBuilder> predicate){
            for (CertificateSigningRequestConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<CertificateSigningRequestCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<CertificateSigningRequestConditionBuilder>(); for (CertificateSigningRequestCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<CertificateSigningRequestConditionBuilder>();} return (A) this;
    }

    public A withConditions(CertificateSigningRequestCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (CertificateSigningRequestCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public A addNewCondition(String lastUpdateTime,String message,String reason,String type){
            return (A)addToConditions(new CertificateSigningRequestCondition(lastUpdateTime, message, reason, type));
    }

    public CertificateSigningRequestStatusFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public CertificateSigningRequestStatusFluent.ConditionsNested<A> addNewConditionLike(CertificateSigningRequestCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public CertificateSigningRequestStatusFluent.ConditionsNested<A> setNewConditionLike(int index,CertificateSigningRequestCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public CertificateSigningRequestStatusFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public CertificateSigningRequestStatusFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public CertificateSigningRequestStatusFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public CertificateSigningRequestStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<CertificateSigningRequestConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CertificateSigningRequestStatusFluentImpl that = (CertificateSigningRequestStatusFluentImpl) o;
            if (certificate != null ? !certificate.equals(that.certificate) :that.certificate != null) return false;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends CertificateSigningRequestConditionFluentImpl<CertificateSigningRequestStatusFluent.ConditionsNested<N>> implements CertificateSigningRequestStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,CertificateSigningRequestCondition item){
                    this.index = index;
                    this.builder = new CertificateSigningRequestConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new CertificateSigningRequestConditionBuilder(this);
            }
    
    public N and(){
            return (N) CertificateSigningRequestStatusFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}


}
