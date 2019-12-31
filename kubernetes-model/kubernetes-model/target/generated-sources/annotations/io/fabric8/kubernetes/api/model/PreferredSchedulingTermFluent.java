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

public interface PreferredSchedulingTermFluent<A extends PreferredSchedulingTermFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildPreference instead.
 * @return The buildable object.
 */
@Deprecated public NodeSelectorTerm getPreference();
    public NodeSelectorTerm buildPreference();
    public A withPreference(NodeSelectorTerm preference);
    public Boolean hasPreference();
    public PreferredSchedulingTermFluent.PreferenceNested<A> withNewPreference();
    public PreferredSchedulingTermFluent.PreferenceNested<A> withNewPreferenceLike(NodeSelectorTerm item);
    public PreferredSchedulingTermFluent.PreferenceNested<A> editPreference();
    public PreferredSchedulingTermFluent.PreferenceNested<A> editOrNewPreference();
    public PreferredSchedulingTermFluent.PreferenceNested<A> editOrNewPreferenceLike(NodeSelectorTerm item);
    public Integer getWeight();
    public A withWeight(Integer weight);
    public Boolean hasWeight();

    public interface PreferenceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeSelectorTermFluent<PreferredSchedulingTermFluent.PreferenceNested<N>>{

        
    public N and();    public N endPreference();
}


}
