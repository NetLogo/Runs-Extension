package org.nlogo.extensions.runs.prims

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.DefaultCommand
import org.nlogo.api.Syntax.StringType
import org.nlogo.api.Syntax.commandSyntax
import org.nlogo.app.App

object AddAnnotation extends DefaultCommand {
  override def getSyntax = commandSyntax(Array(StringType))
  override def perform(args: Array[Argument], context: Context) {
    App.app.tabs.reviewTab.addNote(args(0).getString)
  }
}
