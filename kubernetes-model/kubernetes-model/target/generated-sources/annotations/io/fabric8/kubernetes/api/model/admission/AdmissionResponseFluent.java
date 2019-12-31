package io.fabric8.kubernetes.api.model.admission;

import io.fabric8.kubernetes.api.model.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.StatusFluent;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.StatusBuilder;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface AdmissionResponseFluent<A extends AdmissionResponseFluent<A>> extends Fluent<A>{


    public Boolean isAllowed();
    public A withAllowed(Boolean allowed);
    public Boolean hasAllowed();
    public A withNewAllowed(String arg1);
    public A withNewAllowed(boolean arg1);
    public A addToAuditAnnotations(String key,String value);
    public A addToAuditAnnotations(Map<String,String> map);
    public A removeFromAuditAnnotations(String key);
    public A removeFromAuditAnnotations(Map<String,String> map);
    public Map<String,String> getAuditAnnotations();
    public A withAuditAnnotations(Map<String,String> auditAnnotations);
    public Boolean hasAuditAnnotations();
    public String getPatch();
    public A withPatch(String patch);
    public Boolean hasPatch();
    public String getPatchType();
    public A withPatchType(String patchType);
    public Boolean hasPatchType();
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public Status getStatus();
    public Status buildStatus();
    public A withStatus(Status status);
    public Boolean hasStatus();
    public AdmissionResponseFluent.StatusNested<A> withNewStatus();
    public AdmissionResponseFluent.StatusNested<A> withNewStatusLike(Status item);
    public AdmissionResponseFluent.StatusNested<A> editStatus();
    public AdmissionResponseFluent.StatusNested<A> editOrNewStatus();
    public AdmissionResponseFluent.StatusNested<A> editOrNewStatusLike(Status item);
    public String getUid();
    public A withUid(String uid);
    public Boolean hasUid();

    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatusFluent<AdmissionResponseFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
