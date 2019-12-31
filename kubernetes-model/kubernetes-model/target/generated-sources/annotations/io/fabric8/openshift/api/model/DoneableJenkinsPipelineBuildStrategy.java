package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableJenkinsPipelineBuildStrategy extends JenkinsPipelineBuildStrategyFluentImpl<DoneableJenkinsPipelineBuildStrategy> implements Doneable<JenkinsPipelineBuildStrategy>{

    private final JenkinsPipelineBuildStrategyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<JenkinsPipelineBuildStrategy,JenkinsPipelineBuildStrategy> function;

    public DoneableJenkinsPipelineBuildStrategy(io.fabric8.kubernetes.api.builder.Function<JenkinsPipelineBuildStrategy,JenkinsPipelineBuildStrategy> function){
            super();this.builder=new JenkinsPipelineBuildStrategyBuilder(this);this.function=function;
    }
    public DoneableJenkinsPipelineBuildStrategy(JenkinsPipelineBuildStrategy item,io.fabric8.kubernetes.api.builder.Function<JenkinsPipelineBuildStrategy,JenkinsPipelineBuildStrategy> function){
            super(item);this.builder=new JenkinsPipelineBuildStrategyBuilder(this, item);this.function=function;
    }
    public DoneableJenkinsPipelineBuildStrategy(JenkinsPipelineBuildStrategy item){
            super(item);this.builder=new JenkinsPipelineBuildStrategyBuilder(this, item);this.function=new Function<JenkinsPipelineBuildStrategy, JenkinsPipelineBuildStrategy>() {
    public JenkinsPipelineBuildStrategy apply(JenkinsPipelineBuildStrategy item) {
        return item;
    }
}
;
    }

    public JenkinsPipelineBuildStrategy done(){
             return function.apply(builder.build());
    }




}
