DESCRIPTION = "This package contains a tool to convert Unified Robot Description Format (URDF) \
documents into COLLAborative Design Activity (COLLADA) documents."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles assimp cmake-modules collada-dom collada-parser libeigen geometric-shapes resource-retriever rosconsole urdf"

require collada-urdf.inc
