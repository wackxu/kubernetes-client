package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;

public class ProbeFluentImpl<A extends ProbeFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ProbeFluent<A>{

    private ExecActionBuilder exec;
    private Integer failureThreshold;
    private HTTPGetActionBuilder httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private TCPSocketActionBuilder tcpSocket;
    private Integer timeoutSeconds;

    public ProbeFluentImpl(){
    }
    public ProbeFluentImpl(Probe instance){
            this.withExec(instance.getExec()); 
            this.withFailureThreshold(instance.getFailureThreshold()); 
            this.withHttpGet(instance.getHttpGet()); 
            this.withInitialDelaySeconds(instance.getInitialDelaySeconds()); 
            this.withPeriodSeconds(instance.getPeriodSeconds()); 
            this.withSuccessThreshold(instance.getSuccessThreshold()); 
            this.withTcpSocket(instance.getTcpSocket()); 
            this.withTimeoutSeconds(instance.getTimeoutSeconds()); 
    }

    
/**
 * This method has been deprecated, please use method buildExec instead.
 * @return The buildable object.
 */
@Deprecated public ExecAction getExec(){
            return this.exec!=null?this.exec.build():null;
    }

    public ExecAction buildExec(){
            return this.exec!=null?this.exec.build():null;
    }

    public A withExec(ExecAction exec){
            _visitables.remove(this.exec);
            if (exec!=null){ this.exec= new ExecActionBuilder(exec); _visitables.add(this.exec);} return (A) this;
    }

    public Boolean hasExec(){
            return this.exec != null;
    }

    public ProbeFluent.ExecNested<A> withNewExec(){
            return new ExecNestedImpl();
    }

    public ProbeFluent.ExecNested<A> withNewExecLike(ExecAction item){
            return new ExecNestedImpl(item);
    }

    public ProbeFluent.ExecNested<A> editExec(){
            return withNewExecLike(getExec());
    }

    public ProbeFluent.ExecNested<A> editOrNewExec(){
            return withNewExecLike(getExec() != null ? getExec(): new ExecActionBuilder().build());
    }

    public ProbeFluent.ExecNested<A> editOrNewExecLike(ExecAction item){
            return withNewExecLike(getExec() != null ? getExec(): item);
    }

    public Integer getFailureThreshold(){
            return this.failureThreshold;
    }

    public A withFailureThreshold(Integer failureThreshold){
            this.failureThreshold=failureThreshold; return (A) this;
    }

    public Boolean hasFailureThreshold(){
            return this.failureThreshold != null;
    }

    
/**
 * This method has been deprecated, please use method buildHttpGet instead.
 * @return The buildable object.
 */
@Deprecated public HTTPGetAction getHttpGet(){
            return this.httpGet!=null?this.httpGet.build():null;
    }

    public HTTPGetAction buildHttpGet(){
            return this.httpGet!=null?this.httpGet.build():null;
    }

    public A withHttpGet(HTTPGetAction httpGet){
            _visitables.remove(this.httpGet);
            if (httpGet!=null){ this.httpGet= new HTTPGetActionBuilder(httpGet); _visitables.add(this.httpGet);} return (A) this;
    }

    public Boolean hasHttpGet(){
            return this.httpGet != null;
    }

    public ProbeFluent.HttpGetNested<A> withNewHttpGet(){
            return new HttpGetNestedImpl();
    }

    public ProbeFluent.HttpGetNested<A> withNewHttpGetLike(HTTPGetAction item){
            return new HttpGetNestedImpl(item);
    }

    public ProbeFluent.HttpGetNested<A> editHttpGet(){
            return withNewHttpGetLike(getHttpGet());
    }

    public ProbeFluent.HttpGetNested<A> editOrNewHttpGet(){
            return withNewHttpGetLike(getHttpGet() != null ? getHttpGet(): new HTTPGetActionBuilder().build());
    }

    public ProbeFluent.HttpGetNested<A> editOrNewHttpGetLike(HTTPGetAction item){
            return withNewHttpGetLike(getHttpGet() != null ? getHttpGet(): item);
    }

    public Integer getInitialDelaySeconds(){
            return this.initialDelaySeconds;
    }

    public A withInitialDelaySeconds(Integer initialDelaySeconds){
            this.initialDelaySeconds=initialDelaySeconds; return (A) this;
    }

    public Boolean hasInitialDelaySeconds(){
            return this.initialDelaySeconds != null;
    }

    public Integer getPeriodSeconds(){
            return this.periodSeconds;
    }

    public A withPeriodSeconds(Integer periodSeconds){
            this.periodSeconds=periodSeconds; return (A) this;
    }

    public Boolean hasPeriodSeconds(){
            return this.periodSeconds != null;
    }

    public Integer getSuccessThreshold(){
            return this.successThreshold;
    }

    public A withSuccessThreshold(Integer successThreshold){
            this.successThreshold=successThreshold; return (A) this;
    }

