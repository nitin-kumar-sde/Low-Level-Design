package design_patterns.behavioral.visitor.item;

import design_patterns.behavioral.visitor.ItemVisitor;

public interface Item {
    void accept(ItemVisitor visitor);
}

