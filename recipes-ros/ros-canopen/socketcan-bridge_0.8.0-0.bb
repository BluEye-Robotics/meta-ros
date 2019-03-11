DESCRIPTION = "Provides nodes to convert messages from SocketCAN to a ROS Topic and vice versa."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"
SRC_URI[md5sum] = "33397d669296c712e6c765f420cd7684"
SRC_URI[sha256sum] = "6f82d21a83caa361961006c49bf69268de9215d5a8586dbf90216ea0f07dfec6"

DEPENDS = "socketcan-interface can-msgs roscpp"
RDEPENDS_${PN} = "can-msgs"

require ros-canopen.inc
