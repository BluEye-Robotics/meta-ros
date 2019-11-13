DESCRIPTION = "The multimaster_msgs package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/melodic/multimaster_msgs/0.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1699aa420c9502ebab57f5a22fb55c6a"
SRC_URI[sha256sum] = "a54fb359f77128a68fcace506ee0da2be2b147ccd567b4f947d70ddf740bb153"

ROS_SPN = "cpr_multimaster_tools"
S = "${WORKDIR}/cpr_multimaster_tools-release-release-melodic-multimaster_msgs-0.0.2-1"

inherit catkin
