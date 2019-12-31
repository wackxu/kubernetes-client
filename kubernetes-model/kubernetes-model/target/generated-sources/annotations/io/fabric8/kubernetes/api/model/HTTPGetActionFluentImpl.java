package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.List;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import java.lang.Integer;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class HTTPGetActionFluentImpl<A extends HTTPGetActionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements HTTPGetActionFluent<A>{

    private String host;
    private List<HTTPHeaderBuilder> httpHeaders;
    private String path;
    private IntOrStringBuilder port;
    private String scheme;

    public HTTPGetActionFluentImpl(){
    }
    public HTTPGetActionFluentImpl(HTTPGetAction instance){
            this.withHost(instance.getHost()); 
            this.withHttpHeaders(instance.getHttpHeaders()); 
            this.withPath(instance.getPath()); 
            this.withPort(instance.getPort()); 
            this.withScheme(instance.getScheme()); 
    }

    public String getHost(){
            return this.host;
    }

    public A withHost(String host){
            this.host=host; return (A) this;
    }

    public Boolean hasHost(){
            return this.host != null;
    }

    public A addToHttpHeaders(int index,HTTPHeader item){
            if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<HTTPHeaderBuilder>();}
            HTTPHeaderBuilder builder = new HTTPHeaderBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.httpHeaders.add(index >= 0 ? index : httpHeaders.size(), builder); return (A)this;
    }

    public A setToHttpHeaders(int index,HTTPHeader item){
            if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<HTTPHeaderBuilder>();}
            HTTPHeaderBuilder builder = new HTTPHeaderBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= httpHeaders.size()) { httpHeaders.add(builder); } else { httpHeaders.set(index, builder);}
             return (A)this;
    }

    public A addToHttpHeaders(HTTPHeader... items){
            if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<HTTPHeaderBuilder>();}
            for (HTTPHeader item : items) {HTTPHeaderBuilder builder = new HTTPHeaderBuilder(item);_visitables.add(builder);this.httpHeaders.add(builder);} return (A)this;
    }

    public A addAllToHttpHeaders(Collection<HTTPHeader> items){
            if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<HTTPHeaderBuilder>();}
            for (HTTPHeader item : items) {HTTPHeaderBuilder builder = new HTTPHeaderBuilder(item);_visitables.add(builder);this.httpHeaders.add(builder);} return (A)this;
    }

    public A removeFromHttpHeaders(HTTPHeader... items){
            for (HTTPHeader item : items) {HTTPHeaderBuilder builder = new HTTPHeaderBuilder(item);_visitables.remove(builder);if (this.httpHeaders != null) {this.httpHeaders.remove(builder);}} return (A)this;
    }

    public A removeAllFromHttpHeaders(Collection<HTTPHeader> items){
            for (HTTPHeader item : items) {HTTPHeaderBuilder builder = new HTTPHeaderBuilder(item);_visitables.remove(builder);if (this.httpHeaders != null) {this.httpHeaders.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildHttpHeaders instead.
 * @return The buildable object.
 */
@Deprecated public List<HTTPHeader> getHttpHeaders(){
            return build(httpHeaders);
    }

    public List<HTTPHeader> buildHttpHeaders(){
            return build(httpHeaders);
    }

    public HTTPHeader buildHttpHeader(int index){
            return this.httpHeaders.get(index).build();
    }

    public HTTPHeader buildFirstHttpHeader(){
            return this.httpHeaders.get(0).build();
    }

    public HTTPHeader buildLastHttpHeader(){
            return this.httpHeaders.get(httpHeaders.size() - 1).build();
    }

    public HTTPHeader buildMatchingHttpHeader(io.fabric8.kubernetes.api.builder.Predicate<HTTPHeaderBuilder> predicate){
            for (HTTPHeaderBuilder item: httpHeaders) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withHttpHeaders(List<HTTPHeader> httpHeaders){
            if (this.httpHeaders != null) { _visitables.removeAll(this.httpHeaders);}
            if (httpHeaders != null) {this.httpHeaders = new ArrayList<HTTPHeaderBuilder>(); for (HTTPHeader item : httpHeaders){this.addToHttpHeaders(item);}} else { this.httpHeaders = new ArrayList<HTTPHeaderBuilder>();} return (A) this;
    }

    public A withHttpHeaders(HTTPHeader... httpHeaders){
            if (this.httpHeaders != null) {this.httpHeaders.clear();}
            if (httpHeaders != null) {for (HTTPHeader item :httpHeaders){ this.addToHttpHeaders(item);}} return (A) this;
    }

    public Boolean hasHttpHeaders(){
            return httpHeaders != null && !httpHeaders.isEmpty();
    }

    public A addNewHttpHeader(String name,String value){
            return (A)addToHttpHeaders(new HTTPHeader(name, value));
    }

    public HTTPGetActionFluent.HttpHeadersNested<A> addNewHttpHeader(){
            return new HttpHeadersNestedImpl();
    }

    public HTTPGetActionFluent.HttpHeadersNested<A> addNewHttpHeaderLike(HTTPHeader item){
            return new HttpHeadersNestedImpl(-1, item);
    }

    public HTTPGetActionFluent.HttpHeadersNested<A> setNewHttpHeaderLike(int index,HTTPHeader item){
            return new HttpHeadersNestedImpl(index, item);
    }

    public HTTPGetActionFluent.HttpHeadersNested<A> editHttpHeader(int index){
            if (httpHeaders.size() <= index) throw new RuntimeException("Can't edit httpHeaders. Index exceeds size.");
            return setNewHttpHeaderLike(index, buildHttpHeader(index));
    }

    public HTTPGetActionFluent.HttpHeadersNested<A> editFirstHttpHeader(){
            if (httpHeaders.size() == 0) throw new RuntimeException("Can't edit first httpHeaders. The list is empty.");
            return setNewHttpHeaderLike(0, buildHttpHeader(0));
    }

    public HTTPGetActionFluent.HttpHeadersNested<A> editLastHttpHeader(){
            int index = httpHeaders.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last httpHeaders. The list is empty.");
            return setNewHttpHeaderLike(index, buildHttpHeader(index));
    }

    public HTTPGetActionFluent.HttpHeadersNested<A> editMatchingHttpHeader(io.fabric8.kubernetes.api.builder.Predicate<HTTPHeaderBuilder> predicate){
            int index = -1;
            for (int i=0;i<httpHeaders.size();i++) { 
            if (predicate.apply(httpHeaders.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching httpHeaders. No match found.");
            return setNewHttpHeaderLike(index, buildHttpHeader(index));
    }

    public String getPath(){
            return this.path;
    }

    public A withPath(String path){
            this.path=path; return (A) this;
    }

    public Boolean hasPath(){
            return this.path != null;
    }

    
/**
 * This method has been deprecated, please use method buildPort instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getPort(){
            return this.port!=null?this.port.build():null;
    }

    public IntOrString buildPort(){
            return this.port!=null?this.port.build():null;
    }

    public A withPort(IntOrString port){
            _visitables.remove(this.port);
            if (port!=null){ this.port= new IntOrStringBuilder(port); _visitables.add(this.port);} return (A) this;
    }

    public Boolean hasPort(){
            return this.port != null;
    }

    public A withNewPort(String strVal){
            return (A)withPort(new IntOrString(strVal));
    }

    public A withNewPort(Integer intVal){
            return (A)withPort(new IntOrString(intVal));
    }

    public HTTPGetActionFluent.PortNested<A> withNewPort(){
            return new PortNestedImpl();
    }

    public HTTPGetActionFluent.PortNested<A> withNewPortLike(IntOrString item){
            return new PortNestedImpl(item);
    }

    public HTTPGetActionFluent.PortNested<A> editPort(){
            return withNewPortLike(getPort());
    }

    public HTTPGetActionFluent.PortNested<A> editOrNewPort(){
            return withNewPortLike(getPort() != null ? getPort(): new IntOrStringBuilder().build());
    }

    public HTTPGetActionFluent.PortNested<A> editOrNewPortLike(IntOrString item){
            return withNewPortLike(getPort() != null ? getPort(): item);
    }

    public String getScheme(){
            return this.scheme;
    }

    public A withScheme(String scheme){
            this.scheme=scheme; return (A) this;
    }

    public Boolean hasScheme(){
            return this.scheme != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HTTPGetActionFluentImpl that = (HTTPGetActionFluentImpl) o;
            if (host != null ? !host.equals(that.host) :that.host != null) return false;
            if (httpHeaders != null ? !httpHeaders.equals(that.httpHeaders) :that.httpHeaders != null) return false;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            if (port != null ? !port.equals(that.port) :that.port != null) return false;
            if (scheme != null ? !scheme.equals(that.scheme) :that.scheme != null) return false;
            return true;
    }


    public class HttpHeadersNestedImpl<N> extends HTTPHeaderFluentImpl<HTTPGetActionFluent.HttpHeadersNested<N>> implements HTTPGetActionFluent.HttpHeadersNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HTTPHeaderBuilder builder;
        private final int index;
    
            HttpHeadersNestedImpl(int index,HTTPHeader item){
                    this.index = index;
                    this.builder = new HTTPHeaderBuilder(this, item);
            }
            HttpHeadersNestedImpl(){
                    this.index = -1;
                    this.builder = new HTTPHeaderBuilder(this);
            }
    
    public N and(){
            return (N) HTTPGetActionFluentImpl.this.setToHttpHeaders(index, builder.build());
    }
    public N endHttpHeader(){
            return and();
    }

}
    public class PortNestedImpl<N> extends IntOrStringFluentImpl<HTTPGetActionFluent.PortNested<N>> implements HTTPGetActionFluent.PortNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IntOrStringBuilder builder;
    
            PortNestedImpl(IntOrString item){
                    this.builder = new IntOrStringBuilder(this, item);
            }
            PortNestedImpl(){
                    this.builder = new IntOrStringBuilder(this);
            }
    
    public N and(){
            return (N) HTTPGetActionFluentImpl.this.withPort(builder.build());
    }
    public N endPort(){
            return and();
    }

}


}
