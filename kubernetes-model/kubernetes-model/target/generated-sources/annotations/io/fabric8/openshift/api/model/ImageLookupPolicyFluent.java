package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ImageLookupPolicyFluent<A extends ImageLookupPolicyFluent<A>> extends Fluent<A>{


    public Boolean isLocal();
    public A withLocal(Boolean local);
    public Boolean hasLocal();
    public A withNewLocal(String arg1);
    public A withNewLocal(boolean arg1);



}
