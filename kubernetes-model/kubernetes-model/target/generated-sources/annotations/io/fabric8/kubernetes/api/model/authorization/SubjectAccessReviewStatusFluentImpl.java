package io.fabric8.kubernetes.api.model.authorization;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class SubjectAccessReviewStatusFluentImpl<A extends SubjectAccessReviewStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SubjectAccessReviewStatusFluent<A>{

    private Boolean allowed;
    private Boolean denied;
    private String evaluationError;
    private String reason;

    public SubjectAccessReviewStatusFluentImpl(){
    }
    public SubjectAccessReviewStatusFluentImpl(SubjectAccessReviewStatus instance){
            this.withAllowed(instance.getAllowed()); 
            this.withDenied(instance.getDenied()); 
            this.withEvaluationError(instance.getEvaluationError()); 
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

    public Boolean isDenied(){
            return this.denied;
    }

    public A withDenied(Boolean denied){
            this.denied=denied; return (A) this;
    }

    public Boolean hasDenied(){
            return this.denied != null;
    }

    public A withNewDenied(String arg1){
            return (A)withDenied(new Boolean(arg1));
    }

    public A withNewDenied(boolean arg1){
            return (A)withDenied(new Boolean(arg1));
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
            SubjectAccessReviewStatusFluentImpl that = (SubjectAccessReviewStatusFluentImpl) o;
            if (allowed != null ? !allowed.equals(that.allowed) :that.allowed != null) return false;
            if (denied != null ? !denied.equals(that.denied) :that.denied != null) return false;
            if (evaluationError != null ? !evaluationError.equals(that.evaluationError) :that.evaluationError != null) return false;
            if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
            return true;
    }




}
