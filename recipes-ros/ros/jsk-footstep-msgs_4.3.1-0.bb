DESCRIPTION = "jsk_footstep_msgs"
AUTHOR = "Ryohei Ueda"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs actionlib-msgs geometry-msgs actionlib-msgs message-runtime"

RDEPENDS_${PN} = "geometry-msgs actionlib-msgs message-runtime"

SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/melodic/jsk_footstep_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ce1a0891d0ac48191cf4f0deafdcf5db"
SRC_URI[sha256sum] = "c461c1a447cca272bbd283203796ec6126bb42b6ae13b953f22193d574e49251"

ROS_SPN = "jsk_common_msgs"
S = "${WORKDIR}/jsk_common_msgs-release-release-melodic-jsk_footstep_msgs-4.3.1-0"

inherit catkin
