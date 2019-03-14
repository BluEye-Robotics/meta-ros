DESCRIPTION = "Message definitions for trajectory_tracker package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs geometry-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/at-wat/neonavigation_msgs-release/archive/release/melodic/trajectory_tracker_msgs/0.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b5e4211d25bb366290ad8fe6fcc0d7b6"
SRC_URI[sha256sum] = "c6c75c98fa9489ae279b8e4f5b88e7f34a23c3ca66b9543851858a140f56778e"

ROS_SPN = "neonavigation_msgs"
S = "${WORKDIR}/neonavigation_msgs-release-release-melodic-trajectory_tracker_msgs-0.3.1-0"

inherit catkin
