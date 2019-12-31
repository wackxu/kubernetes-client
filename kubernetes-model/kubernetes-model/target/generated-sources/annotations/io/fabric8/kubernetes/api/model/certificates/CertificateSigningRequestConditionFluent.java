package io.fabric8.kubernetes.api.model.certificates;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface CertificateSigningRequestConditionFluent<A extends CertificateSigningRequestConditionFluent<A>> extends Fluent<A>{


    public String getLastUpdateTime();
    public A withLastUpdateTime(String lastUpdateTime);
    public Boolean hasLastUpdateTime();
    public String getMessage();
    public A withMessage(String message);
    public Boolean hasMessage();
    public String getReason();
    public A withReason(String reason);
    public Boolean hasReason();
    public String getType();
    public A withType(String type);
    public Boolean hasType();



}
