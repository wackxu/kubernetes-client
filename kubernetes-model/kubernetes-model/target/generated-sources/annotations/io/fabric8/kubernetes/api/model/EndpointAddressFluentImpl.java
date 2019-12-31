package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class EndpointAddressFluentImpl<A extends EndpointAddressFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements EndpointAddressFluent<A>{

    private String hostname;
    private String ip;
    private String nodeName;
    private ObjectReferenceBuilder targetRef;

    public EndpointAddressFluentImpl(){
    }
    public EndpointAddressFluentImpl(EndpointAddress instance){
            this.withHostname(instance.getHostname()); 
            this.withIp(instance.getIp()); 
            this.withNodeName(instance.getNodeName()); 
            this.withTargetRef(instance.getTargetRef()); 
    }

    public String getHostname(){
            return this.hostname;
    }

    public A withHostname(String hostname){
            this.hostname=hostname; return (A) this;
    }

    public Boolean hasHostname(){
            return this.hostname != null;
    }

    public String getIp(){
            return this.ip;
    }

    public A withIp(String ip){
            this.ip=ip; return (A) this;
    }

    public Boolean hasIp(){
            return this.ip != null;
    }

    public String getNodeName(){
            return this.nodeName;
    }

    public A withNodeName(String nodeName){
            this.nodeName=nodeName; return (A) this;
    }

    public Boolean hasNodeName(){
            return this.nodeName != null;
    }

    
/**
 * This method has been deprecated, please use method buildTargetRef instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getTargetRef(){
            return this.targetRef!=null?this.targetRef.build():null;
    }

    public ObjectReference buildTargetRef(){
            return this.targetRef!=null?this.targetRef.build():null;
    }

    public A withTargetRef(ObjectReference targetRef){
            _visitables.remove(this.targetRef);
            if (targetRef!=null){ this.targetRef= new ObjectReferenceBuilder(targetRef); _visitables.add(this.targetRef);} return (A) this;
    }

    public Boolean hasTargetRef(){
            return this.targetRef != null;
    }

    public EndpointAddressFluent.TargetRefNested<A> withNewTargetRef(){
            return new TargetRefNestedImpl();
    }

    public EndpointAddressFluent.TargetRefNested<A> withNewTargetRefLike(ObjectReference item){
            return new TargetRefNestedImpl(item);
    }

    public EndpointAddressFluent.TargetRefNested<A> editTargetRef(){
            return withNewTargetRefLike(getTargetRef());
    }

    public EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRef(){
            return withNewTargetRefLike(getTargetRef() != null ? getTargetRef(): new ObjectReferenceBuilder().build());
    }

    public EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRefLike(ObjectReference item){
            return withNewTargetRefLike(getTargetRef() != null ? getTargetRef(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EndpointAddressFluentImpl that = (EndpointAddressFluentImpl) o;
            if (hostname != null ? !hostname.equals(that.hostname) :that.hostname != null) return false;
            if (ip != null ? !ip.equals(that.ip) :that.ip != null) return false;
            if (nodeName != null ? !nodeName.equals(that.nodeName) :that.nodeName != null) return false;
            if (targetRef != null ? !targetRef.equals(that.targetRef) :that.targetRef != null) return false;
            return true;
    }


    public class TargetRefNestedImpl<N> extends ObjectReferenceFluentImpl<EndpointAddressFluent.TargetRefNested<N>> implements EndpointAddressFluent.TargetRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            TargetRefNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            TargetRefNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) EndpointAddressFluentImpl.this.withTargetRef(builder.build());
    }
    public N endTargetRef(){
            return and();
    }

}


}
