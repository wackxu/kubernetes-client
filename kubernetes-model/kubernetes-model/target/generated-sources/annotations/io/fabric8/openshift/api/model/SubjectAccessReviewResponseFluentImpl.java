package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import javax.validation.constraints.NotNull;

public class SubjectAccessReviewResponseFluentImpl<A extends SubjectAccessReviewResponseFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SubjectAccessReviewResponseFluent<A>{

    private Boolean allowed;
    private String apiVersion;
    private String evaluationError;
    private String kind;
    private String namespace;
    private String reason;

    public SubjectAccessReviewResponseFluentImpl(){
    }
    public SubjectAccessReviewResponseFluentImpl(SubjectAccessReviewResponse instance){
            this.withAllowed(instance.getAllowed()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withEvaluationError(instance.getEvaluationError()); 
            this.withKind(instance.getKind()); 
            this.withNamespace(instance.getNamespace()); 
            this.withReason(instance.getReason()); 
    }

    public Boolean isAllowed(){
            return this.allowed;
    }

    public A withAllowed(Boolean allowed){
            this.allowed=allowed; return (A) this;
    }

    public Boolean hasAllowed(){
            return this.allowed != null;
    }

    public A withNewAllowed(String arg1){
            return (A)withAllowed(new Boolean(arg1));
    }

    public A withNewAllowed(boolean arg1){
            return (A)withAllowed(new Boolean(arg1));
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

    public String getEvaluationError(){
            return this.evaluationError;
    }

    public A withEvaluationError(String evaluationError){
            this.evaluationError=evaluationError; return (A) this;
    }

    public Boolean hasEvaluationError(){
            return this.evaluationError != null;
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

    public String getNamespace(){
            return this.namespace;
    }

    public A withNamespace(String namespace){
            this.namespace=namespace; return (A) this;
    }

    public Boolean hasNamespace(){
            return this.namespace != null;
    }

    public String getReason(){
            return this.reason;
    }

    public A withReason(String reason){
            this.reason=reason; return (A) this;
    }

    public Boolean hasReason(){
            return this.reason != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SubjectAccessReviewResponseFluentImpl that = (SubjectAccessReviewResponseFluentImpl) o;
            if (allowed != null ? !allowed.equals(that.allowed) :that.allowed != null) return false;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (evaluationError != null ? !evaluationError.equals(that.evaluationError) :that.evaluationError != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
            if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
            return true;
    }




}
