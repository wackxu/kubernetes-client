package io.fabric8.kubernetes.api.model.admission;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface AdmissionReviewFluent<A extends AdmissionReviewFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildRequest instead.
 * @return The buildable object.
 */
@Deprecated public AdmissionRequest getRequest();
    public AdmissionRequest buildRequest();
    public A withRequest(AdmissionRequest request);
    public Boolean hasRequest();
    public AdmissionReviewFluent.RequestNested<A> withNewRequest();
    public AdmissionReviewFluent.RequestNested<A> withNewRequestLike(AdmissionRequest item);
    public AdmissionReviewFluent.RequestNested<A> editRequest();
    public AdmissionReviewFluent.RequestNested<A> editOrNewRequest();
    public AdmissionReviewFluent.RequestNested<A> editOrNewRequestLike(AdmissionRequest item);
    
/**
 * This method has been deprecated, please use method buildResponse instead.
 * @return The buildable object.
 */
@Deprecated public AdmissionResponse getResponse();
    public AdmissionResponse buildResponse();
    public A withResponse(AdmissionResponse response);
    public Boolean hasResponse();
    public AdmissionReviewFluent.ResponseNested<A> withNewResponse();
    public AdmissionReviewFluent.ResponseNested<A> withNewResponseLike(AdmissionResponse item);
    public AdmissionReviewFluent.ResponseNested<A> editResponse();
    public AdmissionReviewFluent.ResponseNested<A> editOrNewResponse();
    public AdmissionReviewFluent.ResponseNested<A> editOrNewResponseLike(AdmissionResponse item);

    public interface RequestNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AdmissionRequestFluent<AdmissionReviewFluent.RequestNested<N>>{

        
    public N and();    public N endRequest();
}
    public interface ResponseNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AdmissionResponseFluent<AdmissionReviewFluent.ResponseNested<N>>{

        
    public N and();    public N endResponse();
}


}
