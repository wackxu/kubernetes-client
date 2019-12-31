package io.fabric8.kubernetes.api.model.authorization;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface SubjectAccessReviewStatusFluent<A extends SubjectAccessReviewStatusFluent<A>> extends Fluent<A>{


    public Boolean isAllowed();
    public A withAllowed(Boolean allowed);
    public Boolean hasAllowed();
    public A withNewAllowed(String arg1);
    public A withNewAllowed(boolean arg1);
    public Boolean isDenied();
    public A withDenied(Boolean denied);
    public Boolean hasDenied();
    public A withNewDenied(String arg1);
    public A withNewDenied(boolean arg1);
    public String getEvaluationError();
    public A withEvaluationError(String evaluationError);
    public Boolean hasEvaluationError();
    public String getReason();
    public A withReason(String reason);
    public Boolean hasReason();



}
