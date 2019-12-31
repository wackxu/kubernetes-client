package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface ProbeFluent<A extends ProbeFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildExec instead.
 * @return The buildable object.
 */
@Deprecated public ExecAction getExec();
    public ExecAction buildExec();
    public A withExec(ExecAction exec);
    public Boolean hasExec();
    public ProbeFluent.ExecNested<A> withNewExec();
    public ProbeFluent.ExecNested<A> withNewExecLike(ExecAction item);
    public ProbeFluent.ExecNested<A> editExec();
    public ProbeFluent.ExecNested<A> editOrNewExec();
    public ProbeFluent.ExecNested<A> editOrNewExecLike(ExecAction item);
    public Integer getFailureThreshold();
    public A withFailureThreshold(Integer failureThreshold);
    public Boolean hasFailureThreshold();
    
/**
 * This method has been deprecated, please use method buildHttpGet instead.
 * @return The buildable object.
 */
@Deprecated public HTTPGetAction getHttpGet();
    public HTTPGetAction buildHttpGet();
    public A withHttpGet(HTTPGetAction httpGet);
    public Boolean hasHttpGet();
    public ProbeFluent.HttpGetNested<A> withNewHttpGet();
    public ProbeFluent.HttpGetNested<A> withNewHttpGetLike(HTTPGetAction item);
    public ProbeFluent.HttpGetNested<A> editHttpGet();
    public ProbeFluent.HttpGetNested<A> editOrNewHttpGet();
    public ProbeFluent.HttpGetNested<A> editOrNewHttpGetLike(HTTPGetAction item);
    public Integer getInitialDelaySeconds();
    public A withInitialDelaySeconds(Integer initialDelaySeconds);
    public Boolean hasInitialDelaySeconds();
    public Integer getPeriodSeconds();
    public A withPeriodSeconds(Integer periodSeconds);
    public Boolean hasPeriodSeconds();
    public Integer getSuccessThreshold();
    public A withSuccessThreshold(Integer successThreshold);
    public Boolean hasSuccessThreshold();
    
/**
 * This method has been deprecated, please use method buildTcpSocket instead.
 * @return The buildable object.
 */
@Deprecated public TCPSocketAction getTcpSocket();
    public TCPSocketAction buildTcpSocket();
    public A withTcpSocket(TCPSocketAction tcpSocket);
    public Boolean hasTcpSocket();
    public ProbeFluent.TcpSocketNested<A> withNewTcpSocket();
    public ProbeFluent.TcpSocketNested<A> withNewTcpSocketLike(TCPSocketAction item);
    public ProbeFluent.TcpSocketNested<A> editTcpSocket();
    public ProbeFluent.TcpSocketNested<A> editOrNewTcpSocket();
    public ProbeFluent.TcpSocketNested<A> editOrNewTcpSocketLike(TCPSocketAction item);
    public Integer getTimeoutSeconds();
    public A withTimeoutSeconds(Integer timeoutSeconds);
    public Boolean hasTimeoutSeconds();

    public interface ExecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExecActionFluent<ProbeFluent.ExecNested<N>>{

        
    public N and();    public N endExec();
}
    public interface HttpGetNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HTTPGetActionFluent<ProbeFluent.HttpGetNested<N>>{

        
    public N and();    public N endHttpGet();
}
    public interface TcpSocketNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TCPSocketActionFluent<ProbeFluent.TcpSocketNested<N>>{

        
    public N and();    public N endTcpSocket();
}


}
