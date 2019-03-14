DESCRIPTION = "jsk_gui_msgs"
AUTHOR = "chen"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "std-msgs sensor-msgs geometry-msgs message-generation std-msgs sensor-msgs geometry-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs sensor-msgs geometry-msgs message-runtime"

SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/melodic/jsk_gui_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "05ff40cd9f1c020ca69b80cd1022490c"
SRC_URI[sha256sum] = "6af87adf6d809a7311c1b561093859751c7c2575791e5dc89e089a8dd98a118d"

ROS_SPN = "jsk_common_msgs"
S = "${WORKDIR}/jsk_common_msgs-release-release-melodic-jsk_gui_msgs-4.3.1-0"

inherit catkin
