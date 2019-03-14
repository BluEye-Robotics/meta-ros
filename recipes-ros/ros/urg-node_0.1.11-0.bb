DESCRIPTION = "urg_node"
AUTHOR = "Chad Rockey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-updater dynamic-reconfigure laser-proc message-generation nodelet rosconsole roscpp sensor-msgs std-msgs std-srvs tf urg-c"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/urg_node-release/archive/release/melodic/urg_node/0.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "edc4a7f23c6b2874ca10ffdefdc2f27b"
SRC_URI[sha256sum] = "86fec955adf084d6ebdf11e8a17ecb03586afcfab3b15329e02535a773dc7a4d"

S = "${WORKDIR}/urg_node-release-release-melodic-urg_node-0.1.11-0"

inherit catkin