    public Boolean hasSuccessThreshold(){
            return this.successThreshold != null;
    }

    
/**
 * This method has been deprecated, please use method buildTcpSocket instead.
 * @return The buildable object.
 */
@Deprecated public TCPSocketAction getTcpSocket(){
            return this.tcpSocket!=null?this.tcpSocket.build():null;
    }

    public TCPSocketAction buildTcpSocket(){
            return this.tcpSocket!=null?this.tcpSocket.build():null;
    }

    public A withTcpSocket(TCPSocketAction tcpSocket){
            _visitables.remove(this.tcpSocket);
            if (tcpSocket!=null){ this.tcpSocket= new TCPSocketActionBuilder(tcpSocket); _visitables.add(this.tcpSocket);} return (A) this;
    }

    public Boolean hasTcpSocket(){
            return this.tcpSocket != null;
    }

    public ProbeFluent.TcpSocketNested<A> withNewTcpSocket(){
            return new TcpSocketNestedImpl();
    }

    public ProbeFluent.TcpSocketNested<A> withNewTcpSocketLike(TCPSocketAction item){
            return new TcpSocketNestedImpl(item);
    }

    public ProbeFluent.TcpSocketNested<A> editTcpSocket(){
            return withNewTcpSocketLike(getTcpSocket());
    }

    public ProbeFluent.TcpSocketNested<A> editOrNewTcpSocket(){
            return withNewTcpSocketLike(getTcpSocket() != null ? getTcpSocket(): new TCPSocketActionBuilder().build());
    }

    public ProbeFluent.TcpSocketNested<A> editOrNewTcpSocketLike(TCPSocketAction item){
            return withNewTcpSocketLike(getTcpSocket() != null ? getTcpSocket(): item);
    }

    public Integer getTimeoutSeconds(){
            return this.timeoutSeconds;
    }

    public A withTimeoutSeconds(Integer timeoutSeconds){
            this.timeoutSeconds=timeoutSeconds; return (A) this;
    }

    public Boolean hasTimeoutSeconds(){
            return this.timeoutSeconds != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ProbeFluentImpl that = (ProbeFluentImpl) o;
            if (exec != null ? !exec.equals(that.exec) :that.exec != null) return false;
            if (failureThreshold != null ? !failureThreshold.equals(that.failureThreshold) :that.failureThreshold != null) return false;
            if (httpGet != null ? !httpGet.equals(that.httpGet) :that.httpGet != null) return false;
            if (initialDelaySeconds != null ? !initialDelaySeconds.equals(that.initialDelaySeconds) :that.initialDelaySeconds != null) return false;
            if (periodSeconds != null ? !periodSeconds.equals(that.periodSeconds) :that.periodSeconds != null) return false;
            if (successThreshold != null ? !successThreshold.equals(that.successThreshold) :that.successThreshold != null) return false;
            if (tcpSocket != null ? !tcpSocket.equals(that.tcpSocket) :that.tcpSocket != null) return false;
            if (timeoutSeconds != null ? !timeoutSeconds.equals(that.timeoutSeconds) :that.timeoutSeconds != null) return false;
            return true;
    }


    public class ExecNestedImpl<N> extends ExecActionFluentImpl<ProbeFluent.ExecNested<N>> implements ProbeFluent.ExecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExecActionBuilder builder;
    
            ExecNestedImpl(ExecAction item){
                    this.builder = new ExecActionBuilder(this, item);
            }
            ExecNestedImpl(){
                    this.builder = new ExecActionBuilder(this);
            }
    
    public N and(){
            return (N) ProbeFluentImpl.this.withExec(builder.build());
    }
    public N endExec(){
            return and();
    }

}
    public class HttpGetNestedImpl<N> extends HTTPGetActionFluentImpl<ProbeFluent.HttpGetNested<N>> implements ProbeFluent.HttpGetNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HTTPGetActionBuilder builder;
    
            HttpGetNestedImpl(HTTPGetAction item){
                    this.builder = new HTTPGetActionBuilder(this, item);
            }
            HttpGetNestedImpl(){
                    this.builder = new HTTPGetActionBuilder(this);
            }
    
    public N and(){
            return (N) ProbeFluentImpl.this.withHttpGet(builder.build());
    }
    public N endHttpGet(){
            return and();
    }

}
    public class TcpSocketNestedImpl<N> extends TCPSocketActionFluentImpl<ProbeFluent.TcpSocketNested<N>> implements ProbeFluent.TcpSocketNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TCPSocketActionBuilder builder;
    
            TcpSocketNestedImpl(TCPSocketAction item){
                    this.builder = new TCPSocketActionBuilder(this, item);
            }
            TcpSocketNestedImpl(){
                    this.builder = new TCPSocketActionBuilder(this);
            }
    
    public N and(){
            return (N) ProbeFluentImpl.this.withTcpSocket(builder.build());
    }
    public N endTcpSocket(){
            return and();
    }

}


}
