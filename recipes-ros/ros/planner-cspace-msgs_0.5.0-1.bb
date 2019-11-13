DESCRIPTION = "Message definitions for planner_cspace package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/at-wat/neonavigation_msgs-release/archive/release/melodic/planner_cspace_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fba82adf03550d77e7db394969e3eedc"
SRC_URI[sha256sum] = "97391d287ee4f03c83fd7d6c715039d25da350f32b26b01168b91ff04337c38c"

ROS_SPN = "neonavigation_msgs"
S = "${WORKDIR}/neonavigation_msgs-release-release-melodic-planner_cspace_msgs-0.5.0-1"

inherit catkin
