package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ContainerStateTerminatedFluent<A extends ContainerStateTerminatedFluent<A>> extends Fluent<A>{


    public String getContainerID();
    public A withContainerID(String containerID);
    public Boolean hasContainerID();
    public Integer getExitCode();
    public A withExitCode(Integer exitCode);
    public Boolean hasExitCode();
    public String getFinishedAt();
    public A withFinishedAt(String finishedAt);
    public Boolean hasFinishedAt();
    public String getMessage();
    public A withMessage(String message);
    public Boolean hasMessage();
    public String getReason();
    public A withReason(String reason);
    public Boolean hasReason();
    public Integer getSignal();
    public A withSignal(Integer signal);
    public Boolean hasSignal();
    public String getStartedAt();
    public A withStartedAt(String startedAt);
    public Boolean hasStartedAt();



}
