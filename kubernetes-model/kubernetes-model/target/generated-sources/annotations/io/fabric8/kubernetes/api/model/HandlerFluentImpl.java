package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;

public class HandlerFluentImpl<A extends HandlerFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements HandlerFluent<A>{

    private ExecActionBuilder exec;
    private HTTPGetActionBuilder httpGet;
    private TCPSocketActionBuilder tcpSocket;

    public HandlerFluentImpl(){
    }
    public HandlerFluentImpl(Handler instance){
            this.withExec(instance.getExec()); 
            this.withHttpGet(instance.getHttpGet()); 
            this.withTcpSocket(instance.getTcpSocket()); 
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

    public HandlerFluent.ExecNested<A> withNewExec(){
            return new ExecNestedImpl();
    }

    public HandlerFluent.ExecNested<A> withNewExecLike(ExecAction item){
            return new ExecNestedImpl(item);
    }

    public HandlerFluent.ExecNested<A> editExec(){
            return withNewExecLike(getExec());
    }

    public HandlerFluent.ExecNested<A> editOrNewExec(){
            return withNewExecLike(getExec() != null ? getExec(): new ExecActionBuilder().build());
    }

    public HandlerFluent.ExecNested<A> editOrNewExecLike(ExecAction item){
            return withNewExecLike(getExec() != null ? getExec(): item);
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

    public HandlerFluent.HttpGetNested<A> withNewHttpGet(){
            return new HttpGetNestedImpl();
    }

    public HandlerFluent.HttpGetNested<A> withNewHttpGetLike(HTTPGetAction item){
            return new HttpGetNestedImpl(item);
    }

    public HandlerFluent.HttpGetNested<A> editHttpGet(){
            return withNewHttpGetLike(getHttpGet());
    }

    public HandlerFluent.HttpGetNested<A> editOrNewHttpGet(){
            return withNewHttpGetLike(getHttpGet() != null ? getHttpGet(): new HTTPGetActionBuilder().build());
    }

    public HandlerFluent.HttpGetNested<A> editOrNewHttpGetLike(HTTPGetAction item){
            return withNewHttpGetLike(getHttpGet() != null ? getHttpGet(): item);
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

    public HandlerFluent.TcpSocketNested<A> withNewTcpSocket(){
            return new TcpSocketNestedImpl();
    }

    public HandlerFluent.TcpSocketNested<A> withNewTcpSocketLike(TCPSocketAction item){
            return new TcpSocketNestedImpl(item);
    }

    public HandlerFluent.TcpSocketNested<A> editTcpSocket(){
            return withNewTcpSocketLike(getTcpSocket());
    }

    public HandlerFluent.TcpSocketNested<A> editOrNewTcpSocket(){
            return withNewTcpSocketLike(getTcpSocket() != null ? getTcpSocket(): new TCPSocketActionBuilder().build());
    }

    public HandlerFluent.TcpSocketNested<A> editOrNewTcpSocketLike(TCPSocketAction item){
            return withNewTcpSocketLike(getTcpSocket() != null ? getTcpSocket(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HandlerFluentImpl that = (HandlerFluentImpl) o;
            if (exec != null ? !exec.equals(that.exec) :that.exec != null) return false;
            if (httpGet != null ? !httpGet.equals(that.httpGet) :that.httpGet != null) return false;
            if (tcpSocket != null ? !tcpSocket.equals(that.tcpSocket) :that.tcpSocket != null) return false;
            return true;
    }


    public class ExecNestedImpl<N> extends ExecActionFluentImpl<HandlerFluent.ExecNested<N>> implements HandlerFluent.ExecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExecActionBuilder builder;
    
            ExecNestedImpl(ExecAction item){
                    this.builder = new ExecActionBuilder(this, item);
            }
            ExecNestedImpl(){
                    this.builder = new ExecActionBuilder(this);
            }
    
    public N and(){
            return (N) HandlerFluentImpl.this.withExec(builder.build());
    }
    public N endExec(){
            return and();
    }

}
    public class HttpGetNestedImpl<N> extends HTTPGetActionFluentImpl<HandlerFluent.HttpGetNested<N>> implements HandlerFluent.HttpGetNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HTTPGetActionBuilder builder;
    
            HttpGetNestedImpl(HTTPGetAction item){
                    this.builder = new HTTPGetActionBuilder(this, item);
            }
            HttpGetNestedImpl(){
                    this.builder = new HTTPGetActionBuilder(this);
            }
    
    public N and(){
            return (N) HandlerFluentImpl.this.withHttpGet(builder.build());
    }
    public N endHttpGet(){
            return and();
    }

}
    public class TcpSocketNestedImpl<N> extends TCPSocketActionFluentImpl<HandlerFluent.TcpSocketNested<N>> implements HandlerFluent.TcpSocketNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TCPSocketActionBuilder builder;
    
            TcpSocketNestedImpl(TCPSocketAction item){
                    this.builder = new TCPSocketActionBuilder(this, item);
            }
            TcpSocketNestedImpl(){
                    this.builder = new TCPSocketActionBuilder(this);
            }
    
    public N and(){
            return (N) HandlerFluentImpl.this.withTcpSocket(builder.build());
    }
    public N endTcpSocket(){
            return and();
    }

}


}
