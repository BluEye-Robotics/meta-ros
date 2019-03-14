DESCRIPTION = "posedetection_msgs provides messages and services to facilitate passing pose detection results and features."
AUTHOR = "Rosen Diankov"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs sensor-msgs geometry-msgs cv-bridge message-generation message-filters roscpp std-msgs sensor-msgs geometry-msgs cv-bridge message-runtime message-filters"

RDEPENDS_${PN} = "roscpp std-msgs sensor-msgs geometry-msgs cv-bridge message-runtime message-filters"

SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/melodic/posedetection_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8892d61446fd59cca9cf474b70cf87fb"
SRC_URI[sha256sum] = "1538ca360bd31dcfa85392ba78374d072d64a3426425c64b08d8db149ea5cd3a"

ROS_SPN = "jsk_common_msgs"
S = "${WORKDIR}/jsk_common_msgs-release-release-melodic-posedetection_msgs-4.3.1-0"

inherit catkin
