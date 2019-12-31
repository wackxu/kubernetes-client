package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import javax.validation.constraints.NotNull;

public interface SubjectAccessReviewResponseFluent<A extends SubjectAccessReviewResponseFluent<A>> extends Fluent<A>{


    public Boolean isAllowed();
    public A withAllowed(Boolean allowed);
    public Boolean hasAllowed();
    public A withNewAllowed(String arg1);
    public A withNewAllowed(boolean arg1);
    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getEvaluationError();
    public A withEvaluationError(String evaluationError);
    public Boolean hasEvaluationError();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public String getNamespace();
    public A withNamespace(String namespace);
    public Boolean hasNamespace();
    public String getReason();
    public A withReason(String reason);
    public Boolean hasReason();



}
