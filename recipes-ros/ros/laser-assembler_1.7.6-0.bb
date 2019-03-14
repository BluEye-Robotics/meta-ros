DESCRIPTION = "Provides nodes to assemble point clouds from either LaserScan or PointCloud messages"
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation sensor-msgs message-filters tf roscpp rostest filters laser-geometry pluginlib message-runtime sensor-msgs message-filters roscpp tf filters laser-geometry pluginlib"

RDEPENDS_${PN} = "message-runtime sensor-msgs message-filters roscpp tf filters laser-geometry pluginlib"

SRC_URI = "https://github.com/ros-gbp/laser_assembler-release/archive/release/melodic/laser_assembler/1.7.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2aa959221813993a53d4d017d86de83b"
SRC_URI[sha256sum] = "e9f578692846ccaf041da048fcfcef51d1a421a2869c94d2970541af319d3823"

S = "${WORKDIR}/laser_assembler-release-release-melodic-laser_assembler-1.7.6-0"

inherit catkin
