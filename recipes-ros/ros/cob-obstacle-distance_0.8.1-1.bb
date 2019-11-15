DESCRIPTION = "The cob_obstacle_distance package"
AUTHOR = "Marco Bezzon"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "assimp boost cmake-modules cob-control-msgs cob-srvs dynamic-reconfigure eigen-conversions libeigen fcl geometry-msgs kdl-conversions kdl-parser moveit-msgs orocos-kdl pkgconfig roscpp roslib roslint sensor-msgs shape-msgs std-msgs tf-conversions tf urdf visualization-msgs"

RDEPENDS_${PN} = "interactive-markers joint-state-publisher robot-state-publisher rospy  xacro"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_obstacle_distance/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f6a3129c8d95c80a6f8d17931fa2c593"
SRC_URI[sha256sum] = "1ad633643ddbfede2cd06ab76f4e14c0f20dfb639ecd432941ea644a45f4b817"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_obstacle_distance-0.8.1-1"

inherit catkin
