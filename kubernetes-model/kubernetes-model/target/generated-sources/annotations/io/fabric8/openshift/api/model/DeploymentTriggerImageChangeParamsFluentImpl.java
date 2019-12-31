package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class DeploymentTriggerImageChangeParamsFluentImpl<A extends DeploymentTriggerImageChangeParamsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DeploymentTriggerImageChangeParamsFluent<A>{

    private Boolean automatic;
    private List<String> containerNames;
    private ObjectReferenceBuilder from;
    private String lastTriggeredImage;

    public DeploymentTriggerImageChangeParamsFluentImpl(){
    }
    public DeploymentTriggerImageChangeParamsFluentImpl(DeploymentTriggerImageChangeParams instance){
            this.withAutomatic(instance.getAutomatic()); 
            this.withContainerNames(instance.getContainerNames()); 
            this.withFrom(instance.getFrom()); 
            this.withLastTriggeredImage(instance.getLastTriggeredImage()); 
    }

    public Boolean isAutomatic(){
            return this.automatic;
    }

    public A withAutomatic(Boolean automatic){
            this.automatic=automatic; return (A) this;
    }

    public Boolean hasAutomatic(){
            return this.automatic != null;
    }

    public A withNewAutomatic(String arg1){
            return (A)withAutomatic(new Boolean(arg1));
    }

    public A withNewAutomatic(boolean arg1){
            return (A)withAutomatic(new Boolean(arg1));
    }

    public A addToContainerNames(int index,String item){
            if (this.containerNames == null) {this.containerNames = new ArrayList<String>();}
            this.containerNames.add(index, item);
            return (A)this;
    }

    public A setToContainerNames(int index,String item){
            if (this.containerNames == null) {this.containerNames = new ArrayList<String>();}
            this.containerNames.set(index, item); return (A)this;
    }

    public A addToContainerNames(String... items){
            if (this.containerNames == null) {this.containerNames = new ArrayList<String>();}
            for (String item : items) {this.containerNames.add(item);} return (A)this;
    }

    public A addAllToContainerNames(Collection<String> items){
            if (this.containerNames == null) {this.containerNames = new ArrayList<String>();}
            for (String item : items) {this.containerNames.add(item);} return (A)this;
    }

    public A removeFromContainerNames(String... items){
            for (String item : items) {if (this.containerNames!= null){ this.containerNames.remove(item);}} return (A)this;
    }

    public A removeAllFromContainerNames(Collection<String> items){
            for (String item : items) {if (this.containerNames!= null){ this.containerNames.remove(item);}} return (A)this;
    }

    public List<String> getContainerNames(){
            return this.containerNames;
    }

    public String getContainerName(int index){
            return this.containerNames.get(index);
    }

    public String getFirstContainerName(){
            return this.containerNames.get(0);
    }

    public String getLastContainerName(){
            return this.containerNames.get(containerNames.size() - 1);
    }

    public String getMatchingContainerName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: containerNames) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withContainerNames(List<String> containerNames){
            if (this.containerNames != null) { _visitables.removeAll(this.containerNames);}
            if (containerNames != null) {this.containerNames = new ArrayList<String>(); for (String item : containerNames){this.addToContainerNames(item);}} else { this.containerNames = new ArrayList<String>();} return (A) this;
    }

    public A withContainerNames(String... containerNames){
            if (this.containerNames != null) {this.containerNames.clear();}
            if (containerNames != null) {for (String item :containerNames){ this.addToContainerNames(item);}} return (A) this;
    }

    public Boolean hasContainerNames(){
            return containerNames != null && !containerNames.isEmpty();
    }

    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom(){
            return this.from!=null?this.from.build():null;
    }

    public ObjectReference buildFrom(){
            return this.from!=null?this.from.build():null;
    }

    public A withFrom(ObjectReference from){
            _visitables.remove(this.from);
            if (from!=null){ this.from= new ObjectReferenceBuilder(from); _visitables.add(this.from);} return (A) this;
    }

    public Boolean hasFrom(){
            return this.from != null;
    }

    public DeploymentTriggerImageChangeParamsFluent.FromNested<A> withNewFrom(){
            return new FromNestedImpl();
    }

    public DeploymentTriggerImageChangeParamsFluent.FromNested<A> withNewFromLike(ObjectReference item){
            return new FromNestedImpl(item);
    }

    public DeploymentTriggerImageChangeParamsFluent.FromNested<A> editFrom(){
            return withNewFromLike(getFrom());
    }

    public DeploymentTriggerImageChangeParamsFluent.FromNested<A> editOrNewFrom(){
            return withNewFromLike(getFrom() != null ? getFrom(): new ObjectReferenceBuilder().build());
    }

    public DeploymentTriggerImageChangeParamsFluent.FromNested<A> editOrNewFromLike(ObjectReference item){
            return withNewFromLike(getFrom() != null ? getFrom(): item);
    }

    public String getLastTriggeredImage(){
            return this.lastTriggeredImage;
    }

    public A withLastTriggeredImage(String lastTriggeredImage){
            this.lastTriggeredImage=lastTriggeredImage; return (A) this;
    }

    public Boolean hasLastTriggeredImage(){
            return this.lastTriggeredImage != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentTriggerImageChangeParamsFluentImpl that = (DeploymentTriggerImageChangeParamsFluentImpl) o;
            if (automatic != null ? !automatic.equals(that.automatic) :that.automatic != null) return false;
            if (containerNames != null ? !containerNames.equals(that.containerNames) :that.containerNames != null) return false;
            if (from != null ? !from.equals(that.from) :that.from != null) return false;
            if (lastTriggeredImage != null ? !lastTriggeredImage.equals(that.lastTriggeredImage) :that.lastTriggeredImage != null) return false;
            return true;
    }


    public class FromNestedImpl<N> extends ObjectReferenceFluentImpl<DeploymentTriggerImageChangeParamsFluent.FromNested<N>> implements DeploymentTriggerImageChangeParamsFluent.FromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            FromNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            FromNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentTriggerImageChangeParamsFluentImpl.this.withFrom(builder.build());
    }
    public N endFrom(){
            return and();
    }

}


}
