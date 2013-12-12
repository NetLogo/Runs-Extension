package org.nlogo.extensions.runs

import org.nlogo.api.DefaultClassManager
import org.nlogo.api.PrimitiveManager

class RunsExtension extends DefaultClassManager {
  def load(primitiveManager: PrimitiveManager) {
    primitiveManager.addPrimitive("add-annotation", prims.AddAnnotation)
  }
}
