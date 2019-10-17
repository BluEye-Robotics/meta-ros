DESCRIPTION = "Multi-master bringup launch files for CPR platforms"
AUTHOR = "Julian Cerruti"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "clock-relay master-discovery-fkie master-sync-fkie message-relay tf2-relay"

SRC_URI = "https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/melodic/multimaster_launch/0.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fcf86c94f2c6c0c367d3701096e99cbd"
SRC_URI[sha256sum] = "c825dbbb0b8082547b430423181630c5fc96e45e2d60f0110f94bcbb873a43cc"

ROS_SPN = "cpr_multimaster_tools"
S = "${WORKDIR}/cpr_multimaster_tools-release-release-melodic-multimaster_launch-0.0.2-1"

inherit catkin
