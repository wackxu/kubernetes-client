package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.LabelSelector;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import io.fabric8.kubernetes.api.model.LabelSelectorFluent;
import java.lang.Boolean;
import java.util.Map;

public interface GroupRestrictionFluent<A extends GroupRestrictionFluent<A>> extends Fluent<A>{


    public A addToGroups(int index,String item);
    public A setToGroups(int index,String item);
    public A addToGroups(String... items);
    public A addAllToGroups(Collection<String> items);
    public A removeFromGroups(String... items);
    public A removeAllFromGroups(Collection<String> items);
    public List<String> getGroups();
    public String getGroup(int index);
    public String getFirstGroup();
    public String getLastGroup();
    public String getMatchingGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withGroups(List<String> groups);
    public A withGroups(String... groups);
    public Boolean hasGroups();
    public A addToLabels(int index,LabelSelector item);
    public A setToLabels(int index,LabelSelector item);
    public A addToLabels(LabelSelector... items);
    public A addAllToLabels(Collection<LabelSelector> items);
    public A removeFromLabels(LabelSelector... items);
    public A removeAllFromLabels(Collection<LabelSelector> items);
    
/**
 * This method has been deprecated, please use method buildLabels instead.
 * @return The buildable object.
 */
@Deprecated public List<LabelSelector> getLabels();
    public List<LabelSelector> buildLabels();
    public LabelSelector buildLabel(int index);
    public LabelSelector buildFirstLabel();
    public LabelSelector buildLastLabel();
    public LabelSelector buildMatchingLabel(io.fabric8.kubernetes.api.builder.Predicate<LabelSelectorBuilder> predicate);
    public A withLabels(List<LabelSelector> labels);
    public A withLabels(LabelSelector... labels);
    public Boolean hasLabels();
    public GroupRestrictionFluent.LabelsNested<A> addNewLabel();
    public GroupRestrictionFluent.LabelsNested<A> addNewLabelLike(LabelSelector item);
    public GroupRestrictionFluent.LabelsNested<A> setNewLabelLike(int index,LabelSelector item);
    public GroupRestrictionFluent.LabelsNested<A> editLabel(int index);
    public GroupRestrictionFluent.LabelsNested<A> editFirstLabel();
    public GroupRestrictionFluent.LabelsNested<A> editLastLabel();
    public GroupRestrictionFluent.LabelsNested<A> editMatchingLabel(io.fabric8.kubernetes.api.builder.Predicate<LabelSelectorBuilder> predicate);

    public interface LabelsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<GroupRestrictionFluent.LabelsNested<N>>{

        
    public N and();    public N endLabel();
}


}
