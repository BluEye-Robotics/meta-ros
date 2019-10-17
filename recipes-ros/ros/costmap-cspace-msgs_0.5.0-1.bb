DESCRIPTION = "Message definitions for costmap_cspace package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/at-wat/neonavigation_msgs-release/archive/release/melodic/costmap_cspace_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c40af8f22a478ab0d8fd91fb6614a46d"
SRC_URI[sha256sum] = "6d0286a8b36a35142db9e2c78857e2423fbbe9dd87ff350487dd1b07c8759e7a"

ROS_SPN = "neonavigation_msgs"
S = "${WORKDIR}/neonavigation_msgs-release-release-melodic-costmap_cspace_msgs-0.5.0-1"

inherit catkin
