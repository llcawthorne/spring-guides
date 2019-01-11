@ECHO OFF
pushd %~dp0
set PATH=%~dp0node;%PATH%
node "node_modules\@angular\cli\bin\ng" %*
popd
