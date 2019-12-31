package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableExternalDocumentation extends ExternalDocumentationFluentImpl<DoneableExternalDocumentation> implements Doneable<ExternalDocumentation>{

    private final ExternalDocumentationBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ExternalDocumentation,ExternalDocumentation> function;

    public DoneableExternalDocumentation(io.fabric8.kubernetes.api.builder.Function<ExternalDocumentation,ExternalDocumentation> function){
            super();this.builder=new ExternalDocumentationBuilder(this);this.function=function;
    }
    public DoneableExternalDocumentation(ExternalDocumentation item,io.fabric8.kubernetes.api.builder.Function<ExternalDocumentation,ExternalDocumentation> function){
            super(item);this.builder=new ExternalDocumentationBuilder(this, item);this.function=function;
    }
    public DoneableExternalDocumentation(ExternalDocumentation item){
            super(item);this.builder=new ExternalDocumentationBuilder(this, item);this.function=new Function<ExternalDocumentation, ExternalDocumentation>() {
    public ExternalDocumentation apply(ExternalDocumentation item) {
        return item;
    }
}
;
    }

    public ExternalDocumentation done(){
             return function.apply(builder.build());
    }




}
