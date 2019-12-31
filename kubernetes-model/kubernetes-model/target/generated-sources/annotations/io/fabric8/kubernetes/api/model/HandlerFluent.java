package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface HandlerFluent<A extends HandlerFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildExec instead.
 * @return The buildable object.
 */
@Deprecated public ExecAction getExec();
    public ExecAction buildExec();
    public A withExec(ExecAction exec);
    public Boolean hasExec();
    public HandlerFluent.ExecNested<A> withNewExec();
    public HandlerFluent.ExecNested<A> withNewExecLike(ExecAction item);
    public HandlerFluent.ExecNested<A> editExec();
    public HandlerFluent.ExecNested<A> editOrNewExec();
    public HandlerFluent.ExecNested<A> editOrNewExecLike(ExecAction item);
    
/**
 * This method has been deprecated, please use method buildHttpGet instead.
 * @return The buildable object.
 */
@Deprecated public HTTPGetAction getHttpGet();
    public HTTPGetAction buildHttpGet();
    public A withHttpGet(HTTPGetAction httpGet);
    public Boolean hasHttpGet();
    public HandlerFluent.HttpGetNested<A> withNewHttpGet();
    public HandlerFluent.HttpGetNested<A> withNewHttpGetLike(HTTPGetAction item);
    public HandlerFluent.HttpGetNested<A> editHttpGet();
    public HandlerFluent.HttpGetNested<A> editOrNewHttpGet();
    public HandlerFluent.HttpGetNested<A> editOrNewHttpGetLike(HTTPGetAction item);
    
/**
 * This method has been deprecated, please use method buildTcpSocket instead.
 * @return The buildable object.
 */
@Deprecated public TCPSocketAction getTcpSocket();
    public TCPSocketAction buildTcpSocket();
    public A withTcpSocket(TCPSocketAction tcpSocket);
    public Boolean hasTcpSocket();
    public HandlerFluent.TcpSocketNested<A> withNewTcpSocket();
    public HandlerFluent.TcpSocketNested<A> withNewTcpSocketLike(TCPSocketAction item);
    public HandlerFluent.TcpSocketNested<A> editTcpSocket();
    public HandlerFluent.TcpSocketNested<A> editOrNewTcpSocket();
    public HandlerFluent.TcpSocketNested<A> editOrNewTcpSocketLike(TCPSocketAction item);

    public interface ExecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExecActionFluent<HandlerFluent.ExecNested<N>>{

        
    public N and();    public N endExec();
}
    public interface HttpGetNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HTTPGetActionFluent<HandlerFluent.HttpGetNested<N>>{

        
    public N and();    public N endHttpGet();
}
    public interface TcpSocketNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TCPSocketActionFluent<HandlerFluent.TcpSocketNested<N>>{

        
    public N and();    public N endTcpSocket();
}


}
