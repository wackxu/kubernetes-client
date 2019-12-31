package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;

public class CustomResourceSubresourceStatusFluentImpl<A extends CustomResourceSubresourceStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CustomResourceSubresourceStatusFluent<A>{


    public CustomResourceSubresourceStatusFluentImpl(){
    }
    public CustomResourceSubresourceStatusFluentImpl(CustomResourceSubresourceStatus instance){
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceSubresourceStatusFluentImpl that = (CustomResourceSubresourceStatusFluentImpl) o;
            return true;
    }




}
