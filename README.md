# NetLogo Runs Extension

This extension is intended to provide an API to interact with NetLogo's still in development [Model Runs](https://github.com/NetLogo/NetLogo/wiki/Model-runs) feature.

You can [download the extension from here](https://github.com/NetLogo/Runs-Extension/releases).

The extension currently provides only the `runs:add-annotation` primitive.

## Usage

`runs:add-annotation` _text_

If there is a currently selected run in the **Review** tab, and that run is currently being recorded, adds an annotation containing the current (i.e., last) frame of the run.

## Building

Run `./sbt package` to build the extension.

If the build succeeds, `runs.jar` will be created.

## Terms of Use

[![CC0](http://i.creativecommons.org/p/zero/1.0/88x31.png)](http://creativecommons.org/publicdomain/zero/1.0/)

The NetLogo Runs extension is in the public domain.  To the extent possible under law, Uri Wilensky has waived all copyright and related or neighboring rights.
