package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.PodTemplateSpecFluentImpl;
import io.fabric8.kubernetes.api.model.LabelSelectorFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.LabelSelector;
import java.lang.Integer;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.PodTemplateSpecBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class ReplicaSetSpecFluentImpl<A extends ReplicaSetSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ReplicaSetSpecFluent<A>{

    private Integer minReadySeconds;
    private Integer replicas;
    private LabelSelectorBuilder selector;
    private PodTemplateSpecBuilder template;

    public ReplicaSetSpecFluentImpl(){
    }
    public ReplicaSetSpecFluentImpl(ReplicaSetSpec instance){
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withReplicas(instance.getReplicas()); 
            this.withSelector(instance.getSelector()); 
            this.withTemplate(instance.getTemplate()); 
    }

    public Integer getMinReadySeconds(){
            return this.minReadySeconds;
    }

    public A withMinReadySeconds(Integer minReadySeconds){
            this.minReadySeconds=minReadySeconds; return (A) this;
    }

    public Boolean hasMinReadySeconds(){
            return this.minReadySeconds != null;
    }

    public Integer getReplicas(){
            return this.replicas;
    }

    public A withReplicas(Integer replicas){
            this.replicas=replicas; return (A) this;
    }

    public Boolean hasReplicas(){
            return this.replicas != null;
    }

    
/**
 * This method has been deprecated, please use method buildSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getSelector(){
            return this.selector!=null?this.selector.build():null;
    }

    public LabelSelector buildSelector(){
            return this.selector!=null?this.selector.build():null;
    }

    public A withSelector(LabelSelector selector){
            _visitables.remove(this.selector);
            if (selector!=null){ this.selector= new LabelSelectorBuilder(selector); _visitables.add(this.selector);} return (A) this;
    }

    public Boolean hasSelector(){
            return this.selector != null;
    }

    public ReplicaSetSpecFluent.SelectorNested<A> withNewSelector(){
            return new SelectorNestedImpl();
    }

    public ReplicaSetSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item){
            return new SelectorNestedImpl(item);
    }

    public ReplicaSetSpecFluent.SelectorNested<A> editSelector(){
            return withNewSelectorLike(getSelector());
    }

    public ReplicaSetSpecFluent.SelectorNested<A> editOrNewSelector(){
            return withNewSelectorLike(getSelector() != null ? getSelector(): new LabelSelectorBuilder().build());
    }

    public ReplicaSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item){
            return withNewSelectorLike(getSelector() != null ? getSelector(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTemplate instead.
 * @return The buildable object.
 */
@Deprecated public PodTemplateSpec getTemplate(){
            return this.template!=null?this.template.build():null;
    }

    public PodTemplateSpec buildTemplate(){
            return this.template!=null?this.template.build():null;
    }

    public A withTemplate(PodTemplateSpec template){
            _visitables.remove(this.template);
            if (template!=null){ this.template= new PodTemplateSpecBuilder(template); _visitables.add(this.template);} return (A) this;
    }

    public Boolean hasTemplate(){
            return this.template != null;
    }

    public ReplicaSetSpecFluent.TemplateNested<A> withNewTemplate(){
            return new TemplateNestedImpl();
    }

    public ReplicaSetSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item){
            return new TemplateNestedImpl(item);
    }

    public ReplicaSetSpecFluent.TemplateNested<A> editTemplate(){
            return withNewTemplateLike(getTemplate());
    }

    public ReplicaSetSpecFluent.TemplateNested<A> editOrNewTemplate(){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): new PodTemplateSpecBuilder().build());
    }

    public ReplicaSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ReplicaSetSpecFluentImpl that = (ReplicaSetSpecFluentImpl) o;
            if (minReadySeconds != null ? !minReadySeconds.equals(that.minReadySeconds) :that.minReadySeconds != null) return false;
            if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (template != null ? !template.equals(that.template) :that.template != null) return false;
            return true;
    }


    public class SelectorNestedImpl<N> extends LabelSelectorFluentImpl<ReplicaSetSpecFluent.SelectorNested<N>> implements ReplicaSetSpecFluent.SelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            SelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            SelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) ReplicaSetSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector(){
            return and();
    }

}
    public class TemplateNestedImpl<N> extends PodTemplateSpecFluentImpl<ReplicaSetSpecFluent.TemplateNested<N>> implements ReplicaSetSpecFluent.TemplateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateSpecBuilder builder;
    
            TemplateNestedImpl(PodTemplateSpec item){
                    this.builder = new PodTemplateSpecBuilder(this, item);
            }
            TemplateNestedImpl(){
                    this.builder = new PodTemplateSpecBuilder(this);
            }
    
    public N and(){
            return (N) ReplicaSetSpecFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate(){
            return and();
    }

}


}
