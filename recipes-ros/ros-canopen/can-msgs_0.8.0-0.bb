DESCRIPTION = "CAN related message types."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"
SRC_URI[md5sum] = "742cc8298da446571ca0ab94a413fbb2"
SRC_URI[sha256sum] = "54a5a705875b8d67403a724d0771fb4af9cdb1a9406504fe05cae90c43a813fa"

DEPENDS = "std-msgs genmsg message-generation"

RDEPENDS_${PN} = "std-msgs message-runtime"

require ros-canopen.inc
