package io.fabric8.kubernetes.api.model.admission;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class AdmissionReviewFluentImpl<A extends AdmissionReviewFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements AdmissionReviewFluent<A>{

    private String apiVersion;
    private String kind;
    private AdmissionRequestBuilder request;
    private AdmissionResponseBuilder response;

    public AdmissionReviewFluentImpl(){
    }
    public AdmissionReviewFluentImpl(AdmissionReview instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withRequest(instance.getRequest()); 
            this.withResponse(instance.getResponse()); 
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

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    
/**
 * This method has been deprecated, please use method buildRequest instead.
 * @return The buildable object.
 */
@Deprecated public AdmissionRequest getRequest(){
            return this.request!=null?this.request.build():null;
    }

    public AdmissionRequest buildRequest(){
            return this.request!=null?this.request.build():null;
    }

    public A withRequest(AdmissionRequest request){
            _visitables.remove(this.request);
            if (request!=null){ this.request= new AdmissionRequestBuilder(request); _visitables.add(this.request);} return (A) this;
    }

    public Boolean hasRequest(){
            return this.request != null;
    }

    public AdmissionReviewFluent.RequestNested<A> withNewRequest(){
            return new RequestNestedImpl();
    }

    public AdmissionReviewFluent.RequestNested<A> withNewRequestLike(AdmissionRequest item){
            return new RequestNestedImpl(item);
    }

    public AdmissionReviewFluent.RequestNested<A> editRequest(){
            return withNewRequestLike(getRequest());
    }

    public AdmissionReviewFluent.RequestNested<A> editOrNewRequest(){
            return withNewRequestLike(getRequest() != null ? getRequest(): new AdmissionRequestBuilder().build());
    }

    public AdmissionReviewFluent.RequestNested<A> editOrNewRequestLike(AdmissionRequest item){
            return withNewRequestLike(getRequest() != null ? getRequest(): item);
    }

    
/**
 * This method has been deprecated, please use method buildResponse instead.
 * @return The buildable object.
 */
@Deprecated public AdmissionResponse getResponse(){
            return this.response!=null?this.response.build():null;
    }

    public AdmissionResponse buildResponse(){
            return this.response!=null?this.response.build():null;
    }

    public A withResponse(AdmissionResponse response){
            _visitables.remove(this.response);
            if (response!=null){ this.response= new AdmissionResponseBuilder(response); _visitables.add(this.response);} return (A) this;
    }

    public Boolean hasResponse(){
            return this.response != null;
    }

    public AdmissionReviewFluent.ResponseNested<A> withNewResponse(){
            return new ResponseNestedImpl();
    }

    public AdmissionReviewFluent.ResponseNested<A> withNewResponseLike(AdmissionResponse item){
            return new ResponseNestedImpl(item);
    }

    public AdmissionReviewFluent.ResponseNested<A> editResponse(){
            return withNewResponseLike(getResponse());
    }

    public AdmissionReviewFluent.ResponseNested<A> editOrNewResponse(){
            return withNewResponseLike(getResponse() != null ? getResponse(): new AdmissionResponseBuilder().build());
    }

    public AdmissionReviewFluent.ResponseNested<A> editOrNewResponseLike(AdmissionResponse item){
            return withNewResponseLike(getResponse() != null ? getResponse(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AdmissionReviewFluentImpl that = (AdmissionReviewFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (request != null ? !request.equals(that.request) :that.request != null) return false;
            if (response != null ? !response.equals(that.response) :that.response != null) return false;
            return true;
    }


    public class RequestNestedImpl<N> extends AdmissionRequestFluentImpl<AdmissionReviewFluent.RequestNested<N>> implements AdmissionReviewFluent.RequestNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AdmissionRequestBuilder builder;
    
            RequestNestedImpl(AdmissionRequest item){
                    this.builder = new AdmissionRequestBuilder(this, item);
            }
            RequestNestedImpl(){
                    this.builder = new AdmissionRequestBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionReviewFluentImpl.this.withRequest(builder.build());
    }
    public N endRequest(){
            return and();
    }

}
    public class ResponseNestedImpl<N> extends AdmissionResponseFluentImpl<AdmissionReviewFluent.ResponseNested<N>> implements AdmissionReviewFluent.ResponseNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AdmissionResponseBuilder builder;
    
            ResponseNestedImpl(AdmissionResponse item){
                    this.builder = new AdmissionResponseBuilder(this, item);
            }
            ResponseNestedImpl(){
                    this.builder = new AdmissionResponseBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionReviewFluentImpl.this.withResponse(builder.build());
    }
    public N endResponse(){
            return and();
    }

}


}
