package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class RouteSpecFluentImpl<A extends RouteSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RouteSpecFluent<A>{

    private List<RouteTargetReferenceBuilder> alternateBackends;
    private String host;
    private String path;
    private RoutePortBuilder port;
    private TLSConfigBuilder tls;
    private RouteTargetReferenceBuilder to;
    private String wildcardPolicy;

    public RouteSpecFluentImpl(){
    }
    public RouteSpecFluentImpl(RouteSpec instance){
            this.withAlternateBackends(instance.getAlternateBackends()); 
            this.withHost(instance.getHost()); 
            this.withPath(instance.getPath()); 
            this.withPort(instance.getPort()); 
            this.withTls(instance.getTls()); 
            this.withTo(instance.getTo()); 
            this.withWildcardPolicy(instance.getWildcardPolicy()); 
    }

    public A addToAlternateBackends(int index,RouteTargetReference item){
            if (this.alternateBackends == null) {this.alternateBackends = new ArrayList<RouteTargetReferenceBuilder>();}
            RouteTargetReferenceBuilder builder = new RouteTargetReferenceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.alternateBackends.add(index >= 0 ? index : alternateBackends.size(), builder); return (A)this;
    }

    public A setToAlternateBackends(int index,RouteTargetReference item){
            if (this.alternateBackends == null) {this.alternateBackends = new ArrayList<RouteTargetReferenceBuilder>();}
            RouteTargetReferenceBuilder builder = new RouteTargetReferenceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= alternateBackends.size()) { alternateBackends.add(builder); } else { alternateBackends.set(index, builder);}
             return (A)this;
    }

    public A addToAlternateBackends(RouteTargetReference... items){
            if (this.alternateBackends == null) {this.alternateBackends = new ArrayList<RouteTargetReferenceBuilder>();}
            for (RouteTargetReference item : items) {RouteTargetReferenceBuilder builder = new RouteTargetReferenceBuilder(item);_visitables.add(builder);this.alternateBackends.add(builder);} return (A)this;
    }

    public A addAllToAlternateBackends(Collection<RouteTargetReference> items){
            if (this.alternateBackends == null) {this.alternateBackends = new ArrayList<RouteTargetReferenceBuilder>();}
            for (RouteTargetReference item : items) {RouteTargetReferenceBuilder builder = new RouteTargetReferenceBuilder(item);_visitables.add(builder);this.alternateBackends.add(builder);} return (A)this;
    }

    public A removeFromAlternateBackends(RouteTargetReference... items){
            for (RouteTargetReference item : items) {RouteTargetReferenceBuilder builder = new RouteTargetReferenceBuilder(item);_visitables.remove(builder);if (this.alternateBackends != null) {this.alternateBackends.remove(builder);}} return (A)this;
    }

    public A removeAllFromAlternateBackends(Collection<RouteTargetReference> items){
            for (RouteTargetReference item : items) {RouteTargetReferenceBuilder builder = new RouteTargetReferenceBuilder(item);_visitables.remove(builder);if (this.alternateBackends != null) {this.alternateBackends.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildAlternateBackends instead.
 * @return The buildable object.
 */
@Deprecated public List<RouteTargetReference> getAlternateBackends(){
            return build(alternateBackends);
    }

    public List<RouteTargetReference> buildAlternateBackends(){
            return build(alternateBackends);
    }

    public RouteTargetReference buildAlternateBackend(int index){
            return this.alternateBackends.get(index).build();
    }

    public RouteTargetReference buildFirstAlternateBackend(){
            return this.alternateBackends.get(0).build();
    }

    public RouteTargetReference buildLastAlternateBackend(){
            return this.alternateBackends.get(alternateBackends.size() - 1).build();
    }

    public RouteTargetReference buildMatchingAlternateBackend(io.fabric8.kubernetes.api.builder.Predicate<RouteTargetReferenceBuilder> predicate){
            for (RouteTargetReferenceBuilder item: alternateBackends) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withAlternateBackends(List<RouteTargetReference> alternateBackends){
            if (this.alternateBackends != null) { _visitables.removeAll(this.alternateBackends);}
            if (alternateBackends != null) {this.alternateBackends = new ArrayList<RouteTargetReferenceBuilder>(); for (RouteTargetReference item : alternateBackends){this.addToAlternateBackends(item);}} else { this.alternateBackends = new ArrayList<RouteTargetReferenceBuilder>();} return (A) this;
    }

    public A withAlternateBackends(RouteTargetReference... alternateBackends){
            if (this.alternateBackends != null) {this.alternateBackends.clear();}
            if (alternateBackends != null) {for (RouteTargetReference item :alternateBackends){ this.addToAlternateBackends(item);}} return (A) this;
    }

    public Boolean hasAlternateBackends(){
            return alternateBackends != null && !alternateBackends.isEmpty();
    }

    public A addNewAlternateBackend(String kind,String name,Integer weight){
            return (A)addToAlternateBackends(new RouteTargetReference(kind, name, weight));
    }

    public RouteSpecFluent.AlternateBackendsNested<A> addNewAlternateBackend(){
            return new AlternateBackendsNestedImpl();
    }

    public RouteSpecFluent.AlternateBackendsNested<A> addNewAlternateBackendLike(RouteTargetReference item){
            return new AlternateBackendsNestedImpl(-1, item);
    }

    public RouteSpecFluent.AlternateBackendsNested<A> setNewAlternateBackendLike(int index,RouteTargetReference item){
            return new AlternateBackendsNestedImpl(index, item);
    }

    public RouteSpecFluent.AlternateBackendsNested<A> editAlternateBackend(int index){
            if (alternateBackends.size() <= index) throw new RuntimeException("Can't edit alternateBackends. Index exceeds size.");
            return setNewAlternateBackendLike(index, buildAlternateBackend(index));
    }

    public RouteSpecFluent.AlternateBackendsNested<A> editFirstAlternateBackend(){
            if (alternateBackends.size() == 0) throw new RuntimeException("Can't edit first alternateBackends. The list is empty.");
            return setNewAlternateBackendLike(0, buildAlternateBackend(0));
    }

    public RouteSpecFluent.AlternateBackendsNested<A> editLastAlternateBackend(){
            int index = alternateBackends.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last alternateBackends. The list is empty.");
            return setNewAlternateBackendLike(index, buildAlternateBackend(index));
    }

    public RouteSpecFluent.AlternateBackendsNested<A> editMatchingAlternateBackend(io.fabric8.kubernetes.api.builder.Predicate<RouteTargetReferenceBuilder> predicate){
            int index = -1;
            for (int i=0;i<alternateBackends.size();i++) { 
            if (predicate.apply(alternateBackends.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching alternateBackends. No match found.");
            return setNewAlternateBackendLike(index, buildAlternateBackend(index));
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
@Deprecated public RoutePort getPort(){
            return this.port!=null?this.port.build():null;
    }

    public RoutePort buildPort(){
            return this.port!=null?this.port.build():null;
    }

    public A withPort(RoutePort port){
            _visitables.remove(this.port);
            if (port!=null){ this.port= new RoutePortBuilder(port); _visitables.add(this.port);} return (A) this;
    }

    public Boolean hasPort(){
            return this.port != null;
    }

    public RouteSpecFluent.PortNested<A> withNewPort(){
            return new PortNestedImpl();
    }

    public RouteSpecFluent.PortNested<A> withNewPortLike(RoutePort item){
            return new PortNestedImpl(item);
    }

    public RouteSpecFluent.PortNested<A> editPort(){
            return withNewPortLike(getPort());
    }

    public RouteSpecFluent.PortNested<A> editOrNewPort(){
            return withNewPortLike(getPort() != null ? getPort(): new RoutePortBuilder().build());
    }

    public RouteSpecFluent.PortNested<A> editOrNewPortLike(RoutePort item){
            return withNewPortLike(getPort() != null ? getPort(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTls instead.
 * @return The buildable object.
 */
@Deprecated public TLSConfig getTls(){
            return this.tls!=null?this.tls.build():null;
    }

    public TLSConfig buildTls(){
            return this.tls!=null?this.tls.build():null;
    }

    public A withTls(TLSConfig tls){
            _visitables.remove(this.tls);
            if (tls!=null){ this.tls= new TLSConfigBuilder(tls); _visitables.add(this.tls);} return (A) this;
    }

    public Boolean hasTls(){
            return this.tls != null;
    }

    public RouteSpecFluent.TlsNested<A> withNewTls(){
            return new TlsNestedImpl();
    }

    public RouteSpecFluent.TlsNested<A> withNewTlsLike(TLSConfig item){
            return new TlsNestedImpl(item);
    }

    public RouteSpecFluent.TlsNested<A> editTls(){
            return withNewTlsLike(getTls());
    }

    public RouteSpecFluent.TlsNested<A> editOrNewTls(){
            return withNewTlsLike(getTls() != null ? getTls(): new TLSConfigBuilder().build());
    }

    public RouteSpecFluent.TlsNested<A> editOrNewTlsLike(TLSConfig item){
            return withNewTlsLike(getTls() != null ? getTls(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTo instead.
 * @return The buildable object.
 */
@Deprecated public RouteTargetReference getTo(){
            return this.to!=null?this.to.build():null;
    }

    public RouteTargetReference buildTo(){
            return this.to!=null?this.to.build():null;
    }

    public A withTo(RouteTargetReference to){
            _visitables.remove(this.to);
            if (to!=null){ this.to= new RouteTargetReferenceBuilder(to); _visitables.add(this.to);} return (A) this;
    }

    public Boolean hasTo(){
            return this.to != null;
    }

    public A withNewTo(String kind,String name,Integer weight){
            return (A)withTo(new RouteTargetReference(kind, name, weight));
    }

    public RouteSpecFluent.ToNested<A> withNewTo(){
            return new ToNestedImpl();
    }

    public RouteSpecFluent.ToNested<A> withNewToLike(RouteTargetReference item){
            return new ToNestedImpl(item);
    }

    public RouteSpecFluent.ToNested<A> editTo(){
            return withNewToLike(getTo());
    }

    public RouteSpecFluent.ToNested<A> editOrNewTo(){
            return withNewToLike(getTo() != null ? getTo(): new RouteTargetReferenceBuilder().build());
    }

    public RouteSpecFluent.ToNested<A> editOrNewToLike(RouteTargetReference item){
            return withNewToLike(getTo() != null ? getTo(): item);
    }

    public String getWildcardPolicy(){
            return this.wildcardPolicy;
    }

    public A withWildcardPolicy(String wildcardPolicy){
            this.wildcardPolicy=wildcardPolicy; return (A) this;
    }

    public Boolean hasWildcardPolicy(){
            return this.wildcardPolicy != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RouteSpecFluentImpl that = (RouteSpecFluentImpl) o;
            if (alternateBackends != null ? !alternateBackends.equals(that.alternateBackends) :that.alternateBackends != null) return false;
            if (host != null ? !host.equals(that.host) :that.host != null) return false;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            if (port != null ? !port.equals(that.port) :that.port != null) return false;
            if (tls != null ? !tls.equals(that.tls) :that.tls != null) return false;
            if (to != null ? !to.equals(that.to) :that.to != null) return false;
            if (wildcardPolicy != null ? !wildcardPolicy.equals(that.wildcardPolicy) :that.wildcardPolicy != null) return false;
            return true;
    }


    public class AlternateBackendsNestedImpl<N> extends RouteTargetReferenceFluentImpl<RouteSpecFluent.AlternateBackendsNested<N>> implements RouteSpecFluent.AlternateBackendsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteTargetReferenceBuilder builder;
        private final int index;
    
            AlternateBackendsNestedImpl(int index,RouteTargetReference item){
                    this.index = index;
                    this.builder = new RouteTargetReferenceBuilder(this, item);
            }
            AlternateBackendsNestedImpl(){
                    this.index = -1;
                    this.builder = new RouteTargetReferenceBuilder(this);
            }
    
    public N and(){
            return (N) RouteSpecFluentImpl.this.setToAlternateBackends(index, builder.build());
    }
    public N endAlternateBackend(){
            return and();
    }

}
    public class PortNestedImpl<N> extends RoutePortFluentImpl<RouteSpecFluent.PortNested<N>> implements RouteSpecFluent.PortNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoutePortBuilder builder;
    
            PortNestedImpl(RoutePort item){
                    this.builder = new RoutePortBuilder(this, item);
            }
            PortNestedImpl(){
                    this.builder = new RoutePortBuilder(this);
            }
    
    public N and(){
            return (N) RouteSpecFluentImpl.this.withPort(builder.build());
    }
    public N endPort(){
            return and();
    }

}
    public class TlsNestedImpl<N> extends TLSConfigFluentImpl<RouteSpecFluent.TlsNested<N>> implements RouteSpecFluent.TlsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TLSConfigBuilder builder;
    
            TlsNestedImpl(TLSConfig item){
                    this.builder = new TLSConfigBuilder(this, item);
            }
            TlsNestedImpl(){
                    this.builder = new TLSConfigBuilder(this);
            }
    
    public N and(){
            return (N) RouteSpecFluentImpl.this.withTls(builder.build());
    }
    public N endTls(){
            return and();
    }

}
    public class ToNestedImpl<N> extends RouteTargetReferenceFluentImpl<RouteSpecFluent.ToNested<N>> implements RouteSpecFluent.ToNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteTargetReferenceBuilder builder;
    
            ToNestedImpl(RouteTargetReference item){
                    this.builder = new RouteTargetReferenceBuilder(this, item);
            }
            ToNestedImpl(){
                    this.builder = new RouteTargetReferenceBuilder(this);
            }
    
    public N and(){
            return (N) RouteSpecFluentImpl.this.withTo(builder.build());
    }
    public N endTo(){
            return and();
    }

}


}
