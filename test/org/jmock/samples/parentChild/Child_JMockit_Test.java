/*
 * Copyright (c) 2006-2012 Rogério Liesenfeld
 * This file is subject to the terms of the MIT license (see LICENSE.txt).
 */
package org.jmock.samples.parentChild;

import org.junit.*;

import mockit.*;

/**
 * Notice how much simpler the equivalent test is with JMockit.
 */
public final class Child_JMockit_Test
{
   @Injectable Parent parent;
   @Tested Child child;

   @Test
   public void removesItselfFromOldParentWhenAssignedNewParent(@Injectable final Parent newParent)
   {
      new Expectations() {{
         parent.removeChild(child);
         newParent.addChild(child);
      }};

      child.reparent(newParent);
   }
}
