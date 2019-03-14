DESCRIPTION = "Parse a multiple poses from yaml and provide as topic and service. This package is highly inspired by yocs_waypoints_navi"
AUTHOR = "Jihoon Lee"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp visualization-msgs yocs-msgs geometry-msgs yaml-cpp roscpp yocs-msgs visualization-msgs geometry-msgs yaml-cpp"

RDEPENDS_${PN} = "roscpp yocs-msgs visualization-msgs geometry-msgs yaml-cpp"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_waypoint_provider/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bfcbf69675878c1d9d794e531d5e43cc"
SRC_URI[sha256sum] = "af1f87405e022fbc50096287d8b679f0198b09307dc22b04aa1b8a3bcfc4f9f3"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_waypoint_provider-0.8.2-0"

inherit catkin
