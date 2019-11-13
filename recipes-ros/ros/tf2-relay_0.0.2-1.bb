DESCRIPTION = "Specialization of message_relay for tf2"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-relay tf2-msgs roscpp"

RDEPENDS_${PN} = "tf tf2-ros"

SRC_URI = "https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/melodic/tf2_relay/0.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b4f5086716568e008d92691e99f4194c"
SRC_URI[sha256sum] = "6052668a6f51ee065e7833b033ade709311193d3b62f662e38dd617eab05dc31"

ROS_SPN = "cpr_multimaster_tools"
S = "${WORKDIR}/cpr_multimaster_tools-release-release-melodic-tf2_relay-0.0.2-1"

inherit catkin
