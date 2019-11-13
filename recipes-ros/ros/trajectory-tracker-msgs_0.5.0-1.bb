DESCRIPTION = "Message definitions for trajectory_tracker package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs geometry-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/at-wat/neonavigation_msgs-release/archive/release/melodic/trajectory_tracker_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "22637beff7f36cd6ef9068ba9c9854fc"
SRC_URI[sha256sum] = "16e5defe9dc4296864c7920fcc8249c3b6b261cdf7f66511d12f1a3a8a51e725"

ROS_SPN = "neonavigation_msgs"
S = "${WORKDIR}/neonavigation_msgs-release-release-melodic-trajectory_tracker_msgs-0.5.0-1"

inherit catkin
