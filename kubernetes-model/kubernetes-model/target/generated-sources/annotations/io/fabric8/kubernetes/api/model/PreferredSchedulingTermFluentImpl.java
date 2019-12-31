package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class PreferredSchedulingTermFluentImpl<A extends PreferredSchedulingTermFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PreferredSchedulingTermFluent<A>{

    private NodeSelectorTermBuilder preference;
    private Integer weight;

    public PreferredSchedulingTermFluentImpl(){
    }
    public PreferredSchedulingTermFluentImpl(PreferredSchedulingTerm instance){
            this.withPreference(instance.getPreference()); 
            this.withWeight(instance.getWeight()); 
    }

    
/**
 * This method has been deprecated, please use method buildPreference instead.
 * @return The buildable object.
 */
@Deprecated public NodeSelectorTerm getPreference(){
            return this.preference!=null?this.preference.build():null;
    }

    public NodeSelectorTerm buildPreference(){
            return this.preference!=null?this.preference.build():null;
    }

    public A withPreference(NodeSelectorTerm preference){
            _visitables.remove(this.preference);
            if (preference!=null){ this.preference= new NodeSelectorTermBuilder(preference); _visitables.add(this.preference);} return (A) this;
    }

    public Boolean hasPreference(){
            return this.preference != null;
    }

    public PreferredSchedulingTermFluent.PreferenceNested<A> withNewPreference(){
            return new PreferenceNestedImpl();
    }

    public PreferredSchedulingTermFluent.PreferenceNested<A> withNewPreferenceLike(NodeSelectorTerm item){
            return new PreferenceNestedImpl(item);
    }

    public PreferredSchedulingTermFluent.PreferenceNested<A> editPreference(){
            return withNewPreferenceLike(getPreference());
    }

    public PreferredSchedulingTermFluent.PreferenceNested<A> editOrNewPreference(){
            return withNewPreferenceLike(getPreference() != null ? getPreference(): new NodeSelectorTermBuilder().build());
    }

    public PreferredSchedulingTermFluent.PreferenceNested<A> editOrNewPreferenceLike(NodeSelectorTerm item){
            return withNewPreferenceLike(getPreference() != null ? getPreference(): item);
    }

    public Integer getWeight(){
            return this.weight;
    }

    public A withWeight(Integer weight){
            this.weight=weight; return (A) this;
    }

    public Boolean hasWeight(){
            return this.weight != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PreferredSchedulingTermFluentImpl that = (PreferredSchedulingTermFluentImpl) o;
            if (preference != null ? !preference.equals(that.preference) :that.preference != null) return false;
            if (weight != null ? !weight.equals(that.weight) :that.weight != null) return false;
            return true;
    }


    public class PreferenceNestedImpl<N> extends NodeSelectorTermFluentImpl<PreferredSchedulingTermFluent.PreferenceNested<N>> implements PreferredSchedulingTermFluent.PreferenceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeSelectorTermBuilder builder;
    
            PreferenceNestedImpl(NodeSelectorTerm item){
                    this.builder = new NodeSelectorTermBuilder(this, item);
            }
            PreferenceNestedImpl(){
                    this.builder = new NodeSelectorTermBuilder(this);
            }
    
    public N and(){
            return (N) PreferredSchedulingTermFluentImpl.this.withPreference(builder.build());
    }
    public N endPreference(){
            return and();
    }

}


}
