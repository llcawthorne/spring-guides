@echo off
pushd %~dp0
set PATH=%~dp0;%PATH%
node.exe "node\node_modules\npm\bin\npm-cli.js" %*
popd
