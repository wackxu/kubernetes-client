package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface TagImportPolicyFluent<A extends TagImportPolicyFluent<A>> extends Fluent<A>{


    public Boolean isInsecure();
    public A withInsecure(Boolean insecure);
    public Boolean hasInsecure();
    public A withNewInsecure(String arg1);
    public A withNewInsecure(boolean arg1);
    public Boolean isScheduled();
    public A withScheduled(Boolean scheduled);
    public Boolean hasScheduled();
    public A withNewScheduled(String arg1);
    public A withNewScheduled(boolean arg1);



}
