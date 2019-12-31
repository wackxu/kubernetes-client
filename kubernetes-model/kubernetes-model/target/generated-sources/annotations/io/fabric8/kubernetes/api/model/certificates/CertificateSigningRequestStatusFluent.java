package io.fabric8.kubernetes.api.model.certificates;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
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

public interface CertificateSigningRequestStatusFluent<A extends CertificateSigningRequestStatusFluent<A>> extends Fluent<A>{


    public String getCertificate();
    public A withCertificate(String certificate);
    public Boolean hasCertificate();
    public A addToConditions(int index,CertificateSigningRequestCondition item);
    public A setToConditions(int index,CertificateSigningRequestCondition item);
    public A addToConditions(CertificateSigningRequestCondition... items);
    public A addAllToConditions(Collection<CertificateSigningRequestCondition> items);
    public A removeFromConditions(CertificateSigningRequestCondition... items);
    public A removeAllFromConditions(Collection<CertificateSigningRequestCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<CertificateSigningRequestCondition> getConditions();
    public List<CertificateSigningRequestCondition> buildConditions();
    public CertificateSigningRequestCondition buildCondition(int index);
    public CertificateSigningRequestCondition buildFirstCondition();
    public CertificateSigningRequestCondition buildLastCondition();
    public CertificateSigningRequestCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<CertificateSigningRequestConditionBuilder> predicate);
    public A withConditions(List<CertificateSigningRequestCondition> conditions);
    public A withConditions(CertificateSigningRequestCondition... conditions);
    public Boolean hasConditions();
    public A addNewCondition(String lastUpdateTime,String message,String reason,String type);
    public CertificateSigningRequestStatusFluent.ConditionsNested<A> addNewCondition();
    public CertificateSigningRequestStatusFluent.ConditionsNested<A> addNewConditionLike(CertificateSigningRequestCondition item);
    public CertificateSigningRequestStatusFluent.ConditionsNested<A> setNewConditionLike(int index,CertificateSigningRequestCondition item);
    public CertificateSigningRequestStatusFluent.ConditionsNested<A> editCondition(int index);
    public CertificateSigningRequestStatusFluent.ConditionsNested<A> editFirstCondition();
    public CertificateSigningRequestStatusFluent.ConditionsNested<A> editLastCondition();
    public CertificateSigningRequestStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<CertificateSigningRequestConditionBuilder> predicate);

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestConditionFluent<CertificateSigningRequestStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}


}
